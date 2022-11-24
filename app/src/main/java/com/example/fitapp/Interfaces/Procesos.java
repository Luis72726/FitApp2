package com.example.fitapp.Interfaces;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.fitapp.Adaptador.AdaptadorProcesos;
import com.example.fitapp.R;
import com.example.fitapp.modelos.ModeloProcesos;

import java.util.ArrayList;

import com.example.fitapp.Database.DataBaseQueryUsuario;


public class Procesos extends AppCompatActivity {

    RecyclerView reciclador;
    ArrayList<ModeloProcesos> listaArrayprocesos;
    AdaptadorProcesos adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_procesos);

        reciclador = findViewById(R.id.recyclerId);
        reciclador.setLayoutManager(new LinearLayoutManager(this));

        DataBaseQueryUsuario dbUsuarios = new DataBaseQueryUsuario(Procesos.this);

        listaArrayprocesos = new ArrayList<>();

        adapter = new AdaptadorProcesos(dbUsuarios.mostrarContactos());
        reciclador.setAdapter(adapter);



    }

    public void onClick(View view) {
        Toast.makeText(getApplicationContext(), "cambiar actividad", Toast.LENGTH_LONG);
        Intent i = new Intent(Procesos.this, MainActivity.class);
        startActivity(i);
    }

    public void Procesos(View view) {
        Toast.makeText(getApplicationContext(), "cambiar actividad", Toast.LENGTH_LONG);
        Intent i = new Intent(Procesos.this,Procesos.class);
        startActivity(i);
    }

    public void Guias(View view) {
        Toast.makeText(getApplicationContext(), "cambiar actividad", Toast.LENGTH_LONG);
        Intent i = new Intent(Procesos.this, Guias.class);
        startActivity(i);
    }

    public void Setting(View view) {
        Toast.makeText(getApplicationContext(), "cambiar actividad", Toast.LENGTH_LONG);
        Intent i = new Intent(Procesos.this,Setting.class);
        startActivity(i);
    }

    public void Procesoscrear(View view) {
        Toast.makeText(getApplicationContext(), "cambiar actividad", Toast.LENGTH_LONG);
        Intent i = new Intent(Procesos.this,ProcesosCrearCardio.class);
        startActivity(i);
    }

}