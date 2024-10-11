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

public class Isd extends AppCompatActivity {
    private Button intercity,goods,mail,balenceintercity,balencesecond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_isd);

        intercity = findViewById(R.id.isdintercity);
        mail = findViewById(R.id.isdmail);
        goods = findViewById(R.id.isdgoods);
        balenceintercity = findViewById(R.id.balenceisdintercity);
        balencesecond = findViewById(R.id.balencesixtyfive);


        intercity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Isd.this,IsdIntercity.class);
                startActivity(intent);
            }
        });

        balenceintercity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Isd.this,BalenceIsdIntercity.class);
                startActivity(intent);

            }
        });
        balencesecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Isd.this,BalenceIsdSixtyFive.class);
                startActivity(intent);

            }
        });


    }
}