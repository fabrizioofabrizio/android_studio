package it.engim.VideoGame;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fabrizio on 14/06/2016.
 */

public class DB_Manager {


    DB_Helper dbHelper = null;
    DB_String dbString = null;


    private Context context;


    public DB_Manager(Context context) {
        this.context = context;
        dbHelper=new DB_Helper(context,DB_String.DB_NAME, null, DB_String.DB_VERSION);
    }

    public List<Risultati> listaCategorie()
    {
        SQLiteDatabase db=dbHelper.getReadableDatabase();
        Cursor c=db.query("partita", null, null, null, null, null, null);
        ArrayList<Risultati> lista=new ArrayList<Risultati>();
        lista.add(new Risultati(0,"Seleziona una categoria..."));
        while(c.moveToNext())
            lista.add(new Risultati(c.getInt(0) /*id*/, c.getString(1) /*nome*/));

        return lista;
    }

    public void nuovaSpesa(String descr, int catid)
    {
        SQLiteDatabase db=dbHelper.getWritableDatabase();
        ContentValues contents=new ContentValues();
        contents.put(DB_String.COL_RISULTATI, descr);
        contents.put(DB_String.DB_ID, catid);
        db.insert(DB_String.NOME_TAB, null, contents);
        db.close();
    }

    public Cursor inserisci(){
        SQLiteDatabase db=dbHelper.getWritableDatabase();
        String query = "INSERT INTO "+ DB_String.NOME_TAB+" ("+DB_String.COL_RISULTATI+") VALUES('fabry');";
        Cursor c=db.rawQuery(query, null);
        return c;
    }
}
