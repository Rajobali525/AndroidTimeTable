package com.example.timetable;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
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

public class BalenceFour extends AppCompatActivity {
    private EditText ed1, ed2, ed3, ed4, ed5, ed6, ed7, ed8, ed9, ed10,wk, ed11,ed12,ed13,ed14,ed15,ed16;
    private Button bt1, bt2;
    private TextView tv1, tv2, tv3, tv4, tv5, tv6, tv7;
    private AutoCompleteTextView autoCompleteTextView;
    Integer n1, n2, n3, n4, w1, w2, s1, s2, ts, sth, stm, tst, ln, w3, w4, rt, ra, w5, w6,wkk,km,dtkm,runh,runm,trun,trat;
    String tn;
    Double sr, dr, tr, lpr, srr, ld,dtld, lp1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_balence_four);

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
        ed15 = findViewById(R.id.determinekilometer);
        ed16 = findViewById(R.id.rationrationid);


//        ed11 = findViewById(R.id.ed11);
        bt1 = findViewById(R.id.calculateid);
        bt2 = findViewById(R.id.clearid);
        tv1 = findViewById(R.id.tv1id);
        tv2 = findViewById(R.id.tv2id);
        tv3 = findViewById(R.id.tv3id);
        tv4 = findViewById(R.id.tv4id);
        tv5 = findViewById(R.id.tv5id);
        tv6 = findViewById(R.id.tv6id);
        tv7 = findViewById(R.id.tv7id);

        ed12 = findViewById(R.id.runninghour);
        ed13 = findViewById(R.id.runningminute);

        ed14 = findViewById(R.id.determineload);




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
                    ed12.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        ed12.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (ed12.getText().toString().length() == 2) {
                    ed13.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
        ed13.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (ed13.getText().toString().length() == 2) {
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
                    ed14.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
        ed14.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (ed14.getText().toString().length() == 2) {
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
                    ed15.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
        ed15.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (ed15.getText().toString().length() == 3) {
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
                    ed16.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1.length() == 0 || ed2.length() == 0 || ed3.length() == 0 || ed4.length() == 0 || ed5.length() == 0 || ed6.length() == 0 || ed7.length() == 0 || ed8.length() == 0 || ed9.length() == 0 || ed10.length() == 0) {
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
                    dtkm = Integer.valueOf(ed15.getText().toString().trim());

                    ld = Double.valueOf(ed10.getText().toString().trim());
                    dtld =Double.valueOf(ed14.getText().toString().trim());

                    runh     = Integer.valueOf(ed12.getText().toString().trim());
                    runm = Integer.valueOf(ed13.getText().toString().trim());
                    trat = Integer.valueOf(ed16.getText().toString().trim());
                    trun = runh *60 + runm;

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


                    if  ((ln.equals(64) || ln.equals(65)||ln.equals(66)) && ld > dtld) {
                        w4 = w3 - (ts + tst + (trun * wkk) / dtkm);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = ld - dtld;
                        km = dtkm;
                        lpr = Math.ceil((4.0 / 80.0) * lp1 * wkk);
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil(sr + dr + lpr + (trat * wkk) / km);
                        tv1.setText(String.valueOf("R/T   " + (trun * wkk / km) / 60) + " : " + (trun * wkk / km) % 60 + "  " + " Ration " + (trat * wkk) / km);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    } else if ((ln.equals(64) || ln.equals(65)||ln.equals(66)) && ld < dtld) {
                        w4 = w3 - (ts + tst + (trun * wkk) / dtkm);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = dtld - ld;
                        km = dtkm;
                        lpr = Math.floor((3.0 / 80.0) * lp1 * wkk);
                        dr = Math.floor((w4 * 20.0) / 60);
                        sr = Math.floor((ts * 30.0) / 60);
                        tr = Math.ceil(sr + dr + (trat * wkk) / km) - lpr;
                        tv1.setText(String.valueOf("R/T   " + (trun * wkk / km) / 60) + " : " + (trun * wkk / km) % 60 + "  " + " Ration " + (trat * wkk) / km);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    } else if  ((ln.equals(66) || ln.equals(65)||ln.equals(64)) && ld.equals(dtld)) {
                        w4 = w3 - (ts + tst + (trun * wkk) / dtkm);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        km = dtkm;
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil(sr + dr + (trat * wkk) / km);
                        tv1.setText(String.valueOf("R/T   " + (trun * wkk / km) / 60) + " : " + (trun * wkk / km) % 60 + "  " + " Ration " + (trat * wkk) / km);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                    }
                    else if   ((ln.equals(23) || ln.equals(24)||ln.equals(25)||ln.equals(26)||ln.equals(27)||ln.equals(29)||ln.equals(30)||ln.equals(60)||ln.equals(61)) && ld > dtld) {
                        w4 = w3 - (ts + tst + (trun * wkk) / dtkm);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = ld - dtld;
                        km = dtkm;
                        lpr = Math.ceil((4.0 / 80.0) * lp1 * wkk);
                        dr = Math.ceil((w4 * 9.0) / 60);
                        sr = Math.ceil((ts * 13.0) / 60);
                        tr = Math.ceil(sr + dr + lpr + (trat * wkk) / km);
                        tv1.setText(String.valueOf("R/T   " + (trun * wkk / km) / 60) + " : " + (trun * wkk / km) % 60 + "  " + " Ration " + (trat * wkk) / km);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    } else if ((ln.equals(23) || ln.equals(24)||ln.equals(25)||ln.equals(26)||ln.equals(27)||ln.equals(29)||ln.equals(30)||ln.equals(60)||ln.equals(61)) && ld < dtld) {
                        w4 = w3 - (ts + tst + (trun * wkk) / dtkm);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = dtld - ld;
                        km = dtkm;
                        lpr = Math.floor((3.0 / 80.0) * lp1 * wkk);
                        dr = Math.floor((w4 * 9.0) / 60);
                        sr = Math.floor((ts * 13.0) / 60);
                        tr = Math.ceil(sr + dr + (trat * wkk) / km) - lpr;
                        tv1.setText(String.valueOf("R/T   " + (trun * wkk / km) / 60) + " : " + (trun * wkk / km) % 60 + "  " + " Ration " + (trat * wkk) / km);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    } else if  ((ln.equals(23) || ln.equals(24)||ln.equals(25)||ln.equals(26)||ln.equals(27)||ln.equals(29)||ln.equals(30)||ln.equals(60)||ln.equals(61)) && ld.equals(dtld)) {
                        w4 = w3 - (ts + tst + (trun * wkk) / dtkm);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        km = dtkm;
                        dr = Math.ceil((w4 * 9.0) / 60);
                        sr = Math.ceil((ts * 13.0) / 60);
                        tr = Math.ceil(sr + dr + (trat * wkk) / km);
                        tv1.setText(String.valueOf("R/T   " + (trun * wkk / km) / 60) + " : " + (trun * wkk / km) % 60 + "  " + " Ration " + (trat * wkk) / km);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));
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
                ed12.setText("");
                ed13.setText("");
                ed14.setText("");
                ed15.setText("");
                ed16.setText("");
                tv1.setText("");
                tv2.setText("");
                tv3.setText("");
                tv4.setText("");
                tv5.setText("");
                tv6.setText("");
                tv7.setText("");
                wk.setText("");


            }
        });

    }
}