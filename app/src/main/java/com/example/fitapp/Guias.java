package com.example.fitapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Guias extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guias);
    }

    public void onClick(View view) {
        Toast.makeText(getApplicationContext(), "cambiar actividad", Toast.LENGTH_LONG);
        Intent i = new Intent(Guias.this,MainActivity.class);
        startActivity(i);
    }

    public void Procesos(View view) {
        Toast.makeText(getApplicationContext(), "cambiar actividad", Toast.LENGTH_LONG);
        Intent i = new Intent(Guias.this,Procesos.class);
        startActivity(i);
    }

    public void Guias(View view) {
        Toast.makeText(getApplicationContext(), "cambiar actividad", Toast.LENGTH_LONG);
        Intent i = new Intent(Guias.this,Guias.class);
        startActivity(i);
    }

    public void Setting(View view) {
        Toast.makeText(getApplicationContext(), "cambiar actividad", Toast.LENGTH_LONG);
        Intent i = new Intent(Guias.this,Setting.class);
        startActivity(i);
    }
}