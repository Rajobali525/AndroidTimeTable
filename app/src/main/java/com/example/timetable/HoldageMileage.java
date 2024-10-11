package com.example.timetable;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class HoldageMileage extends AppCompatActivity {

    private EditText ed1,ed2,ed3,ed4,ur;
    private TextView totalwork,runningtime,detentiontime,detentionmileage,  totalmileages ;
    private Button clculate,clear;

    Integer n1,n2,n3,n4,w1,w2,r1,r2,w3,w4,w5,r3,r4;
    double m;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_holdage_mileage);


        ed1 = findViewById(R.id.starthour);
        ed2 = findViewById(R.id.startminute);
        ed3 = findViewById(R.id.endhour);
        ed4 = findViewById(R.id.endtminute);


        clculate= findViewById(R.id.calculatebuttonid);
        clear = findViewById(R.id.clearbuttonid);

        totalwork = findViewById(R.id.totalwork);
        runningtime = findViewById(R.id.runningtime);
        detentiontime = findViewById(R.id.detentiontime);
        detentionmileage = findViewById(R.id.detentionmileage);
        totalmileages= findViewById(R.id.totalmileage);


        ed1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(ed1.getText().toString().length()==2){
                    ed2.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        ed2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(ed2.getText().toString().length()==2){
                    ed3.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        ed3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(ed3.getText().toString().length()==2){
                    ed4.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });




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


                    if (n3 > n1 && n4 > n2) {
                        w1 = n3 - n1;
                        w2 = n4 - n2;

                    } else if (n3 > n1 && n2 > n4) {
                        w1 = n3 - n1 - 1;
                        w2 = (60 - n2) + n4;


                    } else if (n1 > n3 && n4 > n2) {
                        w1 = (24 - n1) + n3;
                        w2 = n4 - n2;

                    } else if (n1 > n3 && n2 > n4) {
                        w1 = (24 - n1) + n3 - 1;
                        w2 = (60 - n2) + n4;


                    } else if (n1 == n3 && n2 > n4) {
                        w1 = 23;
                        w2 = 60 + n4 - n2;

                    } else if (n1 == n3 && n2 == n4) {
                        w1 = 0;
                        w2 = 0;

                    } else if (n1 == n3 && n2 < n4) {
                        w1 = 0;
                        w2 = n4 - n2;

                    } else if (n2 == n4 && n1 > n3) {
                        w1 = 24 - n1 + n3;
                        w2 = 0;

                    } else if (n2 == n4 && n3 > n1) {
                        w1 = n3 - n1;
                        w2 = 0;

                    }

                    runningtime.setText("Total Time  " + w1 + "  Hour  " + w2 + "  Minute ");

                    r1 = w1 * 60 + w2;

                    r2 = r1 - 480;
                    r3 = r2 / 60;
                    r4 = r2 % 60;

                    totalwork.setText(String.valueOf("Detaching eight hour " + r3 + " Hour " + r4 + " Minute "));
                    w3 = r2 / 2;

                    w4 = w3 / 60;
                    w5 = w3 % 60;
                    detentiontime.setText(String.valueOf("Divide by two " + w4 + "  Hour " + w5 + "  Minute"));
                    m = (int) Math.ceil((10 * w3) / 48.0);
                    detentionmileage.setText(String.valueOf(" Total Mileage " + m));
                }

            };
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText("");
                ed2.setText("");
                ed3.setText("");
                ed4.setText("");
                runningtime.setText("");
                totalwork.setText("");
                detentiontime.setText("");
                detentionmileage.setText("");
            }
        });
    }
}


