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

public class BnrpRation extends AppCompatActivity {
    private Button ration,balenceration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_bnrp_ration);

        ration = findViewById(R.id.rationid);
        balenceration = findViewById(R.id.balencerationid);

        ration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BnrpRation.this, Bnrpintercity.class);
                startActivity(intent);
            }
        });
        balenceration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BnrpRation.this, BNRPBalence.class);
                startActivity(intent);

            }
        });

    }
}