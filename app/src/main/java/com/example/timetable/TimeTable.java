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

public class TimeTable extends AppCompatActivity {
    private AutoCompleteTextView autoCompleteTextView;
    private Button showbutton,clear;
    private TextView textView;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_time_table);

        autoCompleteTextView = findViewById(R.id.autocompletetextid);
        listView = findViewById(R.id.listviewid);

        showbutton = findViewById(R.id.showbuttonid);
        textView = findViewById(R.id.textview);
        clear = findViewById(R.id.clear);



        String [] countryNames = getResources().getStringArray(R.array.country);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,countryNames);
        autoCompleteTextView.setAdapter(adapter);
        autoCompleteTextView.setThreshold(1);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

              if(position==0){
                  Intent intent = new Intent(TimeTable.this,MainActivity2.class);
                  startActivity(intent);
              }
                if(position==1){
                    Intent intent = new Intent(TimeTable.this,MainActivity3.class);
                    startActivity(intent);
                }
                if(position==2){
                    Intent intent = new Intent(TimeTable.this,MainActivity4.class);
                    startActivity(intent);
                }
                if(position==3){
                    Intent intent = new Intent(TimeTable.this,MainActivity5.class);
                    startActivity(intent);
                }
                if(position==4){
                    Intent intent = new Intent(TimeTable.this,MainActivity6.class);
                    startActivity(intent);
                }
                if(position==5){
                    Intent intent = new Intent(TimeTable.this,MainActivity7.class);
                    startActivity(intent);
                }
                if(position==6){
                    Intent intent = new Intent(TimeTable.this,MainActivity8.class);
                    startActivity(intent);
                }
                if(position==7){
                    Intent intent = new Intent(TimeTable.this,MainActivity9.class);
                    startActivity(intent);
                }
                if(position==8){
                    Intent intent = new Intent(TimeTable.this,MainActivity10.class);
                    startActivity(intent);
                }
                if(position==9){
                    Intent intent = new Intent(TimeTable.this,MainActivity11.class);
                    startActivity(intent);
                }
                if(position==10){
                    Intent intent = new Intent(TimeTable.this,MainActivity12.class);
                    startActivity(intent);
                }
                if(position==11){
                    Intent intent = new Intent(TimeTable.this,MainActivity13.class);
                    startActivity(intent);
                }
                if(position==12){
                    Intent intent = new Intent(TimeTable.this,MainActivity14.class);
                    startActivity(intent);
                }
                if(position==13){
                    Intent intent = new Intent(TimeTable.this,MainActivity15.class);
                    startActivity(intent);
                }
                if(position==14){
                    Intent intent = new Intent(TimeTable.this,MainActivity16.class);
                    startActivity(intent);
                }
                  if(position==15){
                    Intent intent = new Intent(TimeTable.this,MainActivity17.class);
                    startActivity(intent);
                }
                  if(position==16){
                    Intent intent = new Intent(TimeTable.this,MainActivity18.class);
                    startActivity(intent);
                }
                  if(position==17){
                    Intent intent = new Intent(TimeTable.this,MainActivity19.class);
                    startActivity(intent);
                }
              if(position==18){
                    Intent intent = new Intent(TimeTable.this,MainActivity20.class);
                    startActivity(intent);
                }
              if(position==19){
                    Intent intent = new Intent(TimeTable.this,MainActivity21.class);
                    startActivity(intent);
                }
              if(position==20){
                    Intent intent = new Intent(TimeTable.this,MainActivity22.class);
                    startActivity(intent);
                }
              if(position==21){
                    Intent intent = new Intent(TimeTable.this,MainActivity23.class);
                    startActivity(intent);
                }
              if(position==22){
                    Intent intent = new Intent(TimeTable.this,MainActivity24.class);
                    startActivity(intent);
                }
              if(position==23){
                    Intent intent = new Intent(TimeTable.this,MainActivity25.class);
                    startActivity(intent);
                }
              if(position==24){
                    Intent intent = new Intent(TimeTable.this,MainActivity26.class);
                    startActivity(intent);
                }
           if(position==25){
                    Intent intent = new Intent(TimeTable.this,MainActivity27.class);
                    startActivity(intent);
                }
           if(position==26){
                    Intent intent = new Intent(TimeTable.this,MainActivity28.class);
                    startActivity(intent);
                }
           if(position==27){
                    Intent intent = new Intent(TimeTable.this,MainActivity29.class);
                    startActivity(intent);
                }
         if(position==28){
                    Intent intent = new Intent(TimeTable.this,MainActivity30.class);
                    startActivity(intent);
                }
           if(position==29){
                    Intent intent = new Intent(TimeTable.this,MainActivity31.class);
                    startActivity(intent);
                }
           if(position==30){
                    Intent intent = new Intent(TimeTable.this,MainActivity32.class);
                    startActivity(intent);
                }
           if(position==31){
                    Intent intent = new Intent(TimeTable.this,MainActivity33.class);
                    startActivity(intent);
                }
           if(position==32){
                    Intent intent = new Intent(TimeTable.this,MainActivity34.class);
                    startActivity(intent);
                }
        if(position==33){
                    Intent intent = new Intent(TimeTable.this,MainActivity35.class);
                    startActivity(intent);
                }
        if(position==34){
                    Intent intent = new Intent(TimeTable.this,MainActivity36.class);
                    startActivity(intent);
                }
          if(position==35){
                    Intent intent = new Intent(TimeTable.this,MainActivity37.class);
                    startActivity(intent);
                }
          if(position==36){
                    Intent intent = new Intent(TimeTable.this,MainActivity38.class);
                    startActivity(intent);
                }
          if(position==37){
                    Intent intent = new Intent(TimeTable.this,MainActivity39.class);
                    startActivity(intent);
                }

          if(position==38){
                    Intent intent = new Intent(TimeTable.this,MainActivity40.class);
                    startActivity(intent);
                }
       if(position==39){
                    Intent intent = new Intent(TimeTable.this,MainActivity41.class);
                    startActivity(intent);
                }
          if(position==40){
                    Intent intent = new Intent(TimeTable.this,MainActivity42.class);
                    startActivity(intent);
                }

          if(position==41){
                    Intent intent = new Intent(TimeTable.this,MainActivity43.class);
                    startActivity(intent);
                }
     if(position==42){
                    Intent intent = new Intent(TimeTable.this,MainActivity44.class);
                    startActivity(intent);
                }


            }
        });

        showbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = autoCompleteTextView.getText().toString();
                if(text.equals("705 da-pbt")){
                    Intent intent = new Intent(TimeTable.this,MainActivity2.class);
                    startActivity(intent);
                }
                if(text.equals("705 pbt-bmsm")){
                    Intent intent = new Intent(TimeTable.this,MainActivity3.class);
                    startActivity(intent);

                }
                if(text.equals("706 bmsm-pbt")){
                    Intent intent = new Intent(TimeTable.this,MainActivity4.class);
                    startActivity(intent);
                }
                if(text.equals("706 pbt-da")){
                    Intent intent = new Intent(TimeTable.this,MainActivity5.class);
                    startActivity(intent);
                }
                if(text.equals("731 rjhi-pbt")){
                    Intent intent = new Intent(TimeTable.this,MainActivity6.class);
                    startActivity(intent);
                }
                if(text.equals("731/732 pbt-clh-pbt")){
                    Intent intent = new Intent(TimeTable.this,MainActivity7.class);
                    startActivity(intent);
                }
                if(text.equals("733 rjhi-pbt")){
                    Intent intent = new Intent(TimeTable.this,MainActivity8.class);
                    startActivity(intent);
                }
               if(text.equals("733/734 pbt-clh-pbt")){
                    Intent intent = new Intent(TimeTable.this,MainActivity9.class);
                    startActivity(intent);
                }
                if(text.equals("757 da-pbt")){
                    Intent intent = new Intent(TimeTable.this,MainActivity10.class);
                    startActivity(intent);
                }
                if(text.equals("757 pbt-bmsm")){
                    Intent intent = new Intent(TimeTable.this,MainActivity11.class);
                    startActivity(intent);
                }
                if(text.equals("758 bmsm-pbt")){
                    Intent intent = new Intent(TimeTable.this,MainActivity12.class);
                    startActivity(intent);
                }
                if(text.equals("758 pbt-da")){
                    Intent intent = new Intent(TimeTable.this,MainActivity13.class);
                    startActivity(intent);
                }
                if(text.equals("765 da-pbt")){
                    Intent intent = new Intent(TimeTable.this,MainActivity14.class);
                    startActivity(intent);
                }
                if(text.equals("765/766 pbt-clh-pbt")){
                    Intent intent = new Intent(TimeTable.this,MainActivity15.class);
                    startActivity(intent);
                }
                if(text.equals("766 pbt-da")){
                    Intent intent = new Intent(TimeTable.this,MainActivity16.class);
                    startActivity(intent);
                }
               if(text.equals("767 pbt-bmsm")){
                    Intent intent = new Intent(TimeTable.this,MainActivity17.class);
                    startActivity(intent);
                }
               if(text.equals("768 bmsm-pbt")){
                    Intent intent = new Intent(TimeTable.this,MainActivity18.class);
                    startActivity(intent);
                }
               if(text.equals("793 da-pbt")){
                    Intent intent = new Intent(TimeTable.this,MainActivity19.class);
                    startActivity(intent);
                }
               if(text.equals("793 pbt-bmsm")){
                    Intent intent = new Intent(TimeTable.this,MainActivity20.class);
                    startActivity(intent);
                }
               if(text.equals("794 bmsm-pbt")){
                    Intent intent = new Intent(TimeTable.this,MainActivity21.class);
                    startActivity(intent);
                }
              if(text.equals("794 pbt-da")){
                    Intent intent = new Intent(TimeTable.this,MainActivity22.class);
                    startActivity(intent);
                }
             if(text.equals("797 da-pbt")){
                    Intent intent = new Intent(TimeTable.this,MainActivity23.class);
                    startActivity(intent);
                }
            if(text.equals("797/798 pbt-krm-pbt")){
                    Intent intent = new Intent(TimeTable.this,MainActivity24.class);
                    startActivity(intent);
                }
            if(text.equals("798 pbt-da")){
                    Intent intent = new Intent(TimeTable.this,MainActivity25.class);
                    startActivity(intent);
                }
                if(text.equals("803 pbt-bmsm")){
                    Intent intent = new Intent(TimeTable.this,MainActivity26.class);
                    startActivity(intent);
                }
               if(text.equals("804 bmsm-pbt")){
                    Intent intent = new Intent(TimeTable.this,MainActivity27.class);
                    startActivity(intent);
                }
            if(text.equals("805 da-pbt")){
                    Intent intent = new Intent(TimeTable.this,MainActivity28.class);
                    startActivity(intent);
                }

            if(text.equals("805/806 pbt-clh-pbt")){
                    Intent intent = new Intent(TimeTable.this,MainActivity29.class);
                    startActivity(intent);
                }
            if(text.equals("806 pbt-da")){
                    Intent intent = new Intent(TimeTable.this,MainActivity30.class);
                    startActivity(intent);
                }
            if(text.equals("3131 dact-hda-pbt")){
                    Intent intent = new Intent(TimeTable.this,MainActivity31.class);
                    startActivity(intent);
                }
          if(text.equals("3131/3132 pbt-clh-pbt")){
                    Intent intent = new Intent(TimeTable.this,MainActivity32.class);
                    startActivity(intent);
                }
         if(text.equals("3132 pbt-dact")){
                    Intent intent = new Intent(TimeTable.this,MainActivity33.class);
                    startActivity(intent);
                }
             if(text.equals("load + -")){
                    Intent intent = new Intent(TimeTable.this,MainActivity34.class);
                    startActivity(intent);
                }
       if(text.equals("23 isd-pbt")){
                    Intent intent = new Intent(TimeTable.this,MainActivity35.class);
                    startActivity(intent);
                }
       if(text.equals("24 pbt-isd")){
                    Intent intent = new Intent(TimeTable.this,MainActivity36.class);
                    startActivity(intent);
                }
       if(text.equals("27/28 pbt-clh-pbt")){
                    Intent intent = new Intent(TimeTable.this,MainActivity37.class);
                    startActivity(intent);
                }
      if(text.equals("31 rjhi-pbt")){
                    Intent intent = new Intent(TimeTable.this,MainActivity38.class);
                    startActivity(intent);
                }

      if(text.equals("32 pbt-rjhi")){
                    Intent intent = new Intent(TimeTable.this,MainActivity39.class);
                    startActivity(intent);
                }
      if(text.equals("41/42 pbt-bmsm-pbt")){
                    Intent intent = new Intent(TimeTable.this,MainActivity40.class);
                    startActivity(intent);
                }
   if(text.equals("64/65 pbt-bqx")){
                    Intent intent = new Intent(TimeTable.this,MainActivity41.class);
                    startActivity(intent);
                }
   if(text.equals("66/63 bqx-pbt")){
                    Intent intent = new Intent(TimeTable.this,MainActivity42.class);
                    startActivity(intent);
                }
   if(text.equals("732 pbt-rjhi")){
                    Intent intent = new Intent(TimeTable.this,MainActivity43.class);
                    startActivity(intent);
                }
   if(text.equals("734 pbt-rjhi")){
                    Intent intent = new Intent(TimeTable.this,MainActivity44.class);
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