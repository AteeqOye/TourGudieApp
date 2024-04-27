package com.example.tourgudieapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class Education_Activity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TextView textView = findViewById(R.id.education_id);
        textView.setText("According to the census of 1998, the literacy rate of Sargodha was 67.8%, " +
                "while in 2017 the literacy rate was recorded as 80.5%.The city is considered the educational hub of " +
                "Sargodha Division, handling a population of about 8.1 million.Sargodha Division has its own Education " +
                "Board for Secondary School Certificate (SSC) and Higher Secondary School Certificate (HSSC) Examinations. " +
                "There are about four universities and numerous colleges of Medical Sciences, Law, IT, " +
                "Commerce, Engineering and Intermediate Courses. Quaid-e-Azam Law College is famous for law education.\n" +
                "\n-List of educational institutes in Sargodha\n" +
                "\n-> University of Sargodha" +
                "\n-> Army Public College" +
                "\n-> PAF College");
    }
}