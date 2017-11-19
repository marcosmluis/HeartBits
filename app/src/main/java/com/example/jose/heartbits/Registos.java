package com.example.jose.heartbits;

import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;

/**
 * Created by jose on 19-11-2017.
 */

public class Registos extends AppCompatActivity {

    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registos);

        adapter.add("New Item");
        adapter.add("New Item");
    }
}
