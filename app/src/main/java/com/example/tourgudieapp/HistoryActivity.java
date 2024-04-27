package com.example.tourgudieapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class HistoryActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
        //up button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TextView textView = findViewById(R.id.history_of_sargodha);
        textView.setText("Sargodha was established by the British as a c" +
                "anal-colony in 1903, and was initially spelt Sargoda." +
                "Sargodha was badly affected by an outbreak of the bubonic " +
                "plague in 1903, and experienced a milder outbreak in 1904." +
                "Although it was a small town in the beginning, the " +
                "British Royal Air Force built an airport here due to its strategic location." +
                "The term \"Sargodha\" has its origin in the words" +
                " \"Sar\" (from \"sarowar\") meaning \"pond\" and \"Godha\" " +
                "meaning \"Sadhu\", which means \"Pond of Godha\". " +
                "This city was founded by Lady Trooper by the supervision of Sir" +
                " Charles Montgomery Rivaz KCSI (1845 – 7 October 1926), a colonial " +
                "administrator in British India and Lieutenant-Governor" +
                " of the Punjab from 1902 to 1907.");


    }


}

