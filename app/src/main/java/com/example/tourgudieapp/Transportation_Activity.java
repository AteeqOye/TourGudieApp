package com.example.tourgudieapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class Transportation_Activity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transportation);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TextView textView = findViewById(R.id.transport_id);
        textView.setText("Roads and flyovers\n" +
                "The 4 km (2.5 mi) long University Road runs from 47 Pull to Khayyam Chowk. Other main roads include 6 km (3.7 mi) long Fatima Jinnah Road & City Road, Canal Road, Katchery Road, Stadium Road, Club Road, Jail Road, Queens Road, Mushaf Ali Mir Road, Railway Road, Lahore Road, Faisalabad Road, Eid Gah Road, Mianwali Road, Sillanwali Road, Bhalwal Road, and Shaheenabad Road.\n" +
                "\n" +
                "There are 3 flyovers located in the city area to regulate the flow of traffic:\n" +
                "\n" +
                "Khayyam Chowk's flyover has a length of 1 km (0.62 mi) that leads to Mianwali Road.\n" +
                "Fatima Jinnah Road's flyover also has a length of 1 km (0.62 mi).\n" +
                "A 0.4 km (0.25 mi) long flyover is located on Kachehry Road.\n");
    }
}