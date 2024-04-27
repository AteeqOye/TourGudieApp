package com.example.tourgudieapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class Economy_Activity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_economy);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TextView textView = findViewById(R.id.economy_id);
        textView.setText("The majority of Sargodha's economy is based on agriculture. Sargodha is considered the best citrus-producing " +
                "area of Pakistan and therefore is also known as the California of Pakistan. " +
                "Sargodha is largest Kinnow-producing district of the world. " +
                "It produces oranges that are considered high-quality, and supplies them to the different parts of the country. " +
                "These oranges are also exported to other countries." +
                "Sargodha produces a large amount of wheat, cotton, rice and vegetables that are transported to" +
                " other parts of country and exported to other countries.\n" +
                "\n" +
                "There are also Textile mills, Rice processing plants and Nestle and Shezan juice factories.\n" +
                "\n" +
                "The Sargodha Chamber of Commerce and Industry monitors industrial activity in the city and reports their findings to the Federation " +
                "of Pakistan Chamber of Commerce and Industry and provincial government." +
                "A dry port is also under construction in Sargodha.\n" +
                "\n" +
                "There are also several shopping malls and trade centres with both international and national outlets. Some of them include:\n" +
                "\n->Mall of Sargodha\n" +
                "->Burj Ismail Mall\n" +
                "->Xin Mall\n" +
                "->Chenone Tower\n" +
                "->Burj Huraira Mall\n" +
                "->Al-Rehman Trade Centre\n" +
                "->Toheed Mall\n");
    }
}