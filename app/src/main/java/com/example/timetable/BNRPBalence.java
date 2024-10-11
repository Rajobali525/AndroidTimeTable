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

public class BNRPBalence extends AppCompatActivity {
    private EditText ed1, ed2, ed3, ed4, ed5, ed6, ed7, ed8, ed9, ed10,wk, ed11;
    private Button bt1, bt2;
    private TextView tv1, tv2, tv3, tv4, tv5, tv6, tv7;
    private AutoCompleteTextView autoCompleteTextView;
    Integer n1, n2, n3, n4, w1, w2, s1, s2, ts, sth, stm, tst, ln, w3, w4, rt, ra, w5, w6,wkk,km;
    String tn;
    Double sr, dr, tr, lpr, srr, ld, lp1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_bnrpbalence);

        autoCompleteTextView = findViewById(R.id.ed11);

        String[] Bnrp = getResources().getStringArray(R.array.bnrp);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Bnrp);
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
        ed10 = findViewById(R.id.ed10);
        wk = findViewById(R.id.workingkilometer);
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
                if (ed1.getText().toString().length() == 2) {
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
                if (ed2.getText().toString().length() == 2) {
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
                if (ed3.getText().toString().length() == 2) {
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
                if (ed4.getText().toString().length() == 2) {
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
                if (ed5.getText().toString().length() == 2) {
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
                if (ed6.getText().toString().length() == 2) {
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
                if (ed7.getText().toString().length() == 2) {
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
                if (ed8.getText().toString().length() == 2) {
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
                if (ed9.getText().toString().length() == 2) {
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
                if (ed10.getText().toString().length() == 2) {
                    wk.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
        wk.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (wk.getText().toString().length() == 3) {
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
                    wkk = Integer.valueOf(wk.getText().toString().trim());
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
                    if (tn.equals("772 BNRP-DA") && (ln.equals(30)||ln.equals(29)) && ld > 28) {
                        w4 = w3 - (ts + tst + (460*wkk)/360);
                        w5 = w4 / 60; w6 = w4 % 60;  lp1 = ld - 28;km=360;
                        lpr = Math.ceil((4.0 / 80.0) * lp1 * wkk);
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr +lpr+ (785*wkk)/km);
                        tv1.setText(String.valueOf("R/T   "+(460*wkk/km)/60 )+" : "+(460*wkk/km)%60+"  "+" Ration " + (785*wkk)/km);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    } else if (tn.equals("772 BNRP-DA") && (ln.equals(30)||ln.equals(29)) && ld < 28) {
                        w4 = w3 - (ts + tst + (460*wkk)/360);
                        w5 = w4 / 60; w6 = w4 % 60; lp1 = 26 - ld;km=360;
                        lpr = Math.floor((3.0 / 80.0) * lp1 * wkk);
                        dr = Math.floor((w4 * 20.0) / 60);
                        sr = Math.floor((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr +(785*wkk)/km)-lpr;
                        tv1.setText(String.valueOf("R/T   "+(460*wkk/km)/60 )+" : "+(460*wkk/km)%60+"  "+" Ration "+(785*wkk)/km);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    } else if (tn.equals("772 BNRP-DA") && (ln.equals(30)||ln.equals(29)) && ld == 28) {
                        w4 = w3 - (ts + tst + (460*wkk)/360);
                        w5 = w4 / 60;  w6 = w4 % 60;km = 360;
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr + (785*wkk)/km);
                        tv1.setText(String.valueOf("R/T   "+(460*wkk/km)/60 )+" : "+(460*wkk/km)%60+"  "+" Ration "+(785*wkk)/km);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                    }
                   else if (tn.equals("771 DA-BNRP") && (ln.equals(30)||ln.equals(29)) && ld > 28) {
                        w4 = w3 - (ts + tst + (455*wkk)/360);
                        w5 = w4 / 60; w6 = w4 % 60;  lp1 = ld - 28;km=360;
                        lpr = Math.ceil((4.0 / 80.0) * lp1 * wkk);
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr +lpr+ (795*wkk)/km);
                        tv1.setText(String.valueOf("R/T   "+(455*wkk/km)/60 )+" : "+(455*wkk/km)%60+"  "+" Ration " + (795*wkk)/km);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    } else if (tn.equals("771 DA-BNRP") && (ln.equals(30)||ln.equals(29)) && ld < 28) {
                        w4 = w3 - (ts + tst + (455*wkk)/360);
                        w5 = w4 / 60; w6 = w4 % 60; lp1 = 26 - ld;km=360;
                        lpr = Math.floor((3.0 / 80.0) * lp1 * wkk);
                        dr = Math.floor((w4 * 20.0) / 60);
                        sr = Math.floor((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr +(795*wkk)/km)-lpr;
                        tv1.setText(String.valueOf("R/T   "+(455*wkk/km)/60 )+" : "+(455*wkk/km)%60+"  "+" Ration "+(795*wkk)/km);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    } else if (tn.equals("771 DA-BNRP") && (ln.equals(30)||ln.equals(29)) && ld == 28) {
                        w4 = w3 - (ts + tst + (455*wkk)/360);
                        w5 = w4 / 60;  w6 = w4 % 60;km = 360;
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr + (795*wkk)/km);
                        tv1.setText(String.valueOf("R/T   "+(455*wkk/km)/60 )+" : "+(455*wkk/km)%60+"  "+" Ration "+(795*wkk)/km);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                    }
                    else if (tn.equals("771/772 BNRP-RNP-BNRP") && (ln.equals(30)||ln.equals(29)) && ld > 28) {
                        w4 = w3 - (ts + tst + (265*wkk)/173);
                        w5 = w4 / 60; w6 = w4 % 60;  lp1 = ld - 28;km=173;
                        lpr = Math.ceil((4.0 / 80.0) * lp1 * wkk);
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr +lpr+ (370*wkk)/km);
                        tv1.setText(String.valueOf("R/T   "+(265*wkk/km)/60 )+" : "+(265*wkk/km)%60+"  "+" Ration " + (370*wkk)/km);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    } else if (tn.equals("771/772 BNRP-RNP-BNRP") && (ln.equals(30)||ln.equals(29)) && ld < 28) {
                        w4 = w3 - (ts + tst + (265*wkk)/173);
                        w5 = w4 / 60; w6 = w4 % 60; lp1 = 26 - ld;km=173;
                        lpr = Math.floor((3.0 / 80.0) * lp1 * wkk);
                        dr = Math.floor((w4 * 20.0) / 60);
                        sr = Math.floor((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr +(370*wkk)/km)-lpr;
                        tv1.setText(String.valueOf("R/T   "+(265*wkk/km)/60 )+" : "+(265*wkk/km)%60+"  "+" Ration "+(370*wkk)/km);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    } else if (tn.equals("771/772 BNRP-RNP-BNRP") && (ln.equals(30)||ln.equals(29)) && ld == 28) {
                        w4 = w3 - (ts + tst + (265*wkk)/173);
                        w5 = w4 / 60;  w6 = w4 % 60;km = 173;
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr + (370*wkk)/km);
                        tv1.setText(String.valueOf("R/T   "+(265*wkk/km)/60 )+" : "+(265*wkk/km)%60+"  "+" Ration "+(370*wkk)/km);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                    }
                    else if (tn.equals("771/ER BNRP-RNP-LMH") && (ln.equals(30)||ln.equals(29)) && ld > 28) {
                        w4 = w3 - (ts + tst + (175*wkk)/120);
                        w5 = w4 / 60; w6 = w4 % 60;  lp1 = ld - 28;km=120;
                        lpr = Math.ceil((4.0 / 80.0) * lp1 * wkk);
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr +lpr+ (245*wkk)/km);
                        tv1.setText(String.valueOf("R/T   "+(175*wkk/km)/60 )+" : "+(175*wkk/km)%60+"  "+" Ration " + (245*wkk)/km);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    } else if (tn.equals("771/ER BNRP-RNP-LMH") && (ln.equals(30)||ln.equals(29)) && ld < 28) {
                        w4 = w3 - (ts + tst + (175*wkk)/120);
                        w5 = w4 / 60; w6 = w4 % 60; lp1 = 28 - ld;km=120;
                        lpr = Math.floor((3.0 / 80.0) * lp1 * wkk);
                        dr = Math.floor((w4 * 20.0) / 60);
                        sr = Math.floor((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr +(245*wkk)/km)-lpr;
                        tv1.setText(String.valueOf("R/T   "+(175*wkk/km)/60 )+" : "+(175*wkk/km)%60+"  "+" Ration "+(245*wkk)/km);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    } else if (tn.equals("771/ER BNRP-RNP-LMH") && (ln.equals(30)||ln.equals(29)) && ld == 28) {
                        w4 = w3 - (ts + tst + (175*wkk)/120);
                        w5 = w4 / 60;  w6 = w4 % 60;km = 120;
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr + (245*wkk)/km);
                        tv1.setText(String.valueOf("R/T   "+(175*wkk/km)/60 )+" : "+(175*wkk/km)%60+"  "+" Ration "+(245*wkk)/km);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                    }
                    else if ((tn.equals("19 STU-BNRP")||tn.equals("20 BNRP-STU")) && (ln.equals(23)||ln.equals(24)) && ld > 16) {
                        w4 = w3 - (ts + tst + (170*wkk)/84);
                        w5 = w4 / 60; w6 = w4 % 60;  lp1 = ld - 16;km=84;
                        lpr = Math.ceil((4.0 / 80.0) * lp1 * wkk);
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr +lpr+ (147*wkk)/km);
                        tv1.setText(String.valueOf("R/T   "+(170*wkk/km)/60 )+" : "+(170*wkk/km)%60+"  "+" Ration " + (147*wkk)/km);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    } else if ((tn.equals("19 STU-BNRP")||tn.equals("20 BNRP-STU")) && (ln.equals(23)||ln.equals(24)) && ld < 16) {
                        w4 = w3 - (ts + tst + (170*wkk)/84);
                        w5 = w4 / 60; w6 = w4 % 60; lp1 = 16 - ld;km=84;
                        lpr = Math.floor((3.0 / 80.0) * lp1 * wkk);
                        dr = Math.floor((w4 * 20.0) / 60);
                        sr = Math.floor((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr +(147*wkk)/km)-lpr;
                        tv1.setText(String.valueOf("R/T   "+(170*wkk/km)/60 )+" : "+(170*wkk/km)%60+"  "+" Ration "+(147*wkk)/km);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    } else if ((tn.equals("19 STU-BNRP")||tn.equals("20 BNRP-STU")) && (ln.equals(23)||ln.equals(24)) && ld == 16) {
                        w4 = w3 - (ts + tst + (170*wkk)/84);
                        w5 = w4 / 60;  w6 = w4 % 60;km = 84;
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr + (147*wkk)/km);
                        tv1.setText(String.valueOf("R/T   "+(170*wkk/km)/60 )+" : "+(170*wkk/km)%60+"  "+" Ration "+(147*wkk)/km);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                    }
                    else if ((tn.equals("19 BNRP-LMH")||tn.equals("20 LMH-BNRP")) && (ln.equals(23)||ln.equals(24)) && ld > 16) {
                        w4 = w3 - (ts + tst + (190*wkk)/84);
                        w5 = w4 / 60; w6 = w4 % 60;  lp1 = ld - 16;km=84;
                        lpr = Math.ceil((4.0 / 80.0) * lp1 * wkk);
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr +lpr+ (153*wkk)/km);
                        tv1.setText(String.valueOf("R/T   "+(190*wkk/km)/60 )+" : "+(190*wkk/km)%60+"  "+" Ration " + (153*wkk)/km);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    } else if ((tn.equals("19 BNRP-LMH")||tn.equals("20 LMH-BNRP")) && (ln.equals(23)||ln.equals(24)) && ld < 16) {
                        w4 = w3 - (ts + tst + (190*wkk)/84);
                        w5 = w4 / 60; w6 = w4 % 60; lp1 = 16 - ld;km=84;
                        lpr = Math.floor((3.0 / 80.0) * lp1 * wkk);
                        dr = Math.floor((w4 * 20.0) / 60);
                        sr = Math.floor((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr +(153*wkk)/km)-lpr;
                        tv1.setText(String.valueOf("R/T   "+(190*wkk/km)/60 )+" : "+(190*wkk/km)%60+"  "+" Ration "+(153*wkk)/km);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    } else if ((tn.equals("19 BNRP-LMH")||tn.equals("20 LMH-BNRP")) && (ln.equals(23)||ln.equals(24)) && ld == 16) {
                        w4 = w3 - (ts + tst + (190*wkk)/84);
                        w5 = w4 / 60;  w6 = w4 % 60;km = 84;
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr + (153*wkk)/km);
                        tv1.setText(String.valueOf("R/T   "+(190*wkk/km)/60 )+" : "+(190*wkk/km)%60+"  "+" Ration "+(153*wkk)/km);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                    }
                    else if (tn.equals("492 BNRP-STU") && (ln.equals(23)||ln.equals(24)) && ld > 16) {
                        w4 = w3 - (ts + tst + (230*wkk)/84);
                        w5 = w4 / 60; w6 = w4 % 60;  lp1 = ld - 16;km=84;
                        lpr = Math.ceil((4.0 / 80.0) * lp1 * wkk);
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr +lpr+ (150*wkk)/km);
                        tv1.setText(String.valueOf("R/T   "+(230*wkk/km)/60 )+" : "+(230*wkk/km)%60+"  "+" Ration " + (150*wkk)/km);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    } else if (tn.equals("492 BNRP-STU") && (ln.equals(23)||ln.equals(24)) && ld < 16) {
                        w4 = w3 - (ts + tst + (230*wkk)/84);
                        w5 = w4 / 60; w6 = w4 % 60; lp1 = 16 - ld;km=84;
                        lpr = Math.floor((3.0 / 80.0) * lp1 * wkk);
                        dr = Math.floor((w4 * 20.0) / 60);
                        sr = Math.floor((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr +(150*wkk)/km)-lpr;
                        tv1.setText(String.valueOf("R/T   "+(230*wkk/km)/60 )+" : "+(230*wkk/km)%60+"  "+" Ration "+(150*wkk)/km);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    } else if (tn.equals("492 BNRP-STU") && (ln.equals(23)||ln.equals(24)) && ld == 16) {
                        w4 = w3 - (ts + tst + (230*wkk)/84);
                        w5 = w4 / 60;  w6 = w4 % 60;km = 84;
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr + (150*wkk)/km);
                        tv1.setText(String.valueOf("R/T   "+(230*wkk/km)/60 )+" : "+(230*wkk/km)%60+"  "+" Ration "+(150*wkk)/km);
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
                wk.setText("");
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