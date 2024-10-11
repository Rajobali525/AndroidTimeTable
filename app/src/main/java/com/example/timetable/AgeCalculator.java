package com.example.timetable;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AgeCalculator extends AppCompatActivity {

    private Button b1,b2,currentdate;
    private TextView tv1,today,ctext;
    private EditText ed4,ed5,ed6;
    private DatePickerDialog  datePickerDialog;
    Integer n1,n2,n3,n4,n5,n6,currentYear,currentMonth,currentDay;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_age_calculator);


        tv1 = findViewById(R.id.t1);
        today = findViewById(R.id.today);
        ed4 = findViewById(R.id.ed4id);
        ed5 = findViewById(R.id.ed5id);
        ed6 = findViewById(R.id.ed6id);
        currentdate = findViewById(R.id.currendateid);
        b1 = findViewById(R.id.calculateid);
        b2 = findViewById(R.id.clearbuttonid);

        ctext = findViewById(R.id.currenttext);


        ed4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
              if(ed4.getText().toString().length()==2){
                  ed5.requestFocus();
              }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        ed5.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(ed5.getText().toString().length()==2){
                    ed6.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


        DatePicker datePicker = new DatePicker(AgeCalculator.this);
        int x = datePicker.getYear();
        int y = (datePicker.getMonth()) + 1;
        int z = datePicker.getDayOfMonth();

        datePickerDialog = new DatePickerDialog(AgeCalculator.this,

                new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {




                    }
                }, x, y, z);
        datePickerDialog.hide();
        today.setText(z + " / " + y + " / " + x);





        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n6 = Integer.valueOf(ed4.getText().toString().trim());
                n5 = Integer.valueOf(ed5.getText().toString().trim());
                n4 = Integer.valueOf(ed6.getText().toString().trim());


             if(ed4.length()==0 || ed5.length()==0 || ed6.length()==0){
                 Toast.makeText(getApplicationContext(),"Please fill all fields",Toast.LENGTH_LONG).show();
             }else{
                 if(n2>12 || n5>12 || n3>31 || n6>31){
                     Toast.makeText(getApplicationContext()," Please fill correctly",Toast.LENGTH_LONG).show();
                     tv1.setText("");
                 }

                 else if (n4>=n1 && n5>n2){
                     Toast.makeText(getApplicationContext()," Please fill correctly",Toast.LENGTH_LONG).show();
                     tv1.setText("");
                 }
                 else if(n4>=n1 && n5>=n2 && n6>n3){
                     Toast.makeText(getApplicationContext()," Please fill correctly",Toast.LENGTH_LONG).show();
                     tv1.setText("");
                 }

                 else if (n1 >= n4 && n2 > n5 && n3 > n6) {
                     int p1 = n3 - n6 + 1;
                     int p2 = n2 - n5;
                     int p3 = n1 - n4;
                     if(p1>=30){
                         p1 = p1-30;
                         p2 = p2+1;
                     }
                     if(p2>=12){
                         p2= p2-12;
                         p3 = p3+1;
                     }
                     tv1.setText(String.valueOf(p3 + " বছর " + p2 + " মাস  " + p1 + " দিন "));

                 } else if (n1 >= n4 && n2 > n5 && n3 < n6) {
                     int p1 = (n3 + 30 - n6) + 1;
                     int p2 = n2 + 1 - n5;
                     int p3 = n1 - n4;
                     if(p1>=30){
                         p1 = p1-30;
                         p2 = p2+1;
                     }
                     if(p2>=12){
                         p2= p2-12;
                         p3 = p3+1;
                     }
                     tv1.setText(String.valueOf(p3 + " বছর " + p2 + " মাস  " + p1 + " দিন "));

                 }
                 else if (n1 >= n4 && n2 < n5 && n3 < n6) {
                     int p1 = (n3 + 30 - n6) + 1;
                     int p2 = (n2 + 12) - n5;
                     int p3 = n1 - (n4 + 1);
                     if(p1>=30){
                         p1 = p1-30;
                         p2 = p2+1;
                     }
                     if(p2>=12){
                         p2= p2-12;
                         p3 = p3+1;
                     }
                     tv1.setText(String.valueOf(p3 + " বছর " + p2 + " মাস  " + p1 + " দিন "));

                 } else if (n1 >= n4 && n2 > n5 && n3 == n6) {
                     int p1 = (n3 - n6) + 1;
                     int p2 = n2 - n5;
                     int p3 = n1 - n4;
                     if(p1>=30){
                         p1 = p1-30;
                         p2 = p2+1;
                     }
                     if(p2>=12){
                         p2= p2-12;
                         p3 = p3+1;
                     }
                     tv1.setText(String.valueOf(p3 + " বছর " + p2 + " মাস  " + p1 + " দিন "));

                 }
                 else if (n1 >= n4 && n2 < n5 && n3 == n6) {
                     int p1 = (n3 - n6) + 1;
                     int p2 = (n2 + 12) - n5;
                     int p3 = n1 - (n4 + 1);
                     if(p1>=30){
                         p1 = p1-30;
                         p2 = p2+1;
                     }
                     if(p2>=12){
                         p2= p2-12;
                         p3 = p3+1;
                     }
                     tv1.setText(String.valueOf(p3 + " বছর " + p2 + " মাস  " + p1 + " দিন "));

                 }
                 else if (n1 >= n4 && n2 < n5 && n3 > n6) {
                     int p1 = (n3 - n6) + 1;
                     int p2 = (n2 + 12) - n5;
                     int p3 = n1 - (n4 + 1);
                     if(p1>=30){
                         p1 = p1-30;
                         p2 = p2+1;
                     }
                     if(p2>=12){
                         p2= p2-12;
                         p3 = p3+1;
                     }
                     tv1.setText(String.valueOf(p3 + " বছর " + p2 + " মাস  " + p1 + " দিন "));

                 }
                 else if (n1 >= n4 && n2 == n5 && n3 > n6) {
                     int p1 = (n3 - n6) + 1;
                     int p2 = n2 - n5;
                     int p3 = n1 - n4;
                     if(p1>=30){
                         p1 = p1-30;
                         p2 = p2+1;
                     }
                     if(p2>=12){
                         p2= p2-12;
                         p3 = p3+1;
                     }
                     tv1.setText(String.valueOf(p3 + " বছর " + p2 + " মাস  " + p1 + " দিন "));

                 }
                 else if (n1 >= n4 && n2 == n5 && n3 < n6) {
                     int p1 = (n3 + 30 - n6) + 1;
                     int p2 = (n2 + 12) - (n5 + 1);
                     int p3 = n1 - (n4 + 1);
                     if(p1>=30){
                         p1 = p1-30;
                         p2 = p2+1;
                     }
                     if(p2>=12){
                         p2= p2-12;
                         p3 = p3+1;
                     }
                     tv1.setText(String.valueOf(p3 + " বছর " + p2 + " মাস  " + p1 + " দিন "));

                 }
                 else if (n1 >= n4 && n2 == n5 && n3== n6) {
                     int p1 = (n3-n6) + 1;
                     int p2 = n2- n5 ;
                     int p3 = n1 - n4 ;
                     if(p1>=30){
                         p1 = p1-30;
                         p2 = p2+1;
                     }
                     if(p2>=12){
                         p2= p2-12;
                         p3 = p3+1;
                     }
                     tv1.setText(String.valueOf(p3 + " বছর " + p2 + " মাস  " + p1 + " দিন "));

                 }
                 else if (n4>n1) {
                     Toast.makeText(getApplicationContext()," Please fill year correctly",Toast.LENGTH_LONG).show();
                     tv1.setText("");
                 }
                 else {
                     Toast.makeText(getApplicationContext()," Please fill year correctly",Toast.LENGTH_LONG).show();
                     tv1.setText("");

                 }

             }


            }

        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tv1.setText("");
                ctext.setText("");
                ed4.setText("");
                ed5.setText("");
                ed6.setText("");

            }
        });
        currentdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePicker datePicker = new DatePicker(AgeCalculator.this);
                 currentYear = datePicker.getYear();
                 currentMonth = datePicker.getMonth();
                 currentDay = datePicker.getDayOfMonth();

                datePickerDialog = new DatePickerDialog(AgeCalculator.this,

                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {

                            n1 = year;
                            n2 = month+1;
                            n3 = dayOfMonth;
                            ctext.setText(n3 + " / " + n2 + " / " + n1);

                            }
                        },currentYear,currentMonth,currentDay);
                datePickerDialog.show();

            }
        });

    }
}