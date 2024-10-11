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

public class Pbtintercity extends AppCompatActivity {
    private EditText ed1,ed2,ed3,ed4,ed5,ed6,ed7,ed8,ed9,ed10,ed11;
    private Button bt1,bt2;
    private TextView tv1,tv2,tv3,tv4,tv5,tv6,tv7;
    private AutoCompleteTextView autoCompleteTextView;
    Integer n1,n2,n3,n4,w1,w2,s1,s2,ts,sth,stm,tst,ln,w3,w4,rt,ra,w5,w6;
    String tn;
    Double sr,dr,tr,lpr,srr,ld,lp1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_pbtintercity);

        autoCompleteTextView = findViewById(R.id.ed11);
        String [] PbtRation = getResources().getStringArray(R.array.pbtration);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,PbtRation);
        autoCompleteTextView.setAdapter(adapter);
        autoCompleteTextView.setThreshold(1);
        ed1 = findViewById(R.id.ed1);
        ed2 = findViewById(R.id.ed2);
        ed3 = findViewById(R.id.ed3);
        ed4 = findViewById(R.id.ed4);
        ed5 = findViewById(R.id.ed5);
        ed6 = findViewById(R.id.ed6);
        ed7 = findViewById(R.id.ed7);
        ed8 = findViewById(R.id.ed8);
        ed9 = findViewById(R.id.ed9);
        ed10= findViewById(R.id.ed10);
        ed11 = findViewById(R.id.ed11);
        bt1 = findViewById(R.id.calculateid);
        bt2 = findViewById(R.id.clearid);
        tv1 = findViewById(R.id.tv1id);
        tv2 = findViewById(R.id.tv2id);
        tv3 = findViewById(R.id.tv3id);
        tv4 = findViewById(R.id.tv4id);
        tv5 = findViewById(R.id.tv5id);
        tv6 = findViewById(R.id.tv6id);
        tv7 = findViewById(R.id.tv7id);
        bt2 = findViewById(R.id.clearid);
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
        ed6.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(ed6.getText().toString().length()==2){
                    ed7.requestFocus();
                }
            }
            @Override
            public void afterTextChanged(Editable s) {
            }
        });
        ed7.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(ed7.getText().toString().length()==2){
                    ed8.requestFocus();
                }
            }
            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        ed8.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(ed8.getText().toString().length()==2){
                    ed9.requestFocus();
                }
            }
            @Override
            public void afterTextChanged(Editable s) {
            }
        });
        ed9.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(ed9.getText().toString().length()==2){
                    ed10.requestFocus();
                }
            }
            @Override
            public void afterTextChanged(Editable s) {
            }
        });
        ed10.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(ed10.getText().toString().length()==2){
                    ed11.requestFocus();
                }
            }
            @Override
            public void afterTextChanged(Editable s) {
            }
        });
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1.length()==0 ||ed2.length()==0 || ed3.length()==0 || ed4.length()==0 || ed5.length()==0 ||ed6.length()==0 ||ed7.length()==0 ||ed8.length()==0 ||ed9.length()==0 ||ed10.length()==0 ||ed11.length()==0){
                    Toast.makeText(getApplicationContext(),"Please fill all field",Toast.LENGTH_LONG).show();
                }
                else {
                    n1 = Integer.valueOf(ed1.getText().toString().trim());
                    n2 = Integer.valueOf(ed2.getText().toString().trim());
                    n3 = Integer.valueOf(ed3.getText().toString().trim());
                    n4 = Integer.valueOf(ed4.getText().toString().trim());
                    s1 = Integer.valueOf(ed5.getText().toString().trim());
                    s2 = Integer.valueOf(ed6.getText().toString().trim());
                    sth = Integer.valueOf(ed7.getText().toString().trim());
                    stm = Integer.valueOf(ed8.getText().toString().trim());
                    ln = Integer.valueOf(ed9.getText().toString().trim());
                    ld = Double.valueOf(ed10.getText().toString().trim());
                    tn = String.valueOf(ed11.getText().toString().trim());
                    if(n3>n1 && n4>n2){
                        w1= n3-n1;
                        w2 = n4-n2;
                    }
                    else if (n3>n1 && n2>n4)  {
                        w1 = n3 -n1-1;
                        w2 = (60-n2) +n4;
                    }
                    else if (n1>n3 && n4>n2)  {
                        w1 = (24-n1)+n3;
                        w2 = n4-n2;
                    }
                    else if (n1>n3 && n2>n4)  {
                        w1 = (24-n1)+n3-1;
                        w2 = (60-n2)+n4;
                    }
                    else if (n1==n3 && n2>n4)  {
                        w1 = 23;
                        w2 = 60-n2+n4;
                    }
                    else if (n1==n3 && n4==n2)  {
                        w1 =0;
                        w2 = 0;
                    }
                    else if (n1==n3 && n2<n4)  {
                        w1 = 0;
                        w2 = n4-n2;
                    }
                    else if (n2==n4 && n1>n3)  {
                        w1 = (24-n1)+n3;
                        w2 = 0;
                    }
                    else if (n2==n4 && n3>n1)  {
                        w1 = n3-n1;
                        w2 = 0;
                    }
                    tv2.setText(String.valueOf("Total Work " + w1 + " Hour " + w2 + " Minute "));
                    w3 = w1*60+w2;
                    ts = s1*60+s2;
                    tst = sth*60+stm;
                 if(tn.equals("733 pbt-clh-pbt") && (ln.equals(65)) && ld>24){
                   w4 = w3-(ts+tst +200);
                   w5 = w4/60;
                   w6 = w4 %60;
                   lp1 = ld-24;
                   lpr =Math.ceil((4.0/80.0)*lp1*135);
                   dr =Math.ceil( (w4*20.0)/60);
                   sr =Math.ceil( (ts*30.0)/60);
                   tr =Math.ceil(290+sr + dr+lpr) ;
                   tv1.setText(String.valueOf( "R/T 3:20 ,Ration 290,load 24"));
                   tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                   tv4.setText(String.valueOf("Total Ration " + tr));
                   tv5.setText(String.valueOf("Shunting Ration " + sr));
                   tv6.setText(String.valueOf(" Detention Ration " + dr));
                   tv7.setText(String.valueOf(" Load Plus " + lpr));
                 }
                    else if(tn.equals("733 pbt-clh-pbt") && (ln.equals(65)) && ld<24){
                        w4 = w3-(ts+tst +200);
                        w5 = w4/60;
                        w6 = w4 %60;
                        lp1 = 24 -ld;
                        lpr =Math.floor((3.0/80.0)*lp1*135);
                        dr =Math.ceil( (w4*20.0)/60);
                        sr =Math.ceil( (ts*30.0)/60);
                        tr =Math.ceil(290+sr + dr-lpr) ;
                        tv1.setText(String.valueOf( "R/T 3:20 ,Ration 290,load 24"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    }
                    else if(tn.equals("733 pbt-clh-pbt") && (ln.equals(65)) && ld==24){
                        w4 = w3-(ts+tst +200);
                        w5 = w4/60;
                        w6 = w4 %60;
                        dr =Math.ceil( (w4*20.0)/60);
                        sr =Math.ceil( (ts*30.0)/60);
                        tr =Math.ceil(290+sr + dr) ;
                        tv1.setText(String.valueOf( "R/T 3:20 ,Ration 290,load 24"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                    }
                    else if(tn.equals("705 da-pbt") && (ln.equals(66)) && ld>24){
                        w4 = w3-(ts+tst +485);
                        w5 = w4/60;
                        w6 = w4 %60;
                        lp1 = ld-24;
                        lpr =Math.ceil((4.0/80.0)*lp1*375);
                        dr =Math.ceil( (w4*20.0)/60);
                        sr =Math.ceil( (ts*30.0)/60);
                        tr =Math.ceil(1018+sr + dr+lpr) ;
                        tv1.setText(String.valueOf( "R/T 8:05 ,Ration 1018,load 24"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    }
                   else if(tn.equals("705 da-pbt") && (ln.equals(66)) && ld<24){
                        w4 = w3-(ts+tst +485);
                        w5 = w4/60;
                        w6 = w4 %60;
                        lp1 = 24 -ld;
                        lpr =Math.floor((3.0/80.0)*lp1*375);
                        dr =Math.ceil( (w4*20.0)/60);
                        sr =Math.ceil( (ts*30.0)/60);
                        tr =Math.ceil(1018+sr + dr-lpr) ;
                        tv1.setText(String.valueOf( "R/T 8:05 ,Ration 1018,load 24"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                   }
                 else if(tn.equals("705 da-pbt") && (ln.equals(66)) && ld==24){
                     w4 = w3-(ts+tst +485);
                     w5 = w4/60;
                     w6 = w4 %60;
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(1018+sr + dr) ;
                     tv1.setText(String.valueOf( "R/T 8:05 ,Ration 1018,load 24"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                 }
                 else if(tn.equals("705 pbt-bmsm-pbt") && (ln.equals(66)) && ld>24){
                     w4 = w3-(ts+tst +155);
                     w5 = w4/60;
                     w6 = w4 %60;
                     lp1 = ld-24;
                     lpr =Math.ceil((4.0/80.0)*lp1*132);
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(360+sr + dr+lpr) ;
                     tv1.setText(String.valueOf( "R/T  02:35  ,Ration  360 , load 24"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Plus " + lpr));
                 }
                 else if(tn.equals("705 pbt-bmsm-pbt") && (ln.equals(66)) && ld<24){
                     w4 = w3-(ts+tst +155);
                     w5 = w4/60;
                     w6 = w4 %60;
                     lp1 = 24 -ld;
                     lpr =Math.floor((3.0/80.0)*lp1*132);
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(360+sr + dr-lpr) ;
                     tv1.setText(String.valueOf( "R/T  02:35  ,Ration  360 , load 24"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Minus " + lpr));
                 }
                 else if(tn.equals("705 pbt-bmsm-pbt") && (ln.equals(66)) && ld==24){
                     w4 = w3-(ts+tst +155);
                     w5 = w4/60;
                     w6 = w4 %60;
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(360+sr + dr) ;
                     tv1.setText(String.valueOf( "R/T  02:35  ,Ration  360 , load 24"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                 }
                 else if(tn.equals("705 pbt-bmsm-pbt") && (ln.equals(65)) && ld>24){
                     w4 = w3-(ts+tst +165);
                     w5 = w4/60;
                     w6 = w4 %60;
                     lp1 = ld-24;
                     lpr =Math.ceil((4.0/80.0)*lp1*132);
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(325+sr + dr+lpr) ;
                     tv1.setText(String.valueOf( "R/T  02:45  ,Ration  325 , load 24"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Plus " + lpr));
                 }
                 else if(tn.equals("705 pbt-bmsm-pbt") && (ln.equals(65)) && ld<24){
                     w4 = w3-(ts+tst +165);
                     w5 = w4/60;
                     w6 = w4 %60;
                     lp1 = 24 -ld;
                     lpr =Math.floor((3.0/80.0)*lp1*132);
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(325+sr + dr-lpr) ;
                     tv1.setText(String.valueOf( "R/T  02:45  ,Ration  325 , load 24"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Minus " + lpr));
                 }
                 else if(tn.equals("705 pbt-bmsm-pbt") && (ln.equals(65)) && ld==24){
                     w4 = w3-(ts+tst +165);
                     w5 = w4/60;
                     w6 = w4 %60;
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(325+sr + dr) ;
                     tv1.setText(String.valueOf( "R/T  02:45  ,Ration  325 , load 24"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                 }
                 else if(tn.equals("706 bmsm-pbt") && (ln.equals(66)) && ld>24){
                     w4 = w3-(ts+tst +160);
                     w5 = w4/60;
                     w6 = w4 %60;
                     lp1 = ld-24;
                     lpr =Math.ceil((4.0/80.0)*lp1*132);
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(348+sr + dr+lpr) ;
                     tv1.setText(String.valueOf( "R/T  02:40  ,Ration  348 , load 24"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Plus " + lpr));
                 }
                 else if(tn.equals("706 bmsm-pbt") && (ln.equals(66)) && ld<24){
                     w4 = w3-(ts+tst +160);
                     w5 = w4/60;
                     w6 = w4 %60;
                     lp1 = 24 -ld;
                     lpr =Math.floor((3.0/80.0)*lp1*132);
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(348+sr + dr-lpr) ;
                     tv1.setText(String.valueOf( "R/T  02:40  ,Ration  348 , load 24"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Minus " + lpr));
                 }
                 else if(tn.equals("706 bmsm-pbt") && (ln.equals(66)) && ld==24){
                     w4 = w3-(ts+tst +160);
                     w5 = w4/60;
                     w6 = w4 %60;
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(348+sr + dr) ;
                     tv1.setText(String.valueOf( "R/T  02:40  ,Ration  348 , load 24"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                 }
                 else if(tn.equals("706 bmsm-pbt") && (ln.equals(65)) && ld>24){
                     w4 = w3-(ts+tst +170);
                     w5 = w4/60;
                     w6 = w4 %60;
                     lp1 = ld-24;
                     lpr =Math.ceil((4.0/80.0)*lp1*132);
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(350+sr + dr+lpr) ;
                     tv1.setText(String.valueOf( "R/T  02:50  ,Ration  350 , load 24"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Plus " + lpr));
                 }
                 else if(tn.equals("706 bmsm-pbt") && (ln.equals(65)) && ld<24){
                     w4 = w3-(ts+tst +170);
                     w5 = w4/60;
                     w6 = w4 %60;
                     lp1 = 24 -ld;
                     lpr =Math.floor((3.0/80.0)*lp1*132);
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(350+sr + dr-lpr) ;
                     tv1.setText(String.valueOf( "R/T  02:50  ,Ration  350 , load 24"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Minus " + lpr));
                 }
                 else if(tn.equals("706 bmsm-pbt") && (ln.equals(65)) && ld==24){
                     w4 = w3-(ts+tst +170);
                     w5 = w4/60;
                     w6 = w4 %60;
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(350+sr + dr) ;
                     tv1.setText(String.valueOf( "R/T  02:50  ,Ration  350 , load 24"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                 }
                 else if(tn.equals("706 pbt-da") && (ln.equals(66)) && ld>24){
                     w4 = w3-(ts+tst +480);
                     w5 = w4/60;
                     w6 = w4 %60;
                     lp1 = ld-24;
                     lpr =Math.ceil((4.0/80.0)*lp1*375);
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(1015+sr + dr+lpr) ;
                     tv1.setText(String.valueOf( "R/T  08:00  ,Ration  1015 , load 24"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Plus " + lpr));
                 }
                 else if(tn.equals("706 pbt-da") && (ln.equals(66)) && ld<24){
                     w4 = w3-(ts+tst +480);
                     w5 = w4/60;
                     w6 = w4 %60;
                     lp1 = 24 -ld;
                     lpr =Math.floor((3.0/80.0)*lp1*375);
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(1015+sr + dr-lpr) ;
                     tv1.setText(String.valueOf( "R/T  08:00  ,Ration  1015 , load 24"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Minus " + lpr));
                 }
                 else if(tn.equals("706 pbt-da") && (ln.equals(66)) && ld==24){
                     w4 = w3-(ts+tst +480);
                     w5 = w4/60;
                     w6 = w4 %60;
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(1015+sr + dr) ;
                     tv1.setText(String.valueOf( "R/T  08:00  ,Ration  1015 , load 24"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                 }
                 else if(tn.equals("731 rjhi-pbt") && (ln.equals(66)) && ld>20){
                     w4 = w3-(ts+tst +265);
                     w5 = w4/60;
                     w6 = w4 %60;
                     lp1 = ld-20;
                     lpr =Math.ceil((8.0/80.0)*lp1*200);
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(470+sr + dr+lpr) ;
                     tv1.setText(String.valueOf( "R/T  04:25  ,Ration  470 , load 20"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Plus " + lpr));
                 }
                 else if(tn.equals("731 rjhi-pbt") && (ln.equals(66)) && ld<20){
                     w4 = w3-(ts+tst +265);
                     w5 = w4/60;
                     w6 = w4 %60;
                     lp1 = 20 -ld;
                     lpr =Math.floor((6.0/80.0)*lp1*200);
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(470+sr + dr-lpr) ;
                     tv1.setText(String.valueOf( "R/T  04:25  ,Ration  470 , load 20"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Minus " + lpr));
                 }
                 else if(tn.equals("731 rjhi-pbt") && (ln.equals(66)) && ld==20){
                     w4 = w3-(ts+tst +265);
                     w5 = w4/60;
                     w6 = w4 %60;
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(470+sr + dr) ;
                     tv1.setText(String.valueOf( "R/T  04:25  ,Ration  470 , load 20"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                 }
                 else if(tn.equals("731 rjhi-pbt") && (ln.equals(65)) && ld>20){
                     w4 = w3-(ts+tst +265);
                     w5 = w4/60;
                     w6 = w4 %60;
                     lp1 = ld-20;
                     lpr =Math.ceil((4.0/80.0)*lp1*200);
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(430+sr + dr+lpr) ;
                     tv1.setText(String.valueOf( "R/T  04:25  ,Ration  430 , load 20"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Plus " + lpr));
                 }
                 else if(tn.equals("731 rjhi-pbt") && (ln.equals(65)) && ld<20){
                     w4 = w3-(ts+tst +265);
                     w5 = w4/60;
                     w6 = w4 %60;
                     lp1 = 20 -ld;
                     lpr =Math.floor((3.0/80.0)*lp1*200);
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(430+sr + dr-lpr) ;
                     tv1.setText(String.valueOf( "R/T  04:25  ,Ration  430 , load 20"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Minus " + lpr));
                 }
                 else if(tn.equals("731 rjhi-pbt") && (ln.equals(65)) && ld==20){
                     w4 = w3-(ts+tst +265);
                     w5 = w4/60;
                     w6 = w4 %60;
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(430+sr + dr) ;
                     tv1.setText(String.valueOf( "R/T  04:25  ,Ration  430 , load 20"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                 }
                 else if(tn.equals("731/732 pbt-clh-pbt") && (ln.equals(66)) && ld>20){
                     w4 = w3-(ts+tst +210);
                     w5 = w4/60;
                     w6 = w4 %60;
                     lp1 = ld-20;
                     lpr =Math.ceil((8.0/80.0)*lp1*135);
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(345+sr + dr+lpr) ;
                     tv1.setText(String.valueOf( "R/T  03:30  ,Ration  345 , load 20"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Plus " + lpr));
                 }
                 else if(tn.equals("731/732 pbt-clh-pbt") && (ln.equals(66)) && ld<20){
                     w4 = w3-(ts+tst +210);
                     w5 = w4/60;
                     w6 = w4 %60;
                     lp1 = 20 -ld;
                     lpr =Math.floor((6.0/80.0)*lp1*135);
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(345+sr + dr-lpr) ;
                     tv1.setText(String.valueOf( "R/T  03:30  ,Ration  345 , load 20"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Minus " + lpr));
                 }
                 else if(tn.equals("731/732 pbt-clh-pbt") && (ln.equals(66)) && ld==20){
                     w4 = w3-(ts+tst +210);
                     w5 = w4/60;
                     w6 = w4 %60;
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(345+sr + dr) ;
                     tv1.setText(String.valueOf( "R/T  03:30  ,Ration  345 , load 20"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                 }
                 else if(tn.equals("731/732 pbt-clh-pbt") && (ln.equals(65)) && ld>20){
                     w4 = w3-(ts+tst +220);
                     w5 = w4/60;
                     w6 = w4 %60;
                     lp1 = ld-20;
                     lpr =Math.ceil((4.0/80.0)*lp1*135);
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(270+sr + dr+lpr) ;
                     tv1.setText(String.valueOf( "R/T  03:40  ,Ration  270 , load 20"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Plus " + lpr));
                 }
                 else if(tn.equals("731/732 pbt-clh-pbt") && (ln.equals(65)) && ld<20){
                     w4 = w3-(ts+tst +220);
                     w5 = w4/60;
                     w6 = w4 %60;
                     lp1 = 20 -ld;
                     lpr =Math.floor((3.0/80.0)*lp1*135);
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(270+sr + dr-lpr) ;
                     tv1.setText(String.valueOf( "R/T  03:40  ,Ration  270 , load 20"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Minus " + lpr));
                 }
                 else if(tn.equals("731/732 pbt-clh-pbt") && (ln.equals(65)) && ld==20){
                     w4 = w3-(ts+tst +220);
                     w5 = w4/60;
                     w6 = w4 %60;
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(270+sr + dr) ;
                     tv1.setText(String.valueOf( "R/T  03:40  ,Ration  270 , load 20"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                 }
                 else if(tn.equals("732 pbt-rjhi") && (ln.equals(66)) && ld>20){
                     w4 = w3-(ts+tst +255);
                     w5 = w4/60;
                     w6 = w4 %60;
                     lp1 = ld-20;
                     lpr =Math.ceil((8.0/80.0)*lp1*200);
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(465+sr + dr+lpr) ;
                     tv1.setText(String.valueOf( "R/T  04:15  ,Ration  465 , load 20"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Plus " + lpr));
                 }
                 else if(tn.equals("732 pbt-rjhi") && (ln.equals(66)) && ld<20){
                     w4 = w3-(ts+tst +255);
                     w5 = w4/60;
                     w6 = w4 %60;
                     lp1 = 20 -ld;
                     lpr =Math.floor((6.0/80.0)*lp1*200);
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(465+sr + dr-lpr) ;
                     tv1.setText(String.valueOf( "R/T  04:15  ,Ration  465 , load 20"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Minus " + lpr));
                 }
                 else if(tn.equals("732 pbt-rjhi") && (ln.equals(66)) && ld==20){
                     w4 = w3-(ts+tst +255);
                     w5 = w4/60;
                     w6 = w4 %60;
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(465+sr + dr) ;
                     tv1.setText(String.valueOf( "R/T  04:15  ,Ration  465 , load 20"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                 }
                 else if(tn.equals("732 pbt-rjhi") && (ln.equals(65)) && ld>20){
                     w4 = w3-(ts+tst +260);
                     w5 = w4/60;
                     w6 = w4 %60;
                     lp1 = ld-20;
                     lpr =Math.ceil((4.0/80.0)*lp1*200);
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(430+sr + dr+lpr) ;
                     tv1.setText(String.valueOf( "R/T  04:20  ,Ration  430 , load 20"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Plus " + lpr));
                 }
                 else if(tn.equals("732 pbt-rjhi") && (ln.equals(65)) && ld<20){
                     w4 = w3-(ts+tst +260);
                     w5 = w4/60;
                     w6 = w4 %60;
                     lp1 = 20 -ld;
                     lpr =Math.floor((3.0/80.0)*lp1*200);
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(430+sr + dr-lpr) ;
                     tv1.setText(String.valueOf( "R/T  04:20  ,Ration  430 , load 20"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Minus " + lpr));
                 }
                 else if(tn.equals("732 pbt-rjhi") && (ln.equals(65)) && ld==20){
                     w4 = w3-(ts+tst +260);
                     w5 = w4/60;
                     w6 = w4 %60;
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(430+sr + dr) ;
                     tv1.setText(String.valueOf( "R/T  04:20  ,Ration  430 , load 20"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                 }
                 else if(tn.equals("733 rjhi-pbt") && (ln.equals(65)) && ld>24){
                     w4 = w3-(ts+tst +290);
                     w5 = w4/60;
                     w6 = w4 %60;
                     lp1 = ld-24;
                     lpr =Math.ceil((4.0/80.0)*lp1*200);
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(485+sr + dr+lpr) ;
                     tv1.setText(String.valueOf( "R/T  04:50 ,Ration  485 , load 24"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Plus " + lpr));
                 }
                 else if(tn.equals("733 rjhi-pbt") && (ln.equals(65)) && ld<24){
                     w4 = w3-(ts+tst +290);
                     w5 = w4/60;
                     w6 = w4 %60;
                     lp1 = 24 -ld;
                     lpr =Math.floor((3.0/80.0)*lp1*200);
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(485+sr + dr-lpr) ;
                     tv1.setText(String.valueOf( "R/T  04:50  ,Ration  485 , load 24"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Minus " + lpr));
                 }
                 else if(tn.equals("733 rjhi-pbt") && (ln.equals(65)) && ld==24){
                     w4 = w3-(ts+tst +290);
                     w5 = w4/60;
                     w6 = w4 %60;
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(485+sr + dr) ;
                     tv1.setText(String.valueOf( "R/T  04:50  ,Ration  485 , load 24"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                 }
                 else if(tn.equals("734 pbt-rjhi") && (ln.equals(65)) && ld>24){
                     w4 = w3-(ts+tst +310);
                     w5 = w4/60;
                     w6 = w4 %60;
                     lp1 = ld-24;
                     lpr =Math.ceil((4.0/80.0)*lp1*200);
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(490+sr + dr+lpr) ;
                     tv1.setText(String.valueOf( "R/T  05:10  ,Ration  490 , load 24"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Plus " + lpr));
                 }
                 else if(tn.equals("734 pbt-rjhi") && (ln.equals(65)) && ld<24){
                     w4 = w3-(ts+tst +310);
                     w5 = w4/60;
                     w6 = w4 %60;
                     lp1 = 24 -ld;
                     lpr =Math.floor((3.0/80.0)*lp1*200);
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(490+sr + dr-lpr) ;
                     tv1.setText(String.valueOf( "R/T  05:10  ,Ration  490 , load 24"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Minus " + lpr));
                 }
                 else if(tn.equals("734 pbt-rjhi") && (ln.equals(65)) && ld==24){
                     w4 = w3-(ts+tst +310);
                     w5 = w4/60;
                     w6 = w4 %60;
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(490+sr + dr) ;
                     tv1.setText(String.valueOf( "R/T  05:10  ,Ration  490 , load 24"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                 }
                 else if(tn.equals("757 da-pbt") && (ln.equals(66)) && ld>24){
                     w4 = w3-(ts+tst +435);
                     w5 = w4/60;
                     w6 = w4 %60;
                     lp1 = ld-24;
                     lpr =Math.ceil((4.0/80.0)*lp1*375);
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(995+sr + dr+lpr) ;
                     tv1.setText(String.valueOf( "R/T  07:15  ,Ration  995 , load 24"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Plus " + lpr));
                 }
                 else if(tn.equals("757 da-pbt") && (ln.equals(66)) && ld<24){
                     w4 = w3-(ts+tst +435);
                     w5 = w4/60;
                     w6 = w4 %60;
                     lp1 = 24 -ld;
                     lpr =Math.floor((3.0/80.0)*lp1*375);
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(995+sr + dr-lpr) ;
                     tv1.setText(String.valueOf( "R/T  07:15  ,Ration  995 , load 24"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Minus " + lpr));
                 }
                 else if(tn.equals("757 da-pbt") && (ln.equals(66)) && ld==24){
                     w4 = w3-(ts+tst +435);
                     w5 = w4/60;
                     w6 = w4 %60;
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(995+sr + dr) ;
                     tv1.setText(String.valueOf( "R/T  07:15  ,Ration  995 , load 24"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                 }
                 else if(tn.equals("757 pbt-bmsm") && (ln.equals(66)) && ld>24){
                     w4 = w3-(ts+tst +165);
                     w5 = w4/60;
                     w6 = w4 %60;
                     lp1 = ld-24;
                     lpr =Math.ceil((4.0/80.0)*lp1*132);
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(360+sr + dr+lpr) ;
                     tv1.setText(String.valueOf( "R/T  02:45  ,Ration  360 , load 24"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Plus " + lpr));
                 }
                 else if(tn.equals("757 pbt-bmsm") && (ln.equals(66)) && ld<24){
                     w4 = w3-(ts+tst +165);
                     w5 = w4/60;
                     w6 = w4 %60;
                     lp1 = 24 -ld;
                     lpr =Math.floor((3.0/80.0)*lp1*132);
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(360+sr + dr-lpr) ;
                     tv1.setText(String.valueOf( "R/T  02:45  ,Ration  360 , load 24"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Minus " + lpr));
                 }
                 else if(tn.equals("757 pbt-bmsm") && (ln.equals(66)) && ld==24){
                     w4 = w3-(ts+tst +165);
                     w5 = w4/60;
                     w6 = w4 %60;
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(360+sr + dr) ;
                     tv1.setText(String.valueOf( "R/T  02:45  ,Ration  360 , load 24"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                 }
                 else if(tn.equals("757 pbt-bmsm") && (ln.equals(65)) && ld>24){
                     w4 = w3-(ts+tst +175);
                     w5 = w4/60;
                     w6 = w4 %60;
                     lp1 = ld-24;
                     lpr =Math.ceil((4.0/80.0)*lp1*132);
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(355+sr + dr+lpr) ;
                     tv1.setText(String.valueOf( "R/T  02:55  ,Ration  355 , load 24"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Plus " + lpr));
                 }
                 else if(tn.equals("757 pbt-bmsm") && (ln.equals(65)) && ld<24){
                     w4 = w3-(ts+tst +175);
                     w5 = w4/60;
                     w6 = w4 %60;
                     lp1 = 24 -ld;
                     lpr =Math.floor((3.0/80.0)*lp1*132);
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(355+sr + dr-lpr) ;
                     tv1.setText(String.valueOf( "R/T  02:55  ,Ration  355 , load 24"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Minus " + lpr));
                 }
                 else if(tn.equals("757 pbt-bmsm") && (ln.equals(65)) && ld==24){
                     w4 = w3-(ts+tst +175);
                     w5 = w4/60;
                     w6 = w4 %60;
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(355+sr + dr) ;
                     tv1.setText(String.valueOf( "R/T  02:55  ,Ration  355 , load 24"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                 }
                 else if(tn.equals("758 bmsm-pbt") && (ln.equals(66)) && ld>24){
                     w4 = w3-(ts+tst +170);
                     w5 = w4/60;
                     w6 = w4 %60;
                     lp1 = ld-24;
                     lpr =Math.ceil((4.0/80.0)*lp1*132);
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(350+sr + dr+lpr) ;
                     tv1.setText(String.valueOf( "R/T  02:50  ,Ration  350 , load 24"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Plus " + lpr));
                 }
                 else if(tn.equals("758 bmsm-pbt") && (ln.equals(66)) && ld<24){
                     w4 = w3-(ts+tst +170);
                     w5 = w4/60;
                     w6 = w4 %60;
                     lp1 = 24 -ld;
                     lpr =Math.floor((3.0/80.0)*lp1*132);
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(350+sr + dr-lpr) ;
                     tv1.setText(String.valueOf( "R/T  02:50  ,Ration  350 , load 24"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Minus " + lpr));
                 }
                 else if(tn.equals("758 bmsm-pbt") && (ln.equals(66)) && ld==24){
                     w4 = w3-(ts+tst +170);
                     w5 = w4/60;
                     w6 = w4 %60;
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(350+sr + dr) ;
                     tv1.setText(String.valueOf( "R/T  02:50  ,Ration  350 , load 24"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                 }
                 else if(tn.equals("758 bmsm-pbt") && (ln.equals(65)) && ld>24){
                     w4 = w3-(ts+tst +180);
                     w5 = w4/60;
                     w6 = w4 %60;
                     lp1 = ld-24;
                     lpr =Math.ceil((4.0/80.0)*lp1*132);
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(360+sr + dr+lpr) ;
                     tv1.setText(String.valueOf( "R/T  03:00  ,Ration  360 , load 24"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Plus " + lpr));
                 }
                 else if(tn.equals("758 bmsm-pbt") && (ln.equals(65)) && ld<24){
                     w4 = w3-(ts+tst +180);
                     w5 = w4/60;
                     w6 = w4 %60;
                     lp1 = 24 -ld;
                     lpr =Math.floor((3.0/80.0)*lp1*132);
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(360+sr + dr-lpr) ;
                     tv1.setText(String.valueOf( "R/T  03:00  ,Ration  360 , load 24"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Minus " + lpr));
                 }
                 else if(tn.equals("758 bmsm-pbt") && (ln.equals(65)) && ld==24){
                     w4 = w3-(ts+tst +180);
                     w5 = w4/60;
                     w6 = w4 %60;
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(360+sr + dr) ;
                     tv1.setText(String.valueOf( "R/T  03:00  ,Ration  360 , load 24"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                 }
                 else if(tn.equals("758 pbt-da") && (ln.equals(66)) && ld>24){
                     w4 = w3-(ts+tst +455);
                     w5 = w4/60;
                     w6 = w4 %60;
                     lp1 = ld-24;
                     lpr =Math.ceil((4.0/80.0)*lp1*375);
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(1005+sr + dr+lpr) ;
                     tv1.setText(String.valueOf( "R/T  07:35  ,Ration  1005 , load 24"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Plus " + lpr));
                 }
                 else if(tn.equals("758 pbt-da") && (ln.equals(66)) && ld<24){
                     w4 = w3-(ts+tst +455);
                     w5 = w4/60;
                     w6 = w4 %60;
                     lp1 = 24 -ld;
                     lpr =Math.floor((3.0/80.0)*lp1*375);
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(1005+sr + dr-lpr) ;
                     tv1.setText(String.valueOf( "R/T  07:35  ,Ration  1005 , load 24"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Minus " + lpr));
                 }
                 else if(tn.equals("758 pbt-da") && (ln.equals(66)) && ld==24){
                     w4 = w3-(ts+tst +455);
                     w5 = w4/60;
                     w6 = w4 %60;
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(1005+sr + dr) ;
                     tv1.setText(String.valueOf( "R/T  07:35  ,Ration  1005 , load 24"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                 }
                 else if(tn.equals("765 da-pbt") && (ln.equals(66)) && ld>22){
                     w4 = w3-(ts+tst +455);
                     w5 = w4/60;
                     w6 = w4 %60;
                     lp1 = ld-22;
                     lpr =Math.ceil((4.0/80.0)*lp1*375);
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(950+sr + dr+lpr) ;
                     tv1.setText(String.valueOf( "R/T  07:35  ,Ration  950 , load 22"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Plus " + lpr));
                 }
                 else if(tn.equals("765 da-pbt") && (ln.equals(66)) && ld<22){
                     w4 = w3-(ts+tst +455);
                     w5 = w4/60;
                     w6 = w4 %60;
                     lp1 = 22 -ld;
                     lpr =Math.floor((3.0/80.0)*lp1*375);
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(950+sr + dr-lpr) ;
                     tv1.setText(String.valueOf( "R/T  07:35  ,Ration  950 , load 22"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Minus " + lpr));
                 }
                 else if(tn.equals("765 da-pbt") && (ln.equals(66)) && ld==22){
                     w4 = w3-(ts+tst +455);
                     w5 = w4/60;
                     w6 = w4 %60;
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(950+sr + dr) ;
                     tv1.setText(String.valueOf( "R/T  07:35  ,Ration  950 , load 22"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                 }
                 else if(tn.equals("765/766 pbt-clh-pbt") && (ln.equals(66)) && ld>22){
                     w4 = w3-(ts+tst +195);
                     w5 = w4/60;
                     w6 = w4 %60;
                     lp1 = ld-22;
                     lpr =Math.ceil((4.0/80.0)*lp1*135);
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(325+sr + dr+lpr) ;
                     tv1.setText(String.valueOf( "R/T  03:15  ,Ration  325 , load 22"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Plus " + lpr));
                 }
                 else if(tn.equals("765/766 pbt-clh-pbt") && (ln.equals(66)) && ld<22){
                     w4 = w3-(ts+tst +195);
                     w5 = w4/60;
                     w6 = w4 %60;
                     lp1 = 22 -ld;
                     lpr =Math.floor((3.0/80.0)*lp1*135);
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(325+sr + dr-lpr) ;
                     tv1.setText(String.valueOf( "R/T  03:15  ,Ration  325 , load 22"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Minus " + lpr));
                 }
                 else if(tn.equals("765/766 pbt-clh-pbt") && (ln.equals(66)) && ld==22){
                     w4 = w3-(ts+tst +195);
                     w5 = w4/60;
                     w6 = w4 %60;
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(325+sr + dr) ;
                     tv1.setText(String.valueOf( "R/T  03:15  ,Ration  325 , load 24"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                 }
                 else if(tn.equals("765/766 pbt-clh-pbt") && (ln.equals(65)) && ld>24){
                     w4 = w3-(ts+tst +185);
                     w5 = w4/60;
                     w6 = w4 %60;
                     lp1 = ld-24;
                     lpr =Math.ceil((4.0/80.0)*lp1*135);
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(320+sr + dr+lpr) ;
                     tv1.setText(String.valueOf( "R/T  03:05  ,Ration  320 , load 24"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Plus " + lpr));
                 }
                 else if(tn.equals("765/766 pbt-clh-pbt") && (ln.equals(65)) && ld<24){
                     w4 = w3-(ts+tst +185);
                     w5 = w4/60;
                     w6 = w4 %60;
                     lp1 = 24 -ld;
                     lpr =Math.floor((3.0/80.0)*lp1*135);
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(320+sr + dr-lpr) ;
                     tv1.setText(String.valueOf( "R/T  03:05  ,Ration  320 , load 24"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Minus " + lpr));
                 }
                 else if(tn.equals("765/766 pbt-clh-pbt") && (ln.equals(65)) && ld==24){
                     w4 = w3-(ts+tst +185);
                     w5 = w4/60;
                     w6 = w4 %60;
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(320+sr + dr) ;
                     tv1.setText(String.valueOf( "R/T  03:05  ,Ration  320 , load 24"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                 }
                 else if(tn.equals("766 pbt-da") && (ln.equals(66)) && ld>22){
                     w4 = w3-(ts+tst +470);
                     w5 = w4/60;
                     w6 = w4 %60;
                     lp1 = ld-22;
                     lpr =Math.ceil((4.0/80.0)*lp1*375);
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(965+sr + dr+lpr) ;
                     tv1.setText(String.valueOf( "R/T  07:50  ,Ration  965 , load 22"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Plus " + lpr));
                 }
                 else if(tn.equals("766 pbt-da") && (ln.equals(66)) && ld<22){
                     w4 = w3-(ts+tst +470);
                     w5 = w4/60;
                     w6 = w4 %60;
                     lp1 = 22 -ld;
                     lpr =Math.floor((3.0/80.0)*lp1*375);
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(965+sr + dr-lpr) ;
                     tv1.setText(String.valueOf( "R/T  07:50 ,Ration  965 , load 22"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Minus " + lpr));
                 }
                 else if(tn.equals("766 pbt-da") && (ln.equals(66)) && ld==22){
                     w4 = w3-(ts+tst +470);
                     w5 = w4/60;
                     w6 = w4 %60;
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(965+sr + dr) ;
                     tv1.setText(String.valueOf( "R/T  07:50  ,Ration  965 , load 22"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                 }
                 else if(tn.equals("793 da-pbt") && (ln.equals(66)) && ld>24){
                     w4 = w3-(ts+tst +425);
                     w5 = w4/60;
                     w6 = w4 %60;
                     lp1 = ld-24;
                     lpr =Math.ceil((4.0/80.0)*lp1*375);
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(980+sr + dr+lpr) ;
                     tv1.setText(String.valueOf( "R/T  07:05  ,Ration  980 , load 24"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Plus " + lpr));
                 }
                 else if(tn.equals("793 da-pbt") && (ln.equals(66)) && ld<24){
                     w4 = w3-(ts+tst +425);
                     w5 = w4/60;
                     w6 = w4 %60;
                     lp1 = 24 -ld;
                     lpr =Math.floor((3.0/80.0)*lp1*375);
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(980+sr + dr-lpr) ;
                     tv1.setText(String.valueOf( "R/T  07:05 ,Ration  980 , load 24"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Minus " + lpr));
                 }
                 else if(tn.equals("793 da-pbt") && (ln.equals(66)) && ld==24){
                     w4 = w3-(ts+tst +425);
                     w5 = w4/60;
                     w6 = w4 %60;
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(980+sr + dr) ;
                     tv1.setText(String.valueOf( "R/T  07:05  ,Ration  980 , load 24"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                 }
                 else if(tn.equals("793 pbt-bmsm") && (ln.equals(66)) && ld>24){
                     w4 = w3-(ts+tst +170);
                     w5 = w4/60;
                     w6 = w4 %60;
                     lp1 = ld-24;
                     lpr =Math.ceil((4.0/80.0)*lp1*132);
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(345+sr + dr+lpr) ;
                     tv1.setText(String.valueOf( "R/T  02:50  ,Ration  345 , load 24"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Plus " + lpr));
                 }
                 else if(tn.equals("793 pbt-bmsm") && (ln.equals(66)) && ld<24){
                     w4 = w3-(ts+tst +170);
                     w5 = w4/60;
                     w6 = w4 %60;
                     lp1 = 24 -ld;
                     lpr =Math.floor((3.0/80.0)*lp1*132);
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(345+sr + dr-lpr) ;
                     tv1.setText(String.valueOf( "R/T  02:50 ,Ration 345 , load 24"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Minus " + lpr));
                 }
                 else if(tn.equals("793 pbt-bmsm") && (ln.equals(66)) && ld==24){
                     w4 = w3-(ts+tst +170);
                     w5 = w4/60;
                     w6 = w4 %60;
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(345+sr + dr) ;
                     tv1.setText(String.valueOf( "R/T  02:50  ,Ration  345 , load 24"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                 }
                 else if(tn.equals("793 pbt-bmsm") && (ln.equals(65)) && ld>24){
                     w4 = w3-(ts+tst +170);
                     w5 = w4/60;
                     w6 = w4 %60;
                     lp1 = ld-24;
                     lpr =Math.ceil((4.0/80.0)*lp1*132);
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(325+sr + dr+lpr) ;
                     tv1.setText(String.valueOf( "R/T  02:50  ,Ration  325 , load 24"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Plus " + lpr));
                 }
                 else if(tn.equals("793 pbt-bmsm") && (ln.equals(65)) && ld<24){
                     w4 = w3-(ts+tst +170);
                     w5 = w4/60;
                     w6 = w4 %60;
                     lp1 = 24 -ld;
                     lpr =Math.floor((3.0/80.0)*lp1*132);
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(325+sr + dr-lpr) ;
                     tv1.setText(String.valueOf( "R/T  02:50 ,Ration 325 , load 24"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Minus " + lpr));
                 }
                 else if(tn.equals("793 pbt-bmsm") && (ln.equals(65)) && ld==24){
                     w4 = w3-(ts+tst +170);
                     w5 = w4/60;
                     w6 = w4 %60;
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(325+sr + dr) ;
                     tv1.setText(String.valueOf( "R/T  02:50  ,Ration  325 , load 24"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                 }
                 else if(tn.equals("794 pbt-da") && (ln.equals(66)) && ld>24){
                     w4 = w3-(ts+tst +380);
                     w5 = w4/60;
                     w6 = w4 %60;
                     lp1 = ld-24;
                     lpr =Math.ceil((4.0/80.0)*lp1*375);
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(970+sr + dr+lpr) ;
                     tv1.setText(String.valueOf( "R/T  06:20  ,Ration  970 , load 24"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Plus " + lpr));
                 }
                 else if(tn.equals("794 pbt-da") && (ln.equals(66)) && ld<24){
                     w4 = w3-(ts+tst +380);
                     w5 = w4/60;
                     w6 = w4 %60;
                     lp1 = 24 -ld;
                     lpr =Math.floor((3.0/80.0)*lp1*375);
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(970+sr + dr-lpr) ;
                     tv1.setText(String.valueOf( "R/T  06:20 ,Ration 970 , load 24"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Minus " + lpr));
                 }
                 else if(tn.equals("794 pbt-da") && (ln.equals(66)) && ld==24){
                     w4 = w3-(ts+tst +380);
                     w5 = w4/60;
                     w6 = w4 %60;
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(970+sr + dr) ;
                     tv1.setText(String.valueOf( "R/T  06:20  ,Ration  970 , load 24"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                 }
                 else if(tn.equals("794 bmsm-pbt") && (ln.equals(66)) && ld>24){
                     w4 = w3-(ts+tst +165);
                     w5 = w4/60;
                     w6 = w4 %60;
                     lp1 = ld-24;
                     lpr =Math.ceil((4.0/80.0)*lp1*132);
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(335+sr + dr+lpr) ;
                     tv1.setText(String.valueOf( "R/T  02:45  ,Ration  335 , load 24"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Plus " + lpr));
                 }
                 else if(tn.equals("794 bmsm-pbt") && (ln.equals(66)) && ld<24){
                     w4 = w3-(ts+tst +165);
                     w5 = w4/60;
                     w6 = w4 %60;
                     lp1 = 24 -ld;
                     lpr =Math.floor((3.0/80.0)*lp1*132);
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(335+sr + dr-lpr) ;
                     tv1.setText(String.valueOf( "R/T  02:45 ,Ration 335 , load 24"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Minus " + lpr));
                 }
                 else if(tn.equals("794 bmsm-pbt") && (ln.equals(66)) && ld==24){
                     w4 = w3-(ts+tst +165);
                     w5 = w4/60;
                     w6 = w4 %60;
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(335+sr + dr) ;
                     tv1.setText(String.valueOf( "R/T  02:45  ,Ration  335 , load 24"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                 }
                 else if(tn.equals("794 bmsm-pbt") && (ln.equals(65)) && ld>24){
                     w4 = w3-(ts+tst +165);
                     w5 = w4/60;
                     w6 = w4 %60;
                     lp1 = ld-24;
                     lpr =Math.ceil((4.0/80.0)*lp1*132);
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(324+sr + dr+lpr) ;
                     tv1.setText(String.valueOf( "R/T  02:45  ,Ration  324 , load 24"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Plus " + lpr));
                 }
                 else if(tn.equals("794 bmsm-pbt") && (ln.equals(65)) && ld<24){
                     w4 = w3-(ts+tst +165);
                     w5 = w4/60;
                     w6 = w4 %60;
                     lp1 = 24 -ld;
                     lpr =Math.floor((3.0/80.0)*lp1*132);
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(324+sr + dr-lpr) ;
                     tv1.setText(String.valueOf( "R/T  02:45 ,Ration 324 , load 24"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Minus " + lpr));
                 }
                 else if(tn.equals("794 bmsm-pbt") && (ln.equals(65)) && ld==24){
                     w4 = w3-(ts+tst +165);
                     w5 = w4/60;
                     w6 = w4 %60;
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(324+sr + dr) ;
                     tv1.setText(String.valueOf( "R/T  02:45  ,Ration  324 , load 24"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                 }

                 else if(tn.equals("803 pbt-bmsm") && (ln.equals(66)) && ld>20){
                     w4 = w3-(ts+tst +160);
                     w5 = w4/60;
                     w6 = w4 %60;
                     lp1 = ld-20;
                     lpr =Math.ceil((4.0/80.0)*lp1*132);
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(295+sr + dr+lpr) ;
                     tv1.setText(String.valueOf( "R/T  02:40  ,Ration  295 , load 20"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Plus " + lpr));
                 }
                 else if(tn.equals("803 pbt-bmsm") && (ln.equals(66)) && ld<20){
                     w4 = w3-(ts+tst +160);
                     w5 = w4/60;
                     w6 = w4 %60;
                     lp1 = 20 -ld;
                     lpr =Math.floor((3.0/80.0)*lp1*132);
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(295+sr + dr-lpr) ;
                     tv1.setText(String.valueOf( "R/T  02:40 ,Ration 295 , load 20"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Minus " + lpr));
                 }
                 else if(tn.equals("803 pbt-bmsm") && (ln.equals(66)) && ld==20){
                     w4 = w3-(ts+tst +160);
                     w5 = w4/60;
                     w6 = w4 %60;
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(295+sr + dr) ;
                     tv1.setText(String.valueOf( "R/T  02:40  ,Ration  295 , load 20"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                 }
                 else if(tn.equals("803 pbt-bmsm") && (ln.equals(65)) && ld>18){
                     w4 = w3-(ts+tst +160);
                     w5 = w4/60;
                     w6 = w4 %60;
                     lp1 = ld-18;
                     lpr =Math.ceil((4.0/80.0)*lp1*132);
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(282+sr + dr+lpr) ;
                     tv1.setText(String.valueOf( "R/T  02:40  ,Ration  282 , load 18"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Plus " + lpr));
                 }
                 else if(tn.equals("803 pbt-bmsm") && (ln.equals(65)) && ld<18){
                     w4 = w3-(ts+tst +160);
                     w5 = w4/60;
                     w6 = w4 %60;
                     lp1 = 18 -ld;
                     lpr =Math.floor((3.0/80.0)*lp1*132);
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(282+sr + dr-lpr) ;
                     tv1.setText(String.valueOf( "R/T  02:40 ,Ration 282 , load 18"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Minus " + lpr));
                 }
                 else if(tn.equals("803 pbt-bmsm") && (ln.equals(65)) && ld==18){
                     w4 = w3-(ts+tst +160);
                     w5 = w4/60;
                     w6 = w4 %60;
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(282+sr + dr) ;
                     tv1.setText(String.valueOf( "R/T  02:40  ,Ration  282 , load 18"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                 }
                 else if(tn.equals("804 bmsm-pbt") && (ln.equals(66)) && ld>20){
                     w4 = w3-(ts+tst +180);
                     w5 = w4/60;
                     w6 = w4 %60;
                     lp1 = ld-20;
                     lpr =Math.ceil((4.0/80.0)*lp1*132);
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(305+sr + dr+lpr) ;
                     tv1.setText(String.valueOf( "R/T  03:00  ,Ration  305 , load 20"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Plus " + lpr));
                 }
                 else if(tn.equals("804 bmsm-pbt") && (ln.equals(66)) && ld<20){
                     w4 = w3-(ts+tst +180);
                     w5 = w4/60;
                     w6 = w4 %60;
                     lp1 = 20 -ld;
                     lpr =Math.floor((3.0/80.0)*lp1*132);
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(305+sr + dr-lpr) ;
                     tv1.setText(String.valueOf( "R/T  03:00 ,Ration 305 , load 20"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Minus " + lpr));
                 }
                 else if(tn.equals("804 bmsm-pbt") && (ln.equals(66)) && ld==20){
                     w4 = w3-(ts+tst +180);
                     w5 = w4/60;
                     w6 = w4 %60;
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(305+sr + dr) ;
                     tv1.setText(String.valueOf( "R/T  03:00  ,Ration  305 , load 20"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                 }
                 else if(tn.equals("804 bmsm-pbt") && (ln.equals(65)) && ld>18){
                     w4 = w3-(ts+tst +180);
                     w5 = w4/60;
                     w6 = w4 %60;
                     lp1 = ld-18;
                     lpr =Math.ceil((4.0/80.0)*lp1*132);
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(288+sr + dr+lpr) ;
                     tv1.setText(String.valueOf( "R/T  03:00  ,Ration  288 , load 18"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Plus " + lpr));
                 }
                 else if(tn.equals("804 bmsm-pbt") && (ln.equals(65)) && ld<18){
                     w4 = w3-(ts+tst +180);
                     w5 = w4/60;
                     w6 = w4 %60;
                     lp1 = 18 -ld;
                     lpr =Math.floor((3.0/80.0)*lp1*132);
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(288+sr + dr-lpr) ;
                     tv1.setText(String.valueOf( "R/T  03:00 ,Ration 288 , load 18"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Minus " + lpr));
                 }
                 else if(tn.equals("804 bmsm-pbt") && (ln.equals(65)) && ld==18){
                     w4 = w3-(ts+tst +180);
                     w5 = w4/60;
                     w6 = w4 %60;
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(288+sr + dr) ;
                     tv1.setText(String.valueOf( "R/T  03:00  ,Ration  288 , load 18"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                 }
                 else if(tn.equals("805 da-pbt") && (ln.equals(66)) && ld>22){
                     w4 = w3-(ts+tst +485);
                     w5 = w4/60;
                     w6 = w4 %60;
                     lp1 = ld-22;
                     lpr =Math.ceil((4.0/80.0)*lp1*375);
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(970+sr + dr+lpr) ;
                     tv1.setText(String.valueOf( "R/T  08:05  ,Ration  970 , load 22"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Plus " + lpr));
                 }
                 else if(tn.equals("805 da-pbt") && (ln.equals(66)) && ld<22){
                     w4 = w3-(ts+tst +485);
                     w5 = w4/60;
                     w6 = w4 %60;
                     lp1 = 22 -ld;
                     lpr =Math.floor((3.0/80.0)*lp1*375);
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(970+sr + dr-lpr) ;
                     tv1.setText(String.valueOf( "R/T  08:05 ,Ration  970, load 22"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Minus " + lpr));
                 }
                 else if(tn.equals("805 da-pbt") && (ln.equals(66)) && ld==22){
                     w4 = w3-(ts+tst +485);
                     w5 = w4/60;
                     w6 = w4 %60;
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(970+sr + dr) ;
                     tv1.setText(String.valueOf( "R/T  08:05  ,Ration  970 , load 22"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                 }
                 else if(tn.equals("805/806 pbt-clh-pbt") && (ln.equals(66)) && ld>22){
                     w4 = w3-(ts+tst +200);
                     w5 = w4/60;
                     w6 = w4 %60;
                     lp1 = ld-22;
                     lpr =Math.ceil((4.0/80.0)*lp1*135);
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(328+sr + dr+lpr) ;
                     tv1.setText(String.valueOf( "R/T  03:20  ,Ration  328 , load 22"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Plus " + lpr));
                 }
                 else if(tn.equals("805/806 pbt-clh-pbt") && (ln.equals(66)) && ld<22){
                     w4 = w3-(ts+tst +200);
                     w5 = w4/60;
                     w6 = w4 %60;
                     lp1 = 22 -ld;
                     lpr =Math.floor((3.0/80.0)*lp1*135);
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(328+sr + dr-lpr) ;
                     tv1.setText(String.valueOf( "R/T  03:20 ,Ration  328, load 22"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Minus " + lpr));
                 }
                 else if(tn.equals("805/806 pbt-clh-pbt") && (ln.equals(66)) && ld==22){
                     w4 = w3-(ts+tst +200);
                     w5 = w4/60;
                     w6 = w4 %60;
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(328+sr + dr) ;
                     tv1.setText(String.valueOf( "R/T  03:20  ,Ration  328 , load 22"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                 }

                 else if(tn.equals("806 pbt-da") && (ln.equals(66)) && ld>22){
                     w4 = w3-(ts+tst +445);
                     w5 = w4/60;
                     w6 = w4 %60;
                     lp1 = ld-22;
                     lpr =Math.ceil((4.0/80.0)*lp1*375);
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(960+sr + dr+lpr) ;
                     tv1.setText(String.valueOf( "R/T  07:25  ,Ration  960 , load 22"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Plus " + lpr));
                 }
                 else if(tn.equals("806 pbt-da") && (ln.equals(66)) && ld<22){
                     w4 = w3-(ts+tst +445);
                     w5 = w4/60;
                     w6 = w4 %60;
                     lp1 = 22 -ld;
                     lpr =Math.floor((3.0/80.0)*lp1*375);
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(960+sr + dr-lpr) ;
                     tv1.setText(String.valueOf( "R/T  07:25 ,Ration  960, load 22"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Minus " + lpr));
                 }
                 else if(tn.equals("806 pbt-da") && (ln.equals(66)) && ld==22){
                     w4 = w3-(ts+tst +445);
                     w5 = w4/60;
                     w6 = w4 %60;
                     dr =Math.ceil( (w4*20.0)/60);
                     sr =Math.ceil( (ts*30.0)/60);
                     tr =Math.ceil(960+sr + dr) ;
                     tv1.setText(String.valueOf( "R/T  07:25  ,Ration  960 , load 22"));
                     tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                     tv4.setText(String.valueOf("Total Ration " + tr));
                     tv5.setText(String.valueOf("Shunting Ration " + sr));
                     tv6.setText(String.valueOf(" Detention Ration " + dr));
                     tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                 }
                 else {
                     Toast.makeText(getApplicationContext(),"Please fill all items currectly",Toast.LENGTH_LONG).show();
                     tv1.setText("");
                     tv2.setText("");
                     tv3.setText("");
                     tv4.setText("");
                     tv5.setText("");
                     tv6.setText("");
                     tv7.setText("");
                 }

                }
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText("");
                ed2.setText("");
                ed3.setText("");
                ed4.setText("");
                ed5.setText("");
                ed6.setText("");
                ed7.setText("");
                ed8.setText("");
                ed9.setText("");
                ed10.setText("");
                ed11.setText("");
                tv1.setText("");
                tv2.setText("");
                tv3.setText("");
                tv4.setText("");
                tv5.setText("");
                tv6.setText("");
                tv7.setText("");

            }
        });

    }
}