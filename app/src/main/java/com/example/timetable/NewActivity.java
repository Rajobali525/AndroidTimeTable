package com.example.timetable;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class NewActivity extends AppCompatActivity {
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
        setContentView(R.layout.activity_new);

        autoCompleteTextView = findViewById(R.id.ed11);
        String [] PbtRationMail = getResources().getStringArray(R.array.pbtmail);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,PbtRationMail);
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
                if (ed1.length() == 0 || ed2.length() == 0 || ed3.length() == 0 || ed4.length() == 0 || ed5.length() == 0 || ed6.length() == 0 || ed7.length() == 0 || ed8.length() == 0 || ed9.length() == 0 || ed10.length() == 0 || ed11.length() == 0) {
                    Toast.makeText(getApplicationContext(), "Please fill all field", Toast.LENGTH_LONG).show();
                } else {
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
                    if (tn.equals("24 pbt-isd") && (ln.equals(60)||ln.equals(61)) && ld > 16) {
                        w4 = w3 - (ts + tst + 510);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = ld - 16;
                        lpr = Math.ceil((4.0 / 80.0) * lp1 * 175);
                        dr = Math.ceil((w4 * 9.0) / 60);
                        sr = Math.ceil((ts * 13.0) / 60);
                        tr = Math.ceil(420 + sr + dr + lpr);
                        tv1.setText(String.valueOf("R/T 8:30 ,Ration 420,load 16"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    } else if (tn.equals("24 pbt-isd") && (ln.equals(60)||ln.equals(61)) && ld < 16) {
                        w4 = w3 - (ts + tst + 510);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = 16 - ld;
                        lpr = Math.floor((3.0 / 80.0) * lp1 * 175);
                        dr = Math.ceil((w4 * 9.0) / 60);
                        sr = Math.ceil((ts * 13.0) / 60);
                        tr = Math.ceil(420 + sr + dr - lpr);
                        tv1.setText(String.valueOf("R/T 8:30 ,Ration 420,load 16"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    } else if (tn.equals("24 pbt-isd") && (ln.equals(60)||ln.equals(61)) && ld == 16) {
                        w4 = w3 - (ts + tst + 510);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        dr = Math.ceil((w4 * 9.0) / 60);
                        sr = Math.ceil((ts * 13.0) / 60);
                        tr = Math.ceil(420 + sr + dr);
                        tv1.setText(String.valueOf("R/T 8:30 ,Ration 420,load 16"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                    }
                  else  if (tn.equals("24 If Load Trial") && (ln.equals(60)||ln.equals(61)) && ld > 16) {
                        w4 = w3 - (ts + tst + 450);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = ld - 16;
                        lpr = Math.ceil((4.0 / 80.0) * lp1 * 145);
                        dr = Math.ceil((w4 * 9.0) / 60);
                        sr = Math.ceil((ts * 13.0) / 60);
                        tr = Math.ceil(348 + sr + dr + lpr);
                        tv1.setText(String.valueOf("R/T 7:30 ,Ration 348,load 16"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    } else if (tn.equals("24 If Load Trial") && (ln.equals(60)||ln.equals(61)) && ld < 16) {
                        w4 = w3 - (ts + tst + 450);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = 16 - ld;
                        lpr = Math.floor((3.0 / 80.0) * lp1 * 145);
                        dr = Math.ceil((w4 * 9.0) / 60);
                        sr = Math.ceil((ts * 13.0) / 60);
                        tr = Math.ceil(348 + sr + dr - lpr);
                        tv1.setText(String.valueOf("R/T 7:30 ,Ration 348,load 16"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    } else if (tn.equals("24 If Load Trial") && (ln.equals(60)||ln.equals(61)) && ld == 16) {
                        w4 = w3 - (ts + tst + 450);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        dr = Math.ceil((w4 * 9.0) / 60);
                        sr = Math.ceil((ts * 13.0) / 60);
                        tr = Math.ceil(348 + sr + dr);
                        tv1.setText(String.valueOf("R/T 7:30 ,Ration 348,load 16"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                    }
                    else  if (tn.equals("24 If Load Trial") && (ln.equals(64)||ln.equals(65)) && ld > 16) {
                        w4 = w3 - (ts + tst + 450);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = ld - 16;
                        lpr = Math.ceil((4.0 / 80.0) * lp1 * 145);
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil(369 + sr + dr + lpr);
                        tv1.setText(String.valueOf("R/T 7:30 ,Ration 369,load 16"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    } else if (tn.equals("24 If Load Trial") && (ln.equals(64)||ln.equals(65)) && ld < 16) {
                        w4 = w3 - (ts + tst + 450);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = 16 - ld;
                        lpr = Math.floor((3.0 / 80.0) * lp1 * 145);
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil(369 + sr + dr - lpr);
                        tv1.setText(String.valueOf("R/T 7:30 ,Ration 369,load 16"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    } else if (tn.equals("24 If Load Trial") && (ln.equals(64)||ln.equals(65)) && ld == 16) {
                        w4 = w3 - (ts + tst + 450);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil(369 + sr + dr);
                        tv1.setText(String.valueOf("R/T 7:30 ,Ration 369,load 16"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                    }
                    else  if (tn.equals("24 pbt-barp trial engine ration") && (ln.equals(64)||ln.equals(65)) && ld > 16) {
                        w4 = w3 - (ts + tst + 90);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = ld - 16;
                        lpr = Math.ceil((4.0 / 80.0) * lp1 * 30);
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil(118 + sr + dr + lpr);
                        tv1.setText(String.valueOf("R/T 1:30 ,Ration 118,load 16"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    } else if (tn.equals("24 pbt-barp trial engine ration") && (ln.equals(64)||ln.equals(65)) && ld < 16) {
                        w4 = w3 - (ts + tst + 90);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = 16 - ld;
                        lpr = Math.floor((3.0 / 80.0) * lp1 * 30);
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil(118 + sr + dr - lpr);
                        tv1.setText(String.valueOf("R/T 1:30 ,Ration 118,load 16"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    } else if (tn.equals("24 pbt-barp trial engine ration") && (ln.equals(64)||ln.equals(65)) && ld == 16) {
                        w4 = w3 - (ts + tst + 90);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil(118 + sr + dr);
                        tv1.setText(String.valueOf("R/T 1:30 ,Ration 118,load 16"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                    }
                    else  if (tn.equals("24 pbt-barp trial engine ration") && (ln.equals(60)||ln.equals(61)) && ld > 16) {
                        w4 = w3 - (ts + tst + 90);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = ld - 16;
                        lpr = Math.ceil((4.0 / 80.0) * lp1 * 30);
                        dr = Math.ceil((w4 * 9.0) / 60);
                        sr = Math.ceil((ts * 13.0) / 60);
                        tr = Math.ceil(114 + sr + dr + lpr);
                        tv1.setText(String.valueOf("R/T 1:30 ,Ration 114,load 16"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    } else if (tn.equals("24 pbt-barp trial engine ration") && (ln.equals(60)||ln.equals(61)) && ld < 16) {
                        w4 = w3 - (ts + tst + 90);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = 16 - ld;
                        lpr = Math.floor((3.0 / 80.0) * lp1 * 30);
                        dr = Math.ceil((w4 * 9.0) / 60);
                        sr = Math.ceil((ts * 13.0) / 60);
                        tr = Math.ceil(114 + sr + dr - lpr);
                        tv1.setText(String.valueOf("R/T 1:30 ,Ration 114,load 16"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    } else if (tn.equals("24 pbt-barp trial engine ration") && (ln.equals(60)||ln.equals(61)) && ld == 16) {
                        w4 = w3 - (ts + tst + 90);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        dr = Math.ceil((w4 * 9.0) / 60);
                        sr = Math.ceil((ts * 13.0) / 60);
                        tr = Math.ceil(114 + sr + dr);
                        tv1.setText(String.valueOf("R/T 1:30 ,Ration 114,load 16"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                    }
                   else if (tn.equals("23 isd-pbt") && (ln.equals(60)||ln.equals(61)) && ld > 16) {
                        w4 = w3 - (ts + tst + 325);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = ld - 16;
                        lpr = Math.ceil((4.0 / 80.0) * lp1 * 175);
                        dr = Math.ceil((w4 * 9.0) / 60);
                        sr = Math.ceil((ts * 13.0) / 60);
                        tr = Math.ceil(440 + sr + dr + lpr);
                        tv1.setText(String.valueOf("R/T 5:25 ,Ration 440,load 16"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    } else if (tn.equals("23 isd-pbt") && (ln.equals(60)||ln.equals(61)) && ld < 16) {
                        w4 = w3 - (ts + tst + 325);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = 16 - ld;
                        lpr = Math.floor((3.0 / 80.0) * lp1 * 175);
                        dr = Math.ceil((w4 * 9.0) / 60);
                        sr = Math.ceil((ts * 13.0) / 60);
                        tr = Math.ceil(440 + sr + dr - lpr);
                        tv1.setText(String.valueOf("R/T 5:25 ,Ration 440,load 16"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    } else if (tn.equals("23 isd-pbt") && (ln.equals(60)||ln.equals(61)) && ld == 16) {
                        w4 = w3 - (ts + tst + 325);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        dr = Math.ceil((w4 * 9.0) / 60);
                        sr = Math.ceil((ts * 13.0) / 60);
                        tr = Math.ceil(440 + sr + dr);
                        tv1.setText(String.valueOf("R/T 5:25 ,Ration 440,load 16"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                    }
                    else if (tn.equals("27 pbt-clh-pbt") && (ln.equals(60)||ln.equals(61)) && ld > 16) {
                        w4 = w3 - (ts + tst + 210);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = ld - 16;
                        lpr = Math.ceil((4.0 / 80.0) * lp1 * 135);
                        dr = Math.ceil((w4 * 9.0) / 60);
                        sr = Math.ceil((ts * 13.0) / 60);
                        tr = Math.ceil(285 + sr + dr + lpr);
                        tv1.setText(String.valueOf("R/T 3:30 ,Ration 285,load 16"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    } else if (tn.equals("27 pbt-clh-pbt") && (ln.equals(60)||ln.equals(61)) && ld < 16) {
                        w4 = w3 - (ts + tst + 210);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = 16 - ld;
                        lpr = Math.floor((3.0 / 80.0) * lp1 * 135);
                        dr = Math.ceil((w4 * 9.0) / 60);
                        sr = Math.ceil((ts * 13.0) / 60);
                        tr = Math.ceil(285 + sr + dr - lpr);
                        tv1.setText(String.valueOf("R/T 3:30 ,Ration 285,load 16"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    } else if (tn.equals("27 pbt-clh-pbt") && (ln.equals(60)||ln.equals(61)) && ld == 16) {
                        w4 = w3 - (ts + tst + 210);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        dr = Math.ceil((w4 * 9.0) / 60);
                        sr = Math.ceil((ts * 13.0) / 60);
                        tr = Math.ceil(285 + sr + dr);
                        tv1.setText(String.valueOf("R/T 3:30 ,Ration 285,load 16"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                    }
                    else if (tn.equals("27 pbt-clh-pbt") && (ln.equals(64)||ln.equals(65)) && ld > 16) {
                        w4 = w3 - (ts + tst + 210);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = ld - 16;
                        lpr = Math.ceil((4.0 / 80.0) * lp1 * 135);
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil(315 + sr + dr + lpr);
                        tv1.setText(String.valueOf("R/T 3:30 ,Ration 315,load 16"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    } else if (tn.equals("27 pbt-clh-pbt") && (ln.equals(64)||ln.equals(65)) && ld < 16) {
                        w4 = w3 - (ts + tst + 210);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = 16 - ld;
                        lpr = Math.floor((3.0 / 80.0) * lp1 * 135);
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil(315 + sr + dr - lpr);
                        tv1.setText(String.valueOf("R/T 3:30 ,Ration 315,load 16"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    } else if (tn.equals("27 pbt-clh-pbt") && (ln.equals(64)||ln.equals(65)) && ld == 16) {
                        w4 = w3 - (ts + tst + 210);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil(315 + sr + dr);
                        tv1.setText(String.valueOf("R/T 3:30 ,Ration 315,load 16"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                    }
                    else if (tn.equals("32 pbt-rjhi") && (ln.equals(60)||ln.equals(61)) && ld > 10) {
                        w4 = w3 - (ts + tst + 400);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = ld - 10;
                        lpr = Math.ceil((4.0 / 80.0) * lp1 * 200);
                        dr = Math.ceil((w4 * 9.0) / 60);
                        sr = Math.ceil((ts * 13.0) / 60);
                        tr = Math.ceil(390 + sr + dr + lpr);
                        tv1.setText(String.valueOf("R/T 6:40 ,Ration 390,load 10"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    } else if (tn.equals("32 pbt-rjhi") && (ln.equals(60)||ln.equals(61)) && ld < 10) {
                        w4 = w3 - (ts + tst + 400);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = 10 - ld;
                        lpr = Math.floor((3.0 / 80.0) * lp1 * 200);
                        dr = Math.ceil((w4 * 9.0) / 60);
                        sr = Math.ceil((ts * 13.0) / 60);
                        tr = Math.ceil(390 + sr + dr - lpr);
                        tv1.setText(String.valueOf("R/T 6:40 ,Ration 390,load 10"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    } else if (tn.equals("32 pbt-rjhi") && (ln.equals(60)||ln.equals(61)) && ld == 10) {
                        w4 = w3 - (ts + tst + 400);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        dr = Math.ceil((w4 * 9.0) / 60);
                        sr = Math.ceil((ts * 13.0) / 60);
                        tr = Math.ceil(390 + sr + dr);
                        tv1.setText(String.valueOf("R/T 6:40 ,Ration 390,load 10"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                    }
                    else if (tn.equals("31 rjhi-pbt") && (ln.equals(60)||ln.equals(61)) && ld > 10) {
                        w4 = w3 - (ts + tst + 455);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = ld - 10;
                        lpr = Math.ceil((4.0 / 80.0) * lp1 * 200);
                        dr = Math.ceil((w4 * 9.0) / 60);
                        sr = Math.ceil((ts * 13.0) / 60);
                        tr = Math.ceil(395 + sr + dr + lpr);
                        tv1.setText(String.valueOf("R/T 7:35 ,Ration 395,load 10"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    } else if (tn.equals("31 rjhi-pbt") && (ln.equals(60)||ln.equals(61)) && ld < 10) {
                        w4 = w3 - (ts + tst + 455);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = 10 - ld;
                        lpr = Math.floor((3.0 / 80.0) * lp1 * 200);
                        dr = Math.ceil((w4 * 9.0) / 60);
                        sr = Math.ceil((ts * 13.0) / 60);
                        tr = Math.ceil(395 + sr + dr - lpr);
                        tv1.setText(String.valueOf("R/T 7:35 ,Ration 395,load 10"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    } else if (tn.equals("31 rjhi-pbt") && (ln.equals(60)||ln.equals(61)) && ld == 10) {
                        w4 = w3 - (ts + tst + 455);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        dr = Math.ceil((w4 * 9.0) / 60);
                        sr = Math.ceil((ts * 13.0) / 60);
                        tr = Math.ceil(395 + sr + dr);
                        tv1.setText(String.valueOf("R/T 7:35 ,Ration 395,load 10"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                    }
                    else if (tn.equals("31 rjhi-pbt") && (ln.equals(64)||ln.equals(65)) && ld > 10) {
                        w4 = w3 - (ts + tst + 455);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = ld - 10;
                        lpr = Math.ceil((4.0 / 80.0) * lp1 * 200);
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil(445 + sr + dr + lpr);
                        tv1.setText(String.valueOf("R/T 7:35 ,Ration 445,load 10"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    } else if (tn.equals("31 rjhi-pbt") && (ln.equals(64)||ln.equals(65)) && ld < 10) {
                        w4 = w3 - (ts + tst + 455);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = 10 - ld;
                        lpr = Math.floor((3.0 / 80.0) * lp1 * 200);
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil(445 + sr + dr - lpr);
                        tv1.setText(String.valueOf("R/T 7:35 ,Ration 445,load 10"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    } else if (tn.equals("31 rjhi-pbt") && (ln.equals(64)||ln.equals(65)) && ld == 10) {
                        w4 = w3 - (ts + tst + 455);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil(445 + sr + dr);
                        tv1.setText(String.valueOf("R/T 7:35 ,Ration 445,load 10"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                    }
                    else if (tn.equals("32 pbt-rjhi") && (ln.equals(64)||ln.equals(65)) && ld > 10) {
                        w4 = w3 - (ts + tst + 400);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = ld - 10;
                        lpr = Math.ceil((4.0 / 80.0) * lp1 * 200);
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil(440 + sr + dr + lpr);
                        tv1.setText(String.valueOf("R/T 6:40 ,Ration 440,load 10"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    } else if (tn.equals("32 pbt-rjhi") && (ln.equals(64)||ln.equals(65)) && ld < 10) {
                        w4 = w3 - (ts + tst + 400);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = 10 - ld;
                        lpr = Math.floor((3.0 / 80.0) * lp1 * 200);
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil(440 + sr + dr - lpr);
                        tv1.setText(String.valueOf("R/T 6:40 ,Ration 440,load 10"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    } else if (tn.equals("32 pbt-rjhi") && (ln.equals(64)||ln.equals(65)) && ld == 10) {
                        w4 = w3 - (ts + tst + 400);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil(440 + sr + dr);
                        tv1.setText(String.valueOf("R/T 6:40 ,Ration 440,load 10"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                    }
                    else if (tn.equals("24 pbt-isd") && (ln.equals(64)||ln.equals(65)) && ld > 16) {
                        w4 = w3 - (ts + tst + 510);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = ld - 16;
                        lpr = Math.ceil((4.0 / 80.0) * lp1 * 175);
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil(445 + sr + dr + lpr);
                        tv1.setText(String.valueOf("R/T 8:30 ,Ration 445,load 16"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    } else if (tn.equals("24 pbt-isd") && (ln.equals(64)||ln.equals(65)) && ld < 16) {
                        w4 = w3 - (ts + tst + 510);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = 16 - ld;
                        lpr = Math.floor((3.0 / 80.0) * lp1 * 175);
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil(445 + sr + dr - lpr);
                        tv1.setText(String.valueOf("R/T 8:30 ,Ration 445,load 16"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    } else if (tn.equals("24 pbt-isd") && (ln.equals(64)||ln.equals(65)) && ld == 16) {
                        w4 = w3 - (ts + tst + 510);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil(445 + sr + dr);
                        tv1.setText(String.valueOf("R/T 8:30 ,Ration 445,load 16"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                    }
                    else if (tn.equals("23 isd-pbt") && (ln.equals(64)||ln.equals(65)) && ld > 16) {
                        w4 = w3 - (ts + tst + 325);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = ld - 16;
                        lpr = Math.ceil((4.0 / 80.0) * lp1 * 175);
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil(445 + sr + dr + lpr);
                        tv1.setText(String.valueOf("R/T 5:25 ,Ration 445,load 16"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    } else if (tn.equals("23 isd-pbt") && (ln.equals(64)||ln.equals(65)) && ld < 16) {
                        w4 = w3 - (ts + tst + 325);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = 16 - ld;
                        lpr = Math.floor((3.0 / 80.0) * lp1 * 175);
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil(445 + sr + dr - lpr);
                        tv1.setText(String.valueOf("R/T 5:25 ,Ration 445,load 16"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    } else if (tn.equals("23 isd-pbt") && (ln.equals(64)||ln.equals(65)) && ld == 16) {
                        w4 = w3 - (ts + tst + 325);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil(445 + sr + dr);
                        tv1.setText(String.valueOf("R/T 5:25 ,Ration 445,load 16"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                    }
                    else if (tn.equals("64/65/66/63 pbt-bqx-pbt") && (ln.equals(23)||ln.equals(24)||ln.equals(26)||ln.equals(29)) && ld > 14) {
                        w4 = w3 - (ts + tst + 525);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = ld - 14;
                        lpr = Math.ceil((4.0 / 80.0) * lp1 * 310);
                        dr = Math.ceil((w4 * 9.0) / 60);
                        sr = Math.ceil((ts * 13.0) / 60);
                        tr = Math.ceil(505 + sr + dr + lpr);
                        tv1.setText(String.valueOf("R/T 8:45 ,Ration 505,load 14"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    } else if (tn.equals("64/65/66/63 pbt-bqx-pbt") && (ln.equals(23)||ln.equals(24)||ln.equals(26)||ln.equals(29)) && ld < 14) {
                        w4 = w3 - (ts + tst + 525);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = 14 - ld;
                        lpr = Math.floor((3.0 / 80.0) * lp1 * 310);
                        dr = Math.ceil((w4 * 9.0) / 60);
                        sr = Math.ceil((ts * 13.0) / 60);
                        tr = Math.ceil(505 + sr + dr - lpr);
                        tv1.setText(String.valueOf("R/T 8:45 ,Ration 505,load 14"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    } else if (tn.equals("64/65/66/63 pbt-bqx-pbt") && (ln.equals(23)||ln.equals(24)||ln.equals(26)||ln.equals(29)) && ld == 14) {
                        w4 = w3 - (ts + tst + 525);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        dr = Math.ceil((w4 * 9.0) / 60);
                        sr = Math.ceil((ts * 13.0) / 60);
                        tr = Math.ceil(505 + sr + dr);
                        tv1.setText(String.valueOf("R/T 8:45 ,Ration 505,load 14"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                    }
                    else if (tn.equals("41/42 pbt-bmsm-pbt") && (ln.equals(23)||ln.equals(24)||ln.equals(26)||ln.equals(29)) && ld > 12) {
                        w4 = w3 - (ts + tst + 455);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = ld - 12;
                        lpr = Math.ceil((4.0 / 80.0) * lp1 * 265);
                        dr = Math.ceil((w4 * 9.0) / 60);
                        sr = Math.ceil((ts * 13.0) / 60);
                        tr = Math.ceil(360 + sr + dr + lpr);
                        tv1.setText(String.valueOf("R/T 7:35 ,Ration 360,load 12"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    } else if (tn.equals("41/42 pbt-bmsm-pbt") && (ln.equals(23)||ln.equals(24)||ln.equals(26)||ln.equals(29)) && ld < 12) {
                        w4 = w3 - (ts + tst + 455);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = 12 - ld;
                        lpr = Math.floor((3.0 / 80.0) * lp1 * 265);
                        dr = Math.ceil((w4 * 9.0) / 60);
                        sr = Math.ceil((ts * 13.0) / 60);
                        tr = Math.ceil(360 + sr + dr - lpr);
                        tv1.setText(String.valueOf("R/T 7:35 ,Ration 360,load 12"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    } else if (tn.equals("41/42 pbt-bmsm-pbt") && (ln.equals(23)||ln.equals(24)||ln.equals(26)||ln.equals(29)) && ld == 12) {
                        w4 = w3 - (ts + tst + 455);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        dr = Math.ceil((w4 * 9.0) / 60);
                        sr = Math.ceil((ts * 13.0) / 60);
                        tr = Math.ceil(360 + sr + dr);
                        tv1.setText(String.valueOf("R/T 7:35 ,Ration 360,load 12"));
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