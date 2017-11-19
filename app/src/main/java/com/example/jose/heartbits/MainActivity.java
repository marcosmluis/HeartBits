package com.example.jose.heartbits;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText username;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText) findViewById(R.id.username);
        username.setOnClickListener(this);

        login = (Button) findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                launchRegistos();
            }
        });
    }

    @Override
    public void onClick(View view) {
        if(view == username) {
            username.setText("");
        }
    }

    private void launchRegistos() {

        Intent intent = new Intent(this, Registos.class);
        startActivity(intent);
    }
}
