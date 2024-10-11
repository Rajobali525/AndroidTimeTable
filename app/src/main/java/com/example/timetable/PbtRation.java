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

public class PbtRation extends AppCompatActivity {
    private Button intercity,intercitymg,goods,mail,balenceration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_pbt_ration);

        intercity = findViewById(R.id.intercityid);
        mail = findViewById(R.id.mailid);
        goods = findViewById(R.id.goodsid);
        balenceration = findViewById(R.id.balenceration);
        intercitymg = findViewById(R.id.intercitymgid);

        intercity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PbtRation.this, Pbtintercity.class);
                startActivity(intent);
            }
        });
        intercitymg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PbtRation.this, Intercitymg.class);
                startActivity(intent);

            }
        });

        balenceration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PbtRation.this, BalenceRation.class);
                startActivity(intent);

            }
        });
        mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PbtRation.this, NewActivity.class);
                startActivity(intent);

            }
        });

    }
}