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

public class MainActivity extends AppCompatActivity {
    private Button timetable,sectionalspeed,mileagebutton,landmeasurement,agecalculator,time,ration,guard,mobile,call,opt,offday,common,balenceration,pillar,quran,practice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        timetable = findViewById(R.id.timetableid);
        sectionalspeed = findViewById(R.id.sectionalspeed);
        mileagebutton = findViewById(R.id.mileagebuttonid);
        landmeasurement = findViewById(R.id.landmeasurement);
        agecalculator = findViewById(R.id.agecalculator);
        time = findViewById(R.id.time);
        mobile = findViewById(R.id.mobile);
        call = findViewById(R.id.call);
        guard = findViewById(R.id.guard);
        opt = findViewById(R.id.opt);
        offday = findViewById(R.id.offday);
        ration = findViewById(R.id.ration);
        pillar = findViewById(R.id.pillar);
        common = findViewById(R.id.commonelements);

        practice = findViewById(R.id.practice);


        timetable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,TimeTable.class);
                startActivity(intent);
            }
        });
        sectionalspeed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Sectionalspeed.class);
                startActivity(intent);

            }
        });
        mileagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MileageActivity.class);
                startActivity(intent);

            }
        });

        landmeasurement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LandMeasurement.class);
                startActivity(intent);

            }
        });
        agecalculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AgeCalculator.class);
                startActivity(intent);

            }
        });
        time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Time.class);
                startActivity(intent);

            }
        });
        mobile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MobileNumber.class);
                startActivity(intent);

            }
        });
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Call.class);
                startActivity(intent);

            }
        });
        opt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, OPT.class);
                startActivity(intent);

            }
        });
        offday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Offday.class);
                startActivity(intent);

            }
        });
        guard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Guard.class);
                startActivity(intent);

            }
        });
        ration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Ration.class);
                startActivity(intent);

            }
        });
        common.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Common.class);
                startActivity(intent);

            }
        });
        pillar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PillarNo.class);
                startActivity(intent);

            }
        });

        practice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Practice.class);
                startActivity(intent);

            }
        });




    }
}