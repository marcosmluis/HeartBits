package com.example.jose.heartbits;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class Operacao extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.operacao);

        Button registar = (Button) findViewById(R.id.registar);



        registar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                launchRegistar();
        }
        });

    }

    private void launchRegistar() {

        Intent intent = new Intent(this, Registos.class);
        startActivity(intent);
    }

}
