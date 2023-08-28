package com.example.notasenfermeria;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

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

        imagesCard = findViewById(R.id.SignosVitales);
        imagesCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, SignosVitales.class));
            }
        });


        imagesCard = findViewById(R.id.Notas);

        imagesCard.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, NotasActivity.class));
            }

        });
        imagesCard = findViewById(R.id.ControlLiquidos);
        imagesCard.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ControlLiquidos.class));
            }
        });

        imagesCard = findViewById(R.id.Cuidador);
        imagesCard.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, FCuidador.class));
            }
        });
        imagesCard = findViewById(R.id.Gastos);
        imagesCard.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, gastos.class));
            }
        });

        imagesCard = findViewById(R.id.EAdverso);
        imagesCard.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, eventoadverso.class));
            }
        });

    }
}