package com.example.timetable;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MileageActivity extends AppCompatActivity {
    private Button mileage,holdagemileage,allshedmileage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_mileage);

        mileage = findViewById(R.id.mileagebuttoniddd);
        holdagemileage = findViewById(R.id.holdagemileage);
        allshedmileage = findViewById(R.id.anyshedmileage);

        mileage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MileageActivity.this, Mileage.class);
                startActivity(intent);
            }
        });
        holdagemileage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MileageActivity.this, HoldageMileage.class);
                startActivity(intent);
            }
        });
        allshedmileage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MileageActivity.this, AllShedMileage.class);
                startActivity(intent);

            }
        });




    }
}