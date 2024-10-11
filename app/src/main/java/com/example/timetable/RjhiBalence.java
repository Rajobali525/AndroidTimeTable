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

public class RjhiBalence extends AppCompatActivity {

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
        setContentView(R.layout.activity_rjhi_balence);

        autoCompleteTextView = findViewById(R.id.ed11);

        String[] Rajshahi = getResources().getStringArray(R.array.rajshahi);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Rajshahi);
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
                      if (tn.equals("753 da-rjhi") && (ln.equals(66)) && ld > 28) {
                        w4 = w3 - (ts + tst + (350*wkk)/263);
                        w5 = w4 / 60; w6 = w4 % 60;  lp1 = ld - 28;km=263;
                        lpr = Math.ceil((8.0 / 80.0) * lp1 * wkk);
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr +lpr+ (910*wkk)/km);
                        tv1.setText(String.valueOf("R/T   "+(350*wkk/km)/60 )+" : "+(350*wkk/km)%60+"  "+" Ration " + (910*wkk)/km);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    } else if (tn.equals("753 da-rjhi") && (ln.equals(66)) && ld < 28) {
                        w4 = w3 - (ts + tst + (350*wkk)/263);
                        w5 = w4 / 60; w6 = w4 % 60; lp1 = 28 - ld;km=263;
                        lpr = Math.floor((6.0 / 80.0) * lp1 * wkk);
                        dr = Math.floor((w4 * 20.0) / 60);
                        sr = Math.floor((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr +(910*wkk)/km)-lpr;
                        tv1.setText(String.valueOf("R/T   "+(350*wkk/km)/60 )+" : "+(350*wkk/km)%60+"  "+" Ration "+(910*wkk)/km);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    } else if (tn.equals("753 da-rjhi") && (ln.equals(66)) && ld == 28) {
                        w4 = w3 - (ts + tst + (350*wkk)/263);
                        w5 = w4 / 60;  w6 = w4 % 60;km = 263;
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr + (910*wkk)/km);
                        tv1.setText(String.valueOf("R/T   "+(350*wkk/km)/60 )+" : "+(350*wkk/km)%60+"  "+" Ration "+(910*wkk)/km);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                    }
                   else if (tn.equals("754 rjhi-da") && (ln.equals(66)) && ld > 28) {
                        w4 = w3 - (ts + tst + (340*wkk)/263);
                        w5 = w4 / 60; w6 = w4 % 60;  lp1 = ld - 28;km=263;
                        lpr = Math.ceil((8.0 / 80.0) * lp1 * wkk);
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr +lpr+ (920*wkk)/km);
                        tv1.setText(String.valueOf("R/T   "+(340*wkk/km)/60 )+" : "+(340*wkk/km)%60+"  "+" Ration " + (920*wkk)/km);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    } else if (tn.equals("754 rjhi-da") && (ln.equals(66)) && ld < 28) {
                        w4 = w3 - (ts + tst + (340*wkk)/263);
                        w5 = w4 / 60; w6 = w4 % 60; lp1 = 28 - ld;km=263;
                        lpr = Math.floor((6.0 / 80.0) * lp1 * wkk);
                        dr = Math.floor((w4 * 20.0) / 60);
                        sr = Math.floor((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr +(920*wkk)/km)-lpr;
                        tv1.setText(String.valueOf("R/T   "+(340*wkk/km)/60 )+" : "+(340*wkk/km)%60+"  "+" Ration "+(920*wkk)/km);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    } else if (tn.equals("754 rjhi-da") && (ln.equals(66)) && ld == 28) {
                        w4 = w3 - (ts + tst + (340*wkk)/263);
                        w5 = w4 / 60;  w6 = w4 % 60;km = 263;
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr + (920*wkk)/km);
                        tv1.setText(String.valueOf("R/T   "+(340*wkk/km)/60 )+" : "+(340*wkk/km)%60+"  "+" Ration "+(920*wkk)/km);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                    }
                      else if (tn.equals("759 da-rjhi") && (ln.equals(66)) && ld > 28) {
                          w4 = w3 - (ts + tst + (340*wkk)/263);
                          w5 = w4 / 60; w6 = w4 % 60;  lp1 = ld - 28;km=263;
                          lpr = Math.ceil((8.0 / 80.0) * lp1 * wkk);
                          dr = Math.ceil((w4 * 20.0) / 60);
                          sr = Math.ceil((ts * 30.0) / 60);
                          tr = Math.ceil( sr + dr +lpr+ (890*wkk)/km);
                          tv1.setText(String.valueOf("R/T   "+(340*wkk/km)/60 )+" : "+(340*wkk/km)%60+"  "+" Ration " + (890*wkk)/km);
                          tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                          tv4.setText(String.valueOf("Total Ration " + tr));
                          tv5.setText(String.valueOf("Shunting Ration " + sr));
                          tv6.setText(String.valueOf(" Detention Ration " + dr));
                          tv7.setText(String.valueOf(" Load Plus " + lpr));
                      } else if (tn.equals("759 da-rjhi") && (ln.equals(66)) && ld < 28) {
                          w4 = w3 - (ts + tst + (340*wkk)/263);
                          w5 = w4 / 60; w6 = w4 % 60; lp1 = 28 - ld;km=263;
                          lpr = Math.floor((6.0 / 80.0) * lp1 * wkk);
                          dr = Math.floor((w4 * 20.0) / 60);
                          sr = Math.floor((ts * 30.0) / 60);
                          tr = Math.ceil( sr + dr +(890*wkk)/km)-lpr;
                          tv1.setText(String.valueOf("R/T   "+(340*wkk/km)/60 )+" : "+(340*wkk/km)%60+"  "+" Ration "+(890*wkk)/km);
                          tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                          tv4.setText(String.valueOf("Total Ration " + tr));
                          tv5.setText(String.valueOf("Shunting Ration " + sr));
                          tv6.setText(String.valueOf(" Detention Ration " + dr));
                          tv7.setText(String.valueOf(" Load Minus " + lpr));
                      } else if (tn.equals("759 da-rjhi") && (ln.equals(66)) && ld == 28) {
                          w4 = w3 - (ts + tst + (340*wkk)/263);
                          w5 = w4 / 60;  w6 = w4 % 60;km = 263;
                          dr = Math.ceil((w4 * 20.0) / 60);
                          sr = Math.ceil((ts * 30.0) / 60);
                          tr = Math.ceil( sr + dr + (890*wkk)/km);
                          tv1.setText(String.valueOf("R/T   "+(340*wkk/km)/60 )+" : "+(340*wkk/km)%60+"  "+" Ration "+(890*wkk)/km);
                          tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                          tv4.setText(String.valueOf("Total Ration " + tr));
                          tv5.setText(String.valueOf("Shunting Ration " + sr));
                          tv6.setText(String.valueOf(" Detention Ration " + dr));
                          tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                      }
                      else if (tn.equals("760 rjhi-da") && (ln.equals(66)) && ld > 28) {
                          w4 = w3 - (ts + tst + (325*wkk)/263);
                          w5 = w4 / 60; w6 = w4 % 60;  lp1 = ld - 28;km=263;
                          lpr = Math.ceil((8.0 / 80.0) * lp1 * wkk);
                          dr = Math.ceil((w4 * 20.0) / 60);
                          sr = Math.ceil((ts * 30.0) / 60);
                          tr = Math.ceil( sr + dr +lpr+ (880*wkk)/km);
                          tv1.setText(String.valueOf("R/T   "+(325*wkk/km)/60 )+" : "+(325*wkk/km)%60+"  "+" Ration " + (880*wkk)/km);
                          tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                          tv4.setText(String.valueOf("Total Ration " + tr));
                          tv5.setText(String.valueOf("Shunting Ration " + sr));
                          tv6.setText(String.valueOf(" Detention Ration " + dr));
                          tv7.setText(String.valueOf(" Load Plus " + lpr));
                      } else if (tn.equals("760 rjhi-da") && (ln.equals(66)) && ld < 28) {
                          w4 = w3 - (ts + tst + (325*wkk)/263);
                          w5 = w4 / 60; w6 = w4 % 60; lp1 = 28 - ld;km=263;
                          lpr = Math.floor((6.0 / 80.0) * lp1 * wkk);
                          dr = Math.floor((w4 * 20.0) / 60);
                          sr = Math.floor((ts * 30.0) / 60);
                          tr = Math.ceil( sr + dr +(880*wkk)/km)-lpr;
                          tv1.setText(String.valueOf("R/T   "+(325*wkk/km)/60 )+" : "+(325*wkk/km)%60+"  "+" Ration "+(880*wkk)/km);
                          tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                          tv4.setText(String.valueOf("Total Ration " + tr));
                          tv5.setText(String.valueOf("Shunting Ration " + sr));
                          tv6.setText(String.valueOf(" Detention Ration " + dr));
                          tv7.setText(String.valueOf(" Load Minus " + lpr));
                      } else if (tn.equals("760 rjhi-da") && (ln.equals(66)) && ld == 28) {
                          w4 = w3 - (ts + tst + (325*wkk)/263);
                          w5 = w4 / 60;  w6 = w4 % 60;km = 263;
                          dr = Math.ceil((w4 * 20.0) / 60);
                          sr = Math.ceil((ts * 30.0) / 60);
                          tr = Math.ceil( sr + dr + (880*wkk)/km);
                          tv1.setText(String.valueOf("R/T   "+(325*wkk/km)/60 )+" : "+(325*wkk/km)%60+"  "+" Ration "+(880*wkk)/km);
                          tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                          tv4.setText(String.valueOf("Total Ration " + tr));
                          tv5.setText(String.valueOf("Shunting Ration " + sr));
                          tv6.setText(String.valueOf(" Detention Ration " + dr));
                          tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                      }
                      else if (tn.equals("769 da-rjhi") && (ln.equals(66)) && ld > 28) {
                          w4 = w3 - (ts + tst + (340*wkk)/263);
                          w5 = w4 / 60; w6 = w4 % 60;  lp1 = ld - 28;km=263;
                          lpr = Math.ceil((8.0 / 80.0) * lp1 * wkk);
                          dr = Math.ceil((w4 * 20.0) / 60);
                          sr = Math.ceil((ts * 30.0) / 60);
                          tr = Math.ceil( sr + dr +lpr+ (905*wkk)/km);
                          tv1.setText(String.valueOf("R/T   "+(340*wkk/km)/60 )+" : "+(340*wkk/km)%60+"  "+" Ration " + (905*wkk)/km);
                          tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                          tv4.setText(String.valueOf("Total Ration " + tr));
                          tv5.setText(String.valueOf("Shunting Ration " + sr));
                          tv6.setText(String.valueOf(" Detention Ration " + dr));
                          tv7.setText(String.valueOf(" Load Plus " + lpr));
                      } else if (tn.equals("769 da-rjhi") && (ln.equals(66)) && ld < 28) {
                          w4 = w3 - (ts + tst + (340*wkk)/263);
                          w5 = w4 / 60; w6 = w4 % 60; lp1 = 28 - ld;km=263;
                          lpr = Math.floor((6.0 / 80.0) * lp1 * wkk);
                          dr = Math.floor((w4 * 20.0) / 60);
                          sr = Math.floor((ts * 30.0) / 60);
                          tr = Math.ceil( sr + dr +(905*wkk)/km)-lpr;
                          tv1.setText(String.valueOf("R/T   "+(340*wkk/km)/60 )+" : "+(340*wkk/km)%60+"  "+" Ration "+(905*wkk)/km);
                          tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                          tv4.setText(String.valueOf("Total Ration " + tr));
                          tv5.setText(String.valueOf("Shunting Ration " + sr));
                          tv6.setText(String.valueOf(" Detention Ration " + dr));
                          tv7.setText(String.valueOf(" Load Minus " + lpr));
                      } else if (tn.equals("769 da-rjhi") && (ln.equals(66)) && ld == 28) {
                          w4 = w3 - (ts + tst + (340*wkk)/263);
                          w5 = w4 / 60;  w6 = w4 % 60;km = 263;
                          dr = Math.ceil((w4 * 20.0) / 60);
                          sr = Math.ceil((ts * 30.0) / 60);
                          tr = Math.ceil( sr + dr + (905*wkk)/km);
                          tv1.setText(String.valueOf("R/T   "+(340*wkk/km)/60 )+" : "+(340*wkk/km)%60+"  "+" Ration "+(905*wkk)/km);
                          tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                          tv4.setText(String.valueOf("Total Ration " + tr));
                          tv5.setText(String.valueOf("Shunting Ration " + sr));
                          tv6.setText(String.valueOf(" Detention Ration " + dr));
                          tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                      }
                      else if (tn.equals("770 rjhi-da") && (ln.equals(66)) && ld > 28) {
                          w4 = w3 - (ts + tst + (340*wkk)/263);
                          w5 = w4 / 60; w6 = w4 % 60;  lp1 = ld - 28;km=263;
                          lpr = Math.ceil((8.0 / 80.0) * lp1 * wkk);
                          dr = Math.ceil((w4 * 20.0) / 60);
                          sr = Math.ceil((ts * 30.0) / 60);
                          tr = Math.ceil( sr + dr +lpr+ (900*wkk)/km);
                          tv1.setText(String.valueOf("R/T   "+(340*wkk/km)/60 )+" : "+(340*wkk/km)%60+"  "+" Ration " + (900*wkk)/km);
                          tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                          tv4.setText(String.valueOf("Total Ration " + tr));
                          tv5.setText(String.valueOf("Shunting Ration " + sr));
                          tv6.setText(String.valueOf(" Detention Ration " + dr));
                          tv7.setText(String.valueOf(" Load Plus " + lpr));
                      } else if (tn.equals("770 rjhi-da") && (ln.equals(66)) && ld < 28) {
                          w4 = w3 - (ts + tst + (340*wkk)/263);
                          w5 = w4 / 60; w6 = w4 % 60; lp1 = 28 - ld;km=263;
                          lpr = Math.floor((6.0 / 80.0) * lp1 * wkk);
                          dr = Math.floor((w4 * 20.0) / 60);
                          sr = Math.floor((ts * 30.0) / 60);
                          tr = Math.ceil( sr + dr +(900*wkk)/km)-lpr;
                          tv1.setText(String.valueOf("R/T   "+(340*wkk/km)/60 )+" : "+(340*wkk/km)%60+"  "+" Ration "+(900*wkk)/km);
                          tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                          tv4.setText(String.valueOf("Total Ration " + tr));
                          tv5.setText(String.valueOf("Shunting Ration " + sr));
                          tv6.setText(String.valueOf(" Detention Ration " + dr));
                          tv7.setText(String.valueOf(" Load Minus " + lpr));
                      } else if (tn.equals("770 rjhi-da") && (ln.equals(66)) && ld == 28) {
                          w4 = w3 - (ts + tst + (340*wkk)/263);
                          w5 = w4 / 60;  w6 = w4 % 60;km = 263;
                          dr = Math.ceil((w4 * 20.0) / 60);
                          sr = Math.ceil((ts * 30.0) / 60);
                          tr = Math.ceil( sr + dr + (900*wkk)/km);
                          tv1.setText(String.valueOf("R/T   "+(340*wkk/km)/60 )+" : "+(340*wkk/km)%60+"  "+" Ration "+(900*wkk)/km);
                          tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                          tv4.setText(String.valueOf("Total Ration " + tr));
                          tv5.setText(String.valueOf("Shunting Ration " + sr));
                          tv6.setText(String.valueOf(" Detention Ration " + dr));
                          tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                      }
                      else if ((tn.equals("791 da-rjhi") ||tn.equals("792 rjhi-da")) && (ln.equals(66)) && ld > 28) {
                          w4 = w3 - (ts + tst + (275*wkk)/263);
                          w5 = w4 / 60; w6 = w4 % 60;  lp1 = ld - 28;km=263;
                          lpr = Math.ceil((8.0 / 80.0) * lp1 * wkk);
                          dr = Math.ceil((w4 * 20.0) / 60);
                          sr = Math.ceil((ts * 30.0) / 60);
                          tr = Math.ceil( sr + dr +lpr+ (850*wkk)/km);
                          tv1.setText(String.valueOf("R/T   "+(275*wkk/km)/60 )+" : "+(275*wkk/km)%60+"  "+" Ration " + (850*wkk)/km);
                          tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                          tv4.setText(String.valueOf("Total Ration " + tr));
                          tv5.setText(String.valueOf("Shunting Ration " + sr));
                          tv6.setText(String.valueOf(" Detention Ration " + dr));
                          tv7.setText(String.valueOf(" Load Plus " + lpr));
                      } else if ((tn.equals("791 da-rjhi")||tn.equals("792 rjhi-da"))  && (ln.equals(66)) && ld < 28) {
                          w4 = w3 - (ts + tst + (275*wkk)/263);
                          w5 = w4 / 60; w6 = w4 % 60; lp1 = 28 - ld;km=263;
                          lpr = Math.floor((6.0 / 80.0) * lp1 * wkk);
                          dr = Math.floor((w4 * 20.0) / 60);
                          sr = Math.floor((ts * 30.0) / 60);
                          tr = Math.ceil( sr + dr +(850*wkk)/km)-lpr;
                          tv1.setText(String.valueOf("R/T   "+(275*wkk/km)/60 )+" : "+(275*wkk/km)%60+"  "+" Ration "+(850*wkk)/km);
                          tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                          tv4.setText(String.valueOf("Total Ration " + tr));
                          tv5.setText(String.valueOf("Shunting Ration " + sr));
                          tv6.setText(String.valueOf(" Detention Ration " + dr));
                          tv7.setText(String.valueOf(" Load Minus " + lpr));
                      } else if ((tn.equals("791 da-rjhi")||tn.equals("792 rjhi-da"))  && (ln.equals(66)) && ld == 28) {
                          w4 = w3 - (ts + tst + (275*wkk)/263);
                          w5 = w4 / 60;  w6 = w4 % 60;km = 263;
                          dr = Math.ceil((w4 * 20.0) / 60);
                          sr = Math.ceil((ts * 30.0) / 60);
                          tr = Math.ceil( sr + dr + (850*wkk)/km);
                          tv1.setText(String.valueOf("R/T   "+(275*wkk/km)/60 )+" : "+(275*wkk/km)%60+"  "+" Ration "+(850*wkk)/km);
                          tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                          tv4.setText(String.valueOf("Total Ration " + tr));
                          tv5.setText(String.valueOf("Shunting Ration " + sr));
                          tv6.setText(String.valueOf(" Detention Ration " + dr));
                          tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                      }
                      else if (tn.equals("791 rjhi-cnbj") && (ln.equals(66)) && ld > 26) {
                          w4 = w3 - (ts + tst + (55*wkk)/50);
                          w5 = w4 / 60; w6 = w4 % 60;  lp1 = ld - 26;km=50;
                          lpr = Math.ceil((4.0 / 80.0) * lp1 * wkk);
                          dr = Math.ceil((w4 * 20.0) / 60);
                          sr = Math.ceil((ts * 30.0) / 60);
                          tr = Math.ceil( sr + dr +lpr+ (120*wkk)/km);
                          tv1.setText(String.valueOf("R/T   "+(55*wkk/km)/60 )+" : "+(55*wkk/km)%60+"  "+" Ration " + (120*wkk)/km);
                          tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                          tv4.setText(String.valueOf("Total Ration " + tr));
                          tv5.setText(String.valueOf("Shunting Ration " + sr));
                          tv6.setText(String.valueOf(" Detention Ration " + dr));
                          tv7.setText(String.valueOf(" Load Plus " + lpr));
                      } else if (tn.equals("791 rjhi-cnbj") && (ln.equals(66)) && ld < 26) {
                          w4 = w3 - (ts + tst + (55*wkk)/50);
                          w5 = w4 / 60; w6 = w4 % 60; lp1 = 26 - ld;km=50;
                          lpr = Math.floor((3.0 / 80.0) * lp1 * wkk);
                          dr = Math.floor((w4 * 20.0) / 60);
                          sr = Math.floor((ts * 30.0) / 60);
                          tr = Math.ceil( sr + dr +(120*wkk)/km)-lpr;
                          tv1.setText(String.valueOf("R/T   "+(55*wkk/km)/60 )+" : "+(55*wkk/km)%60+"  "+" Ration "+(120*wkk)/km);
                          tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                          tv4.setText(String.valueOf("Total Ration " + tr));
                          tv5.setText(String.valueOf("Shunting Ration " + sr));
                          tv6.setText(String.valueOf(" Detention Ration " + dr));
                          tv7.setText(String.valueOf(" Load Minus " + lpr));
                      } else if (tn.equals("791 rjhi-cnbj") && (ln.equals(66)) && ld == 26) {
                          w4 = w3 - (ts + tst + (55*wkk)/50);
                          w5 = w4 / 60;  w6 = w4 % 60;km = 50;
                          dr = Math.ceil((w4 * 20.0) / 60);
                          sr = Math.ceil((ts * 30.0) / 60);
                          tr = Math.ceil( sr + dr + (120*wkk)/km);
                          tv1.setText(String.valueOf("R/T   "+(55*wkk/km)/60 )+" : "+(55*wkk/km)%60+"  "+" Ration "+(120*wkk)/km);
                          tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                          tv4.setText(String.valueOf("Total Ration " + tr));
                          tv5.setText(String.valueOf("Shunting Ration " + sr));
                          tv6.setText(String.valueOf(" Detention Ration " + dr));
                          tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                      }
                      else if (tn.equals("791 rjhi-cnbj") && (ln.equals(65)) && ld > 24) {
                          w4 = w3 - (ts + tst + (55*wkk)/50);
                          w5 = w4 / 60; w6 = w4 % 60;  lp1 = ld - 24;km=50;
                          lpr = Math.ceil((4.0 / 80.0) * lp1 * wkk);
                          dr = Math.ceil((w4 * 20.0) / 60);
                          sr = Math.ceil((ts * 30.0) / 60);
                          tr = Math.ceil( sr + dr +lpr+ (110*wkk)/km);
                          tv1.setText(String.valueOf("R/T   "+(55*wkk/km)/60 )+" : "+(55*wkk/km)%60+"  "+" Ration " + (110*wkk)/km);
                          tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                          tv4.setText(String.valueOf("Total Ration " + tr));
                          tv5.setText(String.valueOf("Shunting Ration " + sr));
                          tv6.setText(String.valueOf(" Detention Ration " + dr));
                          tv7.setText(String.valueOf(" Load Plus " + lpr));
                      } else if (tn.equals("791 rjhi-cnbj") && (ln.equals(65)) && ld < 24) {
                          w4 = w3 - (ts + tst + (55*wkk)/50);
                          w5 = w4 / 60; w6 = w4 % 60; lp1 = 24- ld;km=50;
                          lpr = Math.floor((3.0 / 80.0) * lp1 * wkk);
                          dr = Math.floor((w4 * 20.0) / 60);
                          sr = Math.floor((ts * 30.0) / 60);
                          tr = Math.ceil( sr + dr +(110*wkk)/km)-lpr;
                          tv1.setText(String.valueOf("R/T   "+(55*wkk/km)/60 )+" : "+(55*wkk/km)%60+"  "+" Ration "+(110*wkk)/km);
                          tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                          tv4.setText(String.valueOf("Total Ration " + tr));
                          tv5.setText(String.valueOf("Shunting Ration " + sr));
                          tv6.setText(String.valueOf(" Detention Ration " + dr));
                          tv7.setText(String.valueOf(" Load Minus " + lpr));
                      } else if (tn.equals("791 rjhi-cnbj") && (ln.equals(65)) && ld == 24) {
                          w4 = w3 - (ts + tst + (55*wkk)/50);
                          w5 = w4 / 60;  w6 = w4 % 60;km = 50;
                          dr = Math.ceil((w4 * 20.0) / 60);
                          sr = Math.ceil((ts * 30.0) / 60);
                          tr = Math.ceil( sr + dr + (110*wkk)/km);
                          tv1.setText(String.valueOf("R/T   "+(55*wkk/km)/60 )+" : "+(55*wkk/km)%60+"  "+" Ration "+(110*wkk)/km);
                          tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                          tv4.setText(String.valueOf("Total Ration " + tr));
                          tv5.setText(String.valueOf("Shunting Ration " + sr));
                          tv6.setText(String.valueOf(" Detention Ration " + dr));
                          tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                      }
                      else if (tn.equals("792 cnbj-rjhi") && (ln.equals(66)) && ld > 26) {
                          w4 = w3 - (ts + tst + (50*wkk)/50);
                          w5 = w4 / 60; w6 = w4 % 60;  lp1 = ld - 26;km=50;
                          lpr = Math.ceil((4.0 / 80.0) * lp1 * wkk);
                          dr = Math.ceil((w4 * 20.0) / 60);
                          sr = Math.ceil((ts * 30.0) / 60);
                          tr = Math.ceil( sr + dr +lpr+ (118*wkk)/km);
                          tv1.setText(String.valueOf("R/T   "+(50*wkk/km)/60 )+" : "+(50*wkk/km)%60+"  "+" Ration " + (118*wkk)/km);
                          tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                          tv4.setText(String.valueOf("Total Ration " + tr));
                          tv5.setText(String.valueOf("Shunting Ration " + sr));
                          tv6.setText(String.valueOf(" Detention Ration " + dr));
                          tv7.setText(String.valueOf(" Load Plus " + lpr));
                      } else if (tn.equals("792 cnbj-rjhi") && (ln.equals(66)) && ld < 26) {
                          w4 = w3 - (ts + tst + (50*wkk)/50);
                          w5 = w4 / 60; w6 = w4 % 60; lp1 = 26 - ld;km=50;
                          lpr = Math.floor((3.0 / 80.0) * lp1 * wkk);
                          dr = Math.floor((w4 * 20.0) / 60);
                          sr = Math.floor((ts * 30.0) / 60);
                          tr = Math.ceil( sr + dr +(118*wkk)/km)-lpr;
                          tv1.setText(String.valueOf("R/T   "+(50*wkk/km)/60 )+" : "+(50*wkk/km)%60+"  "+" Ration "+(118*wkk)/km);
                          tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                          tv4.setText(String.valueOf("Total Ration " + tr));
                          tv5.setText(String.valueOf("Shunting Ration " + sr));
                          tv6.setText(String.valueOf(" Detention Ration " + dr));
                          tv7.setText(String.valueOf(" Load Minus " + lpr));
                      } else if (tn.equals("792 cnbj-rjhi") && (ln.equals(66)) && ld == 26) {
                          w4 = w3 - (ts + tst + (50*wkk)/50);
                          w5 = w4 / 60;  w6 = w4 % 60;km = 50;
                          dr = Math.ceil((w4 * 20.0) / 60);
                          sr = Math.ceil((ts * 30.0) / 60);
                          tr = Math.ceil( sr + dr + (118*wkk)/km);
                          tv1.setText(String.valueOf("R/T   "+(50*wkk/km)/60 )+" : "+(50*wkk/km)%60+"  "+" Ration "+(118*wkk)/km);
                          tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                          tv4.setText(String.valueOf("Total Ration " + tr));
                          tv5.setText(String.valueOf("Shunting Ration " + sr));
                          tv6.setText(String.valueOf(" Detention Ration " + dr));
                          tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                      }
                      else if (tn.equals("792 cnbj-rjhi") && (ln.equals(65)) && ld > 24) {
                          w4 = w3 - (ts + tst + (60*wkk)/50);
                          w5 = w4 / 60; w6 = w4 % 60;  lp1 = ld - 24;km=50;
                          lpr = Math.ceil((4.0 / 80.0) * lp1 * wkk);
                          dr = Math.ceil((w4 * 20.0) / 60);
                          sr = Math.ceil((ts * 30.0) / 60);
                          tr = Math.ceil( sr + dr +lpr+ (110*wkk)/km);
                          tv1.setText(String.valueOf("R/T   "+(60*wkk/km)/60 )+" : "+(60*wkk/km)%60+"  "+" Ration " + (110*wkk)/km);
                          tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                          tv4.setText(String.valueOf("Total Ration " + tr));
                          tv5.setText(String.valueOf("Shunting Ration " + sr));
                          tv6.setText(String.valueOf(" Detention Ration " + dr));
                          tv7.setText(String.valueOf(" Load Plus " + lpr));
                      } else if (tn.equals("792 cnbj-rjhi") && (ln.equals(65)) && ld < 24) {
                          w4 = w3 - (ts + tst + (60*wkk)/50);
                          w5 = w4 / 60; w6 = w4 % 60; lp1 = 24 - ld;km=50;
                          lpr = Math.floor((3.0 / 80.0) * lp1 * wkk);
                          dr = Math.floor((w4 * 20.0) / 60);
                          sr = Math.floor((ts * 30.0) / 60);
                          tr = Math.ceil( sr + dr +(110*wkk)/km)-lpr;
                          tv1.setText(String.valueOf("R/T   "+(60*wkk/km)/60 )+" : "+(60*wkk/km)%60+"  "+" Ration "+(110*wkk)/km);
                          tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                          tv4.setText(String.valueOf("Total Ration " + tr));
                          tv5.setText(String.valueOf("Shunting Ration " + sr));
                          tv6.setText(String.valueOf(" Detention Ration " + dr));
                          tv7.setText(String.valueOf(" Load Minus " + lpr));
                      } else if (tn.equals("792 cnbj-rjhi") && (ln.equals(65)) && ld == 24) {
                          w4 = w3 - (ts + tst + (50*wkk)/50);
                          w5 = w4 / 60;  w6 = w4 % 60;km = 50;
                          dr = Math.ceil((w4 * 20.0) / 60);
                          sr = Math.ceil((ts * 30.0) / 60);
                          tr = Math.ceil( sr + dr + (110*wkk)/km);
                          tv1.setText(String.valueOf("R/T   "+(60*wkk/km)/60 )+" : "+(60*wkk/km)%60+"  "+" Ration "+(110*wkk)/km);
                          tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                          tv4.setText(String.valueOf("Total Ration " + tr));
                          tv5.setText(String.valueOf("Shunting Ration " + sr));
                          tv6.setText(String.valueOf(" Detention Ration " + dr));
                          tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                      }
                      else if (tn.equals("792-ER cnbj-rjhi") && (ln.equals(66)) && ld > 26) {
                          w4 = w3 - (ts + tst + (50*wkk)/50);
                          w5 = w4 / 60; w6 = w4 % 60;  lp1 = ld - 26;km=50;
                          lpr = Math.ceil((4.0 / 80.0) * lp1 * wkk);
                          dr = Math.ceil((w4 * 20.0) / 60);
                          sr = Math.ceil((ts * 30.0) / 60);
                          tr = Math.ceil( sr + dr +lpr+ (112*wkk)/km);
                          tv1.setText(String.valueOf("R/T   "+(50*wkk/km)/60 )+" : "+(50*wkk/km)%60+"  "+" Ration " + (112*wkk)/km);
                          tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                          tv4.setText(String.valueOf("Total Ration " + tr));
                          tv5.setText(String.valueOf("Shunting Ration " + sr));
                          tv6.setText(String.valueOf(" Detention Ration " + dr));
                          tv7.setText(String.valueOf(" Load Plus " + lpr));
                      } else if (tn.equals("792-ER cnbj-rjhi") && (ln.equals(66)) && ld < 26) {
                          w4 = w3 - (ts + tst + (50*wkk)/50);
                          w5 = w4 / 60; w6 = w4 % 60; lp1 = 26 - ld;km=50;
                          lpr = Math.floor((3.0 / 80.0) * lp1 * wkk);
                          dr = Math.floor((w4 * 20.0) / 60);
                          sr = Math.floor((ts * 30.0) / 60);
                          tr = Math.ceil( sr + dr +(112*wkk)/km)-lpr;
                          tv1.setText(String.valueOf("R/T   "+(50*wkk/km)/60 )+" : "+(50*wkk/km)%60+"  "+" Ration "+(112*wkk)/km);
                          tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                          tv4.setText(String.valueOf("Total Ration " + tr));
                          tv5.setText(String.valueOf("Shunting Ration " + sr));
                          tv6.setText(String.valueOf(" Detention Ration " + dr));
                          tv7.setText(String.valueOf(" Load Minus " + lpr));
                      } else if (tn.equals("792-ER cnbj-rjhi") && (ln.equals(66)) && ld == 26) {
                          w4 = w3 - (ts + tst + (50*wkk)/50);
                          w5 = w4 / 60;  w6 = w4 % 60;km = 50;
                          dr = Math.ceil((w4 * 20.0) / 60);
                          sr = Math.ceil((ts * 30.0) / 60);
                          tr = Math.ceil( sr + dr + (112*wkk)/km);
                          tv1.setText(String.valueOf("R/T   "+(50*wkk/km)/60 )+" : "+(50*wkk/km)%60+"  "+" Ration "+(112*wkk)/km);
                          tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                          tv4.setText(String.valueOf("Total Ration " + tr));
                          tv5.setText(String.valueOf("Shunting Ration " + sr));
                          tv6.setText(String.valueOf(" Detention Ration " + dr));
                          tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                      }
                      else if (tn.equals("791-ER rjhi-cnbj") && (ln.equals(66)) && ld > 26) {
                          w4 = w3 - (ts + tst + (50*wkk)/50);
                          w5 = w4 / 60; w6 = w4 % 60;  lp1 = ld - 26;km=50;
                          lpr = Math.ceil((4.0 / 80.0) * lp1 * wkk);
                          dr = Math.ceil((w4 * 20.0) / 60);
                          sr = Math.ceil((ts * 30.0) / 60);
                          tr = Math.ceil( sr + dr +lpr+ (115*wkk)/km);
                          tv1.setText(String.valueOf("R/T   "+(50*wkk/km)/60 )+" : "+(50*wkk/km)%60+"  "+" Ration " + (115*wkk)/km);
                          tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                          tv4.setText(String.valueOf("Total Ration " + tr));
                          tv5.setText(String.valueOf("Shunting Ration " + sr));
                          tv6.setText(String.valueOf(" Detention Ration " + dr));
                          tv7.setText(String.valueOf(" Load Plus " + lpr));
                      } else if (tn.equals("791-ER rjhi-cnbj") && (ln.equals(66)) && ld < 26) {
                          w4 = w3 - (ts + tst + (50*wkk)/50);
                          w5 = w4 / 60; w6 = w4 % 60; lp1 = 26 - ld;km=50;
                          lpr = Math.floor((3.0 / 80.0) * lp1 * wkk);
                          dr = Math.floor((w4 * 20.0) / 60);
                          sr = Math.floor((ts * 30.0) / 60);
                          tr = Math.ceil( sr + dr +(115*wkk)/km)-lpr;
                          tv1.setText(String.valueOf("R/T   "+(50*wkk/km)/60 )+" : "+(50*wkk/km)%60+"  "+" Ration "+(115*wkk)/km);
                          tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                          tv4.setText(String.valueOf("Total Ration " + tr));
                          tv5.setText(String.valueOf("Shunting Ration " + sr));
                          tv6.setText(String.valueOf(" Detention Ration " + dr));
                          tv7.setText(String.valueOf(" Load Minus " + lpr));
                      } else if (tn.equals("791-ER rjhi-cnbj") && (ln.equals(66)) && ld == 26) {
                          w4 = w3 - (ts + tst + (50*wkk)/50);
                          w5 = w4 / 60;  w6 = w4 % 60;km = 50;
                          dr = Math.ceil((w4 * 20.0) / 60);
                          sr = Math.ceil((ts * 30.0) / 60);
                          tr = Math.ceil( sr + dr + (115*wkk)/km);
                          tv1.setText(String.valueOf("R/T   "+(50*wkk/km)/60 )+" : "+(50*wkk/km)%60+"  "+" Ration "+(115*wkk)/km);
                          tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                          tv4.setText(String.valueOf("Total Ration " + tr));
                          tv5.setText(String.valueOf("Shunting Ration " + sr));
                          tv6.setText(String.valueOf(" Detention Ration " + dr));
                          tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                      }
                      else if (tn.equals("755 isd-rjhi") && (ln.equals(66)) && ld > 24) {
                          w4 = w3 - (ts + tst + (70*wkk)/59);
                          w5 = w4 / 60; w6 = w4 % 60;  lp1 = ld - 24;km=59;
                          lpr = Math.ceil((8.0 / 80.0) * lp1 * wkk);
                          dr = Math.ceil((w4 * 20.0) / 60);
                          sr = Math.ceil((ts * 30.0) / 60);
                          tr = Math.ceil( sr + dr +lpr+ (160*wkk)/km);
                          tv1.setText(String.valueOf("R/T   "+(70*wkk/km)/60 )+" : "+(70*wkk/km)%60+"  "+" Ration " + (160*wkk)/km);
                          tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                          tv4.setText(String.valueOf("Total Ration " + tr));
                          tv5.setText(String.valueOf("Shunting Ration " + sr));
                          tv6.setText(String.valueOf(" Detention Ration " + dr));
                          tv7.setText(String.valueOf(" Load Plus " + lpr));
                      } else if (tn.equals("755 isd-rjhi") && (ln.equals(66)) && ld < 24) {
                          w4 = w3 - (ts + tst + (70*wkk)/59);
                          w5 = w4 / 60; w6 = w4 % 60; lp1 = 24 - ld;km=59;
                          lpr = Math.floor((6.0 / 80.0) * lp1 * wkk);
                          dr = Math.floor((w4 * 20.0) / 60);
                          sr = Math.floor((ts * 30.0) / 60);
                          tr = Math.ceil( sr + dr +(160*wkk)/km)-lpr;
                          tv1.setText(String.valueOf("R/T   "+(70*wkk/km)/60 )+" : "+(70*wkk/km)%60+"  "+" Ration "+(160*wkk)/km);
                          tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                          tv4.setText(String.valueOf("Total Ration " + tr));
                          tv5.setText(String.valueOf("Shunting Ration " + sr));
                          tv6.setText(String.valueOf(" Detention Ration " + dr));
                          tv7.setText(String.valueOf(" Load Minus " + lpr));
                      } else if (tn.equals("755 isd-rjhi") && (ln.equals(66)) && ld == 24) {
                          w4 = w3 - (ts + tst + (70*wkk)/59);
                          w5 = w4 / 60;  w6 = w4 % 60;km = 59;
                          dr = Math.ceil((w4 * 20.0) / 60);
                          sr = Math.ceil((ts * 30.0) / 60);
                          tr = Math.ceil( sr + dr + (160*wkk)/km);
                          tv1.setText(String.valueOf("R/T   "+(70*wkk/km)/60 )+" : "+(70*wkk/km)%60+"  "+" Ration "+(160*wkk)/km);
                          tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                          tv4.setText(String.valueOf("Total Ration " + tr));
                          tv5.setText(String.valueOf("Shunting Ration " + sr));
                          tv6.setText(String.valueOf(" Detention Ration " + dr));
                          tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                      }
                      else if (tn.equals("755 isd-rjhi") && (ln.equals(65)) && ld > 18) {
                          w4 = w3 - (ts + tst + (70*wkk)/59);
                          w5 = w4 / 60; w6 = w4 % 60;  lp1 = ld - 18;km=59;
                          lpr = Math.ceil((8.0 / 80.0) * lp1 * wkk);
                          dr = Math.ceil((w4 * 20.0) / 60);
                          sr = Math.ceil((ts * 30.0) / 60);
                          tr = Math.ceil( sr + dr +lpr+ (120*wkk)/km);
                          tv1.setText(String.valueOf("R/T   "+(70*wkk/km)/60 )+" : "+(70*wkk/km)%60+"  "+" Ration " + (120*wkk)/km);
                          tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                          tv4.setText(String.valueOf("Total Ration " + tr));
                          tv5.setText(String.valueOf("Shunting Ration " + sr));
                          tv6.setText(String.valueOf(" Detention Ration " + dr));
                          tv7.setText(String.valueOf(" Load Plus " + lpr));
                      } else if (tn.equals("755 isd-rjhi") && (ln.equals(65)) && ld < 18) {
                          w4 = w3 - (ts + tst + (70*wkk)/59);
                          w5 = w4 / 60; w6 = w4 % 60; lp1 = 18 - ld;km=59;
                          lpr = Math.floor((6.0 / 80.0) * lp1 * wkk);
                          dr = Math.floor((w4 * 20.0) / 60);
                          sr = Math.floor((ts * 30.0) / 60);
                          tr = Math.ceil( sr + dr +(120*wkk)/km)-lpr;
                          tv1.setText(String.valueOf("R/T   "+(70*wkk/km)/60 )+" : "+(70*wkk/km)%60+"  "+" Ration "+(120*wkk)/km);
                          tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                          tv4.setText(String.valueOf("Total Ration " + tr));
                          tv5.setText(String.valueOf("Shunting Ration " + sr));
                          tv6.setText(String.valueOf(" Detention Ration " + dr));
                          tv7.setText(String.valueOf(" Load Minus " + lpr));
                      } else if (tn.equals("755 isd-rjhi") && (ln.equals(65)) && ld == 18) {
                          w4 = w3 - (ts + tst + (70*wkk)/59);
                          w5 = w4 / 60;  w6 = w4 % 60;km = 59;
                          dr = Math.ceil((w4 * 20.0) / 60);
                          sr = Math.ceil((ts * 30.0) / 60);
                          tr = Math.ceil( sr + dr + (120*wkk)/km);
                          tv1.setText(String.valueOf("R/T   "+(70*wkk/km)/60 )+" : "+(70*wkk/km)%60+"  "+" Ration "+(120*wkk)/km);
                          tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                          tv4.setText(String.valueOf("Total Ration " + tr));
                          tv5.setText(String.valueOf("Shunting Ration " + sr));
                          tv6.setText(String.valueOf(" Detention Ration " + dr));
                          tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                      }
                      else if (tn.equals("756 rjhi-isd") && (ln.equals(66)) && ld > 24) {
                          w4 = w3 - (ts + tst + (60*wkk)/59);
                          w5 = w4 / 60; w6 = w4 % 60;  lp1 = ld - 24;km=59;
                          lpr = Math.ceil((8.0 / 80.0) * lp1 * wkk);
                          dr = Math.ceil((w4 * 20.0) / 60);
                          sr = Math.ceil((ts * 30.0) / 60);
                          tr = Math.ceil( sr + dr +lpr+ (170*wkk)/km);
                          tv1.setText(String.valueOf("R/T   "+(60*wkk/km)/60 )+" : "+(60*wkk/km)%60+"  "+" Ration " + (170*wkk)/km);
                          tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                          tv4.setText(String.valueOf("Total Ration " + tr));
                          tv5.setText(String.valueOf("Shunting Ration " + sr));
                          tv6.setText(String.valueOf(" Detention Ration " + dr));
                          tv7.setText(String.valueOf(" Load Plus " + lpr));
                      } else if (tn.equals("756 rjhi-isd") && (ln.equals(66)) && ld < 24) {
                          w4 = w3 - (ts + tst + (60*wkk)/59);
                          w5 = w4 / 60; w6 = w4 % 60; lp1 = 24 - ld;km=59;
                          lpr = Math.floor((6.0 / 80.0) * lp1 * wkk);
                          dr = Math.floor((w4 * 20.0) / 60);
                          sr = Math.floor((ts * 30.0) / 60);
                          tr = Math.ceil( sr + dr +(170*wkk)/km)-lpr;
                          tv1.setText(String.valueOf("R/T   "+(60*wkk/km)/60 )+" : "+(60*wkk/km)%60+"  "+" Ration "+(170*wkk)/km);
                          tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                          tv4.setText(String.valueOf("Total Ration " + tr));
                          tv5.setText(String.valueOf("Shunting Ration " + sr));
                          tv6.setText(String.valueOf(" Detention Ration " + dr));
                          tv7.setText(String.valueOf(" Load Minus " + lpr));
                      } else if (tn.equals("756 rjhi-isd") && (ln.equals(66)) && ld == 24) {
                          w4 = w3 - (ts + tst + (60*wkk)/59);
                          w5 = w4 / 60;  w6 = w4 % 60;km = 59;
                          dr = Math.ceil((w4 * 20.0) / 60);
                          sr = Math.ceil((ts * 30.0) / 60);
                          tr = Math.ceil( sr + dr + (170*wkk)/km);
                          tv1.setText(String.valueOf("R/T   "+(60*wkk/km)/60 )+" : "+(60*wkk/km)%60+"  "+" Ration "+(170*wkk)/km);
                          tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                          tv4.setText(String.valueOf("Total Ration " + tr));
                          tv5.setText(String.valueOf("Shunting Ration " + sr));
                          tv6.setText(String.valueOf(" Detention Ration " + dr));
                          tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                      }
                      else if (tn.equals("803 rjhi-pbt") && (ln.equals(66)) && ld > 20) {
                          w4 = w3 - (ts + tst + (295*wkk)/200);
                          w5 = w4 / 60; w6 = w4 % 60;  lp1 = ld - 20;km=200;
                          lpr = Math.ceil((4.0 / 80.0) * lp1 * wkk);
                          dr = Math.ceil((w4 * 20.0) / 60);
                          sr = Math.ceil((ts * 30.0) / 60);
                          tr = Math.ceil( sr + dr +lpr+ (480*wkk)/km);
                          tv1.setText(String.valueOf("R/T   "+(295*wkk/km)/60 )+" : "+(295*wkk/km)%60+"  "+" Ration " + (480*wkk)/km);
                          tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                          tv4.setText(String.valueOf("Total Ration " + tr));
                          tv5.setText(String.valueOf("Shunting Ration " + sr));
                          tv6.setText(String.valueOf(" Detention Ration " + dr));
                          tv7.setText(String.valueOf(" Load Plus " + lpr));
                      } else if (tn.equals("803 rjhi-pbt") && (ln.equals(66)) && ld < 20) {
                          w4 = w3 - (ts + tst + (295*wkk)/200);
                          w5 = w4 / 60; w6 = w4 % 60; lp1 = 20 - ld;km=200;
                          lpr = Math.floor((3.0 / 80.0) * lp1 * wkk);
                          dr = Math.floor((w4 * 20.0) / 60);
                          sr = Math.floor((ts * 30.0) / 60);
                          tr = Math.ceil( sr + dr +(480*wkk)/km)-lpr;
                          tv1.setText(String.valueOf("R/T   "+(295*wkk/km)/60 )+" : "+(295*wkk/km)%60+"  "+" Ration "+(480*wkk)/km);
                          tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                          tv4.setText(String.valueOf("Total Ration " + tr));
                          tv5.setText(String.valueOf("Shunting Ration " + sr));
                          tv6.setText(String.valueOf(" Detention Ration " + dr));
                          tv7.setText(String.valueOf(" Load Minus " + lpr));
                      } else if (tn.equals("803 rjhi-pbt") && (ln.equals(66)) && ld == 20) {
                          w4 = w3 - (ts + tst + (295*wkk)/200);
                          w5 = w4 / 60;  w6 = w4 % 60;km = 200;
                          dr = Math.ceil((w4 * 20.0) / 60);
                          sr = Math.ceil((ts * 30.0) / 60);
                          tr = Math.ceil( sr + dr + (480*wkk)/km);
                          tv1.setText(String.valueOf("R/T   "+(295*wkk/km)/60 )+" : "+(295*wkk/km)%60+"  "+" Ration "+(480*wkk)/km);
                          tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                          tv4.setText(String.valueOf("Total Ration " + tr));
                          tv5.setText(String.valueOf("Shunting Ration " + sr));
                          tv6.setText(String.valueOf(" Detention Ration " + dr));
                          tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                      }
                      else if (tn.equals("803 rjhi-pbt") && (ln.equals(65)) && ld > 18) {
                          w4 = w3 - (ts + tst + (295*wkk)/200);
                          w5 = w4 / 60; w6 = w4 % 60;  lp1 = ld - 18;km=200;
                          lpr = Math.ceil((4.0 / 80.0) * lp1 * wkk);
                          dr = Math.ceil((w4 * 20.0) / 60);
                          sr = Math.ceil((ts * 30.0) / 60);
                          tr = Math.ceil( sr + dr +lpr+ (438*wkk)/km);
                          tv1.setText(String.valueOf("R/T   "+(295*wkk/km)/60 )+" : "+(295*wkk/km)%60+"  "+" Ration " + (438*wkk)/km);
                          tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                          tv4.setText(String.valueOf("Total Ration " + tr));
                          tv5.setText(String.valueOf("Shunting Ration " + sr));
                          tv6.setText(String.valueOf(" Detention Ration " + dr));
                          tv7.setText(String.valueOf(" Load Plus " + lpr));
                      } else if (tn.equals("803 rjhi-pbt") && (ln.equals(65)) && ld < 18) {
                          w4 = w3 - (ts + tst + (295*wkk)/200);
                          w5 = w4 / 60; w6 = w4 % 60; lp1 = 18- ld;km=200;
                          lpr = Math.floor((3.0 / 80.0) * lp1 * wkk);
                          dr = Math.floor((w4 * 20.0) / 60);
                          sr = Math.floor((ts * 30.0) / 60);
                          tr = Math.ceil( sr + dr +(438*wkk)/km)-lpr;
                          tv1.setText(String.valueOf("R/T   "+(295*wkk/km)/60 )+" : "+(295*wkk/km)%60+"  "+" Ration "+(438*wkk)/km);
                          tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                          tv4.setText(String.valueOf("Total Ration " + tr));
                          tv5.setText(String.valueOf("Shunting Ration " + sr));
                          tv6.setText(String.valueOf(" Detention Ration " + dr));
                          tv7.setText(String.valueOf(" Load Minus " + lpr));
                      } else if (tn.equals("803 rjhi-pbt") && (ln.equals(65)) && ld == 18) {
                          w4 = w3 - (ts + tst + (295*wkk)/200);
                          w5 = w4 / 60;  w6 = w4 % 60;km = 200;
                          dr = Math.ceil((w4 * 20.0) / 60);
                          sr = Math.ceil((ts * 30.0) / 60);
                          tr = Math.ceil( sr + dr + (438*wkk)/km);
                          tv1.setText(String.valueOf("R/T   "+(295*wkk/km)/60 )+" : "+(295*wkk/km)%60+"  "+" Ration "+(438*wkk)/km);
                          tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                          tv4.setText(String.valueOf("Total Ration " + tr));
                          tv5.setText(String.valueOf("Shunting Ration " + sr));
                          tv6.setText(String.valueOf(" Detention Ration " + dr));
                          tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                      }
                      else if (tn.equals("804 pbt-rjhi") && (ln.equals(65)) && ld > 18) {
                          w4 = w3 - (ts + tst + (340*wkk)/200);
                          w5 = w4 / 60; w6 = w4 % 60;  lp1 = ld - 18;km=200;
                          lpr = Math.ceil((4.0 / 80.0) * lp1 * wkk);
                          dr = Math.ceil((w4 * 20.0) / 60);
                          sr = Math.ceil((ts * 30.0) / 60);
                          tr = Math.ceil( sr + dr +lpr+ (450*wkk)/km);
                          tv1.setText(String.valueOf("R/T   "+(340*wkk/km)/60 )+" : "+(340*wkk/km)%60+"  "+" Ration " + (450*wkk)/km);
                          tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                          tv4.setText(String.valueOf("Total Ration " + tr));
                          tv5.setText(String.valueOf("Shunting Ration " + sr));
                          tv6.setText(String.valueOf(" Detention Ration " + dr));
                          tv7.setText(String.valueOf(" Load Plus " + lpr));
                      } else if (tn.equals("804 pbt-rjhi") && (ln.equals(65)) && ld < 18) {
                          w4 = w3 - (ts + tst + (340*wkk)/200);
                          w5 = w4 / 60; w6 = w4 % 60; lp1 = 18- ld;km=200;
                          lpr = Math.floor((3.0 / 80.0) * lp1 * wkk);
                          dr = Math.floor((w4 * 20.0) / 60);
                          sr = Math.floor((ts * 30.0) / 60);
                          tr = Math.ceil( sr + dr +(450*wkk)/km)-lpr;
                          tv1.setText(String.valueOf("R/T   "+(340*wkk/km)/60 )+" : "+(340*wkk/km)%60+"  "+" Ration "+(450*wkk)/km);
                          tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                          tv4.setText(String.valueOf("Total Ration " + tr));
                          tv5.setText(String.valueOf("Shunting Ration " + sr));
                          tv6.setText(String.valueOf(" Detention Ration " + dr));
                          tv7.setText(String.valueOf(" Load Minus " + lpr));
                      } else if (tn.equals("804 pbt-rjhi") && (ln.equals(65)) && ld == 18) {
                          w4 = w3 - (ts + tst + (340*wkk)/200);
                          w5 = w4 / 60;  w6 = w4 % 60;km = 200;
                          dr = Math.ceil((w4 * 20.0) / 60);
                          sr = Math.ceil((ts * 30.0) / 60);
                          tr = Math.ceil( sr + dr + (450*wkk)/km);
                          tv1.setText(String.valueOf("R/T   "+(340*wkk/km)/60 )+" : "+(340*wkk/km)%60+"  "+" Ration "+(450*wkk)/km);
                          tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                          tv4.setText(String.valueOf("Total Ration " + tr));
                          tv5.setText(String.valueOf("Shunting Ration " + sr));
                          tv6.setText(String.valueOf(" Detention Ration " + dr));
                          tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                      }
                      else if (tn.equals("804 pbt-rjhi") && (ln.equals(66)) && ld > 20) {
                          w4 = w3 - (ts + tst + (340*wkk)/200);
                          w5 = w4 / 60; w6 = w4 % 60;  lp1 = ld -20;km=200;
                          lpr = Math.ceil((4.0 / 80.0) * lp1 * wkk);
                          dr = Math.ceil((w4 * 20.0) / 60);
                          sr = Math.ceil((ts * 30.0) / 60);
                          tr = Math.ceil( sr + dr +lpr+ (495*wkk)/km);
                          tv1.setText(String.valueOf("R/T   "+(340*wkk/km)/60 )+" : "+(340*wkk/km)%60+"  "+" Ration " + (495*wkk)/km);
                          tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                          tv4.setText(String.valueOf("Total Ration " + tr));
                          tv5.setText(String.valueOf("Shunting Ration " + sr));
                          tv6.setText(String.valueOf(" Detention Ration " + dr));
                          tv7.setText(String.valueOf(" Load Plus " + lpr));
                      } else if (tn.equals("804 pbt-rjhi") && (ln.equals(66)) && ld < 20) {
                          w4 = w3 - (ts + tst + (340*wkk)/200);
                          w5 = w4 / 60; w6 = w4 % 60; lp1 = 20- ld;km=200;
                          lpr = Math.floor((3.0 / 80.0) * lp1 * wkk);
                          dr = Math.floor((w4 * 20.0) / 60);
                          sr = Math.floor((ts * 30.0) / 60);
                          tr = Math.ceil( sr + dr +(495*wkk)/km)-lpr;
                          tv1.setText(String.valueOf("R/T   "+(340*wkk/km)/60 )+" : "+(340*wkk/km)%60+"  "+" Ration "+(495*wkk)/km);
                          tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                          tv4.setText(String.valueOf("Total Ration " + tr));
                          tv5.setText(String.valueOf("Shunting Ration " + sr));
                          tv6.setText(String.valueOf(" Detention Ration " + dr));
                          tv7.setText(String.valueOf(" Load Minus " + lpr));
                      } else if (tn.equals("804 pbt-rjhi") && (ln.equals(66)) && ld == 20) {
                          w4 = w3 - (ts + tst + (340*wkk)/200);
                          w5 = w4 / 60;  w6 = w4 % 60;km = 200;
                          dr = Math.ceil((w4 * 20.0) / 60);
                          sr = Math.ceil((ts * 30.0) / 60);
                          tr = Math.ceil( sr + dr + (495*wkk)/km);
                          tv1.setText(String.valueOf("R/T   "+(340*wkk/km)/60 )+" : "+(340*wkk/km)%60+"  "+" Ration "+(495*wkk)/km);
                          tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                          tv4.setText(String.valueOf("Total Ration " + tr));
                          tv5.setText(String.valueOf("Shunting Ration " + sr));
                          tv6.setText(String.valueOf(" Detention Ration " + dr));
                          tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                      }
                      else if (tn.equals("783 isd-rjhi") && (ln.equals(65)) && ld > 18) {
                          w4 = w3 - (ts + tst + (75*wkk)/59);
                          w5 = w4 / 60; w6 = w4 % 60;  lp1 = ld -18;km=59;
                          lpr = Math.ceil((4.0 / 80.0) * lp1 * wkk);
                          dr = Math.ceil((w4 * 20.0) / 60);
                          sr = Math.ceil((ts * 30.0) / 60);
                          tr = Math.ceil( sr + dr +lpr+ (130*wkk)/km);
                          tv1.setText(String.valueOf("R/T   "+(75*wkk/km)/60 )+" : "+(75*wkk/km)%60+"  "+" Ration " + (130*wkk)/km);
                          tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                          tv4.setText(String.valueOf("Total Ration " + tr));
                          tv5.setText(String.valueOf("Shunting Ration " + sr));
                          tv6.setText(String.valueOf(" Detention Ration " + dr));
                          tv7.setText(String.valueOf(" Load Plus " + lpr));
                      } else if (tn.equals("783 isd-rjhi") && (ln.equals(65)) && ld < 18) {
                          w4 = w3 - (ts + tst + (75*wkk)/59);
                          w5 = w4 / 60; w6 = w4 % 60; lp1 = 18- ld;km=59;
                          lpr = Math.floor((3.0 / 80.0) * lp1 * wkk);
                          dr = Math.floor((w4 * 20.0) / 60);
                          sr = Math.floor((ts * 30.0) / 60);
                          tr = Math.ceil( sr + dr +(130*wkk)/km)-lpr;
                          tv1.setText(String.valueOf("R/T   "+(75*wkk/km)/60 )+" : "+(75*wkk/km)%60+"  "+" Ration "+(130*wkk)/km);
                          tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                          tv4.setText(String.valueOf("Total Ration " + tr));
                          tv5.setText(String.valueOf("Shunting Ration " + sr));
                          tv6.setText(String.valueOf(" Detention Ration " + dr));
                          tv7.setText(String.valueOf(" Load Minus " + lpr));
                      } else if (tn.equals("783 isd-rjhi") && (ln.equals(65)) && ld == 18) {
                          w4 = w3 - (ts + tst + (75*wkk)/59);
                          w5 = w4 / 60;  w6 = w4 % 60;km = 59;
                          dr = Math.ceil((w4 * 20.0) / 60);
                          sr = Math.ceil((ts * 30.0) / 60);
                          tr = Math.ceil( sr + dr + (130*wkk)/km);
                          tv1.setText(String.valueOf("R/T   "+(75*wkk/km)/60 )+" : "+(75*wkk/km)%60+"  "+" Ration "+(130*wkk)/km);
                          tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                          tv4.setText(String.valueOf("Total Ration " + tr));
                          tv5.setText(String.valueOf("Shunting Ration " + sr));
                          tv6.setText(String.valueOf(" Detention Ration " + dr));
                          tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                      }
                      else if (tn.equals("784 rjhi-isd") && (ln.equals(65)) && ld > 18) {
                          w4 = w3 - (ts + tst + (60*wkk)/59);
                          w5 = w4 / 60; w6 = w4 % 60;  lp1 = ld -18;km=59;
                          lpr = Math.ceil((4.0 / 80.0) * lp1 * wkk);
                          dr = Math.ceil((w4 * 20.0) / 60);
                          sr = Math.ceil((ts * 30.0) / 60);
                          tr = Math.ceil( sr + dr +lpr+ (125*wkk)/km);
                          tv1.setText(String.valueOf("R/T   "+(60*wkk/km)/60 )+" : "+(60*wkk/km)%60+"  "+" Ration " + (125*wkk)/km);
                          tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                          tv4.setText(String.valueOf("Total Ration " + tr));
                          tv5.setText(String.valueOf("Shunting Ration " + sr));
                          tv6.setText(String.valueOf(" Detention Ration " + dr));
                          tv7.setText(String.valueOf(" Load Plus " + lpr));
                      } else if (tn.equals("784 rjhi-isd") && (ln.equals(65)) && ld < 18) {
                          w4 = w3 - (ts + tst + (60*wkk)/59);
                          w5 = w4 / 60; w6 = w4 % 60; lp1 = 18- ld;km=59;
                          lpr = Math.floor((3.0 / 80.0) * lp1 * wkk);
                          dr = Math.floor((w4 * 20.0) / 60);
                          sr = Math.floor((ts * 30.0) / 60);
                          tr = Math.ceil( sr + dr +(125*wkk)/km)-lpr;
                          tv1.setText(String.valueOf("R/T   "+(60*wkk/km)/60 )+" : "+(60*wkk/km)%60+"  "+" Ration "+(125*wkk)/km);
                          tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                          tv4.setText(String.valueOf("Total Ration " + tr));
                          tv5.setText(String.valueOf("Shunting Ration " + sr));
                          tv6.setText(String.valueOf(" Detention Ration " + dr));
                          tv7.setText(String.valueOf(" Load Minus " + lpr));
                      } else if (tn.equals("784 rjhi-isd") && (ln.equals(65)) && ld == 18) {
                          w4 = w3 - (ts + tst + (60*wkk)/59);
                          w5 = w4 / 60;  w6 = w4 % 60;km = 59;
                          dr = Math.ceil((w4 * 20.0) / 60);
                          sr = Math.ceil((ts * 30.0) / 60);
                          tr = Math.ceil( sr + dr + (125*wkk)/km);
                          tv1.setText(String.valueOf("R/T   "+(60*wkk/km)/60 )+" : "+(60*wkk/km)%60+"  "+" Ration "+(125*wkk)/km);
                          tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                          tv4.setText(String.valueOf("Total Ration " + tr));
                          tv5.setText(String.valueOf("Shunting Ration " + sr));
                          tv6.setText(String.valueOf(" Detention Ration " + dr));
                          tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                      }
                      else if (tn.equals("761 isd-rjhi") && (ln.equals(65)) && ld > 18) {
                          w4 = w3 - (ts + tst + (70*wkk)/59);
                          w5 = w4 / 60; w6 = w4 % 60;  lp1 = ld -18;km=59;
                          lpr = Math.ceil((4.0 / 80.0) * lp1 * wkk);
                          dr = Math.ceil((w4 * 20.0) / 60);
                          sr = Math.ceil((ts * 30.0) / 60);
                          tr = Math.ceil( sr + dr +lpr+ (129*wkk)/km);
                          tv1.setText(String.valueOf("R/T   "+(70*wkk/km)/60 )+" : "+(70*wkk/km)%60+"  "+" Ration " + (129*wkk)/km);
                          tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                          tv4.setText(String.valueOf("Total Ration " + tr));
                          tv5.setText(String.valueOf("Shunting Ration " + sr));
                          tv6.setText(String.valueOf(" Detention Ration " + dr));
                          tv7.setText(String.valueOf(" Load Plus " + lpr));
                      } else if (tn.equals("761 isd-rjhi") && (ln.equals(65)) && ld < 18) {
                          w4 = w3 - (ts + tst + (70*wkk)/59);
                          w5 = w4 / 60; w6 = w4 % 60; lp1 = 18- ld;km=59;
                          lpr = Math.floor((3.0 / 80.0) * lp1 * wkk);
                          dr = Math.floor((w4 * 20.0) / 60);
                          sr = Math.floor((ts * 30.0) / 60);
                          tr = Math.ceil( sr + dr +(129*wkk)/km)-lpr;
                          tv1.setText(String.valueOf("R/T   "+(70*wkk/km)/60 )+" : "+(70*wkk/km)%60+"  "+" Ration "+(129*wkk)/km);
                          tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                          tv4.setText(String.valueOf("Total Ration " + tr));
                          tv5.setText(String.valueOf("Shunting Ration " + sr));
                          tv6.setText(String.valueOf(" Detention Ration " + dr));
                          tv7.setText(String.valueOf(" Load Minus " + lpr));
                      } else if (tn.equals("761 isd-rjhi") && (ln.equals(65)) && ld == 18) {
                          w4 = w3 - (ts + tst + (70*wkk)/59);
                          w5 = w4 / 60;  w6 = w4 % 60;km = 59;
                          dr = Math.ceil((w4 * 20.0) / 60);
                          sr = Math.ceil((ts * 30.0) / 60);
                          tr = Math.ceil( sr + dr + (129*wkk)/km);
                          tv1.setText(String.valueOf("R/T   "+(70*wkk/km)/60 )+" : "+(70*wkk/km)%60+"  "+" Ration "+(129*wkk)/km);
                          tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                          tv4.setText(String.valueOf("Total Ration " + tr));
                          tv5.setText(String.valueOf("Shunting Ration " + sr));
                          tv6.setText(String.valueOf(" Detention Ration " + dr));
                          tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                      }
                      else if (tn.equals("761 isd-rjhi") && (ln.equals(66)) && ld > 22) {
                          w4 = w3 - (ts + tst + (85*wkk)/59);
                          w5 = w4 / 60; w6 = w4 % 60;  lp1 = ld -22;km=59;
                          lpr = Math.ceil((4.0 / 80.0) * lp1 * wkk);
                          dr = Math.ceil((w4 * 20.0) / 60);
                          sr = Math.ceil((ts * 30.0) / 60);
                          tr = Math.ceil( sr + dr +lpr+ (154*wkk)/km);
                          tv1.setText(String.valueOf("R/T   "+(85*wkk/km)/60 )+" : "+(85*wkk/km)%60+"  "+" Ration " + (154*wkk)/km);
                          tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                          tv4.setText(String.valueOf("Total Ration " + tr));
                          tv5.setText(String.valueOf("Shunting Ration " + sr));
                          tv6.setText(String.valueOf(" Detention Ration " + dr));
                          tv7.setText(String.valueOf(" Load Plus " + lpr));
                      } else if (tn.equals("761 isd-rjhi") && (ln.equals(66)) && ld < 22) {
                          w4 = w3 - (ts + tst + (85*wkk)/59);
                          w5 = w4 / 60; w6 = w4 % 60; lp1 = 22- ld;km=59;
                          lpr = Math.floor((3.0 / 80.0) * lp1 * wkk);
                          dr = Math.floor((w4 * 20.0) / 60);
                          sr = Math.floor((ts * 30.0) / 60);
                          tr = Math.ceil( sr + dr +(154*wkk)/km)-lpr;
                          tv1.setText(String.valueOf("R/T   "+(85*wkk/km)/60 )+" : "+(85*wkk/km)%60+"  "+" Ration "+(154*wkk)/km);
                          tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                          tv4.setText(String.valueOf("Total Ration " + tr));
                          tv5.setText(String.valueOf("Shunting Ration " + sr));
                          tv6.setText(String.valueOf(" Detention Ration " + dr));
                          tv7.setText(String.valueOf(" Load Minus " + lpr));
                      } else if (tn.equals("761 isd-rjhi") && (ln.equals(66)) && ld == 22) {
                          w4 = w3 - (ts + tst + (85*wkk)/59);
                          w5 = w4 / 60;  w6 = w4 % 60;km = 59;
                          dr = Math.ceil((w4 * 20.0) / 60);
                          sr = Math.ceil((ts * 30.0) / 60);
                          tr = Math.ceil( sr + dr + (154*wkk)/km);
                          tv1.setText(String.valueOf("R/T   "+(85*wkk/km)/60 )+" : "+(85*wkk/km)%60+"  "+" Ration "+(154*wkk)/km);
                          tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                          tv4.setText(String.valueOf("Total Ration " + tr));
                          tv5.setText(String.valueOf("Shunting Ration " + sr));
                          tv6.setText(String.valueOf(" Detention Ration " + dr));
                          tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                      }
                      else if ((tn.equals("762 rjhi-isd")||tn.equals("715 isd-rjhi")) && (ln.equals(66)) && ld > 22) {
                          w4 = w3 - (ts + tst + (70*wkk)/59);
                          w5 = w4 / 60; w6 = w4 % 60;  lp1 = ld -22;km=59;
                          lpr = Math.ceil((4.0 / 80.0) * lp1 * wkk);
                          dr = Math.ceil((w4 * 20.0) / 60);
                          sr = Math.ceil((ts * 30.0) / 60);
                          tr = Math.ceil( sr + dr +lpr+ (148*wkk)/km);
                          tv1.setText(String.valueOf("R/T   "+(70*wkk/km)/60 )+" : "+(70*wkk/km)%60+"  "+" Ration " + (148*wkk)/km);
                          tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                          tv4.setText(String.valueOf("Total Ration " + tr));
                          tv5.setText(String.valueOf("Shunting Ration " + sr));
                          tv6.setText(String.valueOf(" Detention Ration " + dr));
                          tv7.setText(String.valueOf(" Load Plus " + lpr));
                      } else if ((tn.equals("762 rjhi-isd")||tn.equals("715 isd-rjhi")) && (ln.equals(66)) && ld < 22) {
                          w4 = w3 - (ts + tst + (70*wkk)/59);
                          w5 = w4 / 60; w6 = w4 % 60; lp1 = 22- ld;km=59;
                          lpr = Math.floor((3.0 / 80.0) * lp1 * wkk);
                          dr = Math.floor((w4 * 20.0) / 60);
                          sr = Math.floor((ts * 30.0) / 60);
                          tr = Math.ceil( sr + dr +(148*wkk)/km)-lpr;
                          tv1.setText(String.valueOf("R/T   "+(70*wkk/km)/60 )+" : "+(70*wkk/km)%60+"  "+" Ration "+(148*wkk)/km);
                          tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                          tv4.setText(String.valueOf("Total Ration " + tr));
                          tv5.setText(String.valueOf("Shunting Ration " + sr));
                          tv6.setText(String.valueOf(" Detention Ration " + dr));
                          tv7.setText(String.valueOf(" Load Minus " + lpr));
                      } else if ((tn.equals("762 rjhi-isd")||tn.equals("715 isd-rjhi")) && (ln.equals(66)) && ld == 22) {
                          w4 = w3 - (ts + tst + (70*wkk)/59);
                          w5 = w4 / 60;  w6 = w4 % 60;km = 59;
                          dr = Math.ceil((w4 * 20.0) / 60);
                          sr = Math.ceil((ts * 30.0) / 60);
                          tr = Math.ceil( sr + dr + (148*wkk)/km);
                          tv1.setText(String.valueOf("R/T   "+(70*wkk/km)/60 )+" : "+(70*wkk/km)%60+"  "+" Ration "+(148*wkk)/km);
                          tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                          tv4.setText(String.valueOf("Total Ration " + tr));
                          tv5.setText(String.valueOf("Shunting Ration " + sr));
                          tv6.setText(String.valueOf(" Detention Ration " + dr));
                          tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                      }
                      else if (tn.equals("762 rjhi-isd") && (ln.equals(65)) && ld > 18) {
                          w4 = w3 - (ts + tst + (65*wkk)/59);
                          w5 = w4 / 60; w6 = w4 % 60;  lp1 = ld -18;km=59;
                          lpr = Math.ceil((4.0 / 80.0) * lp1 * wkk);
                          dr = Math.ceil((w4 * 20.0) / 60);
                          sr = Math.ceil((ts * 30.0) / 60);
                          tr = Math.ceil( sr + dr +lpr+ (129*wkk)/km);
                          tv1.setText(String.valueOf("R/T   "+(65*wkk/km)/60 )+" : "+(65*wkk/km)%60+"  "+" Ration " + (129*wkk)/km);
                          tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                          tv4.setText(String.valueOf("Total Ration " + tr));
                          tv5.setText(String.valueOf("Shunting Ration " + sr));
                          tv6.setText(String.valueOf(" Detention Ration " + dr));
                          tv7.setText(String.valueOf(" Load Plus " + lpr));
                      } else if (tn.equals("762 rjhi-isd") && (ln.equals(65)) && ld < 18) {
                          w4 = w3 - (ts + tst + (65*wkk)/59);
                          w5 = w4 / 60; w6 = w4 % 60; lp1 = 18- ld;km=59;
                          lpr = Math.floor((3.0 / 80.0) * lp1 * wkk);
                          dr = Math.floor((w4 * 20.0) / 60);
                          sr = Math.floor((ts * 30.0) / 60);
                          tr = Math.ceil( sr + dr +(129*wkk)/km)-lpr;
                          tv1.setText(String.valueOf("R/T   "+(65*wkk/km)/60 )+" : "+(65*wkk/km)%60+"  "+" Ration "+(129*wkk)/km);
                          tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                          tv4.setText(String.valueOf("Total Ration " + tr));
                          tv5.setText(String.valueOf("Shunting Ration " + sr));
                          tv6.setText(String.valueOf(" Detention Ration " + dr));
                          tv7.setText(String.valueOf(" Load Minus " + lpr));
                      } else if (tn.equals("762 rjhi-isd") && (ln.equals(65)) && ld == 18) {
                          w4 = w3 - (ts + tst + (65*wkk)/59);
                          w5 = w4 / 60;  w6 = w4 % 60;km = 59;
                          dr = Math.ceil((w4 * 20.0) / 60);
                          sr = Math.ceil((ts * 30.0) / 60);
                          tr = Math.ceil( sr + dr + (129*wkk)/km);
                          tv1.setText(String.valueOf("R/T   "+(65*wkk/km)/60 )+" : "+(65*wkk/km)%60+"  "+" Ration "+(129*wkk)/km);
                          tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                          tv4.setText(String.valueOf("Total Ration " + tr));
                          tv5.setText(String.valueOf("Shunting Ration " + sr));
                          tv6.setText(String.valueOf(" Detention Ration " + dr));
                          tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                      }
                      else if (tn.equals("716 rjhi-isd") && (ln.equals(66)) && ld > 22) {
                          w4 = w3 - (ts + tst + (60*wkk)/59);
                          w5 = w4 / 60; w6 = w4 % 60;  lp1 = ld -22;km=59;
                          lpr = Math.ceil((4.0 / 80.0) * lp1 * wkk);
                          dr = Math.ceil((w4 * 20.0) / 60);
                          sr = Math.ceil((ts * 30.0) / 60);
                          tr = Math.ceil( sr + dr +lpr+ (145*wkk)/km);
                          tv1.setText(String.valueOf("R/T   "+(60*wkk/km)/60 )+" : "+(60*wkk/km)%60+"  "+" Ration " + (145*wkk)/km);
                          tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                          tv4.setText(String.valueOf("Total Ration " + tr));
                          tv5.setText(String.valueOf("Shunting Ration " + sr));
                          tv6.setText(String.valueOf(" Detention Ration " + dr));
                          tv7.setText(String.valueOf(" Load Plus " + lpr));
                      } else if (tn.equals("716 rjhi-isd") && (ln.equals(66)) && ld < 22) {
                          w4 = w3 - (ts + tst + (60*wkk)/59);
                          w5 = w4 / 60; w6 = w4 % 60; lp1 = 22- ld;km=59;
                          lpr = Math.floor((3.0 / 80.0) * lp1 * wkk);
                          dr = Math.floor((w4 * 20.0) / 60);
                          sr = Math.floor((ts * 30.0) / 60);
                          tr = Math.ceil( sr + dr +(145*wkk)/km)-lpr;
                          tv1.setText(String.valueOf("R/T   "+(60*wkk/km)/60 )+" : "+(60*wkk/km)%60+"  "+" Ration "+(145*wkk)/km);
                          tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                          tv4.setText(String.valueOf("Total Ration " + tr));
                          tv5.setText(String.valueOf("Shunting Ration " + sr));
                          tv6.setText(String.valueOf(" Detention Ration " + dr));
                          tv7.setText(String.valueOf(" Load Minus " + lpr));
                      } else if (tn.equals("716 rjhi-isd") && (ln.equals(66)) && ld == 22) {
                          w4 = w3 - (ts + tst + (60*wkk)/59);
                          w5 = w4 / 60;  w6 = w4 % 60;km = 59;
                          dr = Math.ceil((w4 * 20.0) / 60);
                          sr = Math.ceil((ts * 30.0) / 60);
                          tr = Math.ceil( sr + dr + (145*wkk)/km);
                          tv1.setText(String.valueOf("R/T   "+(60*wkk/km)/60 )+" : "+(60*wkk/km)%60+"  "+" Ration "+(145*wkk)/km);
                          tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                          tv4.setText(String.valueOf("Total Ration " + tr));
                          tv5.setText(String.valueOf("Shunting Ration " + sr));
                          tv6.setText(String.valueOf(" Detention Ration " + dr));
                          tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                      }
                      else if ((tn.equals("716 rjhi-isd")||tn.equals("715 isd-rjhi")) && (ln.equals(65)) && ld > 24) {
                          w4 = w3 - (ts + tst + (65*wkk)/59);
                          w5 = w4 / 60; w6 = w4 % 60;  lp1 = ld -24;km=59;
                          lpr = Math.ceil((4.0 / 80.0) * lp1 * wkk);
                          dr = Math.ceil((w4 * 20.0) / 60);
                          sr = Math.ceil((ts * 30.0) / 60);
                          tr = Math.ceil( sr + dr +lpr+ (135*wkk)/km);
                          tv1.setText(String.valueOf("R/T   "+(65*wkk/km)/60 )+" : "+(65*wkk/km)%60+"  "+" Ration " + (135*wkk)/km);
                          tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                          tv4.setText(String.valueOf("Total Ration " + tr));
                          tv5.setText(String.valueOf("Shunting Ration " + sr));
                          tv6.setText(String.valueOf(" Detention Ration " + dr));
                          tv7.setText(String.valueOf(" Load Plus " + lpr));
                      } else if ((tn.equals("716 rjhi-isd")||tn.equals("715 isd-rjhi")) && (ln.equals(65)) && ld < 24) {
                          w4 = w3 - (ts + tst + (65*wkk)/59);
                          w5 = w4 / 60; w6 = w4 % 60; lp1 = 24- ld;km=59;
                          lpr = Math.floor((3.0 / 80.0) * lp1 * wkk);
                          dr = Math.floor((w4 * 20.0) / 60);
                          sr = Math.floor((ts * 30.0) / 60);
                          tr = Math.ceil( sr + dr +(135*wkk)/km)-lpr;
                          tv1.setText(String.valueOf("R/T   "+(65*wkk/km)/60 )+" : "+(65*wkk/km)%60+"  "+" Ration "+(135*wkk)/km);
                          tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                          tv4.setText(String.valueOf("Total Ration " + tr));
                          tv5.setText(String.valueOf("Shunting Ration " + sr));
                          tv6.setText(String.valueOf(" Detention Ration " + dr));
                          tv7.setText(String.valueOf(" Load Minus " + lpr));
                      } else if ((tn.equals("716 rjhi-isd")||tn.equals("715 isd-rjhi")) && (ln.equals(65)) && ld == 24) {
                          w4 = w3 - (ts + tst + (65*wkk)/59);
                          w5 = w4 / 60;  w6 = w4 % 60;km = 59;
                          dr = Math.ceil((w4 * 20.0) / 60);
                          sr = Math.ceil((ts * 30.0) / 60);
                          tr = Math.ceil( sr + dr + (135*wkk)/km);
                          tv1.setText(String.valueOf("R/T   "+(65*wkk/km)/60 )+" : "+(65*wkk/km)%60+"  "+" Ration "+(135*wkk)/km);
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