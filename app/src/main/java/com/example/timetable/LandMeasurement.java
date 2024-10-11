package com.example.timetable;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LandMeasurement extends AppCompatActivity {
    private EditText ed1,ed2,ed3,ed4;
    private TextView t1,t2,t3,t4,t5;
    private Button clculate,clear;

    Integer n1,n2,n3,n4,w1,w2,r1,r2,w3,w4,w5,r3,r4;
    double p1,p2,p3,p4,p5,p6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_land_measurement);
        ed1 = findViewById(R.id.starthour);
        ed2 = findViewById(R.id.startminute);
        ed3 = findViewById(R.id.endhour);
        ed4 = findViewById(R.id.endtminute);


        clculate= findViewById(R.id.calculatebuttonid);
        clear = findViewById(R.id.clearbuttonid);



        t1 = findViewById(R.id.totalwork);
        t2 = findViewById(R.id.runningtime);
        t3 = findViewById(R.id.detentiontime);
        t4 = findViewById(R.id.detentionmileage);
        t5= findViewById(R.id.totalmileage);

        clculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1.length() == 0 || ed2.length() == 0 || ed3.length() == 0 || ed4.length() == 0) {
                    Toast.makeText(getApplicationContext(), "Please fill all items", Toast.LENGTH_LONG).show();

                }
                else {
                    n1 = Integer.valueOf(ed1.getText().toString());
                    n2 = Integer.valueOf(ed2.getText().toString());
                    n3 = Integer.valueOf(ed3.getText().toString());
                    n4 = Integer.valueOf(ed4.getText().toString());
                    p1= ((n1*12)+n2)/12.0;
                    p2 = ((n3*12)+n4)/12.0;
                    p3 = (p1*p2)/432.0;
                    p4 = (p1*p2)/720.0;
                    p5 = (p1*p2)/14400.0;
                    p6 = (p1*p2)/43200.0;


                    t2.setText(String.valueOf( "  একর     :  " + p6));
                    t1.setText(String.valueOf("   বিঘা     : " + p5));
                    t3.setText(String.valueOf("   কাঠা     :  " + p4));
                    t4.setText(String.valueOf("  শতাংশ    :  " + p3));

                }

            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText("");
                ed2.setText("");
                ed3.setText("");
                ed4.setText("");
                t1.setText("");
                t2.setText("");
                t3.setText("");
                t4.setText("");
                t5.setText("");
            }
        });

//         Get data from other activity

//       getdata.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(LandMeasurement.this,LIstDataActivity.class);
//                startActivityForResult(intent,1);
//
//            }
//        });
//
//    }
//
//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//
//        if(requestCode==1){
//            String value = data.getStringExtra("key");
//            t1.setText(value);
//        }
//
    }
}