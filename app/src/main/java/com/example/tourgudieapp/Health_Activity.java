package com.example.tourgudieapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class Health_Activity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TextView textView1 = findViewById(R.id.paf_host);
        textView1.setText("PAF Hospitals");

        TextView textView = findViewById(R.id.health_id);
        textView.setText("Pakistan Air Force (PAF) hospitals are secondary and tertiary care hospitals dedicated to provide health facilities to the uniformed and civilian personnel of PAF. These hospitals are situated at various bases of PAF and include:\n" +
                "\n" +
                "->PAF Hospital Unit 2 Islamabad is open for Public.\n" +
                "->PAF Hospital Unit 2, Islamabad.\n" +
                "->PAF hospital Islamabad\n" +
                "->PAF hospital Sargodha\n" +
                "->PAF hospital Lahore\n" +
                "->PAF hospital Mianwali\n" +
                "->PAF hospital, Rafiqui Shorkot\n" +
                "->PAF hospital Faisal base Karachi\n" +
                "->PAF hospital Masroor base Karachi\n" +
                "\nThe doctors and the nurses are borrowed from the Army Medical Corps, " +
                "Army Dental Corps and Armed Forces Nursing Services of Pakistan army. " +
                "However, lately the Air force has also started to induct the doctors directly. " +
                "Soon after the Inauguration of its first ever Medical College here in Air University Islamabad," +
                " there was a dire need to meet the requirements of medical students and patients." +
                " Pakistan Air Force in Islamabad launched a state of the art 600 bed Hospital providing Medical, " +
                "Surgical, Gynae, Urology, Cardiology, ENT, Eye, Radiology, Pathology, Dermatology," +
                " Psychiatry and Physiotherapy services. PAF Hospital Islamabad Unit 2 is open for general public, " +
                "it is not specifically for the uniform personnel.");
    }
}