package com.example.fitapp.Interfaces;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.fitapp.Adaptador.AdaptadorGuias;
import com.example.fitapp.R;
import com.example.fitapp.modelos.ModeloGuias;

import java.util.ArrayList;

public class Guias extends AppCompatActivity {

    ArrayList<ModeloGuias> listaJuegos;
    RecyclerView recyclerViewJuegos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guias);

        listaJuegos=new ArrayList<>();
        recyclerViewJuegos= findViewById(R.id.recyclerId);
        recyclerViewJuegos.setLayoutManager(new LinearLayoutManager(this));

        llenarJuegos();
        AdaptadorGuias adapter= new AdaptadorGuias(listaJuegos);
        recyclerViewJuegos.setAdapter(adapter);
    }


    private void llenarJuegos() {

        listaJuegos.add(new ModeloGuias("El agua","Lo que bebemos diariamente forma parte de nuestro cuerpo como un 50% y al 70% de nuestro peso. En el deporte al sudar como efecto de defensa para no sobrecalentarse, usa el agua. Dicho lo anterior es recomendable tomar agua despues del deporte.",R.drawable._water3));
        listaJuegos.add(new ModeloGuias("El desarrollo muscular","Para tener un buen desarrollo, es recomendable dormir bien entre un rango de 6-8 horas. Tener una alimentacion saludable como tener un buen porcentaje de proteina consumida. ",R.drawable._biceps1));

    }

    public void onClick(View view) {
        Toast.makeText(getApplicationContext(), "cambiar actividad", Toast.LENGTH_LONG);
        Intent i = new Intent(Guias.this, MainActivity.class);
        startActivity(i);
    }

    public void Procesos(View view) {
        Toast.makeText(getApplicationContext(), "cambiar actividad", Toast.LENGTH_LONG);
        Intent i = new Intent(Guias.this, Procesos.class);
        startActivity(i);
    }

    public void Guias(View view) {
        Toast.makeText(getApplicationContext(), "cambiar actividad", Toast.LENGTH_LONG);
        Intent i = new Intent(Guias.this,Guias.class);
        startActivity(i);
    }

    public void Setting(View view) {
        Toast.makeText(getApplicationContext(), "cambiar actividad", Toast.LENGTH_LONG);
        Intent i = new Intent(Guias.this, Setting.class);
        startActivity(i);
    }
}