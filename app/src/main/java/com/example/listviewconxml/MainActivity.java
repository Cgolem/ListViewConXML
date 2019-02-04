package com.example.listviewconxml;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listaDatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaDatos = (ListView) findViewById(R.id.listaDatosCtrl);

        //Generamos un adaptador de tipo ArrayAdapter.
        //Enviamos la actividad en la que estamos, el arreglo XML que generamos y la vista.
        ArrayAdapter<CharSequence> adaptador = ArrayAdapter.createFromResource(getApplicationContext(), R.array.valores_arreglo, android.R.layout.simple_list_item_1);

        //
        listaDatos.setAdapter(adaptador);
    }
}
