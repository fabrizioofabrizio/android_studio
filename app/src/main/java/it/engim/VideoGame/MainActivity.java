package it.engim.VideoGame;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    TextView partita = null;
    TextView partitaScelta = null;
    Spinner risultato = null;
    DB_Manager dbManager = null;
    DB_Helper dbHelper = null;
    Button butt = null;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        partita = (TextView) findViewById(R.id.partitaDelGiorno);
        partitaScelta = (TextView) findViewById(R.id.partitaScelta);
        risultato= (Spinner) findViewById(R.id.risultati);


        partita.setText("Partita del Giorno");

       // ArrayAdapter<Risultati> spinnerAdapter=new ArrayAdapter<Risultati>(this,android.R.layout.simple_dropdown_item_1line,dbManager.listaCategorie());
       // risultato.setAdapter(spinnerAdapter);

        risultato.setOnItemSelectedListener(new OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                // TODO Auto-generated method stub

                Toast.makeText(getBaseContext(), risultato.getSelectedItem().toString(),
                        Toast.LENGTH_SHORT).show();
                partitaScelta.setText(risultato.getSelectedItem().toString());
            }


            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub

            }
        });
    }


    public void insert(View v)
    {

    }
}
