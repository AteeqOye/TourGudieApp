package com.example.tourgudieapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class Location_Activity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        TextView textView = findViewById(R.id.location_text);
        textView.setText("Location of Sargodha with respect to five major cities of Pakistan is as follow:\n" +
                "\n" +
                "->1,202 km (747 mi) North of Karachi\n" +
                "->187 km (116 mi) West of Lahore\n" +
                "->241 km (150 mi) South of Islamabad\n" +
                "->91 km (57 mi) North-West of Faisalabad\n" +
                "->223 km (139 mi) South of Rawalpindi\n" +
                "\nSargodha is situated in Pakistani province of Punjab. " +
                "It is located 187 kilometres (116 mi) " +
                "northwest of Lahore, in Sargodha District." +
                "It lies about 48 kilometres (30 mi) from " +
                "the M-2 motorway, which connects Lahore and " +
                "Islamabad. It is connected to the M-2 by several " +
                "interchanges at different locations. Sargodha is " +
                "roughly 91 km (57 mi) from Faisalabad, " +
                "due southeast.Directly east connected" +
                " by the M-2 motorway are Lahore and" +
                " the route to Rawalpindi and " +
                "Islamabad. Due east is the city of" +
                " Jhang; toward the west are the city of" +
                " Mianwali and the Chashma Barrage.\n" +
                "\n");
    }
}