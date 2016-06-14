package it.engim.VideoGame;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fabrizio on 14/06/2016.
 */

public class Risultati {


        private int id;
        private String nome;

    public Risultati(int i, String n)
        {
            id=i;
            nome=n;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }



}
