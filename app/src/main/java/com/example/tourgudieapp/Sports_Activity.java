package com.example.tourgudieapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class Sports_Activity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sports);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TextView textView = findViewById(R.id.sports_id);
        textView.setText("Sargodha is home to the Sargodha Cricket Stadium. Sargodha's cricket team was a first-class cricket " +
                "team that represented Sargodha Division. They competed in Pakistan's " +
                "first-class tournaments in 1961–62 and 2002–03. There's a sports complex" +
                " adjacent to the stadium that includes gym as well as basketball," +
                " badminton and table tennis courts. Moreover, karate classes also " +
                "take place regularly at the complex.[citation needed]\n" +
                "\n" +
                "Mela Mandi Ground is a multi-use historic stadium in Sargodha." +
                " It is mostly used for cricket and football. The Mela Mandi Ground was " +
                "constructed to provide a vast ground for outdoor sports and activities. " +
                "During March, every year (the country's spring season), " +
                "several competitions are held here. Almost all Pakistani " +
                "people watch these annual games.[76]\n" +
                "\n");
    }
}