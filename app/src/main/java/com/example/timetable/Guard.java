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

public class Guard extends AppCompatActivity {
    private AutoCompleteTextView autoCompleteTextView;
    private Button showbutton,clear;
    private TextView tv1;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_guard);
        autoCompleteTextView = findViewById(R.id.autocompletetextid);
        listView = findViewById(R.id.listviewid);

        showbutton = findViewById(R.id.showbuttonid);
        tv1 = findViewById(R.id.textview);
        clear = findViewById(R.id.clear);



        String [] MobileNumber = getResources().getStringArray(R.array.guard);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,MobileNumber);
        autoCompleteTextView.setAdapter(adapter);
        autoCompleteTextView.setThreshold(1);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    String number = "01716474069";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }

               else if (position == 1) {
                    String number = "01716474069";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
               else if (position == 2) {
                    String number = "01886073354";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }  else if (position == 3) {
                    String number = "01886073354";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
            }
        });

        showbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String text = autoCompleteTextView.getText().toString().trim();
                 if (text.equals("jahangir kobir guard pbt")||text.equals("জাহাঙ্গীর কবির গার্ড পার্বতীপুর")){
                    String number = "01716474069";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);

                 }
                 else if (text.equals("zakiul islam guard pbt")|| text.equals("জাকিউল ইসলাম গার্ড পার্বতীপুর")) {
                     String number = "01886073354";
                     Intent intent = new Intent(Intent.ACTION_DIAL);
                     intent.setData(Uri.parse("tel:" +number));
                     startActivity(intent);

                 }
                 else if (text.equals("imam hasan 22 guard pbt")|| text.equals("ইমাম হাসান 22 গার্ড পার্বতীপুর")) {
                     String number = "01750789027";
                     Intent intent = new Intent(Intent.ACTION_DIAL);
                     intent.setData(Uri.parse("tel:" +number));
                     startActivity(intent);

                 }
                 else if (text.equals("sadequl mursalin 27 guard pbt")|| text.equals("সাদিকুল মুরসালিন 27 গার্ড পার্বতীপুর")) {
                     String number = "01716883512";
                     Intent intent = new Intent(Intent.ACTION_DIAL);
                     intent.setData(Uri.parse("tel:" +number));
                     startActivity(intent);

                 }
                 else if (text.equals("shahidul islam 41 guard pbt")|| text.equals("শহিদু্ল ইসলাম 41 গার্ড পার্বতীপুর")) {
                     String number = "01713732791";
                     Intent intent = new Intent(Intent.ACTION_DIAL);
                     intent.setData(Uri.parse("tel:" +number));
                     startActivity(intent);

                 }
                 else if (text.equals("abdullahel shafi 51 guard pbt")|| text.equals("আব্দুল্লাহিল সাফি 51 গার্ড পার্বতীপুর")) {
                     String number = "01751376609";
                     Intent intent = new Intent(Intent.ACTION_DIAL);
                     intent.setData(Uri.parse("tel:" +number));
                     startActivity(intent);
                 }
                 else if (text.equals("saiful islam 74 guard pbt")|| text.equals("সাইফুল ইসলাম 74 গার্ড পার্বতীপুর")) {
                     String number = "01717442716";
                     Intent intent = new Intent(Intent.ACTION_DIAL);
                     intent.setData(Uri.parse("tel:" +number));
                     startActivity(intent);
                 }
                 else if (text.equals("rubaiat hassain 76 guard pbt")|| text.equals("রুবাইয়াত হাসান 76 গার্ড পার্বতীপুর")) {
                     String number = "01784831226";
                     Intent intent = new Intent(Intent.ACTION_DIAL);
                     intent.setData(Uri.parse("tel:" +number));
                     startActivity(intent);
                 }
                 else if (text.equals("rayhan mostafiz 80 guard pbt")|| text.equals("রায়হান মোস্তাফিজ 80 গার্ড পার্বতীপুর")) {
                     String number = "01712561340";
                     Intent intent = new Intent(Intent.ACTION_DIAL);
                     intent.setData(Uri.parse("tel:" +number));
                     startActivity(intent);
                 }
                 else if (text.equals("ataour rahman 105 guard pbt")|| text.equals("আতাউর রহমান 105 গার্ড পার্বতীপুর")) {
                     String number = "01728462641";
                     Intent intent = new Intent(Intent.ACTION_DIAL);
                     intent.setData(Uri.parse("tel:" +number));
                     startActivity(intent);
                 }
                 else if (text.equals("towfique hossain 110 guard pbt")|| text.equals("তৌফিক হোসাইন 110 গার্ড পার্বতীপুর")) {
                     String number = "01718618844";
                     Intent intent = new Intent(Intent.ACTION_DIAL);
                     intent.setData(Uri.parse("tel:" +number));
                     startActivity(intent);
                 }
                 else if (text.equals("mominul islam 119 guard pbt")|| text.equals("মোমিনুল ইসলাম 119 গার্ড পার্বতীপুর")) {
                     String number = "01710770646";
                     Intent intent = new Intent(Intent.ACTION_DIAL);
                     intent.setData(Uri.parse("tel:" +number));
                     startActivity(intent);
                 }
                 else if (text.equals("mahamadul hasan 123 guard pbt")|| text.equals("মাহমুদুল হাসান 123 গার্ড পার্বতীপুর")) {
                     String number = "01757893777";
                     Intent intent = new Intent(Intent.ACTION_DIAL);
                     intent.setData(Uri.parse("tel:" +number));
                     startActivity(intent);
                 }
                 else if (text.equals("mostafizur rahman 132 guard pbt")|| text.equals("মোস্তাফিজুর রহমান 132 গার্ড পার্বতীপুর")) {
                     String number = "01714327899";
                     Intent intent = new Intent(Intent.ACTION_DIAL);
                     intent.setData(Uri.parse("tel:" +number));
                     startActivity(intent);
                 }
                 else if (text.equals("rakibuzzman 136 guard pbt")|| text.equals("রাকিবুজ্জামান 136 গার্ড পার্বতীপুর")) {
                     String number = "01723247635";
                     Intent intent = new Intent(Intent.ACTION_DIAL);
                     intent.setData(Uri.parse("tel:" +number));
                     startActivity(intent);
                 }
              else if (text.equals("josim uddin 164 guard pbt")|| text.equals("জসিম উদ্দিন 164 গার্ড পার্বতীপুর")) {
                     String number = "01719157062";
                     Intent intent = new Intent(Intent.ACTION_DIAL);
                     intent.setData(Uri.parse("tel:" +number));
                     startActivity(intent);
                 }
              else if (text.equals("abdus satter 169 guard pbt")|| text.equals("আব্দুস সাত্তার 169 গার্ড পার্বতীপুর")) {
                     String number = "01721716019";
                     Intent intent = new Intent(Intent.ACTION_DIAL);
                     intent.setData(Uri.parse("tel:" +number));
                     startActivity(intent);
                 }
             else if (text.equals("abu hena jakaria 185 guard pbt")|| text.equals("আবু হেনা জাকারিয়া 185 গার্ড পার্বতীপুর")) {
                     String number = "01738648506";
                     Intent intent = new Intent(Intent.ACTION_DIAL);
                     intent.setData(Uri.parse("tel:" +number));
                     startActivity(intent);
                 }
             else if (text.equals("subroto bhowmik 186 guard pbt")|| text.equals("সুব্রত ভৌমিক 186 গার্ড পার্বতীপুর")) {
                     String number = "01768465065";
                     Intent intent = new Intent(Intent.ACTION_DIAL);
                     intent.setData(Uri.parse("tel:" +number));
                     startActivity(intent);
                 }
             else if (text.equals("arif hossain sifat 192 guard pbt")|| text.equals("আরিফ হোসেন সিফাত 192 গার্ড পার্বতীপুর")) {
                     String number = "01709044796";
                     Intent intent = new Intent(Intent.ACTION_DIAL);
                     intent.setData(Uri.parse("tel:" +number));
                     startActivity(intent);
                 }
             else if (text.equals("sharif hasan 198 guard pbt")|| text.equals("শরিফ হাসান 198 গার্ড পার্বতীপুর")) {
                     String number = "01721719809";
                     Intent intent = new Intent(Intent.ACTION_DIAL);
                     intent.setData(Uri.parse("tel:" +number));
                     startActivity(intent);
                 }
             else if (text.equals("bissojit roy 207 guard pbt")|| text.equals("বিশ্বজিৎ রায় 207 গার্ড পার্বতীপুর")) {
                     String number = "01728358087";
                     Intent intent = new Intent(Intent.ACTION_DIAL);
                     intent.setData(Uri.parse("tel:" +number));
                     startActivity(intent);
                 }
            else if (text.equals("abdul ahad 217 guard pbt")|| text.equals("আ: আহাদ 217 গার্ড পার্বতীপুর")) {
                     String number = "01717526524";
                     Intent intent = new Intent(Intent.ACTION_DIAL);
                     intent.setData(Uri.parse("tel:" +number));
                     startActivity(intent);
                 }
         else if (text.equals("rokunazzman 220 guard pbt")|| text.equals("রোকনুজ্জামান 220 গার্ড পার্বতীপুর")) {
                     String number = "01717854755";
                     Intent intent = new Intent(Intent.ACTION_DIAL);
                     intent.setData(Uri.parse("tel:" +number));
                     startActivity(intent);
                 }
          else if (text.equals("tarek mahabub 228 guard pbt")|| text.equals("তারেক মাহবুব 228 গার্ড পার্বতীপুর")) {
                     String number = "01733419189";
                     Intent intent = new Intent(Intent.ACTION_DIAL);
                     intent.setData(Uri.parse("tel:" +number));
                     startActivity(intent);
                  }
        else if (text.equals("sumon 229 guard pbt")|| text.equals("সুমন 229 গার্ড পার্বতীপুর")) {
                     String number = "01778755880";
                     Intent intent = new Intent(Intent.ACTION_DIAL);
                     intent.setData(Uri.parse("tel:" +number));
                     startActivity(intent);
                 }
        else if (text.equals("al amin khan 240 guard pbt")|| text.equals("আল আমিন খান 240 গার্ড পার্বতীপুর")) {
                     String number = "01744226903";
                     Intent intent = new Intent(Intent.ACTION_DIAL);
                     intent.setData(Uri.parse("tel:" +number));
                     startActivity(intent);
                 }
        else if (text.equals("shahadot shain 242 guard pbt")|| text.equals("শাহাদত শাহিন 242 গার্ড পার্বতীপুর")) {
                     String number = "01711166255";
                     Intent intent = new Intent(Intent.ACTION_DIAL);
                     intent.setData(Uri.parse("tel:" +number));
                     startActivity(intent);
                 }
        else if (text.equals("hafizur rahman 248 guard pbt")|| text.equals("হাফিজুর রহমান 248 গার্ড পার্বতীপুর")) {
                     String number = "01751283260";
                     Intent intent = new Intent(Intent.ACTION_DIAL);
                     intent.setData(Uri.parse("tel:" +number));
                     startActivity(intent);
                 }
        else if (text.equals("firoz hossain 263 guard pbt")|| text.equals("ফিরোজ হোসাইন 263 গার্ড পার্বতীপুর")) {
                     String number = "01783152585";
                     Intent intent = new Intent(Intent.ACTION_DIAL);
                     intent.setData(Uri.parse("tel:" +number));
                     startActivity(intent);
                 }
        else if (text.equals("anaiet hossain 268 guard pbt")|| text.equals("এনায়েত হোসাইন 268 গার্ড পার্বতীপুর")) {
                     String number = "01723069367";
                     Intent intent = new Intent(Intent.ACTION_DIAL);
                     intent.setData(Uri.parse("tel:" +number));
                     startActivity(intent);
                 }
        else if (text.equals("ashaduzzman guard pbt")|| text.equals("আসাদুজ্জামান গার্ড পার্বতীপুর")) {
                     String number = "01750245380";
                     Intent intent = new Intent(Intent.ACTION_DIAL);
                     intent.setData(Uri.parse("tel:" +number));
                     startActivity(intent);
                 }
        else if (text.equals("shoriful islam guard pbt")|| text.equals("শরিফুল ইসলাম গার্ড পার্বতীপুর")) {
                     String number = "01706362699";
                     Intent intent = new Intent(Intent.ACTION_DIAL);
                     intent.setData(Uri.parse("tel:" +number));
                     startActivity(intent);
                 }
        else if (text.equals("sobuz roy guard pbt")|| text.equals("সবুজ রায় গার্ড পার্বতীপুর")) {
                     String number = "01767302291";
                     Intent intent = new Intent(Intent.ACTION_DIAL);
                     intent.setData(Uri.parse("tel:" +number));
                     startActivity(intent);
                 }
        else if (text.equals("jahidul haque guard pbt")|| text.equals("জাহিদুল হক গার্ড পার্বতীপুর")) {
                     String number = "01712499299";
                     Intent intent = new Intent(Intent.ACTION_DIAL);
                     intent.setData(Uri.parse("tel:" +number));
                     startActivity(intent);
                 }
        else if (text.equals("riazul islam guard pbt")|| text.equals("রিয়াজুল ইসলাম গার্ড পার্বতীপুর")) {
                     String number = "01711197703";
                     Intent intent = new Intent(Intent.ACTION_DIAL);
                     intent.setData(Uri.parse("tel:" +number));
                     startActivity(intent);
                 }
        else if (text.equals("masud rana guard pbt")|| text.equals("মাসুদ রানা গার্ড পার্বতীপুর")) {
                     String number = "01780580000";
                     Intent intent = new Intent(Intent.ACTION_DIAL);
                     intent.setData(Uri.parse("tel:" +number));
                     startActivity(intent);
                 }
        else if (text.equals("rayhan guard pbt")|| text.equals("রায়হান গার্ড পার্বতীপুর")) {
                     String number = "01739825877";
                     Intent intent = new Intent(Intent.ACTION_DIAL);
                     intent.setData(Uri.parse("tel:" +number));
                     startActivity(intent);
                 }
        else if (text.equals("mostafizur rahman 2 guard pbt")|| text.equals("মোস্তাফিজুর রহমান 2 গার্ড পার্বতীপুর")) {
                     String number = "01737989309";
                     Intent intent = new Intent(Intent.ACTION_DIAL);
                     intent.setData(Uri.parse("tel:" +number));
                     startActivity(intent);
                 }
        else if (text.equals("sultan salek guard pbt")|| text.equals("সুলতান সালেক গার্ড পার্বতীপুর")) {
                     String number = "01911402500";
                     Intent intent = new Intent(Intent.ACTION_DIAL);
                     intent.setData(Uri.parse("tel:" +number));
                     startActivity(intent);
                 }
        else if (text.equals("ajit chandra guard pbt")|| text.equals("অজিত চন্দ্র গার্ড পার্বতীপুর")) {
                     String number = "01722026248";
                     Intent intent = new Intent(Intent.ACTION_DIAL);
                     intent.setData(Uri.parse("tel:" +number));
                     startActivity(intent);
                 }
        else if (text.equals("juel hossain guard pbt")|| text.equals("জুয়েল হোসাইন গার্ড পার্বতীপুর")) {
                     String number = "01315518589";
                     Intent intent = new Intent(Intent.ACTION_DIAL);
                     intent.setData(Uri.parse("tel:" +number));
                     startActivity(intent);
                 }
        else if (text.equals("masum kobir guard pbt")|| text.equals("মাসুম কবির গার্ড পার্বতীপুর")) {
                     String number = "01719104510";
                     Intent intent = new Intent(Intent.ACTION_DIAL);
                     intent.setData(Uri.parse("tel:" +number));
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