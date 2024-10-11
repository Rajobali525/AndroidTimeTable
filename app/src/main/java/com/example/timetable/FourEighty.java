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

public class FourEighty extends AppCompatActivity {
    private EditText ed1,ed2,ed3,ed4,ed5,ed6,ed7,ed8,ed9,ed10,ed11,dtld,kilometer,rhour,rminute;
    private Button bt1,bt2;
    private TextView tv1,tv2,tv3,tv4,tv5,tv6,tv7;

    Integer n1,n2,n3,n4,w1,w2,s1,s2,ts,sth,stm,tst,ln,w3,w4,rt,ra,w5,w6,ration,km,runninth,runningm,total;

    Double sr,dr,tr,lpr,srr,ld,dld,lp1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_four_eighty);
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
        rhour = findViewById(R.id.runningtimehourid);
        rminute = findViewById(R.id.runningtimeminuteid);

        dtld  = findViewById(R.id.determineload);
        kilometer = findViewById(R.id.kilometerid);

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
                    rhour.requestFocus();
                }
            }
            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        rhour.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(rhour.getText().toString().length()==2){
                    rminute.requestFocus();
                }
            }
            @Override
            public void afterTextChanged(Editable s) {
            }
        });  rminute.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(rminute.getText().toString().length()==2){
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
                    dtld.requestFocus();
                }
            }
            @Override
            public void afterTextChanged(Editable s) {
            }
        });
        dtld.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(dtld.getText().toString().length()==2){
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
                    kilometer.requestFocus();
                }
            }
            @Override
            public void afterTextChanged(Editable s) {
            }
        });
        kilometer.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(kilometer.getText().toString().length()==3){
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
                if (ed1.length() == 0 || ed2.length() == 0 || ed3.length() == 0 || ed4.length() == 0 || ed5.length() == 0 || ed6.length() == 0 || ed7.length() == 0 || ed8.length() == 0 || ed9.length() == 0 || ed10.length() == 0 || ed11.length() == 0 ||kilometer.length()==0 ||dtld.length()==0||rhour.length()==0||rminute.length()==0) {
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

                    ld = Double.valueOf(dtld.getText().toString().trim());
                    dld= Double.valueOf(ed10.getText().toString().trim());
                    km = Integer.valueOf(kilometer.getText().toString().trim());

                    runninth = Integer.valueOf(rhour.getText().toString().trim());
                    runningm = Integer.valueOf(rminute.getText().toString().trim());


                    ration = Integer.valueOf(ed11.getText().toString().trim());

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
                    tv1.setText(String.valueOf("Total Work " + w1 + " Hour " + w2 + " Minute "));
                    w3 = w1 * 60 + w2;
                    ts = s1 * 60 + s2;
                    tst = sth * 60 + stm;
                    total = runninth*60+   runningm;
//                    tv1.setText("Total Runnint Time :" + totalrunning);

                    if ((ln.equals(65)||ln.equals(64)||ln.equals(66)) && dld > ld) {
                        w4 = w3 - (ts + tst + total);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = dld-ld;
                        lpr = Math.ceil((4.0 / 80.0) * lp1 * km);
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil(ration + sr + dr + lpr);
                        tv2.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv3.setText(String.valueOf("Total Ration " + tr));
                        tv4.setText(String.valueOf("Shunting Ration " + sr));
                        tv5.setText(String.valueOf(" Detention Ration " + dr));
                        tv6.setText(String.valueOf(" Load Plus " + lpr));
                    } else if ((ln.equals(64)||ln.equals(65)||ln.equals(66)) && dld < ld) {
                        w4 = w3 - (ts + tst +   total);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 =  ld-dld;
                        lpr = Math.floor((3.0 / 80.0) * lp1 * km);
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil(ration + sr + dr - lpr);
                        tv2.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv3.setText(String.valueOf("Total Ration " + tr));
                        tv4.setText(String.valueOf("Shunting Ration " + sr));
                        tv5.setText(String.valueOf(" Detention Ration " + dr));
                        tv6.setText(String.valueOf(" Load Minus " + lpr));
                    } else if ((ln.equals(64)||ln.equals(65)||ln.equals(66)) && ld.equals(dld)) {
                        w4 = w3 - (ts + tst + total);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil(ration + sr + dr);
                        tv2.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv3.setText(String.valueOf("Total Ration " + tr));
                        tv4.setText(String.valueOf("Shunting Ration " + sr));
                        tv5.setText(String.valueOf(" Detention Ration " + dr));
                        tv6.setText(String.valueOf(" Load Plus Minus Zero "));
                    }
                  else  if ((ln.equals(60)||ln.equals(61)||ln.equals(23)||ln.equals(24)||ln.equals(25)||ln.equals(26)||ln.equals(27)||ln.equals(29)||ln.equals(30)) && dld > ld) {
                        w4 = w3 - (ts + tst + total);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = dld-ld;
                        lpr = Math.ceil((4.0 / 80.0) * lp1 * km);
                        dr = Math.ceil((w4 * 9.0) / 60);
                        sr = Math.ceil((ts * 13.0) / 60);
                        tr = Math.ceil(ration + sr + dr + lpr);
                        tv2.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv3.setText(String.valueOf("Total Ration " + tr));
                        tv4.setText(String.valueOf("Shunting Ration " + sr));
                        tv5.setText(String.valueOf(" Detention Ration " + dr));
                        tv6.setText(String.valueOf(" Load Plus " + lpr));
                    }
                  else if ((ln.equals(60)||ln.equals(61)||ln.equals(23)||ln.equals(24)||ln.equals(25)||ln.equals(26)||ln.equals(27)||ln.equals(29)||ln.equals(30)) && dld < ld) {
                        w4 = w3 - (ts + tst +   total);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 =  ld-dld;
                        lpr = Math.floor((3.0 / 80.0) * lp1 * km);
                        dr = Math.ceil((w4 * 9.0) / 60);
                        sr = Math.ceil((ts * 13.0) / 60);
                        tr = Math.ceil(ration + sr + dr - lpr);
                        tv2.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv3.setText(String.valueOf("Total Ration " + tr));
                        tv4.setText(String.valueOf("Shunting Ration " + sr));
                        tv5.setText(String.valueOf(" Detention Ration " + dr));
                        tv6.setText(String.valueOf(" Load Minus " + lpr));
                    } else if ((ln.equals(60)||ln.equals(61)||ln.equals(23)||ln.equals(24)||ln.equals(25)||ln.equals(26)||ln.equals(27)||ln.equals(29)||ln.equals(30)) && ld.equals(dld)) {
                        w4 = w3 - (ts + tst + total);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        dr = Math.ceil((w4 * 9.0) / 60);
                        sr = Math.ceil((ts * 13.0) / 60);
                        tr = Math.ceil(ration + sr + dr);
                        tv2.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv3.setText(String.valueOf("Total Ration " + tr));
                        tv4.setText(String.valueOf("Shunting Ration " + sr));
                        tv5.setText(String.valueOf(" Detention Ration " + dr));
                        tv6.setText(String.valueOf(" Load Plus Minus Zero "));
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
                rhour.setText("");
                rminute.setText("");
                dtld.setText("");
                kilometer.setText("");
            }
        });

    }
}