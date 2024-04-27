package com.example.tourgudieapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class Recreation_Activity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recreation);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TextView textView = findViewById(R.id.recreation_id);
        textView.setText("Kirana Hills\n" +
                "\nThe Kirana Hills are a small and extensive rocky mountain range located in Sargodha." +
                " They are a commonly-visited tourist attraction in Sargodha City. " +
                "Locally known as the Black Mountains due to their brownish landscape, their highest " +
                "peak is about 980 feet (300 m).\n" +
                "\n" +
                "Jinnah Hall\n" +
                "\nJinnah Hall is a historical landmark in Sargodha. Jinnah Hall was built in 1949." +
                " It was named for Muhammad Ali Jinnah, the founder of Pakistan. " +
                "Jinnah Hall was originally built as a town hall and " +
                "library in Company Bagh, Sargodha; now it is currently used as an exhibition hall, event space, and library.");
    }
}