package com.example.fitapp.Interfaces;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.fitapp.R;
import com.example.fitapp.modelos.ModeloProcesos;

import com.example.fitapp.Database.DataBaseQueryUsuario;

public class ProcesosCrearCardio extends AppCompatActivity {

    private EditText nombre;
    private EditText detalle;
    private RadioGroup opciones;
    private RadioButton KG;
    private RadioButton Min;
    private EditText numeroActual;

    private Button agregarBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_procesocrear);

        nombre = this.findViewById(R.id.nombreText);
        detalle = this.findViewById(R.id.detalleText);

        //
        opciones = this.findViewById(R.id.radioGroupText);
        int idradio = opciones.getCheckedRadioButtonId();

        KG = this.findViewById(R.id.radioButtonKg);

        Min = this.findViewById(R.id.radioButtonMin);

        //

        numeroActual = this.findViewById(R.id.editTextNumber);

        agregarBtn = this.findViewById(R.id.button21);

        agregarBtn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                ModeloProcesos procesosNuevo = new ModeloProcesos();

                procesosNuevo.setNombre(nombre.getText().toString());
                procesosNuevo.setDetalle(detalle.getText().toString());

                if (KG.isChecked()){
                    procesosNuevo.setOpciones("KG");
                }
                if (Min.isChecked()){
                    procesosNuevo.setOpciones("Min");
                }
                //
               // procesosNuevo.setOpciones(opciones.getText().toString());
                //


                procesosNuevo.setNumeroActual(numeroActual.getText().length());

                DataBaseQueryUsuario dbQeryUsuario = new DataBaseQueryUsuario(getBaseContext());

                dbQeryUsuario.insertarUsuario(procesosNuevo);

                Toast.makeText(getApplicationContext(), "cambiar actividad", Toast.LENGTH_LONG);
                Intent i = new Intent(ProcesosCrearCardio.this,Procesos.class);
                startActivity(i);

            }

        });
    }


}