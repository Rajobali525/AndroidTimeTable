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

public class IsdIntercity extends AppCompatActivity {
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
        setContentView(R.layout.activity_isd_intercity);

        autoCompleteTextView = findViewById(R.id.ed11);
        String [] Isd = getResources().getStringArray(R.array.isd);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,Isd);
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
                    if(tn.equals("748 isd-kln") && (ln.equals(65)) && ld>26){
                        w4 = w3-(ts+tst +265);
                        w5 = w4/60;
                        w6 = w4 %60;
                        lp1 = ld-26;
                        lpr =Math.ceil((4.0/80.0)*lp1*205);
                        dr =Math.ceil( (w4*20.0)/60);
                        sr =Math.ceil( (ts*30.0)/60);
                        tr =Math.ceil(445+sr + dr+lpr) ;
                        tv1.setText(String.valueOf( "R/T  04:25  ,Ration  445 , load 26"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));}
                    else if(tn.equals("748 isd-kln") && (ln.equals(65)) && ld<26){
                        w4 = w3-(ts+tst +265);
                        w5 = w4/60;
                        w6 = w4 %60;
                        lp1 = 26 -ld;
                        lpr =Math.floor((3.0/80.0)*lp1*205);
                        dr =Math.floor( (w4*20.0)/60);
                        sr =Math.floor( (ts*30.0)/60);
                        tr =Math.floor(445+sr + dr-lpr) ;
                        tv1.setText(String.valueOf( "R/T  04:25 ,Ration  445 , load 26"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));}
                    else if(tn.equals("748 isd-kln") && (ln.equals(65)) && ld==26){
                        w4 = w3-(ts+tst +265);
                        w5 = w4/60;
                        w6 = w4 %60;
                        dr =Math.ceil( (w4*20.0)/60);
                        sr =Math.ceil( (ts*30.0)/60);
                        tr =Math.ceil(445+sr + dr) ;
                        tv1.setText(String.valueOf( "R/T  04:25  ,Ration  445 , load 26"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));}
                   else if(tn.equals("748 chi-isd") && (ln.equals(65)) && ld>26){
                        w4 = w3-(ts+tst +290);
                        w5 = w4/60;
                        w6 = w4 %60;
                        lp1 = ld-26;
                        lpr =Math.ceil((4.0/80.0)*lp1*242);
                        dr =Math.ceil( (w4*20.0)/60);
                        sr =Math.ceil( (ts*30.0)/60);
                        tr =Math.ceil(530+sr + dr+lpr) ;
                        tv1.setText(String.valueOf( "R/T  04:50  ,Ration  530 , load 26"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));}
                    else if(tn.equals("748 chi-isd") && (ln.equals(65)) && ld<26){
                        w4 = w3-(ts+tst +290);
                        w5 = w4/60;
                        w6 = w4 %60;
                        lp1 = 26 -ld;
                        lpr =Math.floor((3.0/80.0)*lp1*242);
                        dr =Math.floor( (w4*20.0)/60);
                        sr =Math.floor( (ts*30.0)/60);
                        tr =Math.floor(530+sr + dr-lpr) ;
                        tv1.setText(String.valueOf( "R/T  04:50 ,Ration  530 , load 26"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));}
                    else if(tn.equals("748 chi-isd") && (ln.equals(65)) && ld==26){
                        w4 = w3-(ts+tst +290);
                        w5 = w4/60;
                        w6 = w4 %60;
                        dr =Math.ceil( (w4*20.0)/60);
                        sr =Math.ceil( (ts*30.0)/60);
                        tr =Math.ceil(530+sr + dr) ;
                        tv1.setText(String.valueOf( "R/T  04:50  ,Ration  530 , load 26"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));}
                    else if(tn.equals("748 chi-isd") && (ln.equals(66)) && ld>26){
                        w4 = w3-(ts+tst +290);
                        w5 = w4/60;
                        w6 = w4 %60;
                        lp1 = ld-26;
                        lpr =Math.ceil((4.0/80.0)*lp1*242);
                        dr =Math.ceil( (w4*20.0)/60);
                        sr =Math.ceil( (ts*30.0)/60);
                        tr =Math.ceil(670+sr + dr+lpr) ;
                        tv1.setText(String.valueOf( "R/T  04:50  ,Ration  670 , load 26"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));}
                    else if(tn.equals("748 chi-isd") && (ln.equals(66)) && ld<26){
                        w4 = w3-(ts+tst +290);
                        w5 = w4/60;
                        w6 = w4 %60;
                        lp1 = 26 -ld;
                        lpr =Math.floor((3.0/80.0)*lp1*242);
                        dr =Math.floor( (w4*20.0)/60);
                        sr =Math.floor( (ts*30.0)/60);
                        tr =Math.floor(670+sr + dr-lpr) ;
                        tv1.setText(String.valueOf( "R/T  04:50 ,Ration  670 , load 26"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));}
                    else if(tn.equals("748 chi-isd") && (ln.equals(66)) && ld==26){
                        w4 = w3-(ts+tst +290);
                        w5 = w4/60;
                        w6 = w4 %60;
                        dr =Math.ceil( (w4*20.0)/60);
                        sr =Math.ceil( (ts*30.0)/60);
                        tr =Math.ceil(670+sr + dr) ;
                        tv1.setText(String.valueOf( "R/T  04:50  ,Ration  670 , load 26"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));}
                   else if(tn.equals("748 isd-kln") && (ln.equals(66)) && ld>26){
                        w4 = w3-(ts+tst +265);
                        w5 = w4/60;
                        w6 = w4 %60;
                        lp1 = ld-26;
                        lpr =Math.ceil((4.0/80.0)*lp1*205);
                        dr =Math.ceil( (w4*20.0)/60);
                        sr =Math.ceil( (ts*30.0)/60);
                        tr =Math.ceil(580+sr + dr+lpr) ;
                        tv1.setText(String.valueOf( "R/T  04:25  ,Ration  580 , load 26"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));}
                    else if(tn.equals("748 isd-kln") && (ln.equals(66)) && ld<26){
                        w4 = w3-(ts+tst +265);
                        w5 = w4/60;
                        w6 = w4 %60;
                        lp1 = 26 -ld;
                        lpr =Math.floor((3.0/80.0)*lp1*205);
                        dr =Math.floor( (w4*20.0)/60);
                        sr =Math.floor( (ts*30.0)/60);
                        tr =Math.floor(580+sr + dr-lpr) ;
                        tv1.setText(String.valueOf( "R/T  04:25 ,Ration  580 , load 26"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));}
                    else if(tn.equals("748 isd-kln") && (ln.equals(66)) && ld==26){
                        w4 = w3-(ts+tst +265);
                        w5 = w4/60;
                        w6 = w4 %60;
                        dr =Math.ceil( (w4*20.0)/60);
                        sr =Math.ceil( (ts*30.0)/60);
                        tr =Math.ceil(580+sr + dr) ;
                        tv1.setText(String.valueOf( "R/T  04:25  ,Ration  580 , load 26"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));}
                    else if(tn.equals("747 isd-clh") && (ln.equals(66)) && ld>26){
                        w4 = w3-(ts+tst +315);
                        w5 = w4/60;
                        w6 = w4 %60;
                        lp1 = ld-26;
                        lpr =Math.ceil((4.0/80.0)*lp1*242);
                        dr =Math.ceil( (w4*20.0)/60);
                        sr =Math.ceil( (ts*30.0)/60);
                        tr =Math.ceil(690+sr + dr+lpr) ;
                        tv1.setText(String.valueOf( "R/T  05:15  ,Ration  690 , load 26"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));}
                    else if(tn.equals("747 isd-clh") && (ln.equals(66)) && ld<26){
                        w4 = w3-(ts+tst +315);
                        w5 = w4/60;
                        w6 = w4 %60;
                        lp1 = 26 -ld;
                        lpr =Math.floor((3.0/80.0)*lp1*242);
                        dr =Math.floor( (w4*20.0)/60);
                        sr =Math.floor( (ts*30.0)/60);
                        tr =Math.floor(690+sr + dr-lpr) ;
                        tv1.setText(String.valueOf( "R/T  05:15 ,Ration  690 , load 26"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));}
                    else if(tn.equals("747 isd-clh") && (ln.equals(66)) && ld==26){
                        w4 = w3-(ts+tst +315);
                        w5 = w4/60;
                        w6 = w4 %60;
                        dr =Math.ceil( (w4*20.0)/60);
                        sr =Math.ceil( (ts*30.0)/60);
                        tr =Math.ceil(690+sr + dr) ;
                        tv1.setText(String.valueOf( "R/T  05:15  ,Ration  690 , load 26"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));}
                    else if(tn.equals("747 isd-clh") && (ln.equals(65)) && ld>26){
                        w4 = w3-(ts+tst +315);
                        w5 = w4/60;
                        w6 = w4 %60;
                        lp1 = ld-26;
                        lpr =Math.ceil((4.0/80.0)*lp1*242);
                        dr =Math.ceil( (w4*20.0)/60);
                        sr =Math.ceil( (ts*30.0)/60);
                        tr =Math.ceil(535+sr + dr+lpr) ;
                        tv1.setText(String.valueOf( "R/T  05:15  ,Ration  535 , load 26"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));}
                    else if(tn.equals("747 isd-clh") && (ln.equals(65)) && ld<26){
                        w4 = w3-(ts+tst +315);
                        w5 = w4/60;
                        w6 = w4 %60;
                        lp1 = 26 -ld;
                        lpr =Math.floor((3.0/80.0)*lp1*242);
                        dr =Math.floor( (w4*20.0)/60);
                        sr =Math.floor( (ts*30.0)/60);
                        tr =Math.floor(535+sr + dr-lpr) ;
                        tv1.setText(String.valueOf( "R/T  05:15 ,Ration  535 , load 26"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));}
                    else if(tn.equals("747 isd-clh") && (ln.equals(65)) && ld==26){
                        w4 = w3-(ts+tst +315);
                        w5 = w4/60;
                        w6 = w4 %60;
                        dr =Math.ceil( (w4*20.0)/60);
                        sr =Math.ceil( (ts*30.0)/60);
                        tr =Math.ceil(535+sr + dr) ;
                        tv1.setText(String.valueOf( "R/T  05:15  ,Ration  535 , load 26"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));}
                    else if(tn.equals("747 kln-isd") && (ln.equals(65)) && ld>26){
                        w4 = w3-(ts+tst +245);
                        w5 = w4/60;
                        w6 = w4 %60;
                        lp1 = ld-26;
                        lpr =Math.ceil((4.0/80.0)*lp1*205);
                        dr =Math.ceil( (w4*20.0)/60);
                        sr =Math.ceil( (ts*30.0)/60);
                        tr =Math.ceil(450+sr + dr+lpr) ;
                        tv1.setText(String.valueOf( "R/T  04:05  ,Ration  450 , load 26"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));}
                    else if(tn.equals("747 kln-isd") && (ln.equals(65)) && ld<26){
                        w4 = w3-(ts+tst +245);
                        w5 = w4/60;
                        w6 = w4 %60;
                        lp1 = 26 -ld;
                        lpr =Math.floor((3.0/80.0)*lp1*205);
                        dr =Math.floor( (w4*20.0)/60);
                        sr =Math.floor( (ts*30.0)/60);
                        tr =Math.floor(450+sr + dr-lpr) ;
                        tv1.setText(String.valueOf( "R/T  04:05 ,Ration  450 , load 26"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));}
                    else if(tn.equals("747 kln-isd") && (ln.equals(65)) && ld==26){
                        w4 = w3-(ts+tst +245);
                        w5 = w4/60;
                        w6 = w4 %60;
                        dr =Math.ceil( (w4*20.0)/60);
                        sr =Math.ceil( (ts*30.0)/60);
                        tr =Math.ceil(450+sr + dr) ;
                        tv1.setText(String.valueOf( "R/T  04:05  ,Ration  450 , load 26"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));}
                    else if(tn.equals("747 kln-isd") && (ln.equals(66)) && ld>26){
                        w4 = w3-(ts+tst +245);
                        w5 = w4/60;
                        w6 = w4 %60;
                        lp1 = ld-26;
                        lpr =Math.ceil((4.0/80.0)*lp1*205);
                        dr =Math.ceil( (w4*20.0)/60);
                        sr =Math.ceil( (ts*30.0)/60);
                        tr =Math.ceil(570+sr + dr+lpr) ;
                        tv1.setText(String.valueOf( "R/T  04:05  ,Ration  570 , load 26"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));}
                    else if(tn.equals("747 kln-isd") && (ln.equals(66)) && ld<26){
                        w4 = w3-(ts+tst +245);
                        w5 = w4/60;
                        w6 = w4 %60;
                        lp1 = 26 -ld;
                        lpr =Math.floor((3.0/80.0)*lp1*205);
                        dr =Math.floor( (w4*20.0)/60);
                        sr =Math.floor( (ts*30.0)/60);
                        tr =Math.floor(570+sr + dr-lpr) ;
                        tv1.setText(String.valueOf( "R/T  04:05 ,Ration  570 , load 26"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));}
                    else if(tn.equals("747 kln-isd") && (ln.equals(66)) && ld==26){
                        w4 = w3-(ts+tst +245);
                        w5 = w4/60;
                        w6 = w4 %60;
                        dr =Math.ceil( (w4*20.0)/60);
                        sr =Math.ceil( (ts*30.0)/60);
                        tr =Math.ceil(570+sr + dr) ;
                        tv1.setText(String.valueOf( "R/T  04:05  ,Ration  570 , load 26"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));}
                    else if(tn.equals("727 kln-isd") && (ln.equals(66)) && ld>26){
                        w4 = w3-(ts+tst +260);
                        w5 = w4/60;
                        w6 = w4 %60;
                        lp1 = ld-26;
                        lpr =Math.ceil((4.0/80.0)*lp1*205);
                        dr =Math.ceil( (w4*20.0)/60);
                        sr =Math.ceil( (ts*30.0)/60);
                        tr =Math.ceil(580+sr + dr+lpr) ;
                        tv1.setText(String.valueOf( "R/T  04:20  ,Ration  580 , load 26"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));}
                    else if(tn.equals("727 kln-isd") && (ln.equals(66)) && ld<26){
                        w4 = w3-(ts+tst +260);
                        w5 = w4/60;
                        w6 = w4 %60;
                        lp1 = 26 -ld;
                        lpr =Math.floor((3.0/80.0)*lp1*205);
                        dr =Math.floor( (w4*20.0)/60);
                        sr =Math.floor( (ts*30.0)/60);
                        tr =Math.floor(580+sr + dr-lpr) ;
                        tv1.setText(String.valueOf( "R/T  04:20 ,Ration  580 , load 26"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));}
                    else if(tn.equals("727 kln-isd") && (ln.equals(66)) && ld==26){
                        w4 = w3-(ts+tst +260);
                        w5 = w4/60;
                        w6 = w4 %60;
                        dr =Math.ceil( (w4*20.0)/60);
                        sr =Math.ceil( (ts*30.0)/60);
                        tr =Math.ceil(580+sr + dr) ;
                        tv1.setText(String.valueOf( "R/T  04:20  ,Ration  580 , load 26"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));}
                    else if(tn.equals("727 kln-isd") && (ln.equals(65)) && ld>26){
                        w4 = w3-(ts+tst +260);
                        w5 = w4/60;
                        w6 = w4 %60;
                        lp1 = ld-26;
                        lpr =Math.ceil((4.0/80.0)*lp1*205);
                        dr =Math.ceil( (w4*20.0)/60);
                        sr =Math.ceil( (ts*30.0)/60);
                        tr =Math.ceil(450+sr + dr+lpr) ;
                        tv1.setText(String.valueOf( "R/T  04:20  ,Ration  450 , load 26"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));}
                    else if(tn.equals("727 kln-isd") && (ln.equals(65)) && ld<26){
                        w4 = w3-(ts+tst +260);
                        w5 = w4/60;
                        w6 = w4 %60;
                        lp1 = 26 -ld;
                        lpr =Math.floor((3.0/80.0)*lp1*205);
                        dr =Math.floor( (w4*20.0)/60);
                        sr =Math.floor( (ts*30.0)/60);
                        tr =Math.floor(450+sr + dr-lpr) ;
                        tv1.setText(String.valueOf( "R/T  04:20 ,Ration  450 , load 26"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));}
                    else if(tn.equals("727 kln-isd") && (ln.equals(65)) && ld==26){
                        w4 = w3-(ts+tst +260);
                        w5 = w4/60;
                        w6 = w4 %60;
                        dr =Math.ceil( (w4*20.0)/60);
                        sr =Math.ceil( (ts*30.0)/60);
                        tr =Math.ceil(450+sr + dr) ;
                        tv1.setText(String.valueOf( "R/T  04:20  ,Ration  450 , load 26"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));}
                    else if(tn.equals("727 isd-clh") && (ln.equals(65)) && ld>26){
                        w4 = w3-(ts+tst +325);
                        w5 = w4/60;
                        w6 = w4 %60;
                        lp1 = ld-26;
                        lpr =Math.ceil((4.0/80.0)*lp1*242);
                        dr =Math.ceil( (w4*20.0)/60);
                        sr =Math.ceil( (ts*30.0)/60);
                        tr =Math.ceil(535+sr + dr+lpr) ;
                        tv1.setText(String.valueOf( "R/T  05:25  ,Ration  535 , load 26"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));}
                    else if(tn.equals("727 isd-clh") && (ln.equals(65)) && ld<26){
                        w4 = w3-(ts+tst +325);
                        w5 = w4/60;
                        w6 = w4 %60;
                        lp1 = 26 -ld;
                        lpr =Math.floor((3.0/80.0)*lp1*242);
                        dr =Math.floor( (w4*20.0)/60);
                        sr =Math.floor( (ts*30.0)/60);
                        tr =Math.floor(535+sr + dr-lpr) ;
                        tv1.setText(String.valueOf( "R/T  05:25 ,Ration  535 , load 26"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));}
                    else if(tn.equals("727 isd-clh") && (ln.equals(65)) && ld==26){
                        w4 = w3-(ts+tst +325);
                        w5 = w4/60;
                        w6 = w4 %60;
                        dr =Math.ceil( (w4*20.0)/60);
                        sr =Math.ceil( (ts*30.0)/60);
                        tr =Math.ceil(535+sr + dr) ;
                        tv1.setText(String.valueOf( "R/T  05:25  ,Ration  535 , load 26"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));}
                    else if(tn.equals("727 isd-clh") && (ln.equals(66)) && ld>26){
                        w4 = w3-(ts+tst +325);
                        w5 = w4/60;
                        w6 = w4 %60;
                        lp1 = ld-26;
                        lpr =Math.ceil((4.0/80.0)*lp1*242);
                        dr =Math.ceil( (w4*20.0)/60);
                        sr =Math.ceil( (ts*30.0)/60);
                        tr =Math.ceil(695+sr + dr+lpr) ;
                        tv1.setText(String.valueOf( "R/T  05:25  ,Ration  695 , load 26"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));}
                    else if(tn.equals("727 isd-clh") && (ln.equals(66)) && ld<26){
                        w4 = w3-(ts+tst +325);
                        w5 = w4/60;
                        w6 = w4 %60;
                        lp1 = 26 -ld;
                        lpr =Math.floor((3.0/80.0)*lp1*242);
                        dr =Math.floor( (w4*20.0)/60);
                        sr =Math.floor( (ts*30.0)/60);
                        tr =Math.floor(695+sr + dr-lpr) ;
                        tv1.setText(String.valueOf( "R/T  05:25 ,Ration  695 , load 26"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));}
                    else if(tn.equals("727 isd-clh") && (ln.equals(66)) && ld==26){
                        w4 = w3-(ts+tst +325);
                        w5 = w4/60;
                        w6 = w4 %60;
                        dr =Math.ceil( (w4*20.0)/60);
                        sr =Math.ceil( (ts*30.0)/60);
                        tr =Math.ceil(695+sr + dr) ;
                        tv1.setText(String.valueOf( "R/T  05:25  ,Ration  695 , load 26"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));}
                    else if(tn.equals("728 clh-isd") && (ln.equals(66)) && ld>26){
                        w4 = w3-(ts+tst +310);
                        w5 = w4/60;
                        w6 = w4 %60;
                        lp1 = ld-26;
                        lpr =Math.ceil((4.0/80.0)*lp1*242);
                        dr =Math.ceil( (w4*20.0)/60);
                        sr =Math.ceil( (ts*30.0)/60);
                        tr =Math.ceil(675+sr + dr+lpr) ;
                        tv1.setText(String.valueOf( "R/T  05:10  ,Ration  675 , load 26"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));}
                    else if(tn.equals("728 clh-isd") && (ln.equals(66)) && ld<26){
                        w4 = w3-(ts+tst +310);
                        w5 = w4/60;
                        w6 = w4 %60;
                        lp1 = 26 -ld;
                        lpr =Math.floor((3.0/80.0)*lp1*242);
                        dr =Math.floor( (w4*20.0)/60);
                        sr =Math.floor( (ts*30.0)/60);
                        tr =Math.floor(675+sr + dr-lpr) ;
                        tv1.setText(String.valueOf( "R/T  05:10 ,Ration  675 , load 26"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));}
                    else if(tn.equals("728 clh-isd") && (ln.equals(66)) && ld==26){
                        w4 = w3-(ts+tst +310);
                        w5 = w4/60;
                        w6 = w4 %60;
                        dr =Math.ceil( (w4*20.0)/60);
                        sr =Math.ceil( (ts*30.0)/60);
                        tr =Math.ceil(675+sr + dr) ;
                        tv1.setText(String.valueOf( "R/T  05:10  ,Ration  675 , load 26"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));}
                    else if(tn.equals("728 clh-isd") && (ln.equals(65)) && ld>26){
                        w4 = w3-(ts+tst +310);
                        w5 = w4/60;
                        w6 = w4 %60;
                        lp1 = ld-26;
                        lpr =Math.ceil((4.0/80.0)*lp1*242);
                        dr =Math.ceil( (w4*20.0)/60);
                        sr =Math.ceil( (ts*30.0)/60);
                        tr =Math.ceil(530+sr + dr+lpr) ;
                        tv1.setText(String.valueOf( "R/T  05:10  ,Ration  530 , load 26"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));}
                    else if(tn.equals("728 clh-isd") && (ln.equals(65)) && ld<26){
                        w4 = w3-(ts+tst +310);
                        w5 = w4/60;
                        w6 = w4 %60;
                        lp1 = 26 -ld;
                        lpr =Math.floor((3.0/80.0)*lp1*242);
                        dr =Math.floor( (w4*20.0)/60);
                        sr =Math.floor( (ts*30.0)/60);
                        tr =Math.floor(530+sr + dr-lpr) ;
                        tv1.setText(String.valueOf( "R/T  05:10 ,Ration  530 , load 26"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));}
                    else if(tn.equals("728 clh-isd") && (ln.equals(65)) && ld==26){
                        w4 = w3-(ts+tst +310);
                        w5 = w4/60;
                        w6 = w4 %60;
                        dr =Math.ceil( (w4*20.0)/60);
                        sr =Math.ceil( (ts*30.0)/60);
                        tr =Math.ceil(530+sr + dr) ;
                        tv1.setText(String.valueOf( "R/T  05:10  ,Ration  530 , load 26"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));}
                    else if(tn.equals("728 isd-kln") && (ln.equals(66)) && ld>26){
                        w4 = w3-(ts+tst +250);
                        w5 = w4/60;
                        w6 = w4 %60;
                        lp1 = ld-26;
                        lpr =Math.ceil((4.0/80.0)*lp1*205);
                        dr =Math.ceil( (w4*20.0)/60);
                        sr =Math.ceil( (ts*30.0)/60);
                        tr =Math.ceil(575+sr + dr+lpr) ;
                        tv1.setText(String.valueOf( "R/T  04:10  ,Ration  575 , load 26"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));}
                    else if(tn.equals("728 isd-kln") && (ln.equals(66)) && ld<26){
                        w4 = w3-(ts+tst +250);
                        w5 = w4/60;
                        w6 = w4 %60;
                        lp1 = 26 -ld;
                        lpr =Math.floor((3.0/80.0)*lp1*205);
                        dr =Math.floor( (w4*20.0)/60);
                        sr =Math.floor( (ts*30.0)/60);
                        tr =Math.floor(575+sr + dr-lpr) ;
                        tv1.setText(String.valueOf( "R/T  04:10 ,Ration  575 , load 26"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));}
                    else if(tn.equals("728 isd-kln") && (ln.equals(66)) && ld==26){
                        w4 = w3-(ts+tst +250);
                        w5 = w4/60;
                        w6 = w4 %60;
                        dr =Math.ceil( (w4*20.0)/60);
                        sr =Math.ceil( (ts*30.0)/60);
                        tr =Math.ceil(575+sr + dr) ;
                        tv1.setText(String.valueOf( "R/T  04:10  ,Ration  575 , load 26"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));}
                    else if(tn.equals("728 isd-kln") && (ln.equals(65)) && ld>26){
                        w4 = w3-(ts+tst +250);
                        w5 = w4/60;
                        w6 = w4 %60;
                        lp1 = ld-26;
                        lpr =Math.ceil((4.0/80.0)*lp1*205);
                        dr =Math.ceil( (w4*20.0)/60);
                        sr =Math.ceil( (ts*30.0)/60);
                        tr =Math.ceil(445+sr + dr+lpr) ;
                        tv1.setText(String.valueOf( "R/T  04:10  ,Ration  445 , load 26"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));}
                    else if(tn.equals("728 isd-kln") && (ln.equals(65)) && ld<26){
                        w4 = w3-(ts+tst +250);
                        w5 = w4/60;
                        w6 = w4 %60;
                        lp1 = 26 -ld;
                        lpr =Math.floor((3.0/80.0)*lp1*205);
                        dr =Math.floor( (w4*20.0)/60);
                        sr =Math.floor( (ts*30.0)/60);
                        tr =Math.floor(445+sr + dr-lpr) ;
                        tv1.setText(String.valueOf( "R/T  04:10 ,Ration  445 , load 26"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));}
                    else if(tn.equals("728 isd-kln") && (ln.equals(65)) && ld==26){
                        w4 = w3-(ts+tst +250);
                        w5 = w4/60;
                        w6 = w4 %60;
                        dr =Math.ceil( (w4*20.0)/60);
                        sr =Math.ceil( (ts*30.0)/60);
                        tr =Math.ceil(445+sr + dr) ;
                        tv1.setText(String.valueOf( "R/T  04:10  ,Ration  445 , load 26"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));}
                    else if(tn.equals("761 kln-isd") && (ln.equals(66)) && ld>22){
                        w4 = w3-(ts+tst +255);
                        w5 = w4/60;
                        w6 = w4 %60;
                        lp1 = ld-22;
                        lpr =Math.ceil((4.0/80.0)*lp1*205);
                        dr =Math.ceil( (w4*20.0)/60);
                        sr =Math.ceil( (ts*30.0)/60);
                        tr =Math.ceil(540+sr + dr+lpr) ;
                        tv1.setText(String.valueOf( "R/T  04:15  ,Ration  540 , load 22"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));}
                    else if(tn.equals("761 kln-isd") && (ln.equals(66)) && ld<22){
                        w4 = w3-(ts+tst +255);
                        w5 = w4/60;
                        w6 = w4 %60;
                        lp1 = 22 -ld;
                        lpr =Math.floor((3.0/80.0)*lp1*205);
                        dr =Math.floor( (w4*20.0)/60);
                        sr =Math.floor( (ts*30.0)/60);
                        tr =Math.floor(540+sr + dr-lpr) ;
                        tv1.setText(String.valueOf( "R/T  04:15 ,Ration  540 , load 22"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));}
                    else if(tn.equals("761 kln-isd") && (ln.equals(66)) && ld==22){
                        w4 = w3-(ts+tst +255);
                        w5 = w4/60;
                        w6 = w4 %60;
                        dr =Math.ceil( (w4*20.0)/60);
                        sr =Math.ceil( (ts*30.0)/60);
                        tr =Math.ceil(540+sr + dr) ;
                        tv1.setText(String.valueOf( "R/T  04:15  ,Ration  540 , load 22"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));}
                    else if(tn.equals("762 isd-kln") && (ln.equals(66)) && ld>22){
                        w4 = w3-(ts+tst +290);
                        w5 = w4/60;
                        w6 = w4 %60;
                        lp1 = ld-22;
                        lpr =Math.ceil((4.0/80.0)*lp1*205);
                        dr =Math.ceil( (w4*20.0)/60);
                        sr =Math.ceil( (ts*30.0)/60);
                        tr =Math.ceil(550+sr + dr+lpr) ;
                        tv1.setText(String.valueOf( "R/T  04:50  ,Ration  550 , load 22"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));}
                    else if(tn.equals("762 isd-kln") && (ln.equals(66)) && ld<22){
                        w4 = w3-(ts+tst +290);
                        w5 = w4/60;
                        w6 = w4 %60;
                        lp1 = 22 -ld;
                        lpr =Math.floor((3.0/80.0)*lp1*205);
                        dr =Math.floor( (w4*20.0)/60);
                        sr =Math.floor( (ts*30.0)/60);
                        tr =Math.floor(550+sr + dr-lpr) ;
                        tv1.setText(String.valueOf( "R/T  04:50 ,Ration  550 , load 22"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));}
                    else if(tn.equals("762 isd-kln") && (ln.equals(66)) && ld==22){
                        w4 = w3-(ts+tst +290);
                        w5 = w4/60;
                        w6 = w4 %60;
                        dr =Math.ceil( (w4*20.0)/60);
                        sr =Math.ceil( (ts*30.0)/60);
                        tr =Math.ceil(550+sr + dr) ;
                        tv1.setText(String.valueOf( "R/T  04:50  ,Ration  550 , load 22"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));}
                    else if(tn.equals("754 rjhi-da") && (ln.equals(66)) && ld>28){
                        w4 = w3-(ts+tst +340);
                        w5 = w4/60;
                        w6 = w4 %60;
                        lp1 = ld-28;
                        lpr =Math.ceil((8.0/80.0)*lp1*263);
                        dr =Math.ceil( (w4*20.0)/60);
                        sr =Math.ceil( (ts*30.0)/60);
                        tr =Math.ceil(920+sr + dr+lpr) ;
                        tv1.setText(String.valueOf( "R/T  05:40  ,Ration  920 , load 28"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));}
                    else if(tn.equals("754 rjhi-da") && (ln.equals(66)) && ld<28){
                        w4 = w3-(ts+tst +340);
                        w5 = w4/60;
                        w6 = w4 %60;
                        lp1 = 28 -ld;
                        lpr =Math.floor((6.0/80.0)*lp1*263);
                        dr =Math.floor( (w4*20.0)/60);
                        sr =Math.floor( (ts*30.0)/60);
                        tr =Math.floor(920+sr + dr-lpr) ;
                        tv1.setText(String.valueOf( "R/T  05:40 ,Ration  920 , load 28"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));}
                    else if(tn.equals("754 rjhi-da") && (ln.equals(66)) && ld==28){
                        w4 = w3-(ts+tst +340);
                        w5 = w4/60;
                        w6 = w4 %60;
                        dr =Math.ceil( (w4*20.0)/60);
                        sr =Math.ceil( (ts*30.0)/60);
                        tr =Math.ceil(920+sr + dr) ;
                        tv1.setText(String.valueOf( "R/T  05:40  ,Ration  920 , load 28"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));}
                    else if(tn.equals("764 da-isd") && (ln.equals(66)) && ld>26){
                        w4 = w3-(ts+tst +285);
                        w5 = w4/60;
                        w6 = w4 %60;
                        lp1 = ld-26;
                        lpr =Math.ceil((4.0/80.0)*lp1*208);
                        dr =Math.ceil( (w4*20.0)/60);
                        sr =Math.ceil( (ts*30.0)/60);
                        tr =Math.ceil(597+sr + dr+lpr) ;
                        tv1.setText(String.valueOf( "R/T  04:45  ,Ration  597 , load 26"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));}
                    else if(tn.equals("764 da-isd") && (ln.equals(66)) && ld<26){
                        w4 = w3-(ts+tst +285);
                        w5 = w4/60;
                        w6 = w4 %60;
                        lp1 = 26 -ld;
                        lpr =Math.floor((3.0/80.0)*lp1*208);
                        dr =Math.floor( (w4*20.0)/60);
                        sr =Math.floor( (ts*30.0)/60);
                        tr =Math.floor(597+sr + dr-lpr) ;
                        tv1.setText(String.valueOf( "R/T  04:45 ,Ration  597 , load 26"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));}
                    else if(tn.equals("764 da-isd") && (ln.equals(66)) && ld==26){
                        w4 = w3-(ts+tst +285);
                        w5 = w4/60;
                        w6 = w4 %60;
                        dr =Math.ceil( (w4*20.0)/60);
                        sr =Math.ceil( (ts*30.0)/60);
                        tr =Math.ceil(597+sr + dr) ;
                        tv1.setText(String.valueOf( "R/T  04:45  ,Ration  597 , load 26"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));}
                    else if(tn.equals("756 isd-rb") && (ln.equals(66)) && ld>24){
                        w4 = w3-(ts+tst +165);
                        w5 = w4/60;
                        w6 = w4 %60;
                        lp1 = ld-24;
                        lpr =Math.ceil((8.0/80.0)*lp1*103);
                        dr =Math.ceil( (w4*20.0)/60);
                        sr =Math.ceil( (ts*30.0)/60);
                        tr =Math.ceil(330+sr + dr+lpr) ;
                        tv1.setText(String.valueOf( "R/T  02:45  ,Ration  330 , load 24"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));}
                    else if(tn.equals("756 isd-rb") && (ln.equals(66)) && ld<24){
                        w4 = w3-(ts+tst +165);
                        w5 = w4/60;
                        w6 = w4 %60;
                        lp1 = 24 -ld;
                        lpr =Math.floor((6.0/80.0)*lp1*103);
                        dr =Math.floor( (w4*20.0)/60);
                        sr =Math.floor( (ts*30.0)/60);
                        tr =Math.floor(330+sr + dr-lpr) ;
                        tv1.setText(String.valueOf( "R/T  02:45 ,Ration  330 , load 24"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));}
                    else if(tn.equals("756 isd-rb") && (ln.equals(66)) && ld==24){
                        w4 = w3-(ts+tst +165);
                        w5 = w4/60;
                        w6 = w4 %60;
                        dr =Math.ceil( (w4*20.0)/60);
                        sr =Math.ceil( (ts*30.0)/60);
                        tr =Math.ceil(330+sr + dr) ;
                        tv1.setText(String.valueOf( "R/T  02:45  ,Ration  330 , load 24"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));}
                    else if(tn.equals("755 rb-isd") && (ln.equals(66)) && ld>24){
                        w4 = w3-(ts+tst +170);
                        w5 = w4/60;
                        w6 = w4 %60;
                        lp1 = ld-24;
                        lpr =Math.ceil((8.0/80.0)*lp1*103);
                        dr =Math.ceil( (w4*20.0)/60);
                        sr =Math.ceil( (ts*30.0)/60);
                        tr =Math.ceil(340+sr + dr+lpr) ;
                        tv1.setText(String.valueOf( "R/T  02:50  ,Ration  340 , load 24"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));}
                    else if(tn.equals("755 rb-isd") && (ln.equals(66)) && ld<24){
                        w4 = w3-(ts+tst +170);
                        w5 = w4/60;
                        w6 = w4 %60;
                        lp1 = 24 -ld;
                        lpr =Math.floor((6.0/80.0)*lp1*103);
                        dr =Math.floor( (w4*20.0)/60);
                        sr =Math.floor( (ts*30.0)/60);
                        tr =Math.floor(340+sr + dr-lpr) ;
                        tv1.setText(String.valueOf( "R/T  02:50 ,Ration  340 , load 24"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));}

                    else if(tn.equals("755 rb-isd") && (ln.equals(66)) && ld==24){
                        w4 = w3-(ts+tst +170);
                        w5 = w4/60;
                        w6 = w4 %60;
                        dr =Math.ceil( (w4*20.0)/60);
                        sr =Math.ceil( (ts*30.0)/60);
                        tr =Math.ceil(340+sr + dr) ;
                        tv1.setText(String.valueOf( "R/T  02:50  ,Ration  340 , load 24"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));}
                    else if(tn.equals("763 isd-da") && (ln.equals(66)) && ld>26){
                        w4 = w3-(ts+tst +280);
                        w5 = w4/60;
                        w6 = w4 %60;
                        lp1 = ld-26;
                        lpr =Math.ceil((4.0/80.0)*lp1*208);
                        dr =Math.ceil( (w4*20.0)/60);
                        sr =Math.ceil( (ts*30.0)/60);
                        tr =Math.ceil(595+sr + dr+lpr) ;
                        tv1.setText(String.valueOf( "R/T  04:40  ,Ration  595 , load 26"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));}
                    else if(tn.equals("763 isd-da") && (ln.equals(66)) && ld<26){
                        w4 = w3-(ts+tst +280);
                        w5 = w4/60;
                        w6 = w4 %60;
                        lp1 = 26 -ld;
                        lpr =Math.floor((3.0/80.0)*lp1*208);
                        dr =Math.floor( (w4*20.0)/60);
                        sr =Math.floor( (ts*30.0)/60);
                        tr =Math.floor(595+sr + dr-lpr) ;
                        tv1.setText(String.valueOf( "R/T  04:40 ,Ration  595 , load 26"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));}
                    else if(tn.equals("763 isd-da") && (ln.equals(66)) && ld==26){
                        w4 = w3-(ts+tst +280);
                        w5 = w4/60;
                        w6 = w4 %60;
                        dr =Math.ceil( (w4*20.0)/60);
                        sr =Math.ceil( (ts*30.0)/60);
                        tr =Math.ceil(595+sr + dr) ;
                        tv1.setText(String.valueOf( "R/T  04:40  ,Ration  595 , load 26"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));}
                    else if(tn.equals("753 da-rjhi") && (ln.equals(66)) && ld>28){
                        w4 = w3-(ts+tst +350);
                        w5 = w4/60;
                        w6 = w4 %60;
                        lp1 = ld-28;
                        lpr =Math.ceil((8.0/80.0)*lp1*263);
                        dr =Math.ceil( (w4*20.0)/60);
                        sr =Math.ceil( (ts*30.0)/60);
                        tr =Math.ceil(910+sr + dr+lpr) ;
                        tv1.setText(String.valueOf( "R/T  05:50  ,Ration  910 , load 28"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));}
                    else if(tn.equals("753 da-rjhi") && (ln.equals(66)) && ld<28){
                        w4 = w3-(ts+tst +350);
                        w5 = w4/60;
                        w6 = w4 %60;
                        lp1 = 28 -ld;
                        lpr =Math.floor((6.0/80.0)*lp1*263);
                        dr =Math.floor( (w4*20.0)/60);
                        sr =Math.floor( (ts*30.0)/60);
                        tr =Math.floor(910+sr + dr-lpr) ;
                        tv1.setText(String.valueOf( "R/T  05:50 ,Ration  910 , load 28"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));}
                    else if(tn.equals("753 da-rjhi") && (ln.equals(66)) && ld==28){
                        w4 = w3-(ts+tst +350);
                        w5 = w4/60;
                        w6 = w4 %60;
                        dr =Math.ceil( (w4*20.0)/60);
                        sr =Math.ceil( (ts*30.0)/60);
                        tr =Math.ceil(910+sr + dr) ;
                        tv1.setText(String.valueOf( "R/T  05:50  ,Ration  910 , load 28"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));}
                    else if(tn.equals("756 rjhi-isd") && (ln.equals(65)) && ld>24){
                        w4 = w3-(ts+tst +60);
                        w5 = w4/60;
                        w6 = w4 %60;
                        lp1 = ld-24;
                        lpr =Math.ceil((8.0/80.0)*lp1*59);
                        dr =Math.ceil( (w4*20.0)/60);
                        sr =Math.ceil( (ts*30.0)/60);
                        tr =Math.ceil(120+sr + dr+lpr) ;
                        tv1.setText(String.valueOf( "R/T  05:50  ,Ration  120 , load 24"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));}
                    else if(tn.equals("756 rjhi-isd") && (ln.equals(65)) && ld<24){
                        w4 = w3-(ts+tst +60);
                        w5 = w4/60;
                        w6 = w4 %60;
                        lp1 = 24 -ld;
                        lpr =Math.floor((6.0/80.0)*lp1*59);
                        dr =Math.floor( (w4*20.0)/60);
                        sr =Math.floor( (ts*30.0)/60);
                        tr =Math.floor(120+sr + dr-lpr) ;
                        tv1.setText(String.valueOf( "R/T  05:50 ,Ration  120 , load 24"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));}
                    else if(tn.equals("756 rjhi-isd") && (ln.equals(65)) && ld==24){
                        w4 = w3-(ts+tst +60);
                        w5 = w4/60;
                        w6 = w4 %60;
                        dr =Math.ceil( (w4*20.0)/60);
                        sr =Math.ceil( (ts*30.0)/60);
                        tr =Math.ceil(120+sr + dr) ;
                        tv1.setText(String.valueOf( "R/T  05:50  ,Ration  120 , load 24"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));}
                    else if(tn.equals("756 rjhi-isd") && (ln.equals(66)) && ld>24){
                        w4 = w3-(ts+tst +60);
                        w5 = w4/60;
                        w6 = w4 %60;
                        lp1 = ld-24;
                        lpr =Math.ceil((4.0/80.0)*lp1*59);
                        dr =Math.ceil( (w4*20.0)/60);
                        sr =Math.ceil( (ts*30.0)/60);
                        tr =Math.ceil(170+sr + dr+lpr) ;
                        tv1.setText(String.valueOf( "R/T  05:50  ,Ration  170 , load 24"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));}
                    else if(tn.equals("756 rjhi-isd") && (ln.equals(66)) && ld<24){
                        w4 = w3-(ts+tst +60);
                        w5 = w4/60;
                        w6 = w4 %60;
                        lp1 = 24 -ld;
                        lpr =Math.floor((3.0/80.0)*lp1*59);
                        dr =Math.floor( (w4*20.0)/60);
                        sr =Math.floor( (ts*30.0)/60);
                        tr =Math.floor(170+sr + dr-lpr) ;
                        tv1.setText(String.valueOf( "R/T  05:50 ,Ration  170 , load 24"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));}
                    else if(tn.equals("756 rjhi-isd") && (ln.equals(66)) && ld==24){
                        w4 = w3-(ts+tst +60);
                        w5 = w4/60;
                        w6 = w4 %60;
                        dr =Math.ceil( (w4*20.0)/60);
                        sr =Math.ceil( (ts*30.0)/60);
                        tr =Math.ceil(170+sr + dr) ;
                        tv1.setText(String.valueOf( "R/T  05:50  ,Ration  170 , load 24"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));}
                    else if(tn.equals("784 isd-gplj") && (ln.equals(65)) && ld>18){
                        w4 = w3-(ts+tst +350);
                        w5 = w4/60;
                        w6 = w4 %60;
                        lp1 = ld-18;
                        lpr =Math.ceil((4.0/80.0)*lp1*212);
                        dr =Math.ceil( (w4*20.0)/60);
                        sr =Math.ceil( (ts*30.0)/60);
                        tr =Math.ceil(535+sr + dr+lpr) ;
                        tv1.setText(String.valueOf( "R/T  05:50  ,Ration  535 , load 18"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));}
                    else if(tn.equals("784 isd-gplj") && (ln.equals(65)) && ld<18){
                        w4 = w3-(ts+tst +350);
                        w5 = w4/60;
                        w6 = w4 %60;
                        lp1 = 18 -ld;
                        lpr =Math.floor((3.0/80.0)*lp1*212);
                        dr =Math.floor( (w4*20.0)/60);
                        sr =Math.floor( (ts*30.0)/60);
                        tr =Math.floor(535+sr + dr-lpr) ;
                        tv1.setText(String.valueOf( "R/T  05:50 ,Ration  535 , load 18"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));}
                    else if(tn.equals("784 isd-gplj") && (ln.equals(65)) && ld==18){
                        w4 = w3-(ts+tst +350);
                        w5 = w4/60;
                        w6 = w4 %60;
                        dr =Math.ceil( (w4*20.0)/60);
                        sr =Math.ceil( (ts*30.0)/60);
                        tr =Math.ceil(535+sr + dr) ;
                        tv1.setText(String.valueOf( "R/T  05:50  ,Ration  535 , load 18"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));}
                    else if(tn.equals("783 gplj-isd") && (ln.equals(65)) && ld>18){
                        w4 = w3-(ts+tst +320);
                        w5 = w4/60;
                        w6 = w4 %60;
                        lp1 = ld-18;
                        lpr =Math.ceil((4.0/80.0)*lp1*212);
                        dr =Math.ceil( (w4*20.0)/60);
                        sr =Math.ceil( (ts*30.0)/60);
                        tr =Math.ceil(525+sr + dr+lpr) ;
                        tv1.setText(String.valueOf( "R/T  05:20  ,Ration  525 , load 18"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));}
                    else if(tn.equals("783 gplj-isd") && (ln.equals(65)) && ld<18){
                        w4 = w3-(ts+tst +320);
                        w5 = w4/60;
                        w6 = w4 %60;
                        lp1 = 18 -ld;
                        lpr =Math.floor((3.0/80.0)*lp1*212);
                        dr =Math.floor( (w4*20.0)/60);
                        sr =Math.floor( (ts*30.0)/60);
                        tr =Math.floor(525+sr + dr-lpr) ;
                        tv1.setText(String.valueOf( "R/T  05:20 ,Ration  525 , load 18"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));}
                    else if(tn.equals("783 gplj-isd") && (ln.equals(65)) && ld==18){
                        w4 = w3-(ts+tst +320);
                        w5 = w4/60;
                        w6 = w4 %60;
                        dr =Math.ceil( (w4*20.0)/60);
                        sr =Math.ceil( (ts*30.0)/60);
                        tr =Math.ceil(525+sr + dr) ;
                        tv1.setText(String.valueOf( "R/T  05:20  ,Ration  525 , load 18"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));}
                    else if(tn.equals("715 isd-rjhi") && (ln.equals(65)) && ld>22){
                        w4 = w3-(ts+tst +60);
                        w5 = w4/60;
                        w6 = w4 %60;
                        lp1 = ld-22;
                        lpr =Math.ceil((4.0/80.0)*lp1*59);
                        dr =Math.ceil( (w4*20.0)/60);
                        sr =Math.ceil( (ts*30.0)/60);
                        tr =Math.ceil(140+sr + dr+lpr) ;
                        tv1.setText(String.valueOf( "R/T  01:00  ,Ration  140 , load 22"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));}
                    else if(tn.equals("715 isd-rjhi") && (ln.equals(65)) && ld<22){
                        w4 = w3-(ts+tst +60);
                        w5 = w4/60;
                        w6 = w4 %60;
                        lp1 = 22 -ld;
                        lpr =Math.floor((3.0/80.0)*lp1*59);
                        dr =Math.floor( (w4*20.0)/60);
                        sr =Math.floor( (ts*30.0)/60);
                        tr =Math.floor(140+sr + dr-lpr) ;
                        tv1.setText(String.valueOf( "R/T  01:00 ,Ration  140 , load 22"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));}
                    else if(tn.equals("715 isd-rjhi") && (ln.equals(65)) && ld==22){
                        w4 = w3-(ts+tst +60);
                        w5 = w4/60;
                        w6 = w4 %60;
                        dr =Math.ceil( (w4*20.0)/60);
                        sr =Math.ceil( (ts*30.0)/60);
                        tr =Math.ceil(140+sr + dr) ;
                        tv1.setText(String.valueOf( "R/T  01:00  ,Ration  140 , load 22"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));}
                    else if(tn.equals("715 isd-rjhi") && (ln.equals(66)) && ld>22){
                        w4 = w3-(ts+tst +60);
                        w5 = w4/60;
                        w6 = w4 %60;
                        lp1 = ld-22;
                        lpr =Math.ceil((4.0/80.0)*lp1*59);
                        dr =Math.ceil( (w4*20.0)/60);
                        sr =Math.ceil( (ts*30.0)/60);
                        tr =Math.ceil(148+sr + dr+lpr) ;
                        tv1.setText(String.valueOf( "R/T  01:00  ,Ration  148 , load 22"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));}
                    else if(tn.equals("715 isd-rjhi") && (ln.equals(66)) && ld<22){
                        w4 = w3-(ts+tst +60);
                        w5 = w4/60;
                        w6 = w4 %60;
                        lp1 = 22 -ld;
                        lpr =Math.floor((3.0/80.0)*lp1*59);
                        dr =Math.floor( (w4*20.0)/60);
                        sr =Math.floor( (ts*30.0)/60);
                        tr =Math.floor(148+sr + dr-lpr) ;
                        tv1.setText(String.valueOf( "R/T  01:00 ,Ration  148 , load 22"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));}
                    else if(tn.equals("715 isd-rjhi") && (ln.equals(66)) && ld==22){
                        w4 = w3-(ts+tst +60);
                        w5 = w4/60;
                        w6 = w4 %60;
                        dr =Math.ceil( (w4*20.0)/60);
                        sr =Math.ceil( (ts*30.0)/60);
                        tr =Math.ceil(148+sr + dr) ;
                        tv1.setText(String.valueOf( "R/T  01:00  ,Ration  148 , load 22"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));}
                    else if(tn.equals("770 rjhi-da") && (ln.equals(66)) && ld>28){
                        w4 = w3-(ts+tst +340);
                        w5 = w4/60;
                        w6 = w4 %60;
                        lp1 = ld-28;
                        lpr =Math.ceil((8.0/80.0)*lp1*263);
                        dr =Math.ceil( (w4*20.0)/60);
                        sr =Math.ceil( (ts*30.0)/60);
                        tr =Math.ceil(900+sr + dr+lpr) ;
                        tv1.setText(String.valueOf( "R/T  05:40  ,Ration  900 , load 28"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));}
                    else if(tn.equals("770 rjhi-da") && (ln.equals(66)) && ld<28){
                        w4 = w3-(ts+tst +340);
                        w5 = w4/60;
                        w6 = w4 %60;
                        lp1 = 28 -ld;
                        lpr =Math.floor((6.0/80.0)*lp1*263);
                        dr =Math.floor( (w4*20.0)/60);
                        sr =Math.floor( (ts*30.0)/60);
                        tr =Math.floor(900+sr + dr-lpr) ;
                        tv1.setText(String.valueOf( "R/T  05:40 ,Ration  900 , load 28"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));}
                    else if(tn.equals("770 rjhi-da") && (ln.equals(66)) && ld==28){
                        w4 = w3-(ts+tst +340);
                        w5 = w4/60;
                        w6 = w4 %60;
                        dr =Math.ceil( (w4*20.0)/60);
                        sr =Math.ceil( (ts*30.0)/60);
                        tr =Math.ceil(900+sr + dr) ;
                        tv1.setText(String.valueOf( "R/T  05:40  ,Ration  900 , load 28"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));}
                    else if(tn.equals("776 da-sjyb") && (ln.equals(65)) && ld>24){
                        w4 = w3-(ts+tst +265);
                        w5 = w4/60;
                        w6 = w4 %60;
                        lp1 = ld-24;
                        lpr =Math.ceil((4.0/80.0)*lp1*149);
                        dr =Math.ceil( (w4*20.0)/60);
                        sr =Math.ceil( (ts*30.0)/60);
                        tr =Math.ceil(378+sr + dr+lpr) ;
                        tv1.setText(String.valueOf( "R/T  04:25  ,Ration  378 , load 24"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));}
                    else if(tn.equals("776 da-sjyb") && (ln.equals(65)) && ld<24){
                        w4 = w3-(ts+tst +265);
                        w5 = w4/60;
                        w6 = w4 %60;
                        lp1 = 24 -ld;
                        lpr =Math.floor((3.0/80.0)*lp1*149);
                        dr =Math.floor( (w4*20.0)/60);
                        sr =Math.floor( (ts*30.0)/60);
                        tr =Math.floor(378+sr + dr-lpr) ;
                        tv1.setText(String.valueOf( "R/T  04:25 ,Ration  378 , load 24"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));}
                    else if(tn.equals("776 da-sjyb") && (ln.equals(65)) && ld==24){
                        w4 = w3-(ts+tst +265);
                        w5 = w4/60;
                        w6 = w4 %60;
                        dr =Math.ceil( (w4*20.0)/60);
                        sr =Math.ceil( (ts*30.0)/60);
                        tr =Math.ceil(378+sr + dr) ;
                        tv1.setText(String.valueOf( "R/T  04:25  ,Ration  378 , load 24"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));}
                    else if(tn.equals("775 sjyb-da") && (ln.equals(65)) && ld>24){
                        w4 = w3-(ts+tst +260);
                        w5 = w4/60;
                        w6 = w4 %60;
                        lp1 = ld-24;
                        lpr =Math.ceil((4.0/80.0)*lp1*149);
                        dr =Math.ceil( (w4*20.0)/60);
                        sr =Math.ceil( (ts*30.0)/60);
                        tr =Math.ceil(370+sr + dr+lpr) ;
                        tv1.setText(String.valueOf( "R/T  04:20  ,Ration  370 , load 24"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));}
                    else if(tn.equals("775 sjyb-da") && (ln.equals(65)) && ld<24){
                        w4 = w3-(ts+tst +260);
                        w5 = w4/60;
                        w6 = w4 %60;
                        lp1 = 24 -ld;
                        lpr =Math.floor((3.0/80.0)*lp1*149);
                        dr =Math.floor( (w4*20.0)/60);
                        sr =Math.floor( (ts*30.0)/60);
                        tr =Math.floor(370+sr + dr-lpr) ;
                        tv1.setText(String.valueOf( "R/T  04:20 ,Ration  370 , load 24"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));}
                    else if(tn.equals("775 sjyb-da") && (ln.equals(65)) && ld==24){
                        w4 = w3-(ts+tst +260);
                        w5 = w4/60;
                        w6 = w4 %60;
                        dr =Math.ceil( (w4*20.0)/60);
                        sr =Math.ceil( (ts*30.0)/60);
                        tr =Math.ceil(370+sr + dr) ;
                        tv1.setText(String.valueOf( "R/T  04:20  ,Ration  370 , load 24"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));}
                    else if(tn.equals("769 da-rjhi") && (ln.equals(66)) && ld>28){
                        w4 = w3-(ts+tst +340);
                        w5 = w4/60;
                        w6 = w4 %60;
                        lp1 = ld-28;
                        lpr =Math.ceil((8.0/80.0)*lp1*263);
                        dr =Math.ceil( (w4*20.0)/60);
                        sr =Math.ceil( (ts*30.0)/60);
                        tr =Math.ceil(905+sr + dr+lpr) ;
                        tv1.setText(String.valueOf( "R/T  05:40  ,Ration  905 , load 28"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));}
                    else if(tn.equals("769 da-rjhi") && (ln.equals(66)) && ld<28){
                        w4 = w3-(ts+tst +340);
                        w5 = w4/60;
                        w6 = w4 %60;
                        lp1 = 28 -ld;
                        lpr =Math.floor((6.0/80.0)*lp1*263);
                        dr =Math.floor( (w4*20.0)/60);
                        sr =Math.floor( (ts*30.0)/60);
                        tr =Math.floor(905+sr + dr-lpr) ;
                        tv1.setText(String.valueOf( "R/T  05:40 ,Ration  905 , load 28"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));}
                    else if(tn.equals("769 da-rjhi") && (ln.equals(66)) && ld==28){
                        w4 = w3-(ts+tst +340);
                        w5 = w4/60;
                        w6 = w4 %60;
                        dr =Math.ceil( (w4*20.0)/60);
                        sr =Math.ceil( (ts*30.0)/60);
                        tr =Math.ceil(905+sr + dr) ;
                        tv1.setText(String.valueOf( "R/T  05:40  ,Ration  905 , load 28"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                    }
                    else if(tn.equals("779 dhcr-isdb") && (ln.equals(65)) && ld>14){
                        w4 = w3-(ts+tst +125);
                        w5 = w4/60;
                        w6 = w4 %60;
                        lp1 = ld-14;
                        lpr =Math.ceil((4.0/80.0)*lp1*80);
                        dr =Math.ceil( (w4*20.0)/60);
                        sr =Math.ceil( (ts*30.0)/60);
                        tr =Math.ceil(165+sr + dr+lpr) ;
                        tv1.setText(String.valueOf( "R/T  02:05  ,Ration  165 , load 14"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));}
                    else if(tn.equals("779 dhcr-isdb") && (ln.equals(65)) && ld<14){
                        w4 = w3-(ts+tst +125);
                        w5 = w4/60;
                        w6 = w4 %60;
                        lp1 = 14 -ld;
                        lpr =Math.floor((3.0/80.0)*lp1*80);
                        dr =Math.floor( (w4*20.0)/60);
                        sr =Math.floor( (ts*30.0)/60);
                        tr =Math.floor(165+sr + dr-lpr) ;
                        tv1.setText(String.valueOf( "R/T  02:05 ,Ration  165 , load 14"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));}
                    else if(tn.equals("779 dhcr-isdb") && (ln.equals(65)) && ld==14){
                        w4 = w3-(ts+tst +125);
                        w5 = w4/60;
                        w6 = w4 %60;
                        dr =Math.ceil( (w4*20.0)/60);
                        sr =Math.ceil( (ts*30.0)/60);
                        tr =Math.ceil(165+sr + dr) ;
                        tv1.setText(String.valueOf( "R/T  02:05  ,Ration  165 , load 14"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                    }
                    else if(tn.equals("779 isdb-cnbj") && (ln.equals(65)) && ld>14){
                        w4 = w3-(ts+tst +162);
                        w5 = w4/60;
                        w6 = w4 %60;
                        lp1 = ld-14;
                        lpr =Math.ceil((4.0/80.0)*lp1*105);
                        dr =Math.ceil( (w4*20.0)/60);
                        sr =Math.ceil( (ts*30.0)/60);
                        tr =Math.ceil(230+sr + dr+lpr) ;
                        tv1.setText(String.valueOf( "R/T  02:42  ,Ration  230 , load 14"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));}
                    else if(tn.equals("779 isdb-cnbj") && (ln.equals(65)) && ld<14){
                        w4 = w3-(ts+tst +162);
                        w5 = w4/60;
                        w6 = w4 %60;
                        lp1 = 14 -ld;
                        lpr =Math.floor((3.0/80.0)*lp1*105);
                        dr =Math.floor( (w4*20.0)/60);
                        sr =Math.floor( (ts*30.0)/60);
                        tr =Math.floor(230+sr + dr-lpr) ;
                        tv1.setText(String.valueOf( "R/T  02:42 ,Ration  230 , load 14"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));}
                    else if(tn.equals("779 isdb-cnbj") && (ln.equals(65)) && ld==14){
                        w4 = w3-(ts+tst +162);
                        w5 = w4/60;
                        w6 = w4 %60;
                        dr =Math.ceil( (w4*20.0)/60);
                        sr =Math.ceil( (ts*30.0)/60);
                        tr =Math.ceil(230+sr + dr) ;
                        tv1.setText(String.valueOf( "R/T  02:42  ,Ration  230 , load 14"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                    }
                    else if(tn.equals("780 isdb-dhcr") && (ln.equals(65)) && ld>14){
                        w4 = w3-(ts+tst +135);
                        w5 = w4/60;
                        w6 = w4 %60;
                        lp1 = ld-14;
                        lpr =Math.ceil((4.0/80.0)*lp1*80);
                        dr =Math.ceil( (w4*20.0)/60);
                        sr =Math.ceil( (ts*30.0)/60);
                        tr =Math.ceil(175+sr + dr+lpr) ;
                        tv1.setText(String.valueOf( "R/T  02:15  ,Ration  175 , load 14"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));}
                    else if(tn.equals("780 isdb-dhcr") && (ln.equals(65)) && ld<14){
                        w4 = w3-(ts+tst +135);
                        w5 = w4/60;
                        w6 = w4 %60;
                        lp1 = 14 -ld;
                        lpr =Math.floor((3.0/80.0)*lp1*80);
                        dr =Math.floor( (w4*20.0)/60);
                        sr =Math.floor( (ts*30.0)/60);
                        tr =Math.floor(175+sr + dr-lpr) ;
                        tv1.setText(String.valueOf( "R/T  02:15 ,Ration  175 , load 14"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));}
                    else if(tn.equals("780 isdb-dhcr") && (ln.equals(65)) && ld==14){
                        w4 = w3-(ts+tst +135);
                        w5 = w4/60;
                        w6 = w4 %60;
                        dr =Math.ceil( (w4*20.0)/60);
                        sr =Math.ceil( (ts*30.0)/60);
                        tr =Math.ceil(175+sr + dr) ;
                        tv1.setText(String.valueOf( "R/T  02:15  ,Ration  175 , load 14"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                    }
                    else if(tn.equals("780 cnbj-isdb") && (ln.equals(65)) && ld>14){
                        w4 = w3-(ts+tst +175);
                        w5 = w4/60;
                        w6 = w4 %60;
                        lp1 = ld-14;
                        lpr =Math.ceil((4.0/80.0)*lp1*105);
                        dr =Math.ceil( (w4*20.0)/60);
                        sr =Math.ceil( (ts*30.0)/60);
                        tr =Math.ceil(235+sr + dr+lpr) ;
                        tv1.setText(String.valueOf( "R/T  02:55  ,Ration  235 , load 14"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));}
                    else if(tn.equals("780 cnbj-isdb") && (ln.equals(65)) && ld<14){
                        w4 = w3-(ts+tst +175);
                        w5 = w4/60;
                        w6 = w4 %60;
                        lp1 = 14 -ld;
                        lpr =Math.floor((3.0/80.0)*lp1*105);
                        dr =Math.floor( (w4*20.0)/60);
                        sr =Math.floor( (ts*30.0)/60);
                        tr =Math.floor(235+sr + dr-lpr) ;
                        tv1.setText(String.valueOf( "R/T  02:55 ,Ration  235 , load 14"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));}
                    else if(tn.equals("780 cnbj-isdb") && (ln.equals(65)) && ld==14){
                        w4 = w3-(ts+tst +175);
                        w5 = w4/60;
                        w6 = w4 %60;
                        dr =Math.ceil( (w4*20.0)/60);
                        sr =Math.ceil( (ts*30.0)/60);
                        tr =Math.ceil(235+sr + dr) ;
                        tv1.setText(String.valueOf( "R/T  02:55  ,Ration  235 , load 14"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));}
                    else if((tn.equals("774 er sjyb-isd")|| tn.equals("er isd-sijb")) && (ln.equals(65)) && ld>20){
                        w4 = w3-(ts+tst +100);
                        w5 = w4/60;
                        w6 = w4 %60;
                        lp1 = ld-20;
                        lpr =Math.ceil((4.0/80.0)*lp1*81);
                        dr =Math.ceil( (w4*20.0)/60);
                        sr =Math.ceil( (ts*30.0)/60);
                        tr =Math.ceil(170+sr + dr+lpr) ;
                        tv1.setText(String.valueOf( "R/T  01:40  ,Ration  170 , load 20"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));}
                    else if((tn.equals("774 er sjyb-isd")|| tn.equals("775 er isd-sijb")) && (ln.equals(65)) && ld<20){
                        w4 = w3-(ts+tst +100);
                        w5 = w4/60;
                        w6 = w4 %60;
                        lp1 = 20 -ld;
                        lpr =Math.floor((3.0/80.0)*lp1*81);
                        dr =Math.floor( (w4*20.0)/60);
                        sr =Math.floor( (ts*30.0)/60);
                        tr =Math.floor(170+sr + dr-lpr) ;
                        tv1.setText(String.valueOf( "R/T  01:40 ,Ration  170 , load 20"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));}
                    else if((tn.equals("774 er sjyb-isd")|| tn.equals("775 er isd-sijb")) && (ln.equals(65)) && ld==20){
                        w4 = w3-(ts+tst +100);
                        w5 = w4/60;
                        w6 = w4 %60;
                        dr =Math.ceil( (w4*20.0)/60);
                        sr =Math.ceil( (ts*30.0)/60);
                        tr =Math.ceil(170+sr + dr) ;
                        tv1.setText(String.valueOf( "R/T  01:10  ,Ration  170 , load 20"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));}
                    else if(tn.equals("1-dh isd-dhcr") && (ln.equals(65)) && ld>14){
                        w4 = w3-(ts+tst +130);
                        w5 = w4/60;
                        w6 = w4 %60;
                        lp1 = ld-14;
                        lpr =Math.ceil((4.0/80.0)*lp1*84);
                        dr =Math.ceil( (w4*20.0)/60);
                        sr =Math.ceil( (ts*30.0)/60);
                        tr =Math.ceil(180+sr + dr+lpr) ;
                        tv1.setText(String.valueOf( "R/T  02:10  ,Ration  180 , load 14"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));}
                    else if(tn.equals("1-dh isd-dhcr") && (ln.equals(65)) && ld<14){
                        w4 = w3-(ts+tst +130);
                        w5 = w4/60;
                        w6 = w4 %60;
                        lp1 = 14 -ld;
                        lpr =Math.floor((3.0/80.0)*lp1*84);
                        dr =Math.floor( (w4*20.0)/60);
                        sr =Math.floor( (ts*30.0)/60);
                        tr =Math.floor(180+sr + dr-lpr) ;
                        tv1.setText(String.valueOf( "R/T  02:10 ,Ration  180 , load 14"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));}
                    else if(tn.equals("1-dh isd-dhcr") && (ln.equals(65)) && ld==14){
                        w4 = w3-(ts+tst +130);
                        w5 = w4/60;
                        w6 = w4 %60;
                        dr =Math.ceil( (w4*20.0)/60);
                        sr =Math.ceil( (ts*30.0)/60);
                        tr =Math.ceil(180+sr + dr) ;
                        tv1.setText(String.valueOf( "R/T  02:10  ,Ration  180 , load 14"));
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
                        tv7.setText("");}}}});
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
                tv7.setText("");}});}}