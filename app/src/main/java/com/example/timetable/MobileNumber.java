package com.example.timetable;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MobileNumber extends AppCompatActivity {
    private AutoCompleteTextView autoCompleteTextView;
    private Button showbutton,clear;
    private TextView tv1;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_mobile_number);

        autoCompleteTextView = findViewById(R.id.autocompletetextid);
        listView = findViewById(R.id.listviewid);

        showbutton = findViewById(R.id.showbuttonid);
        tv1 = findViewById(R.id.textview);
        clear = findViewById(R.id.clear);



        String [] MobileNumber = getResources().getStringArray(R.array.mobilenumber);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,MobileNumber);
        autoCompleteTextView.setAdapter(adapter);
        autoCompleteTextView.setThreshold(1);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) {
                    Intent intent = new Intent(MobileNumber.this, MainActivity49.class);
                    startActivity(intent);

                }
                else if (position == 1) {
                    Intent intent = new Intent(MobileNumber.this, MainActivity50.class);
                    startActivity(intent);

                }
                else if (position == 2) {
                    Intent intent = new Intent(MobileNumber.this, MainActivity51.class);
                    startActivity(intent);

                }
                else if (position == 3) {
                    Intent intent = new Intent(MobileNumber.this, MainActivity52.class);
                    startActivity(intent);

                }
                else if (position == 4) {
                    Intent intent = new Intent(MobileNumber.this, MainActivity53.class);
                    startActivity(intent);

                }
                else if (position == 5) {
                    Intent intent = new Intent(MobileNumber.this, MainActivity54.class);
                    startActivity(intent);

                }
                else if (position == 6) {
                    Intent intent = new Intent(MobileNumber.this, MainActivity55.class);
                    startActivity(intent);

                }
                else if (position == 7) {
                    Intent intent = new Intent(MobileNumber.this, MainActivity56.class);
                    startActivity(intent);

                }
            }
        });

        showbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = autoCompleteTextView.getText().toString();
                if(text.equals("pbt bg")){
                    Intent intent = new Intent(MobileNumber.this, MainActivity49.class);
                    startActivity(intent);
                }
                else if(text.equals("pbt mg")){
                    Intent intent = new Intent(MobileNumber.this, MainActivity50.class);
                    startActivity(intent);
                }
                else if(text.equals("isd")){
                    Intent intent = new Intent(MobileNumber.this, MainActivity51.class);
                    startActivity(intent);
                }
                else if(text.equals("rjhi")){
                    Intent intent = new Intent(MobileNumber.this, MainActivity52.class);
                    startActivity(intent);
                }
                else if(text.equals("barp")){
                    Intent intent = new Intent(MobileNumber.this, MainActivity53.class);
                    startActivity(intent);
                }
                else if(text.equals("lmh")){
                    Intent intent = new Intent(MobileNumber.this, MainActivity54.class);
                    startActivity(intent);
                }
                else if(text.equals("new alm pbt")){
                    Intent intent = new Intent(MobileNumber.this, MainActivity55.class);
                    startActivity(intent);
                }
                else if(text.equals("station")){
                    Intent intent = new Intent(MobileNumber.this, MainActivity56.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(getApplicationContext(),"Please select correct option",Toast.LENGTH_LONG).show();
                }
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                autoCompleteTextView.setText("");
            }
        });

    }
}