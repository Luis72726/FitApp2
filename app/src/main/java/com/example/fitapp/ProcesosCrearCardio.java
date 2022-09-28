package com.example.fitapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ProcesosCrearCardio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_procesocrear);
    }

    public void DirigirVerPropiedades(View view) {
        Toast.makeText(getApplicationContext(), "cambiar actividad", Toast.LENGTH_LONG);
        Intent i = new Intent(ProcesosCrearCardio.this,VerPropiedades.class);
        startActivity(i);
    }
}