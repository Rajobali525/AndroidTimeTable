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

public class Klnration extends AppCompatActivity {
    private Button intercity,balence;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_klnration);

        intercity = findViewById(R.id.intercityid);
        balence = findViewById(R.id.balenceintercity);

        intercity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Klnration.this,Klnintercity.class);
                startActivity(intent);
            }
        });

        balence.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Klnration.this,Balenceklnintercity.class);
                startActivity(intent);

            }
        });

    }
}