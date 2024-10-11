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

public class BalenceRation extends AppCompatActivity {

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
        setContentView(R.layout.activity_balence_ration);

        autoCompleteTextView = findViewById(R.id.ed11);

        String[] Pbt = getResources().getStringArray(R.array.country);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Pbt);
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
                    w3 = w1 * 60 + w2;    ts = s1 * 60 + s2;  tst = sth * 60 + stm;
                    if (tn.equals("705 da-pbt") && (ln.equals(66)) && ld > 24) {
                        w4 = w3 - (ts + tst + (485*wkk)/375);
                        w5 = w4 / 60;   w6 = w4 % 60;  lp1 = ld - 24;
                        lpr = Math.ceil((4.0 / 80.0) * lp1 * wkk);
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr + lpr+(1018*wkk)/(375));
                       tv1.setText(String.valueOf("R/T   " + (485*wkk/375)/60 ) + " : " + (485*wkk/375)%60 + "  " + " Ration " + (1018*wkk)/375);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    } else if (tn.equals("705 da-pbt") && (ln.equals(66)) && ld < 24) {
                        w4 = w3 - (ts + tst + (485*wkk)/375);
                        w5 = w4 / 60;  w6 = w4 % 60; lp1 = 24 - ld;
                        lpr = Math.floor((3.0 / 80.0) * lp1 * wkk);
                        dr = Math.floor((w4 * 20.0) / 60);
                        sr = Math.floor((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr + ((1018*wkk)/375)-lpr);
                        tv1.setText(String.valueOf("R/T   " + (485*wkk/375)/60 ) + " : " + (485*wkk/375)%60 + " " + " Ration " + (1018*wkk)/375);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    } else if (tn.equals("705 da-pbt") && (ln.equals(66)) && ld == 24) {
                        w4 = w3 - (ts + tst + (485*wkk)/375);
                        w5 = w4 / 60;   w6 = w4 % 60;
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr + (1018*wkk)/375);
                        tv1.setText(String.valueOf("R/T   " + (485*wkk/375)/60 ) + " : " + (485*wkk/375)%60 + " " + " Ration " + (1018*wkk)/375);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                    }
                   else if (tn.equals("705 pbt-bmsm") && (ln.equals(66)) && ld > 24) {
                        w4 = w3 - (ts + tst + (155*wkk)/132);
                        w5 = w4 / 60;  w6 = w4 % 60;  lp1 = ld - 24;
                        lpr = Math.ceil((4.0 / 80.0) * lp1 * wkk);
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr +lpr+ (360*wkk)/132);
                        tv1.setText(String.valueOf("R/T   " + (155*wkk/132)/60 ) + " : " + (155*wkk/132)%60 + "  " + " Ration " + (360*wkk)/132);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    } else if (tn.equals("705 pbt-bmsm") && (ln.equals(66)) && ld < 24) {
                        w4 = w3 - (ts + tst + (155*wkk)/132);
                        w5 = w4 / 60;   w6 = w4 % 60;    lp1 = 24 - ld;
                        lpr = Math.floor((3.0 / 80.0) * lp1 * wkk);
                        dr = Math.floor((w4 * 20.0) / 60);
                        sr = Math.floor((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr +(360*wkk)/132)-lpr;
                        tv1.setText(String.valueOf("R/T   " + (155*wkk/132)/60 ) + " : " + (155*wkk/132)%60 + "  " + " Ration " + (360*wkk)/132);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    } else if (tn.equals("705 pbt-bmsm") && (ln.equals(66)) && ld == 24) {
                        w4 = w3 - (ts + tst + (155*wkk)/132);
                        w5 = w4 / 60;   w6 = w4 % 60;
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr + (360*wkk)/132);
                        tv1.setText(String.valueOf("R/T   " + (155*wkk/132)/60 ) + " : " + (155*wkk/132)%60 + " " + " Ration " + (360*wkk)/132);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                    }
                    else if (tn.equals("706 bmsm-pbt") && (ln.equals(66)) && ld > 24) {
                        w4 = w3 - (ts + tst + (160*wkk)/132);
                        w5 = w4 / 60;  w6 = w4 % 60;   lp1 = ld - 24;
                        lpr = Math.ceil((4.0 / 80.0) * lp1 * wkk);
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr +lpr+ (348*wkk)/132);
                        tv1.setText(String.valueOf("R/T   " + (160*wkk/132)/60 ) + " : " + (160*wkk/132)%60 + "  " + " Ration " + (348*wkk)/132);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    } else if (tn.equals("706 bmsm-pbt") && (ln.equals(66)) && ld < 24) {
                        w4 = w3 - (ts + tst + (160*wkk)/132);
                        w5 = w4 / 60;  w6 = w4 % 60;  lp1 = 24 - ld;
                        lpr = Math.floor((3.0 / 80.0) * lp1 * wkk);
                        dr = Math.floor((w4 * 20.0) / 60);
                        sr = Math.floor((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr +(348*wkk)/132)-lpr;
                        tv1.setText(String.valueOf("R/T  " + (160*wkk/132)/60 ) + " : " + (160*wkk/132)%60 + "  " + " Ration " + (348*wkk)/132);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    } else if (tn.equals("706 bmsm-pbt") && (ln.equals(66)) && ld == 24) {
                        w4 = w3 - (ts + tst + (160*wkk)/132);
                        w5 = w4 / 60;  w6 = w4 % 60;
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr + (348*wkk)/132);
                        tv1.setText(String.valueOf("R/T   " + (160*wkk/132)/60 ) + " : " + (160*wkk/132)%60 + "  " + " Ration " + (348*wkk)/132);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                    }
                    else if (tn.equals("706 pbt-da") && (ln.equals(66)) && ld > 24) {
                        w4 = w3 - (ts + tst + (480*wkk)/375);
                        w5 = w4 / 60;   w6 = w4 % 60;  lp1 = ld - 24;
                        lpr = Math.ceil((4.0 / 80.0) * lp1 * wkk);
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr +lpr+ (1015*wkk)/375);
                        tv1.setText(String.valueOf("R/T  " + (480*wkk/375)/60 ) + " : " + (480*wkk/375)%60 + " " + " Ration " +  (1015*wkk)/375);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    } else if (tn.equals("706 pbt-dat") && (ln.equals(66)) && ld < 24) {
                        w4 = w3 - (ts + tst + (480*wkk)/375);
                        w5 = w4 / 60;  w6 = w4 % 60; lp1 = 24 - ld;
                        lpr = Math.floor((3.0 / 80.0) * lp1 * wkk);
                        dr = Math.floor((w4 * 20.0) / 60);
                        sr = Math.floor((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr +(1015*wkk)/375)-lpr;
                        tv1.setText(String.valueOf("R/T   " + (480*wkk/375)/60 ) + " : " + (480*wkk/375)%60 + " " + " Ration " + (1015*wkk)/375);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    } else if (tn.equals("706 pbt-da") && (ln.equals(66)) && ld == 24) {
                        w4 = w3 - (ts + tst + (480*wkk)/375);
                        w5 = w4 / 60;   w6 = w4 % 60;
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr + (1015*wkk)/375);
                        tv1.setText(String.valueOf("R/T   " + (480*wkk/375)/60 ) + " : " + (480*wkk/375)%60 + "  " + " Ration " + (1015*wkk)/375);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                    }
                    else if (tn.equals("731 rjhi-pbt") && (ln.equals(66)) && ld > 20) {
                        w4 = w3 - (ts + tst + (265*wkk)/200);
                        w5 = w4 / 60;   w6 = w4 % 60;   lp1 = ld - 20;
                        lpr = Math.ceil((8.0 / 80.0) * lp1 * wkk);
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr +lpr+ (470*wkk)/200);
                        tv1.setText(String.valueOf("R/T   " + (265*wkk/200)/60 ) + " : " + (265*wkk/200)%60 + "  " + " Ration "+ (470*wkk)/200);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    } else if (tn.equals("731 rjhi-pbt") && (ln.equals(66)) && ld < 20) {
                        w4 = w3 - (ts + tst + (265*wkk)/200);
                        w5 = w4 / 60;   w6 = w4 % 60;  lp1 = 20 - ld;
                        lpr = Math.floor((6.0 / 80.0) * lp1 * wkk);
                        dr = Math.floor((w4 * 20.0) / 60);
                        sr = Math.floor((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr +(470*wkk)/200)-lpr;
                        tv1.setText(String.valueOf("R/T   " + (265*wkk/200)/60 ) + " : " + (265*wkk/200)%60 + "  " + " Ration " + (470*wkk)/200);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    } else if (tn.equals("731 rjhi-pbt") && (ln.equals(66)) && ld == 20) {
                        w4 = w3 - (ts + tst + (265*wkk)/200);
                        w5 = w4 / 60; w6 = w4 % 60;
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr + (470*wkk)/200);
                        tv1.setText(String.valueOf("R/T   " + (265*wkk/200)/60 ) + " : " + (265*wkk/200)%60 + "  " + " Ration " + (470*wkk)/200);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                    }
                    else if (tn.equals("731/732 pbt-clh-pbt") && (ln.equals(66)) && ld > 20) {
                        w4 = w3 - (ts + tst + (210*wkk)/135);
                        w5 = w4 / 60;   w6 = w4 % 60;  lp1 = ld - 20;
                        lpr = Math.ceil((8.0 / 80.0) * lp1 * wkk);
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr +lpr+ (345*wkk)/135);
                        tv1.setText(String.valueOf("R/T   " + (210*wkk/135)/60 ) + " : " + (210*wkk/135)%60 + " " + " Ration " + (345*wkk)/135);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    } else if (tn.equals("731/732 pbt-clh-pbt") && (ln.equals(66)) && ld < 20) {
                        w4 = w3 - (ts + tst + (210*wkk)/135);
                        w5 = w4 / 60; w6 = w4 % 60;  lp1 = 20 - ld;
                        lpr = Math.floor((6.0 / 80.0) * lp1 * wkk);
                        dr = Math.floor((w4 * 20.0) / 60);
                        sr = Math.floor((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr +(345*wkk)/135)-lpr;
                        tv1.setText(String.valueOf("R/T   " + (210*wkk/135)/60 ) + " : " + (210*wkk/135)%60 + "  " + " Ration " + (345*wkk)/135);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    } else if (tn.equals("731/732 pbt-clh-pbt") && (ln.equals(66)) && ld == 20) {
                        w4 = w3 - (ts + tst + (210*wkk)/135);
                        w5 = w4 / 60; w6 = w4 % 60;
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr + (345*wkk)/135);
                        tv1.setText(String.valueOf("R/T   " + (210*wkk/135)/60 ) + " : " + (210*wkk/135)%60 + "  " + " Ration " + (345*wkk)/135);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                    }
                    else if (tn.equals("732 pbt-rjhi") && (ln.equals(66)) && ld > 20) {
                        w4 = w3 - (ts + tst + (255*wkk)/200);
                        w5 = w4 / 60;   w6 = w4 % 60;  lp1 = ld - 20;
                        lpr = Math.ceil((8.0 / 80.0) * lp1 * wkk);
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr +lpr+ (465*wkk)/200);
                        tv1.setText(String.valueOf("R/T   "+(255*wkk/200)/60 )+" : "+(255*wkk/200)%60+"  "+" Ration " + (465*wkk)/200);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    } else if (tn.equals("732 pbt-rjhi") && (ln.equals(66)) && ld < 20) {
                        w4 = w3 - (ts + tst + (255*wkk)/200);
                        w5 = w4 / 60;  w6 = w4 % 60;  lp1 = 20 - ld;
                        lpr = Math.floor((6.0 / 80.0) * lp1 * wkk);
                        dr = Math.floor((w4 * 20.0) / 60);
                        sr = Math.floor((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr +(465*wkk)/200)-lpr;
                        tv1.setText(String.valueOf("R/T  "+(255*wkk/200)/60 )+" : "+(255*wkk/200)%60+"  "+" Ration "+(465*wkk)/200);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    } else if (tn.equals("732 pbt-rjhi") && (ln.equals(66)) && ld == 20) {
                        w4 = w3 - (ts + tst + (255*wkk)/200);
                        w5 = w4 / 60;   w6 = w4 % 60;
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr + (465*wkk)/200);
                        tv1.setText(String.valueOf("R/T   "+(255*wkk/200)/60 )+" : "+(255*wkk/200)%60+"  "+" Ration "+(465*wkk)/200);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                    }
                    else if (tn.equals("733 rjhi-pbt") && (ln.equals(65)) && ld > 24) {
                        w4 = w3 - (ts + tst + (290*wkk)/200);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = ld - 24;
                        lpr = Math.ceil((4.0 / 80.0) * lp1 * wkk);
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr +lpr+ (485*wkk)/200);
                        tv1.setText(String.valueOf("R/T   "+(290*wkk/200)/60 )+" : "+(290*wkk/200)%60+"  "+" Ration " + (485*wkk)/200);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    } else if (tn.equals("733 rjhi-pbt") && (ln.equals(65)) && ld < 24) {
                        w4 = w3 - (ts + tst + (290*wkk)/200);
                        w5 = w4 / 60; w6 = w4 % 60; lp1 = 24 - ld;
                        lpr = Math.floor((3.0 / 80.0) * lp1 * wkk);
                        dr = Math.floor((w4 * 20.0) / 60);
                        sr = Math.floor((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr +(485*wkk)/200)-lpr;
                        tv1.setText(String.valueOf("R/T   "+(290*wkk/200)/60 )+" : "+(290*wkk/200)%60+"  "+" Ration "+(485*wkk)/200);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    } else if (tn.equals("733 rjhi-pbt") && (ln.equals(65)) && ld == 24) {
                        w4 = w3 - (ts + tst + (290*wkk)/200);
                        w5 = w4 / 60;   w6 = w4 % 60;
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr + (485*wkk)/200);
                        tv1.setText(String.valueOf("R/T   "+(290*wkk/200)/60 )+" : "+(290*wkk/200)%60+"  "+" Ration "+(485*wkk)/200);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                    }
                    else if (tn.equals("733/734 pbt-clh-pbt") && (ln.equals(65)) && ld > 24) {
                        w4 = w3 - (ts + tst + (200*wkk)/135);
                        w5 = w4 / 60;  w6 = w4 % 60; lp1 = ld - 24;
                        lpr = Math.ceil((4.0 / 80.0) * lp1 * wkk);
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr +lpr+ (290*wkk)/135);
                        tv1.setText(String.valueOf("R/T   "+(200*wkk/135)/60 )+" : "+(200*wkk/135)%60+"  "+" Ration " + (290*wkk)/135);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    } else if (tn.equals("733/734 pbt-clh-pbt") && (ln.equals(65)) && ld < 24) {
                        w4 = w3 - (ts + tst + (200*wkk)/135);
                        w5 = w4 / 60;w6 = w4 % 60; lp1 = 24 - ld;
                        lpr = Math.floor((3.0 / 80.0) * lp1 * wkk);
                        dr = Math.floor((w4 * 20.0) / 60);
                        sr = Math.floor((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr +(290*wkk)/135)-lpr;
                        tv1.setText(String.valueOf("R/T   "+(200*wkk/135)/60 )+" : "+(200*wkk/135)%60+"  "+" Ration "+(290*wkk)/135);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    } else if (tn.equals("733/734 pbt-clh-pbt") && (ln.equals(65)) && ld == 24) {
                        w4 = w3 - (ts + tst + (200*wkk)/135);
                        w5 = w4 / 60;  w6 = w4 % 60;
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr + (290*wkk)/135);
                        tv1.setText(String.valueOf("R/T   "+(200*wkk/135)/60 )+" : "+(200*wkk/135)%60+"  "+" Ration "+(290*wkk)/135);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                    }
                    else if (tn.equals("757 da-pbt") && (ln.equals(66)) && ld > 24) {
                        w4 = w3 - (ts + tst + (435*wkk)/375);
                        w5 = w4 / 60;   w6 = w4 % 60; lp1 = ld - 24;
                        lpr = Math.ceil((4.0 / 80.0) * lp1 * wkk);
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr +lpr+ (995*wkk)/375);
                        tv1.setText(String.valueOf("R/T   "+(435*wkk/375)/60 )+" : "+(435*wkk/375)%60+"  "+" Ration " + (995*wkk)/375);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    } else if (tn.equals("757 da-pbt") && (ln.equals(66)) && ld < 24) {
                        w4 = w3 - (ts + tst + (435*wkk)/375);
                        w5 = w4 / 60;  w6 = w4 % 60;  lp1 = 24 - ld;
                        lpr = Math.floor((3.0 / 80.0) * lp1 * wkk);
                        dr = Math.floor((w4 * 20.0) / 60);
                        sr = Math.floor((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr +(995*wkk)/375)-lpr;
                        tv1.setText(String.valueOf("R/T   "+(435*wkk/375)/60 )+" : "+(435*wkk/375)%60+"  "+" Ration "+(995*wkk)/375);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    } else if (tn.equals("757 da-pbt") && (ln.equals(66)) && ld == 24) {
                        w4 = w3 - (ts + tst + (435*wkk)/375);
                        w5 = w4 / 60;    w6 = w4 % 60;
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr + (995*wkk)/375);
                        tv1.setText(String.valueOf("R/T   "+(435*wkk/375)/60 )+": "+(435*wkk/375)%60+"  "+" Ration "+(995*wkk)/375);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                    }
                    else if (tn.equals("757 pbt-bmsm") && (ln.equals(66)) && ld > 24) {
                        w4 = w3 - (ts + tst + (165*wkk)/132);
                        w5 = w4 / 60;  w6 = w4 % 60;  lp1 = ld - 24;
                        lpr = Math.ceil((4.0 / 80.0) * lp1 * wkk);
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr +lpr+ (360*wkk)/132);
                        tv1.setText(String.valueOf("R/T   "+(165*wkk/132)/60 )+" : "+(165*wkk/132)%60+"  "+" Ration " + (360*wkk)/132);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    } else if (tn.equals("757 pbt-bmsm") && (ln.equals(66)) && ld < 24) {
                        w4 = w3 - (ts + tst + (165*wkk)/132);
                        w5 = w4 / 60;   w6 = w4 % 60; lp1 = 24 - ld;
                        lpr = Math.floor((3.0 / 80.0) * lp1 * wkk);
                        dr = Math.floor((w4 * 20.0) / 60);
                        sr = Math.floor((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr +(360*wkk)/132)-lpr;
                        tv1.setText(String.valueOf("R/T   "+(165*wkk/132)/60 )+" : "+(165*wkk/132)%60+"  "+" Ration "+(360*wkk)/132);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    } else if (tn.equals("757 pbt-bmsm") && (ln.equals(66)) && ld == 24) {
                        w4 = w3 - (ts + tst + (165*wkk)/132);
                        w5 = w4 / 60; w6 = w4 % 60;
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr + (360*wkk)/132);
                        tv1.setText(String.valueOf("R/T   "+(165*wkk/132)/60 )+" : "+(165*wkk/132)%60+"  "+" Ration "+(360*wkk)/132);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                    }
                    else if (tn.equals("758 bmsm-pbt") && (ln.equals(66)) && ld > 24) {
                        w4 = w3 - (ts + tst + (170*wkk)/132);
                        w5 = w4 / 60; w6 = w4 % 60; lp1 = ld - 24;
                        lpr = Math.ceil((4.0 / 80.0) * lp1 * wkk);
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr +lpr+ (350*wkk)/132);
                        tv1.setText(String.valueOf("R/T   "+(170*wkk/132)/60 )+" : "+(170*wkk/132)%60+"  "+" Ration " + (350*wkk)/132);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    } else if (tn.equals("758 bmsm-pbt") && (ln.equals(66)) && ld < 24) {
                        w4 = w3 - (ts + tst + (170*wkk)/132);
                        w5 = w4 / 60; w6 = w4 % 60;  lp1 = 24 - ld;
                        lpr = Math.floor((3.0 / 80.0) * lp1 * wkk);
                        dr = Math.floor((w4 * 20.0) / 60);
                        sr = Math.floor((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr +(350*wkk)/132)-lpr;
                        tv1.setText(String.valueOf("R/T    "+(170*wkk/132)/60 )+" : "+(170*wkk/132)%60+"  "+" Ration "+(350*wkk)/132);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    } else if (tn.equals("758 bmsm-pbt") && (ln.equals(66)) && ld == 24) {
                        w4 = w3 - (ts + tst + (170*wkk)/132);
                        w5 = w4 / 60; w6 = w4 % 60;
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr + (350*wkk)/132);
                        tv1.setText(String.valueOf("R/T   "+(170*wkk/132)/60 )+" : "+(170*wkk/132)%60+"  "+" Ration "+(350*wkk)/132);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                    }
                    else if (tn.equals("758 pbt-da") && (ln.equals(66)) && ld > 24) {
                        w4 = w3 - (ts + tst + (455*wkk)/375);
                        w5 = w4 / 60; w6 = w4 % 60;  lp1 = ld - 24;km=375;
                        lpr = Math.ceil((4.0 / 80.0) * lp1 * wkk);
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr +lpr+ (1005*wkk)/km);
                        tv1.setText(String.valueOf("R/T  "+(455*wkk/km)/60 )+" : "+(455*wkk/km)%60+"  "+" Ration " + (1005*wkk)/km);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    } else if (tn.equals("758 pbt-da") && (ln.equals(66)) && ld < 24) {
                        w4 = w3 - (ts + tst + (455*wkk)/375);
                        w5 = w4 / 60; w6 = w4 % 60; lp1 = 24 - ld;km=375;
                        lpr = Math.floor((3.0 / 80.0) * lp1 * wkk);
                        dr = Math.floor((w4 * 20.0) / 60);
                        sr = Math.floor((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr +(1005*wkk)/km)-lpr;
                        tv1.setText(String.valueOf("R/T   "+(455*wkk/km)/60 )+" : "+(455*wkk/km)%60+"  "+" Ration "+(1005*wkk)/km);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    } else if (tn.equals("758 pbt-da") && (ln.equals(66)) && ld == 24) {
                        w4 = w3 - (ts + tst + (455*wkk)/375);
                        w5 = w4 / 60;  w6 = w4 % 60;km = 375;
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr + (1005*wkk)/km);
                        tv1.setText(String.valueOf("R/T   "+(455*wkk/km)/60 )+" : "+(455*wkk/km)%60+"  "+" Ration "+(1005*wkk)/km);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                    }
                    else if (tn.equals("765 da-pbt") && (ln.equals(66)) && ld > 22) {
                        w4 = w3 - (ts + tst + (455*wkk)/375);
                        w5 = w4 / 60; w6 = w4 % 60;  lp1 = ld - 22;km=375;
                        lpr = Math.ceil((4.0 / 80.0) * lp1 * wkk);
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr +lpr+ (950*wkk)/km);
                        tv1.setText(String.valueOf("R/T  "+(455*wkk/km)/60 )+" : "+(455*wkk/km)%60+"  "+" Ration " + (950*wkk)/km);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    } else if (tn.equals("765 da-pbt") && (ln.equals(66)) && ld < 22) {
                        w4 = w3 - (ts + tst + (455*wkk)/375);
                        w5 = w4 / 60; w6 = w4 % 60; lp1 = 22 - ld;km=375;
                        lpr = Math.floor((3.0 / 80.0) * lp1 * wkk);
                        dr = Math.floor((w4 * 20.0) / 60);
                        sr = Math.floor((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr +(950*wkk)/km)-lpr;
                        tv1.setText(String.valueOf("R/T   "+(455*wkk/km)/60 )+" : "+(455*wkk/km)%60+"  "+" Ration "+(950*wkk)/km);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    } else if (tn.equals("765 da-pbt") && (ln.equals(66)) && ld == 22) {
                        w4 = w3 - (ts + tst + (455*wkk)/375);
                        w5 = w4 / 60;  w6 = w4 % 60;km = 375;
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr + (950*wkk)/km);
                        tv1.setText(String.valueOf("R/T   "+(455*wkk/km)/60 )+" : "+(455*wkk/km)%60+"  "+" Ration "+(950*wkk)/km);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                    }
                    else if (tn.equals("765/766 pbt-clh-pbt") && (ln.equals(66)) && ld > 22) {
                        w4 = w3 - (ts + tst + (195*wkk)/135);
                        w5 = w4 / 60; w6 = w4 % 60;  lp1 = ld - 22;km=135;
                        lpr = Math.ceil((4.0 / 80.0) * lp1 * wkk);
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr +lpr+ (325*wkk)/km);
                        tv1.setText(String.valueOf("R/T   "+(195*wkk/km)/60 )+" : "+(195*wkk/km)%60+"  "+" Ration " + (325*wkk)/km);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    } else if (tn.equals("765/766 pbt-clh-pbt") && (ln.equals(66)) && ld < 22) {
                        w4 = w3 - (ts + tst + (195*wkk)/135);
                        w5 = w4 / 60; w6 = w4 % 60; lp1 = 22 - ld;km=135;
                        lpr = Math.floor((3.0 / 80.0) * lp1 * wkk);
                        dr = Math.floor((w4 * 20.0) / 60);
                        sr = Math.floor((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr +(325*wkk)/km)-lpr;
                        tv1.setText(String.valueOf("R/T   "+(195*wkk/km)/60 )+" : "+(195*wkk/km)%60+"  "+" Ration "+(325*wkk)/km);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    } else if (tn.equals("765/766 pbt-clh-pbt") && (ln.equals(66)) && ld == 22) {
                        w4 = w3 - (ts + tst + (195*wkk)/135);
                        w5 = w4 / 60;  w6 = w4 % 60;km = 135;
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr + (325*wkk)/km);
                        tv1.setText(String.valueOf("R/T   "+(195*wkk/km)/60 )+" : "+(195*wkk/km)%60+"  "+" Ration "+(325*wkk)/km);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                    }
                    else if (tn.equals("766 pbt-da") && (ln.equals(66)) && ld > 22) {
                        w4 = w3 - (ts + tst + (470*wkk)/375);
                        w5 = w4 / 60; w6 = w4 % 60;  lp1 = ld - 22;km=375;
                        lpr = Math.ceil((4.0 / 80.0) * lp1 * wkk);
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr +lpr+ (965*wkk)/km);
                        tv1.setText(String.valueOf("R/T   "+(470*wkk/km)/60 )+" : "+(470*wkk/km)%60+"  "+" Ration " + (965*wkk)/km);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    } else if (tn.equals("766 pbt-da") && (ln.equals(66)) && ld < 22) {
                        w4 = w3 - (ts + tst + (470*wkk)/375);
                        w5 = w4 / 60; w6 = w4 % 60; lp1 = 22 - ld;km=375;
                        lpr = Math.floor((3.0 / 80.0) * lp1 * wkk);
                        dr = Math.floor((w4 * 20.0) / 60);
                        sr = Math.floor((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr +(965*wkk)/km)-lpr;
                        tv1.setText(String.valueOf("R/T   "+(470*wkk/km)/60 )+" : "+(470*wkk/km)%60+"  "+" Ration "+(965*wkk)/km);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    } else if (tn.equals("766 pbt-da") && (ln.equals(66)) && ld == 22) {
                        w4 = w3 - (ts + tst + (470*wkk)/375);
                        w5 = w4 / 60;  w6 = w4 % 60;km = 375;
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr + (965*wkk)/km);
                        tv1.setText(String.valueOf("R/T   "+(470*wkk/km)/60 )+" : "+(470*wkk/km)%60+"  "+" Ration "+(965*wkk)/km);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                    }

                    else if (tn.equals("768 bmsm-pbt") && ((ln.equals(30)||ln.equals(29))) && ld > 20) {
                        w4 = w3 - (ts + tst + (200*wkk)/132);
                        w5 = w4 / 60; w6 = w4 % 60;  lp1 = ld - 20;km=132;
                        lpr = Math.ceil((4.0 / 80.0) * lp1 * wkk);
                        dr = Math.ceil((w4 * 9.0) / 60);
                        sr = Math.ceil((ts * 13.0) / 60);
                        tr = Math.ceil( sr + dr +lpr+ (226*wkk)/km);
                        tv1.setText(String.valueOf("R/T   "+(200*wkk/km)/60 )+" : "+(200*wkk/km)%60+"  "+" Ration " + (226*wkk)/km);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    } else if (tn.equals("768 bmsm-pbt") && ((ln.equals(30)||ln.equals(29))) && ld < 20) {
                        w4 = w3 - (ts + tst + (200*wkk)/132);
                        w5 = w4 / 60; w6 = w4 % 60; lp1 = 20 - ld;km=132;
                        lpr = Math.floor((3.0 / 80.0) * lp1 * wkk);
                        dr = Math.floor((w4 * 9.0) / 60);
                        sr = Math.floor((ts * 13.0) / 60);
                        tr = Math.ceil( sr + dr +(226*wkk)/km)-lpr;
                        tv1.setText(String.valueOf("R/T   "+(200*wkk/km)/60 )+" : "+(200*wkk/km)%60+"  "+" Ration "+(226*wkk)/km);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    } else if (tn.equals("768 bmsm-pbt") && ((ln.equals(30)||ln.equals(29))) && ld == 20) {
                        w4 = w3 - (ts + tst + (200*wkk)/132);
                        w5 = w4 / 60;  w6 = w4 % 60;km = 132;
                        dr = Math.ceil((w4 * 9.0) / 60);
                        sr = Math.ceil((ts * 13.0) / 60);
                        tr = Math.ceil( sr + dr + (226*wkk)/km);
                        tv1.setText(String.valueOf("R/T   "+(200*wkk/km)/60 )+" : "+(200*wkk/km)%60+"  "+" Ration "+(226*wkk)/km);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                    }
                    else if (tn.equals("793 da-pbt") && (ln.equals(66)) && ld > 24) {
                        w4 = w3 - (ts + tst + (425*wkk)/375);
                        w5 = w4 / 60; w6 = w4 % 60;  lp1 = ld - 24;km=375;
                        lpr = Math.ceil((4.0 / 80.0) * lp1 * wkk);
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr +lpr+ (980*wkk)/km);
                        tv1.setText(String.valueOf("R/T  "+(425*wkk/km)/60 )+" : "+(425*wkk/km)%60+"  "+" Ration " + (980*wkk)/km);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    } else if (tn.equals("793 da-pbt") && (ln.equals(66)) && ld < 24) {
                        w4 = w3 - (ts + tst + (425*wkk)/375);
                        w5 = w4 / 60; w6 = w4 % 60; lp1 = 24 - ld;km=375;
                        lpr = Math.floor((3.0 / 80.0) * lp1 * wkk);
                        dr = Math.floor((w4 * 20.0) / 60);
                        sr = Math.floor((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr +(980*wkk)/km)-lpr;
                        tv1.setText(String.valueOf("R/T   "+(425*wkk/km)/60 )+" : "+(425*wkk/km)%60+"  "+" Ration "+(980*wkk)/km);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    } else if (tn.equals("793 da-pbt") && (ln.equals(66)) && ld == 24) {
                        w4 = w3 - (ts + tst + (425*wkk)/375);
                        w5 = w4 / 60;  w6 = w4 % 60;km = 375;
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr + (980*wkk)/km);
                        tv1.setText(String.valueOf("R/T   "+(425*wkk/km)/60 )+" : "+(425*wkk/km)%60+"  "+" Ration "+(980*wkk)/km);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                    }
                    else if (tn.equals("793 pbt-bmsm") && (ln.equals(66)) && ld > 24) {
                        w4 = w3 - (ts + tst + (170*wkk)/132);
                        w5 = w4 / 60; w6 = w4 % 60;  lp1 = ld - 24;km=132;
                        lpr = Math.ceil((4.0 / 80.0) * lp1 * wkk);
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr +lpr+ (345*wkk)/km);
                        tv1.setText(String.valueOf("R/T   "+(170*wkk/km)/60 )+" : "+(170*wkk/km)%60+"  "+" Ration " + (345*wkk)/km);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    } else if (tn.equals("793 pbt-bmsm") && (ln.equals(66)) && ld < 24) {
                        w4 = w3 - (ts + tst + (170*wkk)/132);
                        w5 = w4 / 60; w6 = w4 % 60; lp1 = 24 - ld;km=132;
                        lpr = Math.floor((3.0 / 80.0) * lp1 * wkk);
                        dr = Math.floor((w4 * 20.0) / 60);
                        sr = Math.floor((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr +(345*wkk)/km)-lpr;
                        tv1.setText(String.valueOf("R/T   "+(170*wkk/km)/60 )+" : "+(170*wkk/km)%60+"  "+" Ration "+(345*wkk)/km);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    } else if (tn.equals("793 pbt-bmsm") && (ln.equals(66)) && ld == 24) {
                        w4 = w3 - (ts + tst + (170*wkk)/132);
                        w5 = w4 / 60;  w6 = w4 % 60;km = 132;
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr + (345*wkk)/km);
                        tv1.setText(String.valueOf("R/T   "+(170*wkk/km)/60 )+" : "+(170*wkk/km)%60+"  "+" Ration "+(345*wkk)/km);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                    }
                    else if (tn.equals("794 bmsm-pbt") && (ln.equals(66)) && ld > 24) {
                        w4 = w3 - (ts + tst + (165*wkk)/132);
                        w5 = w4 / 60; w6 = w4 % 60;  lp1 = ld - 24;km=132;
                        lpr = Math.ceil((4.0 / 80.0) * lp1 * wkk);
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr +lpr+ (335*wkk)/km);
                        tv1.setText(String.valueOf("R/T  "+(165*wkk/km)/60 )+" : "+(165*wkk/km)%60+"  "+" Ration " + (335*wkk)/km);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    } else if (tn.equals("794 bmsm-pbt") && (ln.equals(66)) && ld < 24) {
                        w4 = w3 - (ts + tst + (165*wkk)/132);
                        w5 = w4 / 60; w6 = w4 % 60; lp1 = 24 - ld;km=132;
                        lpr = Math.floor((3.0 / 80.0) * lp1 * wkk);
                        dr = Math.floor((w4 * 20.0) / 60);
                        sr = Math.floor((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr +(335*wkk)/km)-lpr;
                        tv1.setText(String.valueOf("R/T   "+(165*wkk/km)/60 )+" : "+(165*wkk/km)%60+"  "+" Ration "+(335*wkk)/km);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    } else if (tn.equals("794 bmsm-pbt") && (ln.equals(66)) && ld == 24) {
                        w4 = w3 - (ts + tst + (165*wkk)/132);
                        w5 = w4 / 60;  w6 = w4 % 60;km = 132;
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr + (335*wkk)/km);
                        tv1.setText(String.valueOf("R/T   "+(165*wkk/km)/60 )+" : "+(165*wkk/km)%60+"  "+" Ration "+(335*wkk)/km);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                    }
                    else if (tn.equals("794 pbt-da") && (ln.equals(66)) && ld > 24) {
                        w4 = w3 - (ts + tst + (380*wkk)/375);
                        w5 = w4 / 60; w6 = w4 % 60;  lp1 = ld - 24;km=375;
                        lpr = Math.ceil((4.0 / 80.0) * lp1 * wkk);
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr +lpr+ (970*wkk)/km);
                        tv1.setText(String.valueOf("R/T   "+(380*wkk/km)/60 )+" : "+(380*wkk/km)%60+"  "+" Ration " + (970*wkk)/km);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    } else if (tn.equals("794 pbt-da") && (ln.equals(66)) && ld < 24) {
                        w4 = w3 - (ts + tst + (380*wkk)/375);
                        w5 = w4 / 60; w6 = w4 % 60; lp1 = 24 - ld;km=375;
                        lpr = Math.floor((3.0 / 80.0) * lp1 * wkk);
                        dr = Math.floor((w4 * 20.0) / 60);
                        sr = Math.floor((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr +(970*wkk)/km)-lpr;
                        tv1.setText(String.valueOf("R/T   "+(380*wkk/km)/60 )+" : "+(380*wkk/km)%60+"  "+" Ration "+(970*wkk)/km);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    } else if (tn.equals("794 pbt-da") && (ln.equals(66)) && ld == 24) {
                        w4 = w3 - (ts + tst + (380*wkk)/375);
                        w5 = w4 / 60;  w6 = w4 % 60;km = 375;
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr + (970*wkk)/km);
                        tv1.setText(String.valueOf("R/T    "+(380*wkk/km)/60 )+" : "+(380*wkk/km)%60+"  "+" Ration "+(970*wkk)/km);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                    }
                    else if (tn.equals("803 pbt-bmsm") && (ln.equals(66)) && ld > 20) {
                        w4 = w3 - (ts + tst + (160*wkk)/132);
                        w5 = w4 / 60; w6 = w4 % 60;  lp1 = ld - 20;km=132;
                        lpr = Math.ceil((4.0 / 80.0) * lp1 * wkk);
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr +lpr+ (295*wkk)/km);
                        tv1.setText(String.valueOf("R/T   "+(160*wkk/km)/60 )+" : "+(160*wkk/km)%60+"  "+" Ration " + (295*wkk)/km);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    } else if (tn.equals("803 pbt-bmsm") && (ln.equals(66)) && ld < 20) {
                        w4 = w3 - (ts + tst + (160*wkk)/132);
                        w5 = w4 / 60; w6 = w4 % 60; lp1 = 20 - ld;km=132;
                        lpr = Math.floor((3.0 / 80.0) * lp1 * wkk);
                        dr = Math.floor((w4 * 20.0) / 60);
                        sr = Math.floor((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr +(295*wkk)/km)-lpr;
                        tv1.setText(String.valueOf("R/T   "+(160*wkk/km)/60 )+" : "+(160*wkk/km)%60+"  "+" Ration "+(295*wkk)/km);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    } else if (tn.equals("803 pbt-bmsm") && (ln.equals(66)) && ld == 20) {
                        w4 = w3 - (ts + tst + (160*wkk)/132);
                        w5 = w4 / 60;  w6 = w4 % 60;km = 132;
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr + (295*wkk)/km);
                        tv1.setText(String.valueOf("R/T   "+(160*wkk/km)/60 )+" : "+(160*wkk/km)%60+" "+" Ration "+(295*wkk)/km);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                    }
                    else if (tn.equals("804 bmsm-pbt") && (ln.equals(66)) && ld > 20) {
                        w4 = w3 - (ts + tst + (180*wkk)/132);
                        w5 = w4 / 60; w6 = w4 % 60;  lp1 = ld - 20;km=132;
                        lpr = Math.ceil((4.0 / 80.0) * lp1 * wkk);
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr +lpr+ (305*wkk)/km);
                        tv1.setText(String.valueOf("R/T   "+(180*wkk/km)/60 )+" : "+(180*wkk/km)%60+"  "+" Ration " + (305*wkk)/km);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    } else if (tn.equals("804 bmsm-pbt") && (ln.equals(66)) && ld < 20) {
                        w4 = w3 - (ts + tst + (180*wkk)/132);
                        w5 = w4 / 60; w6 = w4 % 60; lp1 = 20 - ld;km=132;
                        lpr = Math.floor((3.0 / 80.0) * lp1 * wkk);
                        dr = Math.floor((w4 * 20.0) / 60);
                        sr = Math.floor((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr +(305*wkk)/km)-lpr;
                        tv1.setText(String.valueOf("R/T   "+(180*wkk/km)/60 )+" : "+(180*wkk/km)%60+"  "+" Ration "+(305*wkk)/km);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    } else if (tn.equals("804 bmsm-pbt") && (ln.equals(66)) && ld == 20) {
                        w4 = w3 - (ts + tst + (180*wkk)/132);
                        w5 = w4 / 60;  w6 = w4 % 60;km = 132;
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr + (305*wkk)/km);
                        tv1.setText(String.valueOf("R/T   "+(180*wkk/km)/60 )+" : "+(180*wkk/km)%60+"  "+" Ration "+(305*wkk)/km);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                    }
                    else if (tn.equals("805 da-pbt") && (ln.equals(66)) && ld > 22) {
                        w4 = w3 - (ts + tst + (485*wkk)/375);
                        w5 = w4 / 60; w6 = w4 % 60;  lp1 = ld - 22;km=375;
                        lpr = Math.ceil((4.0 / 80.0) * lp1 * wkk);
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr +lpr+ (970*wkk)/km);
                        tv1.setText(String.valueOf("R/T  "+(485*wkk/km)/60 )+" : "+(485*wkk/km)%60+"  "+" Ration " + (970*wkk)/km);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    } else if (tn.equals("805 da-pbt") && (ln.equals(66)) && ld < 22) {
                        w4 = w3 - (ts + tst + (485*wkk)/375);
                        w5 = w4 / 60; w6 = w4 % 60; lp1 = 22 - ld;km=375;
                        lpr = Math.floor((3.0 / 80.0) * lp1 * wkk);
                        dr = Math.floor((w4 * 20.0) / 60);
                        sr = Math.floor((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr +(970*wkk)/km)-lpr;
                        tv1.setText(String.valueOf("R/T   "+(485*wkk/km)/60 )+" : "+(485*wkk/km)%60+"  "+" Ration "+(970*wkk)/km);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    } else if (tn.equals("805 da-pbt") && (ln.equals(66)) && ld == 22) {
                        w4 = w3 - (ts + tst + (485*wkk)/375);
                        w5 = w4 / 60;  w6 = w4 % 60;km = 375;
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr + (970*wkk)/km);
                        tv1.setText(String.valueOf("R/T   "+(485*wkk/km)/60 )+" : "+(485*wkk/km)%60+"  "+" Ration "+(970*wkk)/km);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                    }
                    else if (tn.equals("805/806 pbt-clh-pbt") && (ln.equals(66)) && ld > 22) {
                        w4 = w3 - (ts + tst + (200*wkk)/135);
                        w5 = w4 / 60; w6 = w4 % 60;  lp1 = ld - 22;km=135;
                        lpr = Math.ceil((4.0 / 80.0) * lp1 * wkk);
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr +lpr+ (328*wkk)/km);
                        tv1.setText(String.valueOf("R/T  "+(200*wkk/km)/60 )+" : "+(200*wkk/km)%60+"  "+" Ration " + (328*wkk)/km);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    } else if (tn.equals("805/806 pbt-clh-pbt") && (ln.equals(66)) && ld < 22) {
                        w4 = w3 - (ts + tst + (200*wkk)/135);
                        w5 = w4 / 60; w6 = w4 % 60; lp1 = 22 - ld;km=135;
                        lpr = Math.floor((3.0 / 80.0) * lp1 * wkk);
                        dr = Math.floor((w4 * 20.0) / 60);
                        sr = Math.floor((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr +(328*wkk)/km)-lpr;
                        tv1.setText(String.valueOf("R/T   "+(200*wkk/km)/60 )+" : "+(200*wkk/km)%60+"  "+" Ration "+(328*wkk)/km);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    } else if (tn.equals("805/806 pbt-clh-pbt") && (ln.equals(66)) && ld == 22) {
                        w4 = w3 - (ts + tst + (200*wkk)/135);
                        w5 = w4 / 60;  w6 = w4 % 60;km = 135;
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr + (328*wkk)/km);
                        tv1.setText(String.valueOf("R/T   "+(200*wkk/km)/60 )+" : "+(200*wkk/km)%60+"  "+" Ration "+(328*wkk)/km);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                    }
                    else if (tn.equals("806 pbt-da") && (ln.equals(66)) && ld > 22) {
                        w4 = w3 - (ts + tst + (445*wkk)/375);
                        w5 = w4 / 60; w6 = w4 % 60;  lp1 = ld - 22;km=375;
                        lpr = Math.ceil((4.0 / 80.0) * lp1 * wkk);
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr +lpr+ (960*wkk)/km);
                        tv1.setText(String.valueOf("R/T  "+(445*wkk/km)/60 )+" : "+(445*wkk/km)%60+" "+" Ration " + (960*wkk)/km);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    } else if (tn.equals("806 pbt-da") && (ln.equals(66)) && ld < 22) {
                        w4 = w3 - (ts + tst + (445*wkk)/375);
                        w5 = w4 / 60; w6 = w4 % 60; lp1 = 22 - ld;km=375;
                        lpr = Math.floor((3.0 / 80.0) * lp1 * wkk);
                        dr = Math.floor((w4 * 20.0) / 60);
                        sr = Math.floor((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr +(960*wkk)/km)-lpr;
                        tv1.setText(String.valueOf("R/T   "+(445*wkk/km)/60 )+" : "+(445*wkk/km)%60+"  "+" Ration "+(960*wkk)/km);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    } else if (tn.equals("806 pbt-da") && (ln.equals(66)) && ld == 22) {
                        w4 = w3 - (ts + tst + (445*wkk)/375);
                        w5 = w4 / 60;  w6 = w4 % 60;km = 375;
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr + (960*wkk)/km);
                        tv1.setText(String.valueOf("R/T   "+(445*wkk/km)/60 )+" : "+(445*wkk/km)%60+"  "+" Ration "+(960*wkk)/km);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                    }
                    else if (tn.equals("797 da-pbt") && ((ln.equals(30)||ln.equals(29))) && ld > 28) {
                        w4 = w3 - (ts + tst + (435*wkk)/375);
                        w5 = w4 / 60; w6 = w4 % 60;  lp1 = ld - 28;km=375;
                        lpr = Math.ceil((4.0 / 80.0) * lp1 * wkk);
                        dr = Math.ceil((w4 * 9.0) / 60);
                        sr = Math.ceil((ts * 13.0) / 60);
                        tr = Math.ceil( sr + dr +lpr+ (825*wkk)/km);
                        tv1.setText(String.valueOf("R/T   "+(435*wkk/km)/60 )+" : "+(435*wkk/km)%60+"  "+" Ration " + (825*wkk)/km);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    } else if (tn.equals("797 da-pbt") && ((ln.equals(30)||ln.equals(29))) && ld < 28) {
                        w4 = w3 - (ts + tst + (435*wkk)/375);
                        w5 = w4 / 60; w6 = w4 % 60; lp1 = 28 - ld;km=375;
                        lpr = Math.floor((3.0 / 80.0) * lp1 * wkk);
                        dr = Math.floor((w4 * 9.0) / 60);
                        sr = Math.floor((ts * 13.0) / 60);
                        tr = Math.ceil( sr + dr +(825*wkk)/km)-lpr;
                        tv1.setText(String.valueOf("R/T  "+(435*wkk/km)/60 )+" : "+(435*wkk/km)%60+"  "+" Ration "+(825*wkk)/km);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    } else if (tn.equals("797 da-pbt") && ((ln.equals(30)||ln.equals(29))) && ld == 28) {
                        w4 = w3 - (ts + tst + (435*wkk)/375);
                        w5 = w4 / 60;  w6 = w4 % 60;km = 375;
                        dr = Math.ceil((w4 * 9.0) / 60);
                        sr = Math.ceil((ts * 13.0) / 60);
                        tr = Math.ceil( sr + dr + (825*wkk)/km);
                        tv1.setText(String.valueOf("R/T  "+(435*wkk/km)/60 )+" : "+(435*wkk/km)%60+"  "+" Ration "+(825*wkk)/km);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                    }
                    else if (tn.equals("798 pbt-da") && ((ln.equals(30)||ln.equals(29))) && ld > 28) {
                        w4 = w3 - (ts + tst + (475*wkk)/375);
                        w5 = w4 / 60; w6 = w4 % 60;  lp1 = ld - 28;km=375;
                        lpr = Math.ceil((4.0 / 80.0) * lp1 * wkk);
                        dr = Math.ceil((w4 * 9.0) / 60);
                        sr = Math.ceil((ts * 13.0) / 60);
                        tr = Math.ceil( sr + dr +lpr+ (830*wkk)/km);
                        tv1.setText(String.valueOf("R/T  "+(475*wkk/km)/60 )+" : "+(475*wkk/km)%60+"  "+" Ration " + (830*wkk)/km);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    } else if (tn.equals("798 pbt-da") && ((ln.equals(30)||ln.equals(29))) && ld < 28) {
                        w4 = w3 - (ts + tst + (475*wkk)/375);
                        w5 = w4 / 60; w6 = w4 % 60; lp1 = 28 - ld;km=375;
                        lpr = Math.floor((3.0 / 80.0) * lp1 * wkk);
                        dr = Math.floor((w4 * 9.0) / 60);
                        sr = Math.floor((ts * 13.0) / 60);
                        tr = Math.ceil( sr + dr +(830*wkk)/km)-lpr;
                        tv1.setText(String.valueOf("R/T   "+(475*wkk/km)/60 )+" : "+(475*wkk/km)%60+"  "+" Ration "+(830*wkk)/km);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    } else if (tn.equals("798 pbt-da") && ((ln.equals(30)||ln.equals(29))) && ld == 28) {
                        w4 = w3 - (ts + tst + (475*wkk)/375);
                        w5 = w4 / 60;  w6 = w4 % 60;km = 375;
                        dr = Math.ceil((w4 * 9.0) / 60);
                        sr = Math.ceil((ts * 13.0) / 60);
                        tr = Math.ceil( sr + dr + (830*wkk)/km);
                        tv1.setText(String.valueOf("R/T   "+(475*wkk/km)/60 )+" : "+(475*wkk/km)%60+"  "+" Ration "+(830*wkk)/km);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                    }
                    else if (tn.equals("797/798 pbt-krm-pbt") && ((ln.equals(30)||ln.equals(29))) && ld > 28) {
                        w4 = w3 - (ts + tst + (270*wkk)/156);
                        w5 = w4 / 60; w6 = w4 % 60;  lp1 = ld - 28;km=156;
                        lpr = Math.ceil((4.0 / 80.0) * lp1 * wkk);
                        dr = Math.ceil((w4 * 9.0) / 60);
                        sr = Math.ceil((ts * 13.0) / 60);
                        tr = Math.ceil( sr + dr +lpr+ (320*wkk)/km);
                        tv1.setText(String.valueOf("R/T  "+(270*wkk/km)/60 )+" : "+(270*wkk/km)%60+"  "+" Ration " + (320*wkk)/km);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    } else if (tn.equals("797/798 pbt-krm-pbt") && ((ln.equals(30)||ln.equals(29))) && ld < 28) {
                        w4 = w3 - (ts + tst + (270*wkk)/156);
                        w5 = w4 / 60; w6 = w4 % 60; lp1 = 28 - ld;km=156;
                        lpr = Math.floor((3.0 / 80.0) * lp1 * wkk);
                        dr = Math.floor((w4 * 9.0) / 60);
                        sr = Math.floor((ts * 13.0) / 60);
                        tr = Math.ceil( sr + dr +(320*wkk)/km)-lpr;
                        tv1.setText(String.valueOf("R/T   "+(270*wkk/km)/60 )+" : "+(270*wkk/km)%60+" "+" Ration "+(320*wkk)/km);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    } else if (tn.equals("797/798 pbt-krm-pbt") && ((ln.equals(30)||ln.equals(29))) && ld == 28) {
                        w4 = w3 - (ts + tst + (270*wkk)/156);
                        w5 = w4 / 60;  w6 = w4 % 60;km = 156;
                        dr = Math.ceil((w4 * 9.0) / 60);
                        sr = Math.ceil((ts * 13.0) / 60);
                        tr = Math.ceil( sr + dr + (320*wkk)/km);
                        tv1.setText(String.valueOf("R/T   "+(270*wkk/km)/60 )+" : "+(270*wkk/km)%60+"  "+" Ration "+(320*wkk)/km);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                    }
                    else if (tn.equals("734 pbt-rjhi") && (ln.equals(65)) && ld > 24) {
                        w4 = w3 - (ts + tst + (310*wkk)/200);
                        w5 = w4 / 60; w6 = w4 % 60;  lp1 = ld - 24;km=200;
                        lpr = Math.ceil((4.0 / 80.0) * lp1 * wkk);
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr +lpr+ (490*wkk)/km);
                        tv1.setText(String.valueOf("R/T  "+(310*wkk/km)/60 )+" : "+(310*wkk/km)%60+"  "+" Ration " + (490*wkk)/km);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    } else if (tn.equals("734 pbt-rjhi") && (ln.equals(65)) && ld < 24) {
                        w4 = w3 - (ts + tst + (310*wkk)/200);
                        w5 = w4 / 60; w6 = w4 % 60; lp1 = 24 - ld;km=200;
                        lpr = Math.floor((3.0 / 80.0) * lp1 * wkk);
                        dr = Math.floor((w4 * 20.0) / 60);
                        sr = Math.floor((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr +(490*wkk)/km)-lpr;
                        tv1.setText(String.valueOf("R/T   "+(310*wkk/km)/60 )+" : "+(310*wkk/km)%60+"  "+" Ration "+(490*wkk)/km);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    } else if (tn.equals("734 pbt-rjhi") && (ln.equals(65)) && ld == 24) {
                        w4 = w3 - (ts + tst + (310*wkk)/200);
                        w5 = w4 / 60;  w6 = w4 % 60;km = 200;
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr + (490*wkk)/km);
                        tv1.setText(String.valueOf("R/T   "+(310*wkk/km)/60 )+" : "+(310*wkk/km)%60+"  "+" Ration "+(490*wkk)/km);
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