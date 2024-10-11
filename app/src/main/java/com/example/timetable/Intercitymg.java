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

public class Intercitymg extends AppCompatActivity {
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
        setContentView(R.layout.activity_intercitymg);

        autoCompleteTextView = findViewById(R.id.ed11);
        String [] PbtRationmg = getResources().getStringArray(R.array.pbtrationmg);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,PbtRationmg);
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
                        w2 = 60 - n2 + n4;
                    } else if (n1 == n3 && n4 == n2) {
                        w1 = 0;
                        w2 = 0;
                    } else if (n1 == n3 && n2 < n4) {
                        w1 = 0;
                        w2 = n4 - n2;
                    } else if (n2 == n4 && n1 > n3) {
                        w1 = (24 - n1) + n3;
                        w2 = 0;
                    } else if (n2 == n4 && n3 > n1) {
                        w1 = n3 - n1;
                        w2 = 0;
                    }
                    tv2.setText(String.valueOf("Total Work " + w1 + " Hour " + w2 + " Minute "));
                    w3 = w1 * 60 + w2;
                    ts = s1 * 60 + s2;
                    tst = sth * 60 + stm;

                    if(tn.equals("767 pbt-bmsm") && (ln.equals(29)|| ln.equals(30)) && ld>20){
                        w4 = w3-(ts+tst +195);
                        w5 = w4/60;
                        w6 = w4 %60;
                        lp1 = ld-20;
                        lpr =Math.ceil((4.0/80.0)*lp1*132);
                        dr =Math.ceil( (w4*09.0)/60);
                        sr =Math.ceil( (ts*13.0)/60);
                        tr =Math.ceil(230+sr + dr+lpr) ;
                        tv1.setText(String.valueOf( "R/T  03:15  ,Ration  230 , load 20"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    }
                    else if(tn.equals("767 pbt-bmsm") && (ln.equals(29)|| ln.equals(30)) && ld<20){
                        w4 = w3-(ts+tst +195);
                        w5 = w4/60;
                        w6 = w4 %60;
                        lp1 = 20 -ld;
                        lpr =Math.floor((3.0/80.0)*lp1*132);
                        dr =Math.floor( (w4*09.0)/60);
                        sr =Math.floor( (ts*13.0)/60);
                        tr =Math.floor(230+sr + dr-lpr) ;
                        tv1.setText(String.valueOf( "R/T  03:15 ,Ration  230 , load 20"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    }
                    else if(tn.equals("767 pbt-bmsm") && (ln.equals(30)|| ln.equals(29)) && ld==20){
                        w4 = w3-(ts+tst +195);
                        w5 = w4/60;
                        w6 = w4 %60;
                        dr =Math.ceil( (w4*09.0)/60);
                        sr =Math.ceil( (ts*13.0)/60);
                        tr =Math.ceil(230+sr + dr) ;
                        tv1.setText(String.valueOf( "R/T  03:15  ,Ration  230 , load 20"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                    }
                    else if(tn.equals("768 bmsm-pbt") && (ln.equals(29)|| ln.equals(30)) && ld>20){
                        w4 = w3-(ts+tst +200);
                        w5 = w4/60;
                        w6 = w4 %60;
                        lp1 = ld-20;
                        lpr =Math.ceil((4.0/80.0)*lp1*132);
                        dr =Math.ceil( (w4*09.0)/60);
                        sr =Math.ceil( (ts*13.0)/60);
                        tr =Math.ceil(226+sr + dr+lpr) ;
                        tv1.setText(String.valueOf( "R/T  03:20  ,Ration  226 , load 20"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    }
                    else if(tn.equals("768 bmsm-pbt") && (ln.equals(29)|| ln.equals(30)) && ld<20){
                        w4 = w3-(ts+tst +200);
                        w5 = w4/60;
                        w6 = w4 %60;
                        lp1 = 20 -ld;
                        lpr =Math.floor((3.0/80.0)*lp1*132);
                        dr =Math.floor( (w4*09.0)/60);
                        sr =Math.floor( (ts*13.0)/60);
                        tr =Math.floor(226+sr + dr-lpr) ;
                        tv1.setText(String.valueOf( "R/T  03:20 ,Ration  226 , load 20"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    }
                    else if(tn.equals("768 bmsm-pbt") && (ln.equals(30)|| ln.equals(29)) && ld==20){
                        w4 = w3-(ts+tst +200);
                        w5 = w4/60;
                        w6 = w4 %60;
                        dr =Math.ceil( (w4*09.0)/60);
                        sr =Math.ceil( (ts*13.0)/60);
                        tr =Math.ceil(226+sr + dr) ;
                        tv1.setText(String.valueOf( "R/T  03:20  ,Ration  226 , load 20"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                    }
                    else if(tn.equals("797 da-pbt") && (ln.equals(29)|| ln.equals(30)) && ld>28){
                        w4 = w3-(ts+tst +435);
                        w5 = w4/60;
                        w6 = w4 %60;
                        lp1 = ld-28;
                        lpr =Math.ceil((4.0/80.0)*lp1*375);
                        dr =Math.ceil( (w4*09.0)/60);
                        sr =Math.ceil( (ts*13.0)/60);
                        tr =Math.ceil(825+sr + dr+lpr) ;
                        tv1.setText(String.valueOf( "R/T  07:15  ,Ration  825 , load 28"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    }
                    else if(tn.equals("797 da-pbt") && (ln.equals(29)||ln.equals(30)) && ld<28){
                        w4 = w3-(ts+tst +435);
                        w5 = w4/60;
                        w6 = w4 %60;
                        lp1 = 28 -ld;
                        lpr =Math.floor((3.0/80.0)*lp1*375);
                        dr =Math.floor( (w4*09.0)/60);
                        sr =Math.floor( (ts*13.0)/60);
                        tr =Math.floor(825+sr + dr-lpr) ;
                        tv1.setText(String.valueOf( "R/T  07:15 ,Ration 825 , load 28"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    }
                    else if(tn.equals("797 da-pbt") && (ln.equals(29)||ln.equals(30)) && ld==28){
                        w4 = w3-(ts+tst +435);
                        w5 = w4/60;
                        w6 = w4 %60;
                        dr =Math.ceil( (w4*09.0)/60);
                        sr =Math.ceil( (ts*13.0)/60);
                        tr =Math.ceil(825+sr + dr) ;
                        tv1.setText(String.valueOf( "R/T  07:15  ,Ration  825 , load 28"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                    }
                    else if(tn.equals("797/798 pbt-krm-pbt") && (ln.equals(29)|| ln.equals(30)) && ld>28){
                        w4 = w3-(ts+tst +270);
                        w5 = w4/60;
                        w6 = w4 %60;
                        lp1 = ld-28;
                        lpr =Math.ceil((4.0/80.0)*lp1*155);
                        dr =Math.ceil( (w4*09.0)/60);
                        sr =Math.ceil( (ts*13.0)/60);
                        tr =Math.ceil(320+sr + dr+lpr) ;
                        tv1.setText(String.valueOf( "R/T  04:30  ,Ration  320 , load 28"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    }
                    else if(tn.equals("797/798 pbt-krm-pbt") && (ln.equals(29)||ln.equals(30)) && ld<28){
                        w4 = w3-(ts+tst +270);
                        w5 = w4/60;
                        w6 = w4 %60;
                        lp1 = 28 -ld;
                        lpr =Math.floor((3.0/80.0)*lp1*155);
                        dr =Math.floor( (w4*09.0)/60);
                        sr =Math.floor( (ts*13.0)/60);
                        tr =Math.floor(320+sr + dr-lpr) ;
                        tv1.setText(String.valueOf( "R/T  04:30 ,Ration 320 , load 28"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    }
                    else if(tn.equals("797/798 pbt-krm-pbt") && (ln.equals(29)||ln.equals(30)) && ld==28){
                        w4 = w3-(ts+tst +270);
                        w5 = w4/60;
                        w6 = w4 %60;
                        dr =Math.ceil( (w4*09.0)/60);
                        sr =Math.ceil( (ts*13.0)/60);
                        tr =Math.ceil(320+sr + dr) ;
                        tv1.setText(String.valueOf( "R/T  04:30  ,Ration  320 , load 28"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                    }
                    else if(tn.equals("798 pbt-da") && (ln.equals(29)|| ln.equals(30)) && ld>28){
                        w4 = w3-(ts+tst +475);
                        w5 = w4/60;
                        w6 = w4 %60;
                        lp1 = ld-28;
                        lpr =Math.ceil((4.0/80.0)*lp1*375);
                        dr =Math.ceil( (w4*09.0)/60);
                        sr =Math.ceil( (ts*13.0)/60);
                        tr =Math.ceil(830+sr + dr+lpr) ;
                        tv1.setText(String.valueOf( "R/T  07:55  ,Ration  830 , load 28"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    }
                    else if(tn.equals("798 pbt-da") && (ln.equals(29)||ln.equals(30)) && ld<28){
                        w4 = w3-(ts+tst +475);
                        w5 = w4/60;
                        w6 = w4 %60;
                        lp1 = 28 -ld;
                        lpr =Math.floor((3.0/80.0)*lp1*375);
                        dr =Math.floor( (w4*09.0)/60);
                        sr =Math.floor( (ts*13.0)/60);
                        tr =Math.floor(830+sr + dr-lpr) ;
                        tv1.setText(String.valueOf( "R/T  07:55 ,Ration 830 , load 28"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    }
                    else if(tn.equals("798 pbt-da") && (ln.equals(29)||ln.equals(30)) && ld==28){
                        w4 = w3-(ts+tst +475);
                        w5 = w4/60;
                        w6 = w4 %60;
                        dr =Math.ceil( (w4*09.0)/60);
                        sr =Math.ceil( (ts*13.0)/60);
                        tr =Math.ceil(830+sr + dr) ;
                        tv1.setText(String.valueOf( "R/T  07:55  ,Ration  830 , load 28"));
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