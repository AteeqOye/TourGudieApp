package com.example.tourgudieapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Content_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);
    }

    public void historymsg(View view) {
        Intent intent = new Intent(this, HistoryActivity.class);
        startActivity(intent);
    }

    public void locationmsg(View view) {
        Intent intent = new Intent(this, Location_Activity.class);
        startActivity(intent);
    }

    public void demomsg(View view) {
        Intent intent = new Intent(this, Demographics_Activity.class);
        startActivity(intent);
    }

    public void econmymsg(View view) {
        Intent intent = new Intent(this, Economy_Activity.class);
        startActivity(intent);
    }

    public void healthmsg(View view) {
        Intent intent = new Intent(this, Health_Activity.class);
        startActivity(intent);
    }
    public void educationmsg(View view) {
        Intent intent = new Intent(this, Education_Activity.class);
        startActivity(intent);
    }
    public void transportationm(View view) {
        Intent intent = new Intent(this, Transportation_Activity.class);
        startActivity(intent);
    }
    public void airbase(View view)
    {
        Intent intent = new Intent(this, AirBase_Activity.class);
        startActivity(intent);
    }
    public  void receationmsg(View view)
    {
        Intent intent = new Intent(this , Recreation_Activity.class);
        startActivity(intent);
    }
    public void sportsmsg(View view)
    {
        Intent intent = new Intent(this, Sports_Activity.class);
        startActivity(intent);
    }
    public void fooddrinkmsg(View view)
    {
        Intent intent = new Intent(this, FoodDrink_Activity.class);
        startActivity(intent);
    }
}