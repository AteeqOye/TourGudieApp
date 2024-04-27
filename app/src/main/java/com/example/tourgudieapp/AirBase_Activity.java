package com.example.tourgudieapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class AirBase_Activity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_air_base);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TextView textView = findViewById(R.id.air_base);
        textView.setText("Pakistan's largest airbase, PAF Base Mushaf (formerly PAF Base Sargodha)," +
                " is situated in Sargodha and hosts " +
                "the headquarters of the Pakistan Air Force's Central Air Command. " +
                "The airbase is also home to the Combat Commanders School " +
                "(CCS), formerly the Fighter Leader's School.");
    }
}