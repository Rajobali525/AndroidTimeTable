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

import org.jetbrains.annotations.Contract;

public class Call extends AppCompatActivity {

    private AutoCompleteTextView autoCompleteTextView;
    private Button showbutton,clear;
    private TextView tv1;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_call);

        autoCompleteTextView = findViewById(R.id.autocompletetextid);
        listView = findViewById(R.id.listviewid);

        showbutton = findViewById(R.id.showbuttonid);
        tv1 = findViewById(R.id.textview);
        clear = findViewById(R.id.clear);



        String [] MobileNumber = getResources().getStringArray(R.array.call);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,MobileNumber);
        autoCompleteTextView.setAdapter(adapter);
        autoCompleteTextView.setThreshold(1);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) {
                    String number = "01737868645";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
                else if (position==1) {
                    String number = "01737868645";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);

                }    else if (position==2) {
                    String number = "01732476410";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);

                }
                else if (position==3) {
                    String number = "01732476410";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);

                }   else if (position==4) {
                    String number = "01718489666";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);

                }
                else if (position==5) {
                    String number = "01718489666";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);

                }
                else if (position==6) {
                    String number = "01740923173";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);

                }
                else if (position==7) {
                    String number = "01740923173";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);

                }
                else if (position==8) {
                    String number = "01718627991";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);

                }
                else if (position==9) {
                    String number = "01718627991";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);

                }    else if (position==10) {
                    String number = "01731283695";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);

                }
                else if (position==11) {
                    String number = "01731283695";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);

                }
             else if (position==12) {
                    String number = "01718899499";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);

                }
             else if (position==13) {
                    String number = "01718899499";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);

                }
                else if (position==14) {
                    String number = "01716064930";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);

                }
                 else if (position==15) {
                    String number = "01716064930";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);

                }     else if (position==16) {
                    String number = "01720506234";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);

                }
                 else if (position==17) {
                    String number = "01720506234";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);

                }     else if (position==18) {
                    String number = "01722036123";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);

                }
                 else if (position==19) {
                    String number = "01722036123";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);

                }   else if (position==20) {
                    String number = "01741778774";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);

                }
                 else if (position==21) {
                    String number = "01741778774";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);

                }    else if (position==22) {
                    String number = "01738653334";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);

                }
                 else if (position==23) {
                    String number = "01738653334";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);

                }
                    else if (position==24) {
                    String number = "01718665596";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);

                }
                else if (position==25) {
                    String number = "01718665596";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);

                }    else if (position==26) {
                    String number = "01740552661";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);

                }
                else if (position==27) {
                    String number = "01740552661";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);

                }     else if (position==28) {
                    String number = "01713712197";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);

                }
                else if (position==29) {
                    String number = "01713712197";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);

                }   else if (position==30) {
                    String number = "01717308049";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);

                }   else if (position==31) {
                    String number = "01717308049";
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

                if(text.equals("rajob ali 525 alm pbt")||text.equals("রজব আলী 525 এ.এল.এম পার্বতীপুর")){
                    String number = "01737868645";
                    String name = "Rajob";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);

                }
                else if (text.equals("jahangir alom sarker 456 lm pbt")||text.equals("জাহাঙ্গীর আলম সরকার 456 এল.এম.পার্বতীপুর")){
                    String number = "01732476410";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);

                }
                else if (text.equals("samsul haque 466 lm pbt")||text.equals("শামসুল হক 466 এল.এম পার্বতীপুর")){
                    String number = "01718489666";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);

                }
                else if (text.equals("nazmul haque sarker 486 lm pbt")||text.equals("নাজমুল হক সরকার 486 এল.এম পার্বতীপুর")){
                    String number = "01740923173";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);

                }
                else if (text.equals("amal sarker 487 lm pbt")||text.equals("অমল সরকার 487 এল.এম পার্বতীপুর")){
                    String number = "01718627991";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);

                }
                else if (text.equals("mizanur rahman 499 lm pbt")||text.equals("মিজানুর রহমান 499 এল.এম পার্বতীপুর")){
                    String number = "01731283695";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);

                }
                else if (text.equals("abdul motaleb 467 lm pbt")||text.equals("আ:মোত্তালেব 467 এল.এম পার্বতীপুর")){
                    String number = "01718899499";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);

                }
                else if (text.equals("bm shahidul alom 463 lm pbt")||text.equals("বি.এম শহিদুল আলম 463 এল.এম পার্বতীপুর")){
                    String number = "01716064930";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);

                }
                else if (text.equals("ziaour rahman 464 lm pbt")||text.equals("জিয়াউর রহমান 464 এল.এম পার্বতীপুর")){
                    String number = "01720506234";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);

                }
                else if (text.equals("monirul islam 477 lm pbt")||text.equals("মনিরুল ইসলাম 477 এল.এম পার্বতীপুর")){
                    String number = "01722036123";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);

                }
                else if (text.equals("aktar hossain 427 lm pbt")||text.equals("আক্তার হোসেন 427 এল.এম পার্বতীপুর")){
                    String number = "01741778774";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);

                }

                else if (text.equals("aneitur rahman 495 lm pbt")||text.equals("এনায়েতুর রহমান 497 এল.এম পার্বতীপুর")){
                    String number = "01738653334";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);

                }
                else if (text.equals("ansarul islam 498 lm pbt")||text.equals("আনছারুল ইসলাম 498 এল.এম পার্বতীপুর")){
                    String number = "01718665596";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);

                }

                else if (text.equals("mahedi hasan 461 lm pbt")||text.equals("মেহেদী হাসান 461 এল.এম পার্বতীপুর")){
                    String number = "01740552661";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);

                }
                else if (text.equals("sanower hossain 497 lm pbt")||text.equals("সানোয়ার হোসেন 497 এল.এম পার্বতীপুর")){
                    String number = "01713712197";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);

                }
                else if (text.equals("arifuzzman 417 lm pbt")||text.equals("আরিফুজ্জামান 417 এল.এম পার্বতীপুর")){
                    String number = "01717308049";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);

                }
                else if (text.equals("firoz shah sultan 496 lm pbt")||text.equals("ফিরোজ শাহ সুলতান 496 এল.এম পার্বতীপুর")){
                    String number = "01745112315";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);

                }
                else if (text.equals("rofiqul islam 474 lm pbt")||text.equals("রফিকুল ইসলাম 474 এল.এম পার্বতীপুর")){
                    String number = "01710723943";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);

                }
                else if (text.equals("tarek hossain 516 lm pbt")||text.equals("তারিক হোসেন 516 এল.এম পার্বতীপুর")){
                    String number = "01705157155";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);

                }
                else if (text.equals("shahabul islam 494 lm pbt")||text.equals("শাহাবুল ইসলাম 494 এল.এম পার্বতীপুর")){
                    String number = "01716594819";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);

                }
                else if (text.equals("aktaruzzman 415 lm pbt")||text.equals("আক্তারুজ্জামান 415 এল.এম পার্বতীপুর")){
                    String number = "01721338292";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);

                }
                else if (text.equals("ahmed mostofa 479 lm pbt")||text.equals("আহম্মেদ মোস্তফা  479 এল.এম পার্বতীপুর")){
                    String number = "01783234252";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);

                }
                else if (text.equals("asraful alom 6329 lm pbt")||text.equals("আশরাফুল আলম 6329 এল.এম পার্বতীপুর")){
                    String number = "01752390704";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);

                }
                else if (text.equals("shahonaz manik 517 lm pbt")||text.equals("শাহনেওয়াজ মানিক 517 এল.এম পার্বতীপুর")){
                    String number = "01713815080";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
                else if (text.equals("m.a salam 502 lm pbt")||text.equals("এ.এম এ সালাম 502 এল.এম পার্বতীপুর")){
                    String number = "01725443988";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
                else if (text.equals("rokibul islam 433 lm pbt")||text.equals("রকিবুল ইসলাম 433 এল.এম পার্বতীপুর")){
                    String number = "01716728248";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
                else if (text.equals("abdul kuddus 402 lm pbt")||text.equals("আব্দুল কুদ্দুস 402 এল.এম পার্বতীপুর")){
                    String number = "01717835299";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
                else if (text.equals("omar faruk 407 slm pbt")||text.equals("ওমর ফারুক 407 এস.এল.এম পার্বতীপুর")){
                    String number = "01796942400";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
                else if (text.equals("tazul islam 412 slm pbt")||text.equals("তাজুল ইসলাম 412 এস.এল.এম পার্বতীপুর")){
                    String number = "01717727217";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
              else if (text.equals("khondokar nisat 413 slm pbt")||text.equals("খন্দকার নিশাত 413 এস.এল.এম পার্বতীপুর")){
                    String number = "01719467647";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
              else if (text.equals("yousub ali 421 slm pbt")||text.equals("ইউসুব আলী 421 এস.এল.এম পার্বতীপুর")){
                    String number = "01717442953";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
              else if (text.equals("shahazan ali 434 slm pbt")||text.equals("শাহজাহান আলী 434 এস.এল.এম পার্বতীপুর")){
                    String number = "01744452493";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
              else if (text.equals("shafait hossain 439 alm pbt")||text.equals("সাফায়েত হোসেন 439 এ.এল.এম পার্বতীপুর")){
                    String number = "01724046017";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
              else if (text.equals("abu jafor 448 slm pbt")||text.equals("আবু জাফর 448 এস.এল.এম পার্বতীপুর")){
                    String number = "01738236306";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
           else if (text.equals("baby yeasmin 507 alm pbt")||text.equals("বেবী ইয়াসমিন 507 এ.এল.এম পার্বতীপুর")){
                    String number = "01710631616";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
           else if (text.equals("harun or rashid 428 alm pbt")||text.equals("হারুন অর রশিদ 428 এ.এল.এম পার্বতীপুর")){
                    String number = "01736575940";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
           else if (text.equals("saiful islam 440 alm pbt")||text.equals("সাইফুল ইসলাম 440 এ.এল.এম পার্বতীপুর")){
                    String number = "01799440244";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
           else if (text.equals("moniruzzman 441 alm pbt")||text.equals("মনিরুজ্জামান 441 এ.এল.এম পার্বতীপুর")){
                    String number = "01723062032";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
           else if (text.equals("abu tarek 444 alm pbt")||text.equals("আবু তারেক 444 এ.এল.এম পার্বতীপুর")){
                    String number = "01716246847";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
           else if (text.equals("nahid hasan 446 alm pbt")||text.equals("নাহিদ হাসান 446 এ.এল.এম পার্বতীপুর")){
                    String number = "01741340167";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
           else if (text.equals("ashaduzzman khan 447 alm pbt")||text.equals("আসাদুজ্জামান খান 447 এ.এল.এম পার্বতীপুর")){
                    String number = "01725998368";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
                else if (text.equals("mannaf 459 alm pbt")||text.equals("মান্নাফ 459 এ.এল.এম পার্বতীপুর")){
                    String number = "01750747537";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
                else if (text.equals("mahmud mostofa 501 alm pbt")||text.equals("মাহমুদ মোস্তাফা 501 এ.এল.এম পার্বতীপুর")){
                    String number = "01746314885";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
               else if (text.equals("yoasim 514 alm pbt")||text.equals("ওয়াসিম 514 এ.এল.এম পার্বতীপুর")){
                    String number = "01719468705";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
          else if (text.equals("khondakar nurul islam 510 alm pbt")||text.equals("খন্দকার নুরুল ইসলাম 510 এ.এল.এম পার্বতীপুর")){
                    String number = "01750078685";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }

          else if (text.equals("arifuzzman shaek 529 alm pbt")||text.equals("আরিফুজ্জামান শেখ 529 এ.এল.এম পার্বতীপুর")){
                    String number = "01710631548";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
          else if (text.equals("valurum sarker 431 alm pbt")||text.equals("ভেলুরাম সরকার 431 এ.এল.এম পার্বতীপুর")){
                    String number = "01738155675";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
          else if (text.equals("alomgir hossain 513 alm rjhi")||text.equals("আলমগীর হোসেন 513 এ.এল.এম রাজশাহী")){
                    String number = "01738074951";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
          else if (text.equals("abdul kader 520 alm pbt")||text.equals("আলমগীর হোসেন 520 এ.এল.এম পার্বতীপুর")){
                    String number = "01738647122";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
        else if (text.equals("kibria 435 alm pbt")||text.equals("গোলাম কিবরিয়া 435 এ.এল.এম পার্বতীপুর")){

                    String number = "01716388761";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
        else if (text.equals("abul kalam azad 522 alm pbt")||text.equals("আবুল কালাম আজাদ 522 এ.এল.এম পার্বতীপুর")){
                    String number = "01707070677";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
              else if (text.equals("rajob ali  525 alm pbt")||text.equals("রজব আলী  525 এ.এল.এম পার্বতীপুর")){
                    String number = "01999652578";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
        else if (text.equals("riyed uddin 429 alm pbt")||text.equals("রিয়াদ উদ্দিন 429 এ.এল.এম পার্বতীপুর")){
                    String number = "01710491462";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
      else if (text.equals("robin hossain 437 alm pbt")||text.equals("রবিন হোসেন 437 এ.এল.এম পার্বতীপুর")){
                    String number = "01718325579";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
      else if (text.equals("mithun alom sarker 436 alm pbt")||text.equals("মিথুন আলম সরকার 436 এ.এল.এম পার্বতীপুর")){
                    String number = "01728785726";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
      else if (text.equals("iqbal hossain 430 alm pbt")||text.equals("ইকবাল হোসেন 430 এ.এল.এম পার্বতীপুর")){
                    String number = "01303671842";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
      else if (text.equals("ziaour rahman 450 alm pbt")||text.equals("জিয়াউর রহমান 450 এ.এল.এম পার্বতীপুর")){
                    String number = "01740869674";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
      else if (text.equals("haidarul islam 415 alm pbt")||text.equals("হায়দারুল ইসলাম 415 এ.এল.এম পার্বতীপুর")){
                    String number = "01717486886";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
      else if (text.equals("kazi yohadur zaman 462 lm pbt")||text.equals("কাজী ওয়াহেদুর জামান 462 এল.এম পার্বতীপুর")){
                    String number = "01727320757";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
      else if (text.equals("abdur rashid sarker 459 lm pbt")||text.equals("আ:রশিদ সরকার 459 এল.এম পার্বতীপুর")){
                    String number = "01731975695";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
     else if (text.equals("saiful azom 492 lm pbt")||text.equals("সাইফুল আজম 492 এল.এম পার্বতীপুর")){
                    String number = "01712956713";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
     else if (text.equals("tohider rahman 481 lm pbt")||text.equals("তহিদার রহমান 481 এল.এম পার্বতীপুর")){
                    String number = "01722187645";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
     else if (text.equals("moshour rahman 344 lm pbt")||text.equals("মশিউর রহমান 344 এল.এম পার্বতীপুর")){
                    String number = "01714948888";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
    else if (text.equals("lotiful haque 482 lm pbt")||text.equals("লতিফুল হক 482 এল.এম পার্বতীপুর")){
                    String number = "01712872948";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
    else if (text.equals("harunur rashid 189 lm pbt")||text.equals("হারুনুর রশিদ 189 এল.এম পার্বতীপুর")){
                    String number = "01719213808";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
    else if (text.equals("a.k.m abdur razzak 173 lm pbt")||text.equals("এ.কে.এম আব্দুর রাজ্জাক 173 এল.এম পার্বতীপুর")){
                    String number = "01719401152";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
  else if (text.equals("saidul islam 193 lm pbt")||text.equals("সাইদুল ইসলাম 193 এল.এম পার্বতীপুর")){
                    String number = "01718381359";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
  else if (text.equals("hiru mia 172 lm pbt")||text.equals("হিরু মিয়া 172 এল.এম পার্বতীপুর")){
                    String number = "01712499807";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
  else if (text.equals("alomgir hossain 187 lm pbt")||text.equals("আলমগীর হোসেন 187 এল.এম পার্বতীপুর")){
                    String number = "01716011791";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
  else if (text.equals("ruhul amin 345 lm pbt")||text.equals("রুহুল আমিন 345 এল.এম পার্বতীপুর")){
                    String number = "01719861147";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
  else if (text.equals("aktaruzzman 161 lm pbt")||text.equals("আক্তারুজ্জামান 161 এল.এম পার্বতীপুর")){
                    String number = "01773802814";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
  else if (text.equals("a.t.m salauddin 166 lm pbt")||text.equals("এ.টি.এম সালাউদ্দীন 166 এল.এম পার্বতীপুর")){
                    String number = "01730719699";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
  else if (text.equals("nazmul haque 181 lm pbt")||text.equals("নাজমুল হক 181 এল.এম পার্বতীপুর")){
                    String number = "01719901647";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
  else if (text.equals("abdur rahim 163 lm pbt")||text.equals("আব্দুর রহিম 163 এল.এম পার্বতীপুর")){
                    String number = "01717524731";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
  else if (text.equals("samsuzoah mondol 201 lm pbt")||text.equals("শামসুজ্জোহ মন্ডল 201 এল.এম পার্বতীপুর")){
                    String number = "01713303749";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
  else if (text.equals("abdulla hil bari 171 lm pbt")||text.equals("আব্দুল্লাহিল বারী 171 এল.এম পার্বতীপুর")){
                    String number = "01717331458";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
  else if (text.equals("khorshed alom 167 lm pbt")||text.equals("খোরশেদ আলম 167 এল.এম পার্বতীপুর")){
                    String number = "01704257259";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
  else if (text.equals("bulbul ahmed 165 lm pbt")||text.equals("বুলবুল আহম্মেদ 165 এল.এম পার্বতীপুর")){
                    String number = "01731918145";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
  else if (text.equals("abdus shafi 194 lm pbt")||text.equals("আব্দুস সাফী 194 এল.এম পার্বতীপুর")){
                    String number = "01716298057";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
  else if (text.equals("ruhul amin 114 lm pbt")||text.equals("রুহুল আমীন 114 এল.এম পার্বতীপুর")){
                    String number = "01714928178";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
  else if (text.equals("lutfor rahman 202 lm pbt")||text.equals("লুৎফর রহমান 202 এল.এম পার্বতীপুর")){
                    String number = "01722668344";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
  else if (text.equals("farid hasan 203 lm pbt")||text.equals("ফরিদ হাসান 203 এল.এম পার্বতীপুর")){
                    String number = "01778812800";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
  else if (text.equals("fuad hasan 205 lm pbt")||text.equals("ফুয়াদ হাসান 205 এল.এম পার্বতীপুর")){
                    String number = "01718729668";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
  else if (text.equals("shofiqul islam 206 lm pbt")||text.equals("শফিকুল ইসলাম 206 এল.এম পার্বতীপুর")){
                    String number = "01723209906";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
  else if (text.equals("ahoshan habib 234 lm pbt")||text.equals("আহসান হাবিব 234 এল.এম পার্বতীপুর")){
                    String number = "01722251616";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
  else if (text.equals("bedanur rahman 204 slm pbt")||text.equals("বেদানুর রহমান 204 এস.এল.এম পার্বতীপুর")){
                    String number = "01727637454";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
  else if (text.equals("shoriful islam 183 alm pbt")||text.equals("শরিফুল ইসলাম 183 এ.এল.এম পার্বতীপুর")){
                    String number = "01718970384";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
  else if (text.equals("nuruzzman 213 slm pbt")||text.equals("নুরুজ্জামান 213 এস.এল.এম পার্বতীপুর")){
                    String number = "01744568298";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
  else if (text.equals("jahidul islam 214 slm pbt")||text.equals("জাহেদুল ইসলাম 214 এস.এল.এম পার্বতীপুর")){
                    String number = "01716829984";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
  else if (text.equals("sumon sarker 217 alm pbt")||text.equals("সুমন সরকার 217 এ.এল.এম পার্বতীপুর")){
                    String number = "01734336222";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
  else if (text.equals("younus ali 219 slm pbt")||text.equals("ইউনুচ আলী 219 এস.এল.এম পার্বতীপুর")){
                    String number = "01728297295";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
  else if (text.equals("asif hossain 182 slm pbt")||text.equals("আসিব হোসেন 182 এস.এল.এম পার্বতীপুর")){
                    String number = "01725246190";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
 else if (text.equals("shoiel rana 220 alm pbt")||text.equals("সোহেল রানা 220 এ.এল.এম পার্বতীপুর")){
                    String number = "01770829906";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
 else if (text.equals("abdul khalik mia 222 slm pbt")||text.equals("আ:খালেক মিয়া 222 এস.এল.এম পার্বতীপুর")){
                    String number = "01737625125";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
 else if (text.equals("sakil reza 224 slm pbt")||text.equals("শাকিল রেজা 224 এস.এল.এম পার্বতীপুর")){
                    String number = "01740108801";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
 else if (text.equals("animesh chandra ray 225 slm pbt")||text.equals("অনিমেষ চন্দ্র রায় 225 এস.এল.এম পার্বতীপুর")){
                    String number = "01710944893";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
 else if (text.equals("jahidul islam 221 slm pbt")||text.equals("জাহিদুল ইসলাম 221 এস.এল.এম পার্বতীপুর")){
                    String number = "01717975028";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
 else if (text.equals("shain hawladar 192 alm pbt")||text.equals("শাহিন হাওলাদার 192 এ.এল.এম পার্বতীপুর")){
                    String number = "01738756944";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
 else if (text.equals("nasrin akter 178 alm pbt")||text.equals("নাছরিন আক্তার 178 এ.এল.এম পার্বতীপুর")){
                    String number = "01761506112";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
 else if (text.equals("rashaduzzman 195 alm pbt")||text.equals("রাশেদুজ্জামান 195 এ.এল.এম পার্বতীপুর")){
                    String number = "01718938468";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
 else if (text.equals("tusar kanti ray 197 alm pbt")||text.equals("তুষার কান্তি রায় 197 এ.এল.এম পার্বতীপুর")){
                    String number = "01705924925";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
 else if (text.equals("abdus salam 227 alm pbt")||text.equals("আব্দুস সালাম 227 এ.এল.এম পার্বতীপুর")){
                    String number = "01755268284";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
 else if (text.equals("abu jahid 228 alm pbt")||text.equals("আবু জাহিদ 228 এ.এল.এম পার্বতীপুর")){
                    String number = "01717435304";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
 else if (text.equals("shoiel rana 402 alm pbt")||text.equals("সোহেল রানা 402 এ.এল.এম পার্বতীপুর")){
                    String number = "01793768225";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
 else if (text.equals("ataour rahman 235 alm pbt")||text.equals("আতাউর রহমান 235 এ.এল.এম পার্বতীপুর")){
                    String number = "01723807312";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
 else if (text.equals("kobir hossain 237 alm pbt")||text.equals("কবির হোসেন 237 এ.এল.এম পার্বতীপুর")){
                    String number = "01792806121";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
 else if (text.equals("ramjan ali 238 alm pbt")||text.equals("রমজান আলী 238 এ.এল.এম পার্বতীপুর")){
                    String number = "01756720101";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
 else if (text.equals("shah islam 101 alm pbt")||text.equals("শাহ ইসলাম 101 এ.এল.এম পার্বতীপুর")){
                    String number = "01738168427";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
 else if (text.equals("suzaoul islam 248 alm pbt")||text.equals("সুজাউল ইসলাম 248 এ.এল.এম পার্বতীপুর")){
                    String number = "01710491462";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
 else if (text.equals("mazid mia 400 alm pbt")||text.equals("মাজেদ মিয়া 400 এ.এল.এম পার্বতীপুর")){
                    String number = "01924883003";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
 else if (text.equals("rokibul islam 245 alm pbt")||text.equals("রকিবুল ইসলাম 245 এ.এল.এম পার্বতীপুর")){
                    String number = "01796257325";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
 else if (text.equals("aioub ali 244 alm pbt")||text.equals("আইয়ুব আলী 244 এ.এল.এম পার্বতীপুর")){
                    String number = "01966200766";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
 else if (text.equals("abu bokkor siddik 250 alm pbt")||text.equals("আবু বক্কর সিদ্দিক 250 এ.এল.এম পার্বতীপুর")){
                    String number = "01734675147";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
 else if (text.equals("sabbriul islam 251 alm pbt")||text.equals("সাব্বিরুল ইসলাম 251 এ.এল.এম পার্বতীপুর")){
                    String number = "01744271368";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
 else if (text.equals("ramjan ali new 254 alm pbt")||text.equals("রমজান আলী নতুন 254 এ.এল.এম পার্বতীপুর")){
                    String number = "01783038627";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
 else if (text.equals("shomoly rany ray 255 alm pbt")||text.equals("শ্যামলী রাণী রায় 255 এ.এল.এম পার্বতীপুর")){
                    String number = "01706852411";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
 else if (text.equals("jakir hossain 256 alm pbt")||text.equals("জাকির হোসেন 256 এ.এল.এম পার্বতীপুর")){
                    String number = "01723183717";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
 else if (text.equals("abdus salam sheik 257 alm pbt")||text.equals("আ:সালাম শেখ 257 এ.এল.এম পার্বতীপুর")){
                    String number = "01748785502";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
 else if (text.equals("hasanul banna shefat 258 alm pbt")||text.equals("হাসানুল বান্না সিফাত 258 এ.এল.এম পার্বতীপুর")){
                    String number = "01703336855";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
 else if (text.equals("mahedi hasan 259 alm pbt")||text.equals("মেহেদী হাসান 259 এ.এল.এম পার্বতীপুর")){
                    String number = "01768836393";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("baldanul islam 260 alm pbt")||text.equals("বেলদানুল ইসলাম 260 এ.এল.এম পার্বতীপুর")){
                    String number = "01765157946";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("hanimuzzman 262 alm pbt")||text.equals("হানিমুজ্জামান 262 এ.এল.এম পার্বতীপুর")){
                    String number = "01764801222";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("mostafizur rahman 264 alm pbt")||text.equals("মোস্তাফিজুর রহমান 264 এ.এল.এম পার্বতীপুর")){
                    String number = "01744648966";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("nazmul alom 266 alm pbt")||text.equals("নাজমুল আলম 266 এ.এল.এম পার্বতীপুর")){
                    String number = "01738464372";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("morsalin mia 268 alm pbt")||text.equals("মোরছালিন মিয়া 268 এ.এল.এম পার্বতীপুর")){
                    String number = "01763195623";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("poran chandra singha 269 alm pbt")||text.equals("পরেন চন্দ্র সিংহ 269 এ.এল.এম পার্বতীপুর")){
                    String number = "01754337871";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("ahoshan habib new 270 alm pbt")||text.equals("আহসান হাবিব 270 এ.এল.এম পার্বতীপুর")){
                    String number = "01786927707";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("masum billah 271 alm pbt")||text.equals("মাসুম বিল্লাহ 271 এ.এল.এম পার্বতীপুর")){
                    String number = "01797680864";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("sushanta kumar malaka 272 alm pbt")||text.equals("সুশান্ত কুমার মালাকা 272 এ.এল.এম পার্বতীপুর")){
                    String number = "01793917105";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("robioul islam 611 alm pbt")||text.equals("রবিউল ইসলাম 611 এ.এল.এম পার্বতীপুর")){
                    String number = "01753665351";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("firoz kobir 601 alm pbt")||text.equals("ফিরোজ কবির 601 এ.এল.এম পার্বতীপুর")){
                    String number = "01768446183";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("shehab mollik 604 alm pbt")||text.equals("সিহাব মল্লিক 604 এ.এল.এম পার্বতীপুর")){
                    String number = "01755129312";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("shahazan ali new 609 alm pbt")||text.equals("শাহজাহান আলী 609 এ.এল.এম পার্বতীপুর")){
                    String number = "01781767205";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("tarikul islam 610 alm pbt")||text.equals("তারিকুল ইসলাম 610 এ.এল.এম পার্বতীপুর")){
                    String number = "01729319034";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("al shaharier 606 alm pbt")||text.equals("আল শাহরিয়ার 606 এ.এল.এম পার্বতীপুর")){
                    String number = "01870005875";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("ismail hossain 605 alm pbt")||text.equals("ইসমাইল হোসেন 605 এ.এল.এম পার্বতীপুর")){
                    String number = "01538123129";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("abdur rahman 608 alm pbt")||text.equals("আব্দুর রহমান 608 এ.এল.এম পার্বতীপুর")){
                    String number = "01738640497";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("saddam hossain 607 alm pbt")||text.equals("সাদ্দাম হোসেন 607 এ.এল.এম পার্বতীপুর")){
                    String number = "01575298152";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("mohoshin hossain 603 alm pbt")||text.equals("মহসিন হোসেন 603 এ.এল.এম পার্বতীপুর")){
                    String number = "01772373870";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("anisur rahman antu 1223 lm pbt")||text.equals("আনিছুর রহমান আন্টু 1223 এল.এম পার্বতীপুর")){
                    String number = "01718880164";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("abdus samak 418 lm pbt")||text.equals("আ: সামাদ 418 এল.এম পার্বতীপুর")){
                    String number = "01712503140";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("ramranjon mohonto 452 lm pbt")||text.equals("রামরঞ্জন মহন্ত 452 এল.এম পার্বতীপুর")){
                    String number = "01715140169";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("ashaduzzman 1800 lm rjhi")||text.equals("আসাদুজ্জামান 1800 এল.এম রাজশাহী")){
                    String number = "01725190090";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("abul kalam azad 1808 lm rjhi")||text.equals("আবুল কালাম আজাদ 1808 এল.এম রাজশাহী")){
                    String number = "01715435132";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("yorash ali 1814 lm rjhi")||text.equals("ওয়ারেশ আলী 1814 এল.এম রাজশাহী")){
                    String number = "01718677373";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("saiful islam 1815 lm rjhi")||text.equals("সাইফুল ইসলাম 1815 এল.এম রাজশাহী")){
                    String number = "01717256321";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("shamim akter 1816 lm rjhi")||text.equals("শামীম আক্তার 1816 এল.এম রাজশাহী")){
                    String number = "01781117589";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }

else if (text.equals("taizul islam 1830 lm rjhi")||text.equals("তাইজুল ইসলাম 1830 এল.এম রাজশাহী")){
                    String number = "01718945273";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("asraful islam 1831 lm rjhi")||text.equals("আশরাফুল ইসলাম 1831 এল.এম রাজশাহী")){
                    String number = "01913567517";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("rofiqul islam 1833 lm rjhi")||text.equals("রফিকুল ইসলাম 1833 এল.এম রাজশাহী")){
                    String number = "01798511737";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("akramul haque 1837 lm rjhi")||text.equals("একরামুল হক 1837 এল.এম রাজশাহী")){
                    String number = "01713707077";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("robioul islam 1829 lm rjhi")||text.equals("রবিউল ইসলাম 1829 এল.এম রাজশাহী")){
                    String number = "01712561423";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("rezaoul korim 1212 lm rjhi")||text.equals("রেজাউল করিম 1212 এল.এম রাজশাহী")){
                    String number = "01716175768";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("monorawal korim 1809 lm rjhi")||text.equals("মনোয়ারুল করিম 1809 এল.এম রাজশাহী")){
                    String number = "01716384802";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("masud rana 1832 lm rjhi")||text.equals("মাসুদ রানা 1832 এল.এম রাজশাহী")){
                    String number = "01768958479";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("nasirul islam 6328 lm rjhi")||text.equals("নাসিরুল ইসলাম 6328 এল.এম রাজশাহী")){
                    String number = "01798242766";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("torikul islam 1827 lm rjhi")||text.equals("তরিকুল ইসলাম 1827 এল.এম রাজশাহী")){
                    String number = "01722375468";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("aminul islam 1810 slm rjhi")||text.equals("আমিনুল ইসলাম 1810 এস.এল.এম রাজশাহী")){
                    String number = "01746101955";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("shahazan bishas 1813 slm rjhi")||text.equals("শাহজাহান বিশ্বাস 1813 এস.এল.এম রাজশাহী")){
                    String number = "01713868996";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("abdul mannan 1842 slm rjhi")||text.equals("আ:মান্নান 1842 এস.এল.এম রাজশাহী")){
                    String number = "01721668488";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("amjad hossain 1801 alm rjhi")||text.equals("আমজাদ হোসেন 1801 এ.এল.এম রাজশাহী")){
                    String number = "01721380867";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("mohaiminul islam 1802 alm rjhi")||text.equals("মুহাইমিনুল ইসলাম 1802 এ.এল.এম রাজশাহী")){
                    String number = "01750660588";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("mukul uddin 1803 alm rjhi")||text.equals("মুকুল উদ্দিন 1803 এ.এল.এম রাজশাহী")){
                    String number = "01723606465";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("mahabubur rahman 1804 alm rjhi")||text.equals("মাহাবুবুর রহমান 1804 এ.এল.এম রাজশাহী")){
                    String number = "01754004670";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("said hasan khan 1805 alm rjhi")||text.equals("সাইদ হাসান খান 1805 এ.এল.এম রাজশাহী")){
                    String number = "01728372637";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("shamim hossain 1806 alm rjhi")||text.equals("শামীম হোসেন 1806 এ.এল.এম রাজশাহী")){
                    String number = "01722029705";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("yoazir hasan 1807 alm rjhi")||text.equals("ওয়াজির হাসান 1807 এ.এল.এম রাজশাহী")){
                    String number = "01722590211";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("bodiouzzman 1811 alm rjhi")||text.equals("বদিউজ্জামান 1811 এ.এল.এম রাজশাহী")){
                    String number = "01730420420";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("abdul halim 1812 alm rjhi")||text.equals("আ:হালিম 1812 এ.এল.এম রাজশাহী")){
                    String number = "01740842181";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("ismail hossain 1817 alm rjhi")||text.equals("ইসমাইল হোসেন 1817 এ.এল.এম রাজশাহী")){
                    String number = "01731919194";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("asif rayhan 1820 alm rjhi")||text.equals("আসিফ রায়হান 1820 এ.এল.এম রাজশাহী")){
                    String number = "01816097371";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("azijul haque 1821 alm rjhi")||text.equals("আজিজুল হক 1821 এ.এল.এম রাজশাহী")){
                    String number = "01737236513";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("kyser hamid 1823 alm rjhi")||text.equals("কায়ছার হামিদ 1823 এ.এল.এম রাজশাহী")){
                    String number = "01911293661";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("monirul islam 1825 alm rjhi")||text.equals("মনিরুল ইসলাম 1825 এ.এল.এম রাজশাহী")){
                    String number = "01714944933";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("abdul jolil 1828 slm rjhi")||text.equals("আ: জলিল 1828 এস.এল.এম রাজশাহী")){
                    String number = "01710602982";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("golam mostofa 1835 alm rjhi")||text.equals("গোলাম মোস্তফা 1835 এ.এল.এম রাজশাহী")){
                    String number = "01724384153";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("hazrat ali 1836 alm rjhi")||text.equals("হযরত আলী 1836 এ.এল.এম রাজশাহী")){
                    String number = "01922364038";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("faruk hossain 6304 alm rjhi")||text.equals("ফারুক হোসেন 6304 এ.এল.এম রাজশাহী")){
                    String number = "01705537171";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("g.m shah alom 1832 alm rjhi")||text.equals("জি.এম. শাহ আলম 1832 এ.এল.এম রাজশাহী")){
                    String number = "01723665049";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("ashadulla hel galib 6907 alm rjhi")||text.equals("আসাদুল্লা হেল গালেব 6907 এ.এল.এম রাজশাহী")){
                    String number = "01717948317";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("abdus samad 361 lm barp")||text.equals("আ:সামাদ 361 এল.এম বোনারপাড়া")){
                    String number = "01715917517";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("haidar ali 111 lm barp")||text.equals("হায়দার আলী 111 এল.এম বোনারপাড়া")){
                    String number = "01712591608";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("said fakrul ahashan 343 lm barp")||text.equals("সৈয়দ ফফরুল আহসান 343 এল.এম বোনারপাড়া")){
                    String number = "01712363711";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("basirul islam 346 lm barp")||text.equals("বাছিরুল ইসলাম 346 এল.এম বোনারপাড়া")){
                    String number = "01717241884";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("anower hossain 345 lm barp")||text.equals("আনোয়ার হোসেন 345 এল.এম বোনারপাড়া")){
                    String number = "01717799716";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("rofiqul islam 7151 lm barp")||text.equals("রফিকুল ইসলাম 7151 এল.এম বোনারপাড়া")){
                    String number = "01718713772";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("tarek rahman 190 lm barp")||text.equals("তারিক রহমান 190 এল.এম বোনারপাড়া")){
                    String number = "01815270772";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }

else if (text.equals("rashadul alom lm barp")||text.equals("রাশেদুল আলম এল.এম বোনারপাড়া")){
                    String number = "01718839201";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("abdul kafe 119 slm barp")||text.equals("আ:কাফি 119 এস.এল.এম বোনারপাড়া")){
                    String number = "01741320486";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("Olip kumar ghosh 347 slm barp")||text.equals("অলিপ কুমার ঘোষ 347 এস.এল.এম বোনারপাড়া")){
                    String number = "01719257795";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("hamidur rahman 214 slm barp")||text.equals("হামিদুর রহমান 214 এস.এল.এম বোনারপাড়া")){
                    String number = "01723766785";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("nurul islam 215 slm barp")||text.equals("নুরুল ইসলাম 215 এস.এল.এম বোনারপাড়া")){
                    String number = "01729939849";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("partho prodip 121 alm barp")||text.equals("পার্থ প্রদীপ 121 এ.এল.এম বোনারপাড়া")){
                    String number = "017382999597";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("tarikul islam 191 alm barp")||text.equals("তারিকুল ইসলাম 191 এ.এল.এম বোনারপাড়া")){
                    String number = "01710793380";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("murtoza al mamun 216 alm barp")||text.equals("মুর্তজা আল মামুন 216 এ.এল.এম বোনারপাড়া")){
                    String number = "01721421320";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("rashel khan 338 alm barp")||text.equals("রাসেল খান 338 এ.এল.এম বোনারপাড়া")){
                    String number = "01762981455";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("mosharof hossain 116 alm barp")||text.equals("মোশারফ হোসেন 116 এ.এল.এম বোনারপাড়া")){
                    String number = "01827538522";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("mujibur rahman 118 alm barp")||text.equals("মজিবর রহমান 118 এ.এল.এম বোনারপাড়া")){
                    String number = "01745054231";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("firoz kobir alm barp")||text.equals("ফিরোজ কবির এ.এল.এম বোনারপাড়া")){
                    String number = "01763263777";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("hasan shahid rashel 395 alm barp")||text.equals("হাসান শহীদ রাসেল 395 এ.এল.এম বোনারপাড়া")){
                    String number = "01711701250";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("masudur rahman 124 alm barp")||text.equals("মাসুদুর রহমান 124 এ.এল.এম বোনারপাড়া")){
                    String number = "01751117798";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("foyzur rahman 350 alm barp")||text.equals("ফয়জুর রহমান 350 এ.এল.এম বোনারপাড়া")){
                    String number = "01718213842";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("robioul islam 1202 lm isd")||text.equals("রবিউল ইসলাম 1202 এল.এম ঈশ্বরদী")){
                    String number = "01720506229";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("samioul islam 1203 lm isd")||text.equals("সামিউল ইসলাম 1203 এল.এম ঈশ্বরদী")){
                    String number = "01730439883";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("mostofa jaman 1204 lm isd")||text.equals("মোস্তফা জামান 1204 এল.এম ঈশ্বরদী")){
                    String number = "01704554288";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("sheak moniruzzman 1205 lm isd")||text.equals("শেখ মনিরুজ্জামান 1205 এল.এম ঈশ্বরদী")){
                    String number = "01720506232";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("mohidul islam 1206 lm isd")||text.equals("মহিদুল ইসলাম 1206 এল.এম ঈশ্বরদী")){
                    String number = "01710867070";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("robilul islam 1208 lm isd")||text.equals("রবিউল ইসলাম 1208 এল.এম ঈশ্বরদী")){
                    String number = "01712988122";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("moinul islam 1214 lm isd")||text.equals("মঈনুল ইসলাম 1214 এল.এম ঈশ্বরদী")){
                    String number = "01712473435";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("mostafizur rahman 1217 lm isd")||text.equals("মোস্তাফিজুর রহমান 1217 এল.এম ঈশ্বরদী")){
                    String number = "01720506228";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("jahidul islam monu 1218 lm isd")||text.equals("জাহিদুল ইসলাম মনু 1218 এল.এম ঈশ্বরদী")){
                    String number = "01720433028";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("anower hossain 1224 lm isd")||text.equals("আনোয়ার হোসেন 1224 এল.এম ঈশ্বরদী")){
                    String number = "01718550462";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("jahangir alom 1225 lm isd")||text.equals("জাহাঙ্গীর আলম 1225 এল.এম ঈশ্বরদী")){
                    String number = "01712726845";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("jahidul islam 1230 lm isd")||text.equals("জাহিদুল ইসলাম 1230 এল.এম ঈশ্বরদী")){
                    String number = "01719753057";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("shahabuddin ahmed 1231 lm isd")||text.equals("সাহাবুদ্দিন আহম্মেদ 1231 এল.এম ঈশ্বরদী")){
                    String number = "01718022731";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("asraful islam 1233 lm isd")||text.equals("আশরাফুল ইসলাম 1233 এল.এম ঈশ্বরদী")){
                    String number = "01720959684";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("obaidul haque 1236 lm isd")||text.equals("ওবায়দুল হক 1236 এল.এম ঈশ্বরদী")){
                    String number = "01716754198";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("nazrul islam 1239 lm isd")||text.equals("নজরুল ইসলাম 1239 এল.এম ঈশ্বরদী")){
                    String number = "01718413635";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("jahangir alom 1244 lm isd")||text.equals("জাহাঙ্গীর আলম 1244 এল.এম ঈশ্বরদী")){
                    String number = "01710631769";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("helal uddin 1250 lm isd")||text.equals("হেলাল উদ্দিন 1250 এল.এম ঈশ্বরদী")){
                    String number = "01728170336";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("aktaruzzman 1251 lm isd")||text.equals("আক্তারুজ্জামান 1251 এল.এম ঈশ্বরদী")){
                    String number = "01779305572";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("fazlur rahman 1252 lm isd")||text.equals("ফজরুর রহমান 1252 এল.এম ঈশ্বরদী")){
                    String number = "01714656038";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("nozibur rahman 1256 lm isd")||text.equals("নজিবুর রহমান 1256 এল.এম ঈশ্বরদী")){
                    String number = "01925338823";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("shofioul alom 1257 lm isd")||text.equals("শফিউল আলম 1257 এল.এম ঈশ্বরদী")){
                    String number = "01712726810";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("asraful hossain 1266 lm isd")||text.equals("আশরাফুল হোসেন 1266 এল.এম ঈশ্বরদী")){
                    String number = "01712041466";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("asraf ali sarker 1267 lm isd")||text.equals("আশরাফ আলী সরকার 1267 এল.এম ঈশ্বরদী")){
                    String number = "01718167829";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("tohidul islam luna 1263 lm isd")||text.equals("তৌহিদুল ইসলাম লুনা 1263 এল.এম ঈশ্বরদী")){
                    String number = "01711042324";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("anisur rahman 1216 lm isd")||text.equals("আনিসুর রহমান 1216 এল.এম ঈশ্বরদী")){
                    String number = "01717945112";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("azijur rahman 1207 lm isd")||text.equals("আজিজুর রহমান 1207 এল.এম ঈশ্বরদী")){
                    String number = "01719928910";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("ariful islam choudory 1209 lm isd")||text.equals("আরিফুল ইসলাম চৌধুরী 1209 এল.এম ঈশ্বরদী")){
                    String number = "01720582798";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("razu ahmed 1210 lm isd")||text.equals("রাজু আহম্মেদ 1210 এল.এম ঈশ্বরদী")){
                    String number = "01712196537";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("shajadul islam 1248 lm isd")||text.equals("সাজেদুল ইসলাম 1248 এল.এম ঈশ্বরদী")){
                    String number = "01761551947";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("samsul alom 1221 lm isd")||text.equals("শামসুল আলম 1221 এল.এম ঈশ্বরদী")){
                    String number = "01717268459";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("abdur razzak 1222 lm isd")||text.equals("আ: রাজ্জাক 1222 এল.এম ঈশ্বরদী")){
                    String number = "01717795520";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("aktaruzzman 1226 lm isd")||text.equals("আক্তারুজ্জামান 1226 এল.এম ঈশ্বরদী")){
                    String number = "01718698201";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("ruhul amin 1227 lm isd")||text.equals("রুহুল আমিন 1227 এল.এম ঈশ্বরদী")){
                    String number = "01716902146";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("mostafuzur rahman 1202 lm isd")||text.equals("মোস্তাফিজুর রহমান 1202 এল.এম ঈশ্বরদী")){
                    String number = "01874759058";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("monto chandra pahan 1234 lm isd")||text.equals("মন্টু চন্দ্র পাহান 1234 এল.এম ঈশ্বরদী")){
                    String number = "01710016053";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("rezaoul islam 1235 lm isd")||text.equals("রেজাউল ইসলাম 1235 এল.এম ঈশ্বরদী")){
                    String number = "01712736652";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("ashadul haque 1238 lm isd")||text.equals("আসাদুল হক 1238 এল.এম ঈশ্বরদী")){
                    String number = "01703383555";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("anamul haque 1241 lm isd")||text.equals("এনামুল হক 1241 এল.এম ঈশ্বরদী")){
                    String number = "01719903025";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("raich uddin 6330 lm isd")||text.equals("রইচ উদ্দিন 6330 এল.এম ঈশ্বরদী")){
                    String number = "01719903029";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("rafiqul islam 6912 lm isd")||text.equals("রফিকুল ইসলাম 6912 এল.এম ঈশ্বরদী")){
                    String number = "01722492909";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("masud rana 1245 lm isd")||text.equals("মাসুদ রানা 1245 এল.এম ঈশ্বরদী")){
                    String number = "01712439093";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("aktaruzzman 1247 lm isd")||text.equals("আক্তারুজ্জামান 1247 এল.এম ঈশ্বরদী")){
                    String number = "01729979493";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("samsur rahman 1249 lm isd")||text.equals("শামসুর রহমান 1249 এল.এম ঈশ্বরদী")){
                    String number = "01731277715";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("ashaduzzman khan 1253 lm isd")||text.equals("আসাদুজ্জামান খান 1253 এল.এম ঈশ্বরদী")){
                    String number = "01710045999";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("hamidul islam 1254 lm isd")||text.equals("হামিদুল ইসলাম 1254 এল.এম ঈশ্বরদী")){
                    String number = "01745599005";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("boshir ahmed 1255 lm isd")||text.equals("বশির আহম্মেদ 1255 এল.এম ঈশ্বরদী")){
                    String number = "01719900796";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("tohidul islam 1258 lm isd")||text.equals("তহিদুল ইসলাম 1258 এল.এম ঈশ্বরদী")){
                    String number = "01716775640";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("hafizur rahman 1260 lm isd")||text.equals("হাফিজুর রহমান 1260 এল.এম ঈশ্বরদী")){
                    String number = "01712988974";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("endrozit kumar sarker 1265 lm isd")||text.equals("ইন্দ্রজিৎ কুমার সরকার 1265 এল.এম ঈশ্বরদী")){
                    String number = "01718995277";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("sultan toufick hasan 1271 lm isd")||text.equals("সুলতান তৌফিক হাসান 1271 এল.এম ঈশ্বরদী")){
                    String number = "01712982587";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("tarek azad 3789 lm isd")||text.equals("তারিক আজাদ 3789 এল.এম ঈশ্বরদী")){
                    String number = "01712439040";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("imarot hossain 3790 lm isd")||text.equals("ইমারত হোসেন 3790 এল.এম ঈশ্বরদী")){
                    String number = "01755920091";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("k m mohioul alom 1289 lm isd")||text.equals("কে এম মহিউল আলম 1289 এল.এম ঈশ্বরদী")){
                    String number = "01721764022";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("nasirul islam 6328 lm isd")||text.equals("নাসিরুল ইসলাম 6328 এল.এম ঈশ্বরদী")){
                    String number = "01798242766";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("azijur rahman lm isd")||text.equals("আজিজুর রহমান এল.এম ঈশ্বরদী")){
                    String number = "01719928910";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("alomgir hossain 1302 lm isd")||text.equals("আলমগীর হোসেন 1302 এল.এম ঈশ্বরদী")){
                    String number = "01711008377";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("mojibul haque 1303 lm isd")||text.equals("মজিবুল হক 1303 এল.এম ঈশ্বরদী")){
                    String number = "01735335020";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("nurul islam 1351 lm isd")||text.equals("নুরুল ইসলাম 1351 এল.এম ঈশ্বরদী")){
                    String number = "01724682472";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("samsul haque 1305 lm isd")||text.equals("শামসুল হক 1305 এল.এম ঈশ্বরদী")){
                    String number = "01710135540";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("anisur rahman 1308 lm isd")||text.equals("আনিসুর রহমান 1308 এল.এম ঈশ্বরদী")){
                    String number = "01718835164";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("jabed ali 1039 lm isd")||text.equals("জাবেদ আলী 1039 এল.এম ঈশ্বরদী")){
                    String number = "01718936530";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("sanaour rahman 1310 lm isd")||text.equals("সানাউর রহমান 1310 এল.এম ঈশ্বরদী")){
                    String number = "01721339944";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("shahinul islam 1312 lm isd")||text.equals("শাহিনুল ইসলাম 1312 এল.এম ঈশ্বরদী")){
                    String number = "01716382668";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("namtaz ali 1313 lm isd")||text.equals("নামতাজ আলী 1313 এল.এম ঈশ্বরদী")){
                    String number = "01714944584";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("aslam uddin khan 1315 lm isd")||text.equals("আসলাম উদ্দিন খাঁন 1315 এল.এম ঈশ্বরদী")){
                    String number = "01711318390";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }

else if (text.equals("bairul islam 1502 alm isd")||text.equals("বাইরুল ইসলাম 1502 এ.এল.এম ঈশ্বরদী")){
                    String number = "01741074640";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("atikur rahman 1509 alm isd")||text.equals("আতিকুর রহমান 1509 এ.এল.এম ঈশ্বরদী")){
                    String number = "01710134949";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("firoz mahmud 1508 alm isd")||text.equals("ফিরোজ মাহমুদ 1508 এ.এল.এম ঈশ্বরদী")){
                    String number = "01717677017";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("m a hossain 1512 alm isd")||text.equals("এম এ হোসেন 1512 এ.এল.এম ঈশ্বরদী")){
                    String number = "01771916984";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("shojibur rahman 1513 alm isd")||text.equals("সজিবুর রহমান 1513 এ.এল.এম ঈশ্বরদী")){
                    String number = "01737211878";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("abdur rokib 1518 alm isd")||text.equals("আ: রকিব 1518 এ.এল.এম ঈশ্বরদী")){
                    String number = "01772848496";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("ismail hossain 1514 alm isd")||text.equals("ইসমাইল হোসেন 1514 এ.এল.এম ঈশ্বরদী")){
                    String number = "01868199978";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("anisur rahman 1515 alm isd")||text.equals("আনিছুর রহমান 1515 এ.এল.এম ঈশ্বরদী")){
                    String number = "01712982062";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("abdul momin 1517 alm isd")||text.equals("আ: মোমিন 1517 এ.এল.এম ঈশ্বরদী")){
                    String number = "01918688830";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("s m sazzad hossain 1519 alm isd")||text.equals("এস এম সাজ্জাদ হোসেন 1519 এ.এল.এম ঈশ্বরদী")){
                    String number = "01718511624";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("anisur rahman 1520 alm isd")||text.equals("আনিছুর রহমান 1520 এ.এল.এম ঈশ্বরদী")){
                    String number = "01718880164";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("mizanur rahman 1521 alm isd")||text.equals("মিজানুর রহমান 1521 এ.এল.এম ঈশ্বরদী")){
                    String number = "01738244310";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("monirul islam 1525 alm isd")||text.equals("মনিরুল ইসলাম 1525 এ.এল.এম ঈশ্বরদী")){
                    String number = "01783653484";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("nibas chandra mahato 1530 alm isd")||text.equals("নিবাস চন্দ্র মাহাতো 1530 এ.এল.এম ঈশ্বরদী")){
                    String number = "01735792467";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("razibul alom 1536 alm isd")||text.equals("রাজিবুল আলম 1536 এ.এল.এম ঈশ্বরদী")){
                    String number = "01913232563";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("mohinul islam 1537 alm isd")||text.equals("মহিনুল ইসলাম 1537 এ.এল.এম ঈশ্বরদী")){
                    String number = "01735560031";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("nazmul haque 1539 alm isd")||text.equals("নাজমুল হক 1539 এ.এল.এম ঈশ্বরদী")){
                    String number = "01966329914";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("s m ahoshon uddin 1540 alm isd")||text.equals("এস এম আহসান উদ্দিন 1540 এ.এল.এম ঈশ্বরদী")){
                    String number = "01752004183";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("abdus sobur khan 1544 alm isd")||text.equals("আ: সবুর খান 1544 এ.এল.এম ঈশ্বরদী")){
                    String number = "01700516054";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("sharmin sultana 1545 alm isd")||text.equals("সারমিন সুলতানা 1545 এ.এল.এম ঈশ্বরদী")){
                    String number = "01747240720";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("saiful islam 1548 alm isd")||text.equals("সাইফুল ইসলাম 1548 এ.এল.এম ঈশ্বরদী")){
                    String number = "01716884025";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("hasan muhammad kamarul islam 1549 alm isd")||text.equals("হাসান মুহাম্মাদ কামারুল ইসলাম 1549 এ.এল.এম ঈশ্বরদী")){
                    String number = "01723881564";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("osman goni 1550 alm isd")||text.equals("ওসমান গণি 1550 এ.এল.এম ঈশ্বরদী")){
                    String number = "01710140510";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("shoriful islam 1551 alm isd")||text.equals("শরিফুল ইসলাম 1551 এ.এল.এম ঈশ্বরদী")){
                    String number = "01687238381";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("arifur rahman 1552 alm isd")||text.equals("আরিফুর রহমান 1552 এ.এল.এম ঈশ্বরদী")){
                    String number = "01718787138";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("rokibul islam 1554 alm isd")||text.equals("রকিবুল ইসলাম 1554 এ.এল.এম ঈশ্বরদী")){
                    String number = "01738732557";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("alomgir hossain 1561 alm isd")||text.equals("আলমগীর হোসেন 1561 এ.এল.এম ঈশ্বরদী")){
                    String number = "01737203537";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("ziaour rahman 1501 alm isd")||text.equals("জিয়াউর রহমান 1501 এ.এল.এম ঈশ্বরদী")){
                    String number = "01720648813";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("shoil rana 1564 alm isd")||text.equals("সোহেল রানা 1564 এ.এল.এম ঈশ্বরদী")){
                    String number = "01716129753";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("habibur rahman 1565 alm isd")||text.equals("হাবিবুর রহমান 1565 এ.এল.এম ঈশ্বরদী")){
                    String number = "01717366228";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("masud rana 1578 alm isd")||text.equals("মাসুদ রানা 1578 এ.এল.এম ঈশ্বরদী")){
                    String number = "01917807894";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("uzzol hossain 1600 alm isd")||text.equals("উজ্জ্বল হোসেন 1600 এ.এল.এম ঈশ্বরদী")){
                    String number = "01722135744";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("abu bokkor siddik 1601 alm isd")||text.equals("আবু বক্কর সিদ্দিক 1601 এ.এল.এম ঈশ্বরদী")){
                    String number = "01718408313";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("arafen romen 1604 alm isd")||text.equals("আরেফিন রোমেন 1604 এ.এল.এম ঈশ্বরদী")){
                    String number = "01731976404";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("shohorab ali 1610 alm isd")||text.equals("সোহরাব আলী 1610 এ.এল.এম ঈশ্বরদী")){
                    String number = "01703503152";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("shain reza arif 1612 alm isd")||text.equals("শাহিন রেজা আরিফ 1612 এ.এল.এম ঈশ্বরদী")){
                    String number = "01719362906";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("ziaour rahman 6330 alm isd")||text.equals("জিয়াউর রহমান 6330 এ.এল.এম ঈশ্বরদী")){
                    String number = "01720644413";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("hediatulla alamin 1531 alm isd")||text.equals("হেদায়েতুল্লা আলামীন 1531 এ.এল.এম ঈশ্বরদী")){
                    String number = "01729342556";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("amirul islam 1533 alm isd")||text.equals("আমিরুল ইসলাম 1533 এ.এল.এম ঈশ্বরদী")){
                    String number = "01741909810";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("bulbul ahmed 1546 alm isd")||text.equals("বুলবুল আহম্মেদ 1546 এ.এল.এম ঈশ্বরদী")){
                    String number = "01798090525";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("tohiduzzman 1556 alm isd")||text.equals("তৌহিদুজ্জামান 1556 এ.এল.এম ঈশ্বরদী")){
                    String number = "01751455648";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("kutub uddin 1562 alm isd")||text.equals("কুতুব উদ্দিন 1562 এ.এল.এম ঈশ্বরদী")){
                    String number = "01714504378";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }

else if (text.equals("masud rana 1570 alm isd")||text.equals("মাসুদ রানা 1570 এ.এল.এম ঈশ্বরদী")){
                    String number = "01736570112";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("nazrul islam 1576 alm isd")||text.equals("নজরুল ইসলাম 1576 এ.এল.এম ঈশ্বরদী")){
                    String number = "01726963402";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("rezaoul korim 1602 alm isd")||text.equals("রেজাউল করিম 1602 এ.এল.এম ঈশ্বরদী")){
                    String number = "01719785752";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("fazlul haque 1603 alm isd")||text.equals("ফজলুল হক 1603 এ.এল.এম ঈশ্বরদী")){
                    String number = "01722455711";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }

else if (text.equals("nazrul islam 1606 alm isd")||text.equals("নজরুল ইসলাম 1606 এ.এল.এম ঈশ্বরদী")){
                    String number = "01783713215";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("masud rana 1608 alm isd")||text.equals("মাসুদ রানা 1608 এ.এল.এম ঈশ্বরদী")){
                    String number = "01728228920";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("shoiel rana 1609 alm isd")||text.equals("সোহেল রানা 1609 এ.এল.এম ঈশ্বরদী")){
                    String number = "01745502962";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("kobir hossain 1613 alm isd")||text.equals("কবির হোসেন 1613 এ.এল.এম ঈশ্বরদী")){
                    String number = "01736001451";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("shoiel rana 1615 alm isd")||text.equals("সোহেল রানা 1615 এ.এল.এম ঈশ্বরদী")){
                    String number = "01719503396";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("nazmul haque roni 1616 alm isd")||text.equals("নাজমুল হক রনি 1616 এ.এল.এম ঈশ্বরদী")){
                    String number = "01726847222";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("muhammad jubayer 1617 alm isd")||text.equals("মুহাম্মদ জুবায়ের 1617 এ.এল.এম ঈশ্বরদী")){
                    String number = "01740971349";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("golam mozid 1619 alm isd")||text.equals("গোলাম মজিদ 1619 এ.এল.এম ঈশ্বরদী")){
                    String number = "01710451722";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("tofail ahmed 1620 alm isd")||text.equals("তোফায়েল আহম্মেদ 1620 এ.এল.এম ঈশ্বরদী")){
                    String number = "01748952100";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("anower hossain 1621 alm isd")||text.equals("আনোয়ার হোসেন 1621 এ.এল.এম ঈশ্বরদী")){
                    String number = "01783654449";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("imaran hossain 1623 alm isd")||text.equals("ইমরান হোসেন 1623 এ.এল.এম ঈশ্বরদী")){
                    String number = "01737804591";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("belayet hossain 1626 alm isd")||text.equals("বেলায়েত হোসেন 1626 এ.এল.এম ঈশ্বরদী")){
                    String number = "01712763815";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("hafizur rahman 1629 alm isd")||text.equals("হাফিজুর রহমান 1629 এ.এল.এম ঈশ্বরদী")){
                    String number = "01711451190";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("jayed hossain 1631 alm isd")||text.equals("জায়েদ হোসেন 1631 এ.এল.এম ঈশ্বরদী")){
                    String number = "01729675900";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("rofiqul islam 6912 alm isd")||text.equals("রফিকুল ইসলাম 6912 এ.এল.এম ঈশ্বরদী")){
                    String number = "01722492909";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("abdus salam dayon 1502 lm isd")||text.equals("আ: সালাম দেওয়ান 1502 এল.এম ঈশ্বরদী")){
                    String number = "01786289091";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("sheak rassel 1614 lm isd")||text.equals("শেখ রাসেল 1614 এল.এম ঈশ্বরদী")){
                    String number = "01730918956";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("subroto kumar bala 1635 lm isd")||text.equals("সুব্রত কুমার বালা 1635 এল.এম ঈশ্বরদী")){
                    String number = "01720921790";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("shain hossain 1638 lm isd")||text.equals("শাহিন হোসেন 1638 এল.এম ঈশ্বরদী")){
                    String number = "01756556709";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("kazi mahamud hossain 7125 lm kln")||text.equals("কাজী মাহমুদ হোসেন 7125 এল.এম খুলন")){
                    String number = "01720506279";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("s.m jakir hossain 7126 lm kln")||text.equals("এস.এম জাকির হোসেন 7126 এল.এম খুলন")){
                    String number = "01718608010";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("abu bokkor siddik 7141 lm kln")||text.equals("আবু বকর সিদ্দিক 7141 এল.এম খুলন")){
                    String number = "01712708636";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("salim howladar 7152 lm kln")||text.equals("সেলিম হাওলাদার 7152 এল.এম খুলন")){
                    String number = "01736884208";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("abdul hakim 7165 lm kln")||text.equals("আ: হাকিম 7165 এল.এম খুলন")){
                    String number = "01720506239";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("saidul islam 7166 lm kln")||text.equals("সাইদুল ইসলাম 7166 এল.এম খুলন")){
                    String number = "01720506235";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("abdul alim 7168 lm kln")||text.equals("আ: আলিম 7168 এল.এম খুলন")){
                    String number = "01712397424";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("tusar kanti bushas 7179 lm kln")||text.equals("তুষার কান্তি বিশ্বাস 7179 এল.এম খুলন")){
                    String number = "01716144149";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("israil hossain 7193 lm kln")||text.equals("ইসরাইল হোসেন 7193 এল.এম খুলন")){
                    String number = "01718702763";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("bengir rahman 7194 lm kln")||text.equals("বেনজির রহমান 7194 এল.এম খুলন")){
                    String number = "01711826211";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("mujibor rahman 7197 lm kln")||text.equals("মজিবর রহমান 7197 এল.এম খুলন")){
                    String number = "01712181100";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("rezaoul korim 7198 lm aua")||text.equals("রেজাউল করিম 7198 এল.এম আমনুরা")){
                    String number = "01716175768";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("abdul kuddul chowdury 7105 lm kln")||text.equals("আ: কুদ্দুস চৌধুরী 7105 এল.এম খুলনা")){
                    String number = "01710759121";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("kazi marufuzzman 7106 lm kln")||text.equals("কাজী মারুফুজ্জামান 7106 এল.এম খুলনা")){
                    String number = "01710996849";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("b.m robiul alom 7108 lm kln")||text.equals("বি.এম রবিউল আলম 7108 এল.এম খুলনা")){
                    String number = "01724200810";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("b m robiul alom 7108 lm kln")||text.equals("বি এম রবিউল আলম 7108 এল.এম খুলনা")){
                    String number = "01724200810";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("shamim kobir 7115 lm kln")||text.equals("শামীম কবির 7115 এল.এম খুলনা")){
                    String number = "01747800217";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("s m aminul islam 7122 lm kln")||text.equals("এস এম আমিনুল ইসলাম 7122 এল.এম খুলনা")){
                    String number = "01789353435";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("nurul amin 7123 lm kln")||text.equals("নুরুল আমিন 7123 এল.এম খুলনা")){
                    String number = "01716955804";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("shawket hossain 7129 lm kln")||text.equals("সাখাওয়াত হোসেন 7129 এল.এম খুলনা")){
                    String number = "01762476600";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("rayhan hasan 7140 lm kln")||text.equals("রায়হান হাসান 7140 এল.এম খুলনা")){
                    String number = "01720558788";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("rofiqul islam 7151 lm kln")||text.equals("রফিকুল ইসলাম 7151 এল.এম খুলনা")){
                    String number = "01718713772";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("shekdar julfiker al mamun 7153 lm kln")||text.equals("শিকদার জুলফিকাপর আল মামুন 7153 এল.এম খুলনা")){
                    String number = "01720506223";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("ajgor ali 7159 lm kln")||text.equals("আজগর আলী 7159 এল.এম খুলনা")){
                    String number = "01779004793";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("shahinuzzman 7174 lm kln")||text.equals("শাহিনুজ্জামান 7174 এল.এম খুলনা")){
                    String number = "01710738723";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("minal mahfuz 7176 lm kln")||text.equals("মিনাল মাহফুজ 7176 এল.এম খুলনা")){
                    String number = "01715235233";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("johirul islam 1855 lm kln")||text.equals("জহিরুল ইসলাম 1855 এল.এম খুলনা")){
                    String number = "01716277808";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("debtos kumar ray 7101 lm kln")||text.equals("দেবতোষ কুমার রায় 7101 এল.এম খুলনা")){
                    String number = "01712334536";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("helal muhammad abdul azad 1860 lm kln")||text.equals("হেলাল মো: আ: আজাদ 1860 এল.এম খুলনা")){
                    String number = "01712248015";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("khan moklesur rahman 6361 lm kln")||text.equals("খাঁন মোকলেছুর রহমান 6361 এল.এম খুলনা")){
                    String number = "01917062406";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("abdur rahim 7102 slm kln")||text.equals("আ: রহিম 7102 এস.এল.এম খুলনা")){
                    String number = "01719558483";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("kamal hossain 7124 slm kln")||text.equals("কামাল হোসেন 7124 এস.এল.এম খুলনা")){
                    String number = "01831770774";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("abdul mozid 7131 slm kln")||text.equals("আ:মজিদ 7131 এস.এল.এম খুলনা")){
                    String number = "01727750824";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("osman goni 7138 slm kln")||text.equals("ওসমান গণি 7138 এস.এল.এম খুলনা")){
                    String number = "01724932884";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("tahowidor rahman 7139 slm kln")||text.equals("তাওহিদুর রহমান 7139 এস.এল.এম খুলনা")){
                    String number = "01716935912";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("kazi aminul islam 7150 slm kln")||text.equals("কাজী আমিনুল ইসলাম 7150 এস.এল.এম খুলনা")){
                    String number = "01712613311";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("sultan ahmed 7164 slm kln")||text.equals("সুলতান আহম্মেদ 7164 এস.এল.এম খুলনা")){
                    String number = "01732545280";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("hafiz forid ahmed 7176 slm kln")||text.equals("হাফেজ ফরিদ আহম্মেদ 7176 এস.এল.এম খুলনা")){
                    String number = "01937042828";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("foisal ahmed 7169 slm kln")||text.equals("ফয়সাল আহম্মেদ 7169 এস.এল.এম খুলনা")){
                    String number = "01670367966";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("s m amirul islam 1853 slm kln")||text.equals("এস এম আমিরুল ইসলাম 1853 এস.এল.এম খুলনা")){
                    String number = "01716032152";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("pronoy mondol 7103 alm kln")||text.equals("প্রনয় মন্ডল 7103 এ.এল.এম খুলনা")){
                    String number = "01766500828";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("sonjoy kumar shil 7104 alm kln")||text.equals("সঞ্জয় কুমার শীল 7104 এ.এল.এম খুলনা")){
                    String number = "01731336408";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("ashaduzzman hemu 7107 alm kln")||text.equals("আসাদুজ্জামান হিমু 7107 এ.এল.এম খুলনা")){
                    String number = "01919515100";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("forjon ahmed 7109 alm kln")||text.equals("ফরজন আহম্মেদ 7109 এ.এল.এম খুলনা")){
                    String number = "01913146805";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("yoazed ali 7110 alm kln")||text.equals("ওয়াজেদ আলী 7110 এ.এল.এম খুলনা")){
                    String number = "01719541357";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("isharot mollik 7113 alm kln")||text.equals("ইসারত মল্লিক 7113 এ.এল.এম খুলনা")){
                    String number = "01714599583";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("golam rosul 7114 alm kln")||text.equals("গোলাম রসুল 7114 এ.এল.এম খুলনা")){
                    String number = "01728750858";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("obaidur rahman 7116 alm kln")||text.equals("ওবায়দুর রহমান 7116 এ.এল.এম খুলনা")){
                    String number = "01719921596";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("nur nobi 7111 alm kln")||text.equals("নূর নবী 7111 এ.এল.এম খুলনা")){
                    String number = "01796419941";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("said bazlur rahman 7117 alm kln")||text.equals("সৈয়দ বজলুর রহমান 7117 এ.এল.এম খুলনা")){
                    String number = "01720558712";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("atikur rahman 7118 alm kln")||text.equals("আতিকুর রহমান 7118 এ.এল.এম খুলনা")){
                    String number = "01927569687";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("sheak hediat ali 7133 alm kln")||text.equals("শেখ হেদায়েত আলী 7133 এ.এল.এম খুলনা")){
                    String number = "01701831602";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("shahazan ali 7135 alm kln")||text.equals("শাহজাহান আলী 7135 এ.এল.এম খুলনা")){
                    String number = "01700821575";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("satodol debnat 7136 alm kln")||text.equals("শতদল দেবনাথ 7136 এ.এল.এম খুলনা")){
                    String number = "01716701948";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("imam uddin mollah 7137 alm kln")||text.equals("ইমাম উদ্দিন মোল্লা 7137 এ.এল.এম খুলনা")){
                    String number = "01912012876";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("mohitul islam 7143 alm kln")||text.equals("মহিতুল ইসলাম 7143 এ.এল.এম খুলনা")){
                    String number = "01789424128";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("sakil mahamud ali khan 7144 alm kln")||text.equals("শাকিল মাহমুদ আলী খান 7144 এ.এল.এম খুলনা")){
                    String number = "01926956016";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("asibjan galib 7147 alm kln")||text.equals("আসিবজান গালিব 7147 এ.এল.এম খুলনা")){
                    String number = "01955801697";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("nousin ahmed 7148 alm kln")||text.equals("নওশিন আহম্মেদ 7148 এ.এল.এম খুলনা")){
                    String number = "01765667076";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("mehedi hasan imran 7149 alm kln")||text.equals("মেহেদী হাসান ইমরান 7149 এ.এল.এম খুলনা")){
                    String number = "01770261898";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("rokibul islam 7156 alm kln")||text.equals("রকিবুল ইসলাম 7156 এ.এল.এম খুলনা")){
                    String number = "01911417866";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("abdul malek 7163 alm kln")||text.equals("আ: মালেক 7163 এ.এল.এম খুলনা")){
                    String number = "01924140572";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("siddikur rahman 7170 alm kln")||text.equals("সিদ্দিকুর রহমান 7170 এ.এল.এম খুলনা")){
                    String number = "01716032152";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("junaid hossain 7172 alm kln")||text.equals("জুনায়েদ হোসেন 7172 এ.এল.এম খুলনা")){
                    String number = "01925827809";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("kamal hossain 7173 alm kln")||text.equals("কামাল হোসেন 7173 এ.এল.এম খুলনা")){
                    String number = "01712792355";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("said khairul alom 7178 alm kln")||text.equals("সৈয়দ খায়রুল আলম 7178 এ.এল.এম খুলনা")){
                    String number = "01754645626";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("robiul islam 7180 alm kln")||text.equals("রবিউল ইসলাম 7180 এ.এল.এম খুলনা")){
                    String number = "01728389527";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("abonish ray 7182 alm kln")||text.equals("অবনিশ রায় 7182 এ.এল.এম খুলনা")){
                    String number = "01912956255";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("rezaoul korim 7183 alm kln")||text.equals("রেজাউল করিম 7183 এ.এল.এম খুলনা")){
                    String number = "01712547241";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("ashadul islam 7185 alm kln")||text.equals("আসাদুল ইসলাম 7185 এ.এল.এম খুলনা")){
                    String number = "01711031894";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("aktaruzzman 7191 alm kln")||text.equals("আক্তারুজ্জামান 7191 এ.এল.এম খুলনা")){
                    String number = "01708199308";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("mirazul islam 7196 alm kln")||text.equals("মিরাজুল ইসলাম 7196 এ.এল.এম খুলনা")){
                    String number = "01738142898";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("delower hossain 7145 alm kln")||text.equals("দেলোয়ার হোসেন 7145 এ.এল.এম খুলনা")){
                    String number = "01736394962";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("iqbal hossain 7146 alm kln")||text.equals("ইকবাল হোসেন 7146 এ.এল.এম খুলনা")){
                    String number = "01744435744";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("saidur rahman 7187 alm kln")||text.equals("সাইদুর রহমান 7187 এ.এল.এম খুলনা")){
                    String number = "01765679591";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("ruhul kuddus alm isd")||text.equals("রুহুল কুদ্দুস এ.এল.এম ঈশ্বরদী")){
                    String number = "01740632204";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("subasish ray 531 alm kln")||text.equals("শুভাশীষ রায় এ.এল.এম খুলনা")){
                    String number = "01747107884";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("rothin ray 534 alm kln")||text.equals("রথিন রায় 534 এ.এল.এম খুলনা")){
                    String number = "01923079992";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
else if (text.equals("shain lm kln")||text.equals("শাহিন এল এম খুলনা")){
                    String number = "01712827504";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }







                else {
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" +text));
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