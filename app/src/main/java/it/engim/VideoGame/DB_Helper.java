package it.engim.VideoGame;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by fabrizio on 14/06/2016.
 */

public class DB_Helper extends SQLiteOpenHelper {

    public DB_Helper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createPartite="CREATE TABLE "+DB_String.NOME_TAB+" ("+
                DB_String.DB_ID+" INTEGER PRIMARY KEY AUTOINCREMENT," +
                DB_String.COL_RISULTATI+" TEXT)";
        db.execSQL(createPartite);

        String [] ris =new String[]{"0-0", "0-1", "0-2", "0-3", "0-4"};
        ContentValues cv=new ContentValues(1);

        for (String c: ris)
        {
            cv.put(DB_String.COL_RISULTATI, c);
            db.insert(DB_String.NOME_TAB, null, cv);
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
