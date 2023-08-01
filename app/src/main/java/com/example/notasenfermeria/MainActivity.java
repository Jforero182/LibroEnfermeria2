package com.example.notasenfermeria;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String[] item = {"C.C", "D.E", "C.D", "A.S", "N.V", "S.I", "P.T", "S.C", "C.N", "M.S", "P.E", "NIT", "C.E", "R.C", "T.I", "P.A"};

    AutoCompleteTextView autoCompleteTextView;

    ArrayAdapter<String> adapterItems;

    Button Auxiliar;

    CardView imagesCard;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imagesCard = findViewById(R.id.Asistencias);
        imagesCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, AsistenciaActivity.class));
            }
        });

        imagesCard = findViewById(R.id.Equipos);
        imagesCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Equipos.class));
            }
        });

        imagesCard = findViewById(R.id.RegistroMedicamentos);
        imagesCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, RegistroMedicamento.class));
            }
        });


        imagesCard = findViewById(R.id.Notas);

        imagesCard.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, NotasActivity.class));
            }
        });
    }
}