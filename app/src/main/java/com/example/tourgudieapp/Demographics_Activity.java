package com.example.tourgudieapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class Demographics_Activity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demographics);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TextView textView = findViewById(R.id.demo_text);
        textView.setText("The total population of the city was 458,440 according to the 1998 census." +
                " The majority of the people in the city speak Punjabi with Shahpuri dialect." +
                "According to the 2017 Census of Pakistan, the population of city was recorded as 872,557 with a rise of 43.94% from 1998." +
                "The population of the metropolitan area (City District) reached 3,903,588,in which around 1 million forms the urban population." +
                "The population of Sargodha Division was recorded as 8,181,499 by the 2017 Census of Pakistan.\n" +
                "\n");

    }
}