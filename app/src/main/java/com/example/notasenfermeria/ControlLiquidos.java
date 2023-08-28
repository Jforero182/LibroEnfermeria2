package com.example.notasenfermeria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ControlLiquidos extends AppCompatActivity {

    Button Recibida,Eliminada,hora;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control_liquidos);

        Recibida= (Button) findViewById(R.id.Recibida);
        Eliminada= (Button) findViewById(R.id.Eliminada);
        hora= (Button) findViewById(R.id.hora);

//        hora.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                startActivity(new Intent(ControlLiquidos.this, horarioliquido.class));
//            }
//        });

        Recibida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ControlLiquidos.this, Recibida.class));
            }
        });
        Eliminada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ControlLiquidos.this, Eliminada.class));
            }
        });

    }
}