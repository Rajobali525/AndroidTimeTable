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

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Time extends AppCompatActivity {
    private AutoCompleteTextView autoCompleteTextView;
    private Button showbutton,clear;
    private TextView tv1;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_time);

        autoCompleteTextView = findViewById(R.id.autocompletetextid);
        listView = findViewById(R.id.listviewid);

        showbutton = findViewById(R.id.showbuttonid);
        tv1 = findViewById(R.id.textview);
        clear = findViewById(R.id.clear);



        String [] trainname = getResources().getStringArray(R.array.train);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,trainname);
        autoCompleteTextView.setAdapter(adapter);
        autoCompleteTextView.setThreshold(1);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) {
                    Intent intent = new Intent(Time.this, MainActivity45.class);
                    startActivity(intent);

                }
                else if (position==1) {
                    Intent intent = new Intent(Time.this, MainActivity46.class);
                    startActivity(intent);

                }
                else if (position==2) {
                    Intent intent = new Intent(Time.this, MainActivity47.class);
                    startActivity(intent);

                }
                else if (position==3) {
                    Intent intent = new Intent(Time.this, MainActivity48.class);
                    startActivity(intent);

                }
                else if (position==4) {
                    Intent intent = new Intent(Time.this, MainActivity57.class);
                    startActivity(intent);

                }
                else if (position==5) {
                    Intent intent = new Intent(Time.this, MainActivity58.class);
                    startActivity(intent);

                }
                else if (position==6) {
                    Intent intent = new Intent(Time.this, MainActivity59.class);
                    startActivity(intent);

                }
                else if (position==7) {
                    Intent intent = new Intent(Time.this, MainActivity60.class);
                    startActivity(intent);

                }
                else if (position==8) {
                    Intent intent = new Intent(Time.this, MainActivity61.class);
                    startActivity(intent);

                }
                else if (position==9) {
                    Intent intent = new Intent(Time.this, MainActivity62.class);
                    startActivity(intent);

                }
                else if (position==10) {
                    Intent intent = new Intent(Time.this, MainActivity63.class);
                    startActivity(intent);

                }
                else if (position==11) {
                    Intent intent = new Intent(Time.this, MainActivity64.class);
                    startActivity(intent);

                }
                else if (position==12) {
                    Intent intent = new Intent(Time.this, MainActivity65.class);
                    startActivity(intent);

                }
                else if (position==13) {
                    Intent intent = new Intent(Time.this, MainActivity66.class);
                    startActivity(intent);
                }
                else if (position==14) {
                    Intent intent = new Intent(Time.this, MainActivity67.class);
                    startActivity(intent);

                }
                else if (position==15) {
                    Intent intent = new Intent(Time.this, MainActivity68.class);
                    startActivity(intent);

                }
                else if (position==16) {
                    Intent intent = new Intent(Time.this, MainActivity69.class);
                    startActivity(intent);

                }
                else if (position==17) {
                    Intent intent = new Intent(Time.this, MainActivity70.class);
                    startActivity(intent);
                }
                else if (position==18) {
                    Intent intent = new Intent(Time.this, MainActivity71.class);
                    startActivity(intent);
                }
                else if (position==19) {
                    Intent intent = new Intent(Time.this, MainActivity72.class);
                    startActivity(intent);

                }
                else if (position==20) {
                    Intent intent = new Intent(Time.this, MainActivity73.class);
                    startActivity(intent);
                }
                else if (position==21) {
                    Intent intent = new Intent(Time.this, MainActivity74.class);
                    startActivity(intent);
                }
                else if (position==22) {
                    Intent intent = new Intent(Time.this, MainActivity75.class);
                    startActivity(intent);
                }
                else if (position==23) {
                    Intent intent = new Intent(Time.this, MainActivity76.class);
                    startActivity(intent);
                }
                else if (position==24) {
                    Intent intent = new Intent(Time.this, MainActivity77.class);
                    startActivity(intent);
                }
                else if (position==25) {
                    Intent intent = new Intent(Time.this, MainActivity78.class);
                    startActivity(intent);
                }
                else if (position==26) {
                    Intent intent = new Intent(Time.this, MainActivity79.class);
                    startActivity(intent);
                }
                else if (position==27) {
                    Intent intent = new Intent(Time.this, MainActivity80.class);
                    startActivity(intent);
                }
                else if (position==28) {
                    Intent intent = new Intent(Time.this, MainActivity81.class);
                    startActivity(intent);
                }
                else if (position==29) {
                    Intent intent = new Intent(Time.this, MainActivity82.class);
                    startActivity(intent);
                }
                else if (position==30) {
                    Intent intent = new Intent(Time.this, MainActivity83.class);
                    startActivity(intent);
                }
                else if (position==31) {
                    Intent intent = new Intent(Time.this, MainActivity84.class);
                    startActivity(intent);
                }
                else if (position==32) {
                    Intent intent = new Intent(Time.this, MainActivity85.class);
                    startActivity(intent);
                }
                else if (position==33) {
                    Intent intent = new Intent(Time.this, MainActivity86.class);
                    startActivity(intent);
                }
                else if (position==34) {
                    Intent intent = new Intent(Time.this, MainActivity87.class);
                    startActivity(intent);
                }
                else if (position==35) {
                    Intent intent = new Intent(Time.this, MainActivity88.class);
                    startActivity(intent);
                }
                else if (position==36) {
                    Intent intent = new Intent(Time.this, MainActivity89.class);
                    startActivity(intent);
                }
                else if (position==37) {
                    Intent intent = new Intent(Time.this, MainActivity90.class);
                    startActivity(intent);
                }
                else if (position==38) {
                    Intent intent = new Intent(Time.this, MainActivity91.class);
                    startActivity(intent);
                }
                else if (position==39) {
                    Intent intent = new Intent(Time.this, MainActivity92.class);
                    startActivity(intent);
                }
                else if (position==40) {
                    Intent intent = new Intent(Time.this, MainActivity93.class);
                    startActivity(intent);
                }
                else if (position==41) {
                    Intent intent = new Intent(Time.this, MainActivity94.class);
                    startActivity(intent);
                }
                else if (position==42) {
                    Intent intent = new Intent(Time.this, MainActivity95.class);
                    startActivity(intent);
                }
                else if (position==43) {
                    Intent intent = new Intent(Time.this, MainActivity96.class);
                    startActivity(intent);
                }
                else if (position==44) {
                    Intent intent = new Intent(Time.this, MainActivity97.class);
                    startActivity(intent);
                }
                else if (position==45) {
                    Intent intent = new Intent(Time.this, MainActivity98.class);
                    startActivity(intent);
                }
                else if (position==46) {
                    Intent intent = new Intent(Time.this, MainActivity99.class);
                    startActivity(intent);
                }
                else if (position==47) {
                    Intent intent = new Intent(Time.this, MainActivity100.class);
                    startActivity(intent);
                }
                else if (position==48) {
                    Intent intent = new Intent(Time.this, MainActivity101.class);
                    startActivity(intent);
                }
                else if (position==49) {
                    Intent intent = new Intent(Time.this, MainActivity102.class);
                    startActivity(intent);
                }
                else if (position==50) {
                    Intent intent = new Intent(Time.this, MainActivity103.class);
                    startActivity(intent);
                }
                else if (position==51) {
                    Intent intent = new Intent(Time.this, MainActivity104.class);
                    startActivity(intent);
                }
              else if (position==52) {
                    Intent intent = new Intent(Time.this, MainActivity105.class);
                    startActivity(intent);
                }
              else if (position==53) {
                    Intent intent = new Intent(Time.this, MainActivity106.class);
                    startActivity(intent);
                }
              else if (position==54) {
                    Intent intent = new Intent(Time.this, MainActivity107.class);
                    startActivity(intent);
                }
              else if (position==55) {
                    Intent intent = new Intent(Time.this, MainActivity108.class);
                    startActivity(intent);
                }
              else if (position==56) {
                    Intent intent = new Intent(Time.this, MainActivity109.class);
                    startActivity(intent);
                }
              else if (position==57) {
                    Intent intent = new Intent(Time.this, MainActivity110.class);
                    startActivity(intent);
                }
              else if (position==58) {
                    Intent intent = new Intent(Time.this, MainActivity111.class);
                    startActivity(intent);
                }  else if (position==59) {
                    Intent intent = new Intent(Time.this, MainActivity112.class);
                    startActivity(intent);
                }

            }
        });
        showbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = autoCompleteTextView.getText().toString();
                if(text.equals("একতা ঢাকা-বি.মু.সী.ই 705")||text.equals("705")){
                    Intent intent = new Intent(Time.this, MainActivity45.class);
                    startActivity(intent);
                }
                else if (text.equals("একতা বি.মু.সী.ই-ঢাকা 706")||text.equals("706")) {
                    Intent intent = new Intent(Time.this, MainActivity46.class);
                    startActivity(intent);

                }
                else if (text.equals("করতোয়া সান্তাহার-বুড়িমারী 713")||text.equals("713")) {
                    Intent intent = new Intent(Time.this, MainActivity47.class);
                    startActivity(intent);

                }
                else if (text.equals("করতোয়া বুড়িমারী-সান্তাহার 714")||text.equals("714")) {
                    Intent intent = new Intent(Time.this, MainActivity48.class);
                    startActivity(intent);

                }
                else if (text.equals("কপোতাক্ষ খুলনা-রাজশাহী 715")||text.equals("715")) {
                    Intent intent = new Intent(Time.this, MainActivity57.class);
                    startActivity(intent);

                }
                else if (text.equals("কপোতাক্ষ রাজশাহী-খুলনা 716")||text.equals("716")) {
                    Intent intent = new Intent(Time.this, MainActivity58.class);
                    startActivity(intent);

                }
                else if (text.equals("সুন্দরবন খুলনা-ঢাকা 725")||text.equals("725")) {
                    Intent intent = new Intent(Time.this, MainActivity59.class);
                    startActivity(intent);

                }
                else if (text.equals("সুন্দরবন ঢাকা-খুলনা 726")||text.equals("726")) {
                    Intent intent = new Intent(Time.this, MainActivity60.class);
                    startActivity(intent);

                }
                else if (text.equals("রূপসা খুলনা-চিলাহাটি 727")||text.equals("727")) {
                    Intent intent = new Intent(Time.this, MainActivity61.class);
                    startActivity(intent);

                }
                else if (text.equals("রূপসা চিলাহাটি-খুলনা 728")||text.equals("728")) {
                    Intent intent = new Intent(Time.this, MainActivity62.class);
                    startActivity(intent);

                }
                else if (text.equals("বরেন্দ্র রাজশাহী-চিলাহাটি 731")||text.equals("731")) {
                    Intent intent = new Intent(Time.this, MainActivity63.class);
                    startActivity(intent);

                }
                else if (text.equals("বরেন্দ্র চিলাহাটি-রাজশাহী 732")||text.equals("732")) {
                    Intent intent = new Intent(Time.this, MainActivity64.class);
                    startActivity(intent);

                }
                else if (text.equals("তিতুমির রাজশাহী-চিলাহাটি 733")||text.equals("733")) {
                    Intent intent = new Intent(Time.this, MainActivity65.class);
                    startActivity(intent);

                }
                else if (text.equals("তিতুমির চিলাহাটি-রাজশাহী 734")||text.equals("734")) {
                    Intent intent = new Intent(Time.this, MainActivity66.class);
                    startActivity(intent);

                }
                else if (text.equals("সীমান্ত খুলনা-চিলাহাটি 747")||text.equals("747")) {
                    Intent intent = new Intent(Time.this, MainActivity67.class);
                    startActivity(intent);

                }
                else if (text.equals("সীমান্ত চিলাহাটি-খুলনা 748")||text.equals("748")) {
                    Intent intent = new Intent(Time.this, MainActivity68.class);
                    startActivity(intent);

                }
                else if (text.equals("লালমনি ঢাকা-লালমনিরহাট 751")||text.equals("751")) {
                    Intent intent = new Intent(Time.this, MainActivity69.class);
                    startActivity(intent);

                }
                else if (text.equals("লালমনি লালমনিরহাট-ঢাকা 752")||text.equals("752")) {
                    Intent intent = new Intent(Time.this, MainActivity70.class);
                    startActivity(intent);

                }
                else if (text.equals("সিল্কসিটি ঢাকা-রাজশাহী 753")||text.equals("753")) {
                    Intent intent = new Intent(Time.this, MainActivity71.class);
                    startActivity(intent);

                }
                else if (text.equals("সিল্কসিটি রাজশাহী-ঢাকা 754")||text.equals("754")) {
                    Intent intent = new Intent(Time.this, MainActivity72.class);
                    startActivity(intent);

                }
                else if (text.equals("মধুমতি ঢাকা-রাজশাহী 755")||text.equals("755")) {
                    Intent intent = new Intent(Time.this, MainActivity73.class);
                    startActivity(intent);

                }
                else if (text.equals("মধুমতি রাজশাহী-ঢাকা 756")||text.equals("756")) {
                    Intent intent = new Intent(Time.this, MainActivity74.class);
                    startActivity(intent);

                }
                else if (text.equals("দ্রুতযান ঢাকা-বী.মু.সি.ই 757")||text.equals("757")) {
                    Intent intent = new Intent(Time.this, MainActivity75.class);
                    startActivity(intent);

                }
                else if (text.equals("দ্রুতযান বী.মু.সি.ই-ঢাকা 758")||text.equals("758")) {
                    Intent intent = new Intent(Time.this, MainActivity76.class);
                    startActivity(intent);

                }
                else if (text.equals("পদ্মা ঢাকা-রাজশাহী 759")||text.equals("759")) {
                    Intent intent = new Intent(Time.this, MainActivity77.class);
                    startActivity(intent);

                }
                else if (text.equals("পদ্মা রাজশাহী-ঢাকা 760")||text.equals("760")) {
                    Intent intent = new Intent(Time.this, MainActivity78.class);
                    startActivity(intent);

                }
                else if (text.equals("সাগরদাঁড়ী খুলনা-রাজশাহী 761")||text.equals("761")) {
                    Intent intent = new Intent(Time.this, MainActivity79.class);
                    startActivity(intent);

                }
                else if (text.equals("সাগরদাঁড়ী রাজশাহী-খুলনা 762")||text.equals("762")) {
                    Intent intent = new Intent(Time.this, MainActivity80.class);
                    startActivity(intent);

                }
                else if (text.equals("চিত্রা খুলনা-ঢাকা 763")||text.equals("763")) {
                    Intent intent = new Intent(Time.this, MainActivity81.class);
                    startActivity(intent);

                }
                else if (text.equals("চিত্রা ঢাকা-খুলনা 764")||text.equals("764")) {
                    Intent intent = new Intent(Time.this, MainActivity82.class);
                    startActivity(intent);

                }
                else if (text.equals("নীলসাগর ঢাকা-চিলাহাটি 765")||text.equals("765")) {
                    Intent intent = new Intent(Time.this, MainActivity83.class);
                    startActivity(intent);

                }
                else if (text.equals("নীলসাগর চিলাহাটি-ঢাকা 766")||text.equals("766")) {
                    Intent intent = new Intent(Time.this, MainActivity84.class);
                    startActivity(intent);

                }
                else if (text.equals("দোলনচাঁপা সান্তাহার-বী.মু.সী.ই 767")||text.equals("767")) {
                    Intent intent = new Intent(Time.this, MainActivity85.class);
                    startActivity(intent);

                }
                else if (text.equals("দোলনচাঁপা বী.মু.সী.ই-সান্তাহার 768")||text.equals("768")) {
                    Intent intent = new Intent(Time.this, MainActivity86.class);
                    startActivity(intent);

                }
                else if (text.equals("ধূমকেতু ঢাকা-রাজশাহী 769")||text.equals("769")) {
                    Intent intent = new Intent(Time.this, MainActivity87.class);
                    startActivity(intent);

                }
            else if (text.equals("ধূমকেতু রাজশাহী-ঢাকা 770")||text.equals("770")) {
                    Intent intent = new Intent(Time.this, MainActivity88.class);
                    startActivity(intent);

                }
            else if (text.equals("রংপুর ঢাকা-রংপুর 771")||text.equals("771")) {
                    Intent intent = new Intent(Time.this, MainActivity89.class);
                    startActivity(intent);

                }
            else if (text.equals("রংপুর রংপুর-ঢাকা 772")||text.equals("772")) {
                    Intent intent = new Intent(Time.this, MainActivity90.class);
                    startActivity(intent);

                }
          else if (text.equals("সিরাজগঞ্জ সিরাজগঞ্জ-ঢাকা 775")||text.equals("775")) {
                    Intent intent = new Intent(Time.this, MainActivity91.class);
                    startActivity(intent);

                }
          else if (text.equals("সিরাজগঞ্জ ঢাকা-সিরাজগঞ্জ 776")||text.equals("776")) {
                    Intent intent = new Intent(Time.this, MainActivity92.class);
                    startActivity(intent);

                }
          else if (text.equals("ঢালারচর ঢালারচর-চা: নবাবগঞ্জ 779")||text.equals("779")) {
                    Intent intent = new Intent(Time.this, MainActivity93.class);
                    startActivity(intent);

                }
          else if (text.equals("ঢালারচর চা: নবাবগঞ্জ-ঢালারচর 780")||text.equals("780")) {
                    Intent intent = new Intent(Time.this, MainActivity94.class);
                    startActivity(intent);

                }
          else if (text.equals("চুঙ্গিপাড়া গোবরা-রাজশাহী 783")||text.equals("783")) {
                    Intent intent = new Intent(Time.this, MainActivity95.class);
                    startActivity(intent);

                }
          else if (text.equals("চুঙ্গিপাড়া রাজশাহী-গোবরা 784")||text.equals("784")) {
                    Intent intent = new Intent(Time.this, MainActivity96.class);
                    startActivity(intent);

                }
          else if (text.equals("বনলতা ঢাকা-রাজশাহী 791")||text.equals("791")) {
                    Intent intent = new Intent(Time.this, MainActivity97.class);
                    startActivity(intent);

                }
          else if (text.equals("বনলতা রাজশাহী-ঢাকা 792")||text.equals("792")) {
                    Intent intent = new Intent(Time.this, MainActivity98.class);
                    startActivity(intent);

                }
          else if (text.equals("পঞ্চগড় ঢাকা-বী.মু.সি.ই 793")||text.equals("793")) {
                    Intent intent = new Intent(Time.this, MainActivity99.class);
                    startActivity(intent);

                }
          else if (text.equals("পঞ্চগড় বী.মু.সি.ই-ঢাকা 794")||text.equals("794")) {
                    Intent intent = new Intent(Time.this, MainActivity100.class);
                    startActivity(intent);

                }
          else if (text.equals("বেনাপোল বেনাপোল-ঢাকা 795")||text.equals("795")) {
                    Intent intent = new Intent(Time.this, MainActivity101.class);
                    startActivity(intent);

                }
          else if (text.equals("বেনাপোল ঢাকা-বেনাপোল 796")||text.equals("796")) {
                    Intent intent = new Intent(Time.this, MainActivity102.class);
                    startActivity(intent);

                }
          else if (text.equals("কুড়িগ্রাম ঢাকা-কুড়িগ্রাম 797")||text.equals("797")) {
                    Intent intent = new Intent(Time.this, MainActivity103.class);
                    startActivity(intent);

                }
          else if (text.equals("কুড়িগ্রাম কুড়িগ্রাম-ঢাকা 798")||text.equals("798")) {
                    Intent intent = new Intent(Time.this, MainActivity104.class);
                    startActivity(intent);

                }
          else if (text.equals("বাংলাবান্ধা রাজশাহী-বী.মু.সি.ই 803")||text.equals("803")) {
                    Intent intent = new Intent(Time.this, MainActivity105.class);
                    startActivity(intent);
          }
          else if (text.equals("বাংলাবান্ধা বী.মু.সি.ই-রাজশাহী 804")||text.equals("804")) {
                    Intent intent = new Intent(Time.this, MainActivity106.class);
                    startActivity(intent);
          }
          else if (text.equals("চিলাহাটি ঢাকা-চিলাহাটি 805")||text.equals("805")) {
                    Intent intent = new Intent(Time.this, MainActivity107.class);
                    startActivity(intent);
          }
          else if (text.equals("চিলাহাটি চিলাহাটি-ঢাকা 806")||text.equals("806")) {
                    Intent intent = new Intent(Time.this, MainActivity108.class);
                    startActivity(intent);
          }
          else if (text.equals("পাবনা ঢাকা-পাবনা 807")||text.equals("807")) {
                    Intent intent = new Intent(Time.this, MainActivity109.class);
                    startActivity(intent);
          }
          else if (text.equals("পাবনা পাবনা-ঢাকা 808")||text.equals("808")) {
                    Intent intent = new Intent(Time.this, MainActivity110.class);
                    startActivity(intent);
          }
          else if (text.equals("বুড়িমারী ঢাকা-বুড়িমারী 809")||text.equals("809")) {
                    Intent intent = new Intent(Time.this, MainActivity111.class);
                    startActivity(intent);
          }
      else if (text.equals("বুড়িমারী বুড়িমারী-ঢাকা 810")||text.equals("810")) {
                    Intent intent = new Intent(Time.this, MainActivity112.class);
                    startActivity(intent);
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