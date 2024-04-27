package com.example.tourgudieapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class FoodDrink_Activity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_drink);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TextView textView = findViewById(R.id.fooddrink_id);
        textView.setText("The cuisine of Sargodha is similar to that of other regions of South Asia," +
                " with some of it originating from the royal kitchens of 16th-century Mughal emperors." +
                " Most of those dishes have their roots in British, Indian, Central Asian and Middle Eastern cuisine." +
                " Pakistani cooking uses large quantities of spices, herbs, and seasoning." +
                " Garlic, ginger, turmeric, red chili, and garam masala are used in most dishes, " +
                "and home cooking regularly includes curry. Roti, a thin flatbread made from wheat, " +
                "is a staple food, usually served with curry, meat, vegetables, and lentils. Rice is " +
                "also common; it is served plain, fried with spices, and in sweet dishes.\n" +
                "\n" +
                "Lassi is a traditional drink in Punjab, including Sargodha. " +
                "Black tea with milk and sugar is also popular throughout the city and is consumed daily by most of the population.");
    }
}