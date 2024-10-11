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

public class Ration extends AppCompatActivity {
    private Button pbt,isd,kln,rjhi,bnrp,lmh,allshed ,allshedbalence;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_ration);

        pbt = findViewById(R.id.pbt);
        isd = findViewById(R.id.isd);
        kln = findViewById(R.id.kln);
        rjhi = findViewById(R.id.rjhi);
        bnrp = findViewById(R.id.bnrp);
        lmh = findViewById(R.id.lmh);
        allshed = findViewById(R.id.allshedration);
        allshedbalence = findViewById(R.id.allshedBalence);

        pbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Ration.this, PbtRation.class);
                startActivity(intent);
            }
        });
        isd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Ration.this, Isd.class);
                startActivity(intent);

            }
        });
        rjhi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Ration.this, RjhiRation.class);
                startActivity(intent);

            }
        });
        kln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Ration.this, Klnration.class);
                startActivity(intent);

            }
        });
        bnrp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Ration.this, BnrpRation.class);
                startActivity(intent);

            }
        });
        lmh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Ration.this, LmhRation.class);
                startActivity(intent);

            }
        });
        allshed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Ration.this, AllsheedRation.class);
                startActivity(intent);

            }
        });

        allshedbalence.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Ration.this, AllshedBalence.class);
                startActivity(intent);

            }
        });

    }
}