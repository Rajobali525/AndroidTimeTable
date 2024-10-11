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

public class AllsheedRation extends AppCompatActivity {
    private Button eighteighty,foureighty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_allsheed_ration);

        eighteighty = findViewById(R.id.eighteightyid);
        foureighty = findViewById(R.id.foureightyid);

        eighteighty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AllsheedRation.this,EightEighty.class);
                startActivity(intent);
            }
        });

        foureighty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AllsheedRation.this,FourEighty.class);
                startActivity(intent);

            }
        });

    }
}