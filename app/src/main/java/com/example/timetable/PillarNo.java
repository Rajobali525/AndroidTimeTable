package com.example.timetable;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class PillarNo extends AppCompatActivity {
    private AutoCompleteTextView autoCompleteTextView;
    private Button button,clear;
    private TextView tv1;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_pillar_no);

        autoCompleteTextView = findViewById(R.id.autocompletetextid);
        listView = findViewById(R.id.listviewid);

        button = findViewById(R.id.showbuttonid);
        tv1 = findViewById(R.id.textview);
        clear = findViewById(R.id.clear);



        String [] StationPiller = getResources().getStringArray(R.array.stationpiller);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,StationPiller);
        autoCompleteTextView.setAdapter(adapter);
        autoCompleteTextView.setThreshold(1);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

//                if (position == 0 ) {
//                    tv1.setText("0 KLN খুলনা 0.00(B)");
//                }
//                else if (position == 1 ) {
//                    tv1.setText("1 KLNJ খুলনা জংশন 2.34(B)");
//                } else if (position == 2 ) {
//                    tv1.setText("2 DT দৌলতপুর কলেজ 6.34(D)");
//                }


            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                autoCompleteTextView.setText("");
                tv1.setText("");
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText("DI - ডাবল অয়ার ইন্টারলকড স্টেশন \n r - রীলে ইন্টারলকড স্টেশন \n" +
                        " f - রানিং লাইন ব্যবস্থা সম্বলিত সিঙ্গেল লাইন স্টেশন \n " +
                        " S - ই-বি-আর স্ট্যান্ডার্ড টাইপ সিঙ্গেল লাইন ইন্টারলকড স্টেশন \n" +
                        "W - পানি সরবরাহের ব্যবস্থা সম্বলিত স্টেশন \n " +
                        " C - ক্যারেজ পরীক্ষা করার সুবিধা সম্বলিত স্টেশন \n" +
                        " E - ইঞ্জিন বদলানোর ব্যবস্থা সম্বলিত স্টেশন \n " +
                        " L - লুপ লাইন ও পাশ্ববর্তি লুপের সংখ্যা নির্দেশক \n" +
                        " MI - মেকানিক্যাল ইন্টারলকড সম্বলিত স্টেশন \n" +
                        "NIM - নন ইন্টারলকড মেকানিক্যাল স্টেশন \n" +
                        "NCL - নন ইন্টারলকড কালার লাইট সম্বলিত স্টেশন \n" +
                        "CBI -  কম্পিউটার বেইজড ইন্টারলকড সম্বলিত স্টেশন \n" +
                        "N - নন ইন্টারলকড স্টেশন ");

            }
        });

    }
}