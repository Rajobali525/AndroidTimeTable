package com.example.timetable;

import android.content.Intent;
import android.net.Uri;
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

import java.util.ArrayList;

public class Common extends AppCompatActivity {
    private AutoCompleteTextView autoCompleteTextView;
    private Button button,clear;
    private TextView tv1;
    private ListView listView;



    ArrayList<String> c = new ArrayList<>();
    ArrayList<String> d = new ArrayList<>();

    ArrayList<String> k = new ArrayList<>();
    ArrayList<String> p = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_common);

        autoCompleteTextView = findViewById(R.id.autocompletetextid);
        listView = findViewById(R.id.listviewid);

       button = findViewById(R.id.showbuttonid);
        tv1 = findViewById(R.id.textview);
        clear = findViewById(R.id.clear);



        String [] Place = getResources().getStringArray(R.array.place);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,Place);
        autoCompleteTextView.setAdapter(adapter);
        autoCompleteTextView.setThreshold(1);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0 || position==1) {
                    tv1.setText("মেট্ররেল\nবিআরটিসি\n গ্রীন ঢাকা \nবিকল্প অটো সার্ভিস \n ৮ নম্বর \n বাহন পরিবহন \n মেশকাত \n দীপন \n" +
                            "মীডলাইন \n ");
                }
         else if (position == 2 || position ==3) {
                    tv1.setText("বিআরটিসি \n গ্রীন ঢাকা \nস্কাইলাইন \n বিকল্প অটো  সার্ভিস \n ইটিসি ট্রান্সপোর্ট \n হিমাচল \n " +
                            " খাজাবাবা পরিবহন \n  মিরপুর ইউনাইটেড  সার্ভিস \n আজমেরী গ্লোরী \n এফটিসিএল \n দীপন \n " +
                            "মীডলাইন \n বাহন পরিবহন \n প্রচেষ্টা \n ");
                }
         else if (position == 4 || position ==5) {
                    tv1.setText("মেট্রোরেল \n বিআরটিসি  \n বিকল্প অটো  সার্ভিস \n ইটিসি ট্রান্সপোর্ট \n হিমাচল \n " +
                            " খাজাবাবা পরিবহন \n  মিরপুর ইউনাইটেড  সার্ভিস \n দেওয়ান \n এফটিসিএল \n দীপন \n ৮ নম্বর \n মেশকাত  " +
                            "মীডলাইন \n বাহন পরিবহন \n ");
                }
         else if (position == 6 || position ==7) {
                    tv1.setText("বিআরটিসি  \n বিকল্প অটে সার্ভিস \n ইটিসি ট্রান্সপোর্ট \n হিমাচল \n মিরপুর ইউনাইটেড সার্ভিস " +
                            "\n দেওয়ান \n মেশকাত \n স্বাধীন পরিবহন \n  ");
                }

            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String f = autoCompleteTextView.getText().toString().trim();

                if (f.equals("মতিঝিল") || f.equals("mothegil")) {
                    tv1.setText("মেট্ররেল\nবিআরটিসি\n গ্রীন ঢাকা \nবিকল্প অটো সার্ভিস \n ৮ নম্বর \n বাহন পরিবহন \n মেশকাত \n দীপন \n" +
                            "মীডলাইন \n ");
                } else if (f.equals("গুলিস্থান") || f.equals("gulistan")) {
                    tv1.setText("বিআরটিসি \n গ্রীন ঢাকা \nস্কাইলাইন \n বিকল্প অটো  সার্ভিস \n ইটিসি ট্রান্সপোর্ট \n হিমাচল \n " +
                            " খাজাবাবা পরিবহন \n  মিরপুর ইউনাইটেড  সার্ভিস \n আজমেরী গ্লোরী \n এফটিসিএল \n দীপন \n " +
                            "মীডলাইন \n বাহন পরিবহন \n প্রচেষ্টা \n ");
                } else if (f.equals("শাহবাগ") || f.equals("shahabag")) {
                    tv1.setText("মেট্রোরেল \n বিআরটিসি  \n বিকল্প অটো  সার্ভিস \n ইটিসি ট্রান্সপোর্ট \n হিমাচল \n " +
                            " খাজাবাবা পরিবহন \n  মিরপুর ইউনাইটেড  সার্ভিস \n দেওয়ান \n এফটিসিএল \n দীপন \n ৮ নম্বর \n মেশকাত  " +
                            "মীডলাইন \n বাহন পরিবহন \n ");
                }
                else if (f.equals("বাংলামটর") || f.equals("banglamotor")) {
                    tv1.setText("বিআরটিসি  \n বিকল্প অটে সার্ভিস \n ইটিসি ট্রান্সপোর্ট \n হিমাচল \n মিরপুর ইউনাইটেড সার্ভিস " +
                            "\n দেওয়ান \n মেশকাত \n স্বাধীন পরিবহন \n  ");
                }
                else if (f.equals("ফার্মগেট") || f.equals("farmgate")) {
                    tv1.setText("মেট্রোরেল \nবিআরটিসি  \n বিকল্প অটো সার্ভিস সার্ভিস \n হিমাচল \n খাজাবাবা পরিবহন \n মিরপুর ইউনাইটেড সার্ভিস " +
                            "\n বিকাশ পরিবহন \n দেওয়ান \n ভিআইপি 27 \n মেশকাত \n স্বাধীন পরিবহন \n ট্রাস্ট ট্রান্সপোর্ট  ");
                }
                else if (f.equals("জাহাঙ্গীর গেট") || f.equals("jahangir gate")) {
                    tv1.setText("বিআরটিসি \n দেওয়ান \n ভিআইপি 27 \n আলিফ এন্টারপ্রাইজ \n ট্রাস্ট ট্রান্সপোর্ট ");
                }
                else if (f.equals("মহাখালী") || f.equals("mohakhali")) {
                    tv1.setText("মেট্রোরেল \nবিআরটিসি \n স্কাইলাইন \n বিকাশ পরিবহন \n দেওয়ান \n ভিআইপি 27 \n আলিফ এন্টারপ্রাইজ " +
                            "\n ক্যান্টনমেন্ট মিনি সার্ভিস \n  ");
                }
                else if (f.equals("বনানী") || f.equals("bonani")) {
                    tv1.setText("বিআরটিসি \n বিকাশ পরিবহন \n ভিআইপি 27 \n আজমেরী গ্লোরী \n ট্রাস্ট ট্রান্সপোর্ট \n ক্যান্টটমেন্ট মিনি সার্ভিস \n ");
                }
             else if (f.equals("কাকলি") || f.equals("kakoli")) {
                    tv1.setText("বিআরটিসি \n স্কাইলাইন \n বিকাশ পরিবহন \n আজমেরী গ্লোরী \n রবরব পরিবহন \n  ");
                }
             else if (f.equals("কুড়িল বিশ্বরোড") || f.equals("kuril bishoroad")) {
                    tv1.setText("বিআরটিসি \n গ্রীন ঢাকা \n প্রচেষ্টা \n স্কাইলাইন \n বিকাশ পরিবহন \n দেওয়ান \n ভিআইপি 27 \n " +
                            "আজমেরী গ্লোরী \n  ");
                }
             else if (f.equals("খিলখেত") || f.equals("khil khat")) {
                    tv1.setText("বিআরটিসি \n গ্রীন ঢাকা \n প্রচেষ্টা \n স্কাইলাইন \n বাসমতি ট্রান্সপোর্ট \n বিকাশ পরিবহন \n  ভিআইপি 27 \n আজমেরী গ্লোরী \n ");
                }
             else if (f.equals("বিমান বন্দর") || f.equals("air port")) {
                    tv1.setText("বিআরটিসি \n গ্রীন ঢাকা \n প্রচেষ্টা \n স্কাইলাইন \n বাসমতি ট্রান্সপোর্ট \n বিকাশ পরিবহন \n ভিআইপি 27 \n  আজমেরী গ্লোরী \n");
                }
        else if (f.equals("আব্দুল্লাপুর") || f.equals("abdullapur")) {
                    tv1.setText("বিআরটিসি \n প্রচেষ্টা \n স্কাইলাইন \n বিকাশ পরিবহন \n ভিআইপি 27 \n আজমেরী গ্লোরী");
                }
        else if (f.equals("টঙ্গী") || f.equals("tongi")) {
                    tv1.setText("বিআরটিসি \n স্কাইলাইন \n বাসমতি ট্রান্সপোর্ট \n ভিআইপি 27 \n আজমেরী গ্লেরী \n ");
                }
        else if (f.equals("কাকরাইল") || f.equals("kakrail")) {
                    tv1.setText("গ্রীন ঢাকা \n প্রচেষ্টা \n স্কাইলাইন \n আজমেরী গ্লেরী \n  ");
                }
      else if (f.equals("শান্তিনগর") || f.equals("shantinagor")) {
                    tv1.setText("গ্রীন ঢাকা \n প্রচেষ্টা \n স্কাইলাইন \n আজমেরী গ্লোরী \n   ");
                }
      else if (f.equals("মালিবাগ") || f.equals("malibag")) {
                    tv1.setText("গ্রীন ঢাকা \n প্রচেষ্টা \n স্কাইলাইন \n আজমেরী গ্লোরী \n স্বাধীন পরিবহন \n  ");
                }
   else if (f.equals("মৌচাক") || f.equals("mouchak")) {
                    tv1.setText("গ্রীন ঢাকা \n প্রচেষ্টা  \n স্কাইলাইন  \n আজমেরী গ্লোরী  \n স্বাধীন পরিবহন");
                }
   else if (f.equals("রামপুরা") || f.equals("rampura")) {
                    tv1.setText("গ্রীন ঢাকা \n প্রচেষ্টা \n স্বাধীন পরিবহন \n আলিফ এন্টারপ্রাইজ \n রবরব পরিবহন ");
                }
 else if (f.equals("বাড্ডা") || f.equals("badda")) {
                    tv1.setText("গ্রীন ঢাকা \n প্রচেষ্টা \n দেওয়ান \n আলিফ এন্টারপ্রাইজ \n রবরব পরিবহন \n  ");
                }
 else if (f.equals("নতুন বাজার") || f.equals("notun brazar")) {
                    tv1.setText("গ্রীন ঢাকা \n  প্রচেষ্টা \n স্কাইলাইন \n  দেওয়ান  ");
                }
 else if (f.equals("বসুন্ধরা") || f.equals("bosundhora")) {
                    tv1.setText("গ্রীন ঢাকা \n দেওয়ান  ");
                }
 else if (f.equals("যমুনা ফিউটার পার্ক") || f.equals("jamuna future park")) {
                    tv1.setText("গ্রীন ঢাকা \n  ");
                }


            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                autoCompleteTextView.setText("");
                tv1.setText("");
            }
        });

    }
}