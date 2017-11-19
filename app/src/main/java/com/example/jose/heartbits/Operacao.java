package com.example.jose.heartbits;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.jose.heartbits.barcode.BarcodeCaptureActivity;


public class Operacao extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.operacao);

        Button registar = (Button) findViewById(R.id.registar);
        Button registos = (Button) findViewById(R.id.registos);



        registar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                launchRegistar();
        }
        });

        registos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                launchRegistos();
            }
        });

    }

    private void launchRegistar() {

        Intent intent = new Intent(this, BarcodeCaptureActivity.class);
        startActivity(intent);
    }

    private void launchRegistos() {

        Intent intent = new Intent(this, Registos.class);
        startActivity(intent);
    }
}
