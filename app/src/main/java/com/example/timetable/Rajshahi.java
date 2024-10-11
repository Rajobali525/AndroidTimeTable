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

public class Rajshahi extends AppCompatActivity {

    private EditText ed1, ed2, ed3, ed4, ed5, ed6, ed7, ed8, ed9, ed10, ed11;
    private Button bt1, bt2;
    private TextView tv1, tv2, tv3, tv4, tv5, tv6, tv7;
    private AutoCompleteTextView autoCompleteTextView;
    Integer n1, n2, n3, n4, w1, w2, s1, s2, ts, sth, stm, tst, ln, w3, w4, rt, ra, w5, w6;
    String tn;
    Double sr, dr, tr, lpr, srr, ld, lp1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_rajshahi);

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
                    if (tn.equals("753 da-rjhi") && (ln.equals(66)) && ld > 28) {
                        w4 = w3 - (ts + tst + 350);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = ld - 28;
                        lpr = Math.ceil((8.0 / 80.0) * lp1 * 263);
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil(910 + sr + dr + lpr);
                        tv1.setText(String.valueOf("R/T 5:50 ,Ration 910  ,load 28"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    } else if (tn.equals("753 da-rjhi") && (ln.equals(66)) && ld < 28) {
                        w4 = w3 - (ts + tst + 350);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = 28 - ld;
                        lpr = Math.floor((6.0 / 80.0) * lp1 * 263);
                        dr = Math.floor((w4 * 20.0) / 60);
                        sr = Math.floor((ts * 30.0) / 60);
                        tr = Math.floor(910+ sr + dr - lpr);
                        tv1.setText(String.valueOf("R/T 5:50 ,Ration 910,load 28"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    } else if (tn.equals("753 da-rjhi") && (ln.equals(66)) && ld == 28) {
                        w4 = w3 - (ts + tst + 350);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil(910 + sr + dr);
                        tv1.setText(String.valueOf("R/T 5:50 ,Ration 910  ,load 28"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                    }
                   else if (tn.equals("754 rjhi-da") && (ln.equals(66)) && ld > 28) {
                        w4 = w3 - (ts + tst + 340);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = ld - 28;
                        lpr = Math.ceil((8.0 / 80.0) * lp1 * 263);
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil(920 + sr + dr + lpr);
                        tv1.setText(String.valueOf("R/T 5:40 ,Ration 920  ,load 28"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    } else if (tn.equals("754 rjhi-da") && (ln.equals(66)) && ld < 28) {
                        w4 = w3 - (ts + tst + 340);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = 28 - ld;
                        lpr = Math.floor((6.0 / 80.0) * lp1 * 263);
                        dr = Math.floor((w4 * 20.0) / 60);
                        sr = Math.floor((ts * 30.0) / 60);
                        tr = Math.floor(920+ sr + dr - lpr);
                        tv1.setText(String.valueOf("R/T 5:40 ,Ration 920,load 28"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    } else if (tn.equals("754 rjhi-da") && (ln.equals(66)) && ld == 28) {
                        w4 = w3 - (ts + tst + 340);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil(920 + sr + dr);
                        tv1.setText(String.valueOf("R/T 5:40 ,Ration 920  ,load 28"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                    }
                    else if (tn.equals("759 da-rjhi") && (ln.equals(66)) && ld > 28) {
                        w4 = w3 - (ts + tst + 340);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = ld - 28;
                        lpr = Math.ceil((8.0 / 80.0) * lp1 * 263);
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil(890 + sr + dr + lpr);
                        tv1.setText(String.valueOf("R/T 5:40 ,Ration 890  ,load 28"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    }
                    else if (tn.equals("759 da-rjhi") && (ln.equals(66)) && ld < 28) {
                        w4 = w3 - (ts + tst + 340);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = 28 - ld;
                        lpr = Math.floor((6.0 / 80.0) * lp1 * 263);
                        dr = Math.floor((w4 * 20.0) / 60);
                        sr = Math.floor((ts * 30.0) / 60);
                        tr = Math.floor(890+ sr + dr - lpr);
                        tv1.setText(String.valueOf("R/T 5:40 ,Ration 890,load 28"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    } else if (tn.equals("759 da-rjhi") && (ln.equals(66)) && ld == 28) {
                        w4 = w3 - (ts + tst + 340);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil(890 + sr + dr);
                        tv1.setText(String.valueOf("R/T 5:40 ,Ration 890  ,load 28"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                    }
                    else if (tn.equals("760 rjhi-da") && (ln.equals(66)) && ld > 28) {
                        w4 = w3 - (ts + tst + 325);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = ld - 28;
                        lpr = Math.ceil((8.0 / 80.0) * lp1 * 263);
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil(880 + sr + dr + lpr);
                        tv1.setText(String.valueOf("R/T 5:25 ,Ration 880  ,load 28"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    }
                    else if (tn.equals("760 rjhi-da") && (ln.equals(66)) && ld < 28) {
                        w4 = w3 - (ts + tst + 325);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = 28 - ld;
                        lpr = Math.floor((6.0 / 80.0) * lp1 * 263);
                        dr = Math.floor((w4 * 20.0) / 60);
                        sr = Math.floor((ts * 30.0) / 60);
                        tr = Math.floor(880+ sr + dr - lpr);
                        tv1.setText(String.valueOf("R/T 5:25 ,Ration 880,load 28"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    } else if (tn.equals("760 rjhi-da") && (ln.equals(66)) && ld == 28) {
                        w4 = w3 - (ts + tst + 325);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil(880 + sr + dr);
                        tv1.setText(String.valueOf("R/T 5:25 ,Ration 880  ,load 28"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                    }
                    else if (tn.equals("769 da-rjhi") && (ln.equals(66)) && ld > 28) {
                        w4 = w3 - (ts + tst + 340);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = ld - 28;
                        lpr = Math.ceil((8.0 / 80.0) * lp1 * 263);
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil(905 + sr + dr + lpr);
                        tv1.setText(String.valueOf("R/T 5:40 ,Ration 905  ,load 28"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    }
                    else if (tn.equals("769 da-rjhi") && (ln.equals(66)) && ld < 28) {
                        w4 = w3 - (ts + tst + 340);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = 28 - ld;
                        lpr = Math.floor((6.0 / 80.0) * lp1 * 263);
                        dr = Math.floor((w4 * 20.0) / 60);
                        sr = Math.floor((ts * 30.0) / 60);
                        tr = Math.floor(905+ sr + dr - lpr);
                        tv1.setText(String.valueOf("R/T 5:40 ,Ration 905,load 28"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    } else if (tn.equals("769 da-rjhi") && (ln.equals(66)) && ld == 28) {
                        w4 = w3 - (ts + tst + 340);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil(905 + sr + dr);
                        tv1.setText(String.valueOf("R/T 5:40 ,Ration 905  ,load 28"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                    }
                    else if (tn.equals("770 rjhi-da") && (ln.equals(66)) && ld > 28) {
                        w4 = w3 - (ts + tst + 340);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = ld - 28;
                        lpr = Math.ceil((8.0 / 80.0) * lp1 * 263);
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil(900 + sr + dr + lpr);
                        tv1.setText(String.valueOf("R/T 5:40 ,Ration 900  ,load 28"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    }
                    else if (tn.equals("770 rjhi-da") && (ln.equals(66)) && ld < 28) {
                        w4 = w3 - (ts + tst + 340);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = 28 - ld;
                        lpr = Math.floor((6.0 / 80.0) * lp1 * 263);
                        dr = Math.floor((w4 * 20.0) / 60);
                        sr = Math.floor((ts * 30.0) / 60);
                        tr = Math.floor(900+ sr + dr - lpr);
                        tv1.setText(String.valueOf("R/T 5:40 ,Ration 900,load 28"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    } else if (tn.equals("770 rjhi-da") && (ln.equals(66)) && ld == 28) {
                        w4 = w3 - (ts + tst + 340);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil(900 + sr + dr);
                        tv1.setText(String.valueOf("R/T 5:40 ,Ration 900  ,load 28"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                    }
                    else if ((tn.equals("791 da-rjhi")|| tn.equals("792 rjhi-da")) && (ln.equals(66)) && ld > 28) {
                        w4 = w3 - (ts + tst + 275);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = ld - 28;
                        lpr = Math.ceil((8.0 / 80.0) * lp1 * 263);
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil(850 + sr + dr + lpr);
                        tv1.setText(String.valueOf("R/T 4:35 ,Ration 850  ,load 28"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    }
                    else if ((tn.equals("791 da-rjhi")|| tn.equals("792 rjhi-da")) && (ln.equals(66)) && ld < 28) {
                        w4 = w3 - (ts + tst + 275);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = 28 - ld;
                        lpr = Math.floor((6.0 / 80.0) * lp1 * 263);
                        dr = Math.floor((w4 * 20.0) / 60);
                        sr = Math.floor((ts * 30.0) / 60);
                        tr = Math.floor(850+ sr + dr - lpr);
                        tv1.setText(String.valueOf("R/T 4:35 ,Ration 850,load 28"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    } else if ((tn.equals("791 da-rjhi")|| tn.equals("792 rjhi-da")) && (ln.equals(66)) && ld == 28) {
                        w4 = w3 - (ts + tst + 275);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil(850 + sr + dr);
                        tv1.setText(String.valueOf("R/T 4:35 ,Ration 850  ,load 28"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                    }
                    else if (tn.equals("791 rjhi-cnbj") && (ln.equals(66)) && ld > 26) {
                        w4 = w3 - (ts + tst + 55);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = ld - 26;
                        lpr = Math.ceil((4.0 / 80.0) * lp1 * 50);
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil(120 + sr + dr + lpr);
                        tv1.setText(String.valueOf("R/T 0:55 ,Ration 120  ,load 26"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    }
                    else if (tn.equals("791 rjhi-cnbj") && (ln.equals(66)) && ld < 26) {
                        w4 = w3 - (ts + tst + 55);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = 26 - ld;
                        lpr = Math.floor((3.0 / 80.0) * lp1 * 50);
                        dr = Math.floor((w4 * 20.0) / 60);
                        sr = Math.floor((ts * 30.0) / 60);
                        tr = Math.floor(120+ sr + dr - lpr);
                        tv1.setText(String.valueOf("R/T 0:55 ,Ration 120,load 26"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    } else if (tn.equals("791 rjhi-cnbj") && (ln.equals(66)) && ld == 26) {
                        w4 = w3 - (ts + tst + 55);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil(120 + sr + dr);
                        tv1.setText(String.valueOf("R/T 0:55 ,Ration 120  ,load 26"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                    }
                    else if (tn.equals("792 cnbj-rjhi") && (ln.equals(66)) && ld > 26) {
                        w4 = w3 - (ts + tst + 50);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = ld - 26;
                        lpr = Math.ceil((4.0 / 80.0) * lp1 * 50);
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil(118 + sr + dr + lpr);
                        tv1.setText(String.valueOf("R/T 0:50 ,Ration 118  ,load 26"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    }
                    else if (tn.equals("792 cnbj-rjhi") && (ln.equals(66)) && ld < 26) {
                        w4 = w3 - (ts + tst + 50);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = 26 - ld;
                        lpr = Math.floor((3.0 / 80.0) * lp1 * 50);
                        dr = Math.floor((w4 * 20.0) / 60);
                        sr = Math.floor((ts * 30.0) / 60);
                        tr = Math.floor(118+ sr + dr - lpr);
                        tv1.setText(String.valueOf("R/T 0:50 ,Ration 118,load 26"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    } else if (tn.equals("792 cnbj-rjhi") && (ln.equals(66)) && ld == 26) {
                        w4 = w3 - (ts + tst + 50);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil(118 + sr + dr);
                        tv1.setText(String.valueOf("R/T 0:50 ,Ration 118  ,load 26"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                    }
                    else if (tn.equals("792-ER cnbj-rjhi") && (ln.equals(66)) && ld > 26) {
                        w4 = w3 - (ts + tst + 50);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = ld - 26;
                        lpr = Math.ceil((4.0 / 80.0) * lp1 * 50);
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil(112 + sr + dr + lpr);
                        tv1.setText(String.valueOf("R/T 0:50 ,Ration 112  ,load 26"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    }
                    else if (tn.equals("792-ER cnbj-rjhi") && (ln.equals(66)) && ld < 26) {
                        w4 = w3 - (ts + tst + 50);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = 26 - ld;
                        lpr = Math.floor((3.0 / 80.0) * lp1 * 50);
                        dr = Math.floor((w4 * 20.0) / 60);
                        sr = Math.floor((ts * 30.0) / 60);
                        tr = Math.floor(112+ sr + dr - lpr);
                        tv1.setText(String.valueOf("R/T 0:50 ,Ration 112,load 26"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    } else if (tn.equals("792-ER cnbj-rjhi") && (ln.equals(66)) && ld == 26) {
                        w4 = w3 - (ts + tst + 50);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil(112 + sr + dr);
                        tv1.setText(String.valueOf("R/T 0:50 ,Ration 112  ,load 26"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                    }
                    else if (tn.equals("791-ER rjhi-cnbj") && (ln.equals(66)) && ld > 26) {
                        w4 = w3 - (ts + tst + 50);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = ld - 26;
                        lpr = Math.ceil((4.0 / 80.0) * lp1 * 50);
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil(115 + sr + dr + lpr);
                        tv1.setText(String.valueOf("R/T 0:50 ,Ration 115  ,load 26"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    }
                    else if (tn.equals("791-ER rjhi-cnbj") && (ln.equals(66)) && ld < 26) {
                        w4 = w3 - (ts + tst + 50);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = 26 - ld;
                        lpr = Math.floor((3.0 / 80.0) * lp1 * 50);
                        dr = Math.floor((w4 * 20.0) / 60);
                        sr = Math.floor((ts * 30.0) / 60);
                        tr = Math.floor(115+ sr + dr - lpr);
                        tv1.setText(String.valueOf("R/T 0:50 ,Ration 115,load 26"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    } else if (tn.equals("791-ER rjhi-cnbj") && (ln.equals(66)) && ld == 26) {
                        w4 = w3 - (ts + tst + 50);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil(115 + sr + dr);
                        tv1.setText(String.valueOf("R/T 0:50 ,Ration 115  ,load 26"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                    }
                    else if (tn.equals("755 isd-rjhi") && (ln.equals(66)) && ld > 24) {
                        w4 = w3 - (ts + tst + 70);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = ld - 24;
                        lpr = Math.ceil((8.0 / 80.0) * lp1 * 59);
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil(160 + sr + dr + lpr);
                        tv1.setText(String.valueOf("R/T 1:10 ,Ration 160  ,load 24"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    }
                    else if (tn.equals("755 isd-rjhi") && (ln.equals(66)) && ld < 24) {
                        w4 = w3 - (ts + tst + 70);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = 24 - ld;
                        lpr = Math.floor((6.0 / 80.0) * lp1 * 59);
                        dr = Math.floor((w4 * 20.0) / 60);
                        sr = Math.floor((ts * 30.0) / 60);
                        tr = Math.floor(160+ sr + dr - lpr);
                        tv1.setText(String.valueOf("R/T 1:10 ,Ration 160,load 24"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    } else if (tn.equals("755 isd-rjhi") && (ln.equals(66)) && ld == 24) {
                        w4 = w3 - (ts + tst + 70);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil(160 + sr + dr);
                        tv1.setText(String.valueOf("R/T 1:10 ,Ration 160  ,load 24"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                    }
                    else if (tn.equals("755 isd-rjhi") && (ln.equals(65)) && ld > 18) {
                        w4 = w3 - (ts + tst + 70);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = ld - 18;
                        lpr = Math.ceil((8.0 / 80.0) * lp1 * 59);
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil(120 + sr + dr + lpr);
                        tv1.setText(String.valueOf("R/T 1:10 ,Ration 120  ,load 18"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    }
                    else if (tn.equals("755 isd-rjhi") && (ln.equals(65)) && ld < 18) {
                        w4 = w3 - (ts + tst + 70);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = 18 - ld;
                        lpr = Math.floor((6.0 / 80.0) * lp1 * 59);
                        dr = Math.floor((w4 * 20.0) / 60);
                        sr = Math.floor((ts * 30.0) / 60);
                        tr = Math.floor(120+ sr + dr - lpr);
                        tv1.setText(String.valueOf("R/T 1:10 ,Ration 120,load 18"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    } else if (tn.equals("755 isd-rjhi") && (ln.equals(65)) && ld == 18) {
                        w4 = w3 - (ts + tst + 70);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil(120 + sr + dr);
                        tv1.setText(String.valueOf("R/T 1:10 ,Ration 120  ,load 18"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                    }
                    else if (tn.equals("756 rjhi-isd") && (ln.equals(66)) && ld > 24) {
                        w4 = w3 - (ts + tst + 60);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = ld - 24;
                        lpr = Math.ceil((8.0 / 80.0) * lp1 * 59);
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil(170 + sr + dr + lpr);
                        tv1.setText(String.valueOf("R/T 1:00 ,Ration 170  ,load 24"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    }
                    else if (tn.equals("756 rjhi-isd") && (ln.equals(66)) && ld < 24) {
                        w4 = w3 - (ts + tst + 60);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = 24 - ld;
                        lpr = Math.floor((6.0 / 80.0) * lp1 * 59);
                        dr = Math.floor((w4 * 20.0) / 60);
                        sr = Math.floor((ts * 30.0) / 60);
                        tr = Math.floor(170+ sr + dr - lpr);
                        tv1.setText(String.valueOf("R/T 1:00 ,Ration 170,load 24"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    } else if (tn.equals("756 rjhi-isd") && (ln.equals(66)) && ld == 24) {
                        w4 = w3 - (ts + tst + 60);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil(170 + sr + dr);
                        tv1.setText(String.valueOf("R/T 1:00 ,Ration 170  ,load 24"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                    }
                    else if (tn.equals("803 rjhi-pbt") && (ln.equals(66)) && ld > 20) {
                        w4 = w3 - (ts + tst + 295);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = ld - 20;
                        lpr = Math.ceil((4.0 / 80.0) * lp1 * 200);
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil(480 + sr + dr + lpr);
                        tv1.setText(String.valueOf("R/T 4:55 ,Ration 480  ,load 20"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    }
                    else if (tn.equals("803 rjhi-pbt") && (ln.equals(66)) && ld < 20) {
                        w4 = w3 - (ts + tst + 295);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = 20 - ld;
                        lpr = Math.floor((3.0 / 80.0) * lp1 * 200);
                        dr = Math.floor((w4 * 20.0) / 60);
                        sr = Math.floor((ts * 30.0) / 60);
                        tr = Math.floor(480+ sr + dr - lpr);
                        tv1.setText(String.valueOf("R/T 4:55 ,Ration 480,load 20"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    } else if (tn.equals("803 rjhi-pbt") && (ln.equals(66)) && ld == 20) {
                        w4 = w3 - (ts + tst + 295);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil(480 + sr + dr);
                        tv1.setText(String.valueOf("R/T 4:55 ,Ration 480  ,load 20"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                    }
                    else if (tn.equals("804 pbt-rjhi") && (ln.equals(66)) && ld > 20) {
                        w4 = w3 - (ts + tst + 340);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = ld - 20;
                        lpr = Math.ceil((4.0 / 80.0) * lp1 * 200);
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil(495 + sr + dr + lpr);
                        tv1.setText(String.valueOf("R/T 5:40 ,Ration 495  ,load 20"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    }
                    else if (tn.equals("804 pbt-rjhi") && (ln.equals(66)) && ld < 20) {
                        w4 = w3 - (ts + tst + 340);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = 20 - ld;
                        lpr = Math.floor((3.0 / 80.0) * lp1 * 200);
                        dr = Math.floor((w4 * 20.0) / 60);
                        sr = Math.floor((ts * 30.0) / 60);
                        tr = Math.floor(495+ sr + dr - lpr);
                        tv1.setText(String.valueOf("R/T 5:40 ,Ration 495,load 20"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    } else if (tn.equals("804 pbt-rjhi") && (ln.equals(66)) && ld == 20) {
                        w4 = w3 - (ts + tst + 340);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil(495 + sr + dr);
                        tv1.setText(String.valueOf("R/T 5:40 ,Ration 495  ,load 20"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                    }
                    else if (tn.equals("783 isd-rjhi") && (ln.equals(65)) && ld > 18) {
                        w4 = w3 - (ts + tst + 75);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = ld - 18;
                        lpr = Math.ceil((4.0 / 80.0) * lp1 * 59);
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil(130 + sr + dr + lpr);
                        tv1.setText(String.valueOf("R/T 1:15 ,Ration 130 ,load 18"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    }
                    else if (tn.equals("783 isd-rjhi") && (ln.equals(65)) && ld < 18) {
                        w4 = w3 - (ts + tst + 75);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = 18 - ld;
                        lpr = Math.floor((3.0 / 80.0) * lp1 * 59);
                        dr = Math.floor((w4 * 20.0) / 60);
                        sr = Math.floor((ts * 30.0) / 60);
                        tr = Math.floor(130+ sr + dr - lpr);
                        tv1.setText(String.valueOf("R/T 1:15 ,Ration 130  ,load 18"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    } else if (tn.equals("783 isd-rjhi") && (ln.equals(65)) && ld == 18) {
                        w4 = w3 - (ts + tst + 75);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil(130 + sr + dr);
                        tv1.setText(String.valueOf("R/T 1:15 ,Ration 130  ,load 18"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                    }
                    else if (tn.equals("784 rjhi-isd") && (ln.equals(65)) && ld > 18) {
                        w4 = w3 - (ts + tst + 60);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = ld - 18;
                        lpr = Math.ceil((4.0 / 80.0) * lp1 * 59);
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil(125 + sr + dr + lpr);
                        tv1.setText(String.valueOf("R/T 1:00 ,Ration 125 ,load 18"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    }
                    else if (tn.equals("784 rjhi-isd") && (ln.equals(65)) && ld < 18) {
                        w4 = w3 - (ts + tst + 60);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = 18 - ld;
                        lpr = Math.floor((3.0 / 80.0) * lp1 * 59);
                        dr = Math.floor((w4 * 20.0) / 60);
                        sr = Math.floor((ts * 30.0) / 60);
                        tr = Math.floor(125+ sr + dr - lpr);
                        tv1.setText(String.valueOf("R/T 1:00 ,Ration 125  ,load 18"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    } else if (tn.equals("784 rjhi-isd") && (ln.equals(65)) && ld == 18) {
                        w4 = w3 - (ts + tst + 60);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil(125 + sr + dr);
                        tv1.setText(String.valueOf("R/T 1:00 ,Ration 125  ,load 18"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                    }
                    else if (tn.equals("761 isd-rjhi") && (ln.equals(65)) && ld > 18) {
                        w4 = w3 - (ts + tst + 70);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = ld - 18;
                        lpr = Math.ceil((4.0 / 80.0) * lp1 * 59);
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil(129 + sr + dr + lpr);
                        tv1.setText(String.valueOf("R/T 1:10 ,Ration 129 ,load 18"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    }
                    else if (tn.equals("761 isd-rjhi") && (ln.equals(65)) && ld < 18) {
                        w4 = w3 - (ts + tst + 70);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = 18 - ld;
                        lpr = Math.floor((3.0 / 80.0) * lp1 * 59);
                        dr = Math.floor((w4 * 20.0) / 60);
                        sr = Math.floor((ts * 30.0) / 60);
                        tr = Math.floor(129+ sr + dr - lpr);
                        tv1.setText(String.valueOf("R/T 1:00 ,Ration 129  ,load 18"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    } else if (tn.equals("761 isd-rjhi") && (ln.equals(65)) && ld == 18) {
                        w4 = w3 - (ts + tst + 70);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil(129 + sr + dr);
                        tv1.setText(String.valueOf("R/T 1:10 ,Ration 129  ,load 18"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                    }
                    else if (tn.equals("761 isd-rjhi") && (ln.equals(66)) && ld > 22) {
                        w4 = w3 - (ts + tst + 85);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = ld - 22;
                        lpr = Math.ceil((4.0 / 80.0) * lp1 * 59);
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil(154 + sr + dr + lpr);
                        tv1.setText(String.valueOf("R/T 1:25 ,Ration 154 ,load 22"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    }
                    else if (tn.equals("761 isd-rjhi") && (ln.equals(66)) && ld < 22) {
                        w4 = w3 - (ts + tst + 85);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = 22 - ld;
                        lpr = Math.floor((3.0 / 80.0) * lp1 * 59);
                        dr = Math.floor((w4 * 20.0) / 60);
                        sr = Math.floor((ts * 30.0) / 60);
                        tr = Math.floor(154+ sr + dr - lpr);
                        tv1.setText(String.valueOf("R/T 1:25 ,Ration 154  ,load 22"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    } else if (tn.equals("761 isd-rjhi") && (ln.equals(66)) && ld == 22) {
                        w4 = w3 - (ts + tst + 85);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil(154 + sr + dr);
                        tv1.setText(String.valueOf("R/T 1:25 ,Ration 154  ,load 22"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                    }
                    else if ((tn.equals("762 rjhi-isd")|| tn.equals("715 isd-rjhi")) && (ln.equals(66)) && ld > 22) {
                        w4 = w3 - (ts + tst + 70);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = ld - 22;
                        lpr = Math.ceil((4.0 / 80.0) * lp1 * 59);
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil(148 + sr + dr + lpr);
                        tv1.setText(String.valueOf("R/T 1:10 ,Ration 148 ,load 22"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    }
                    else if ((tn.equals("762 rjhi-isd")|| tn.equals("715 isd-rjhi")) && (ln.equals(66)) && ld < 22) {
                        w4 = w3 - (ts + tst + 70);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = 22 - ld;
                        lpr = Math.floor((3.0 / 80.0) * lp1 * 59);
                        dr = Math.floor((w4 * 20.0) / 60);
                        sr = Math.floor((ts * 30.0) / 60);
                        tr = Math.floor(148+ sr + dr - lpr);
                        tv1.setText(String.valueOf("R/T 1:10 ,Ration 148  ,load 22"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    } else if ((tn.equals("762 rjhi-isd")|| tn.equals("715 isd-rjhi")) && (ln.equals(66)) && ld == 22) {
                        w4 = w3 - (ts + tst + 70);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil(148 + sr + dr);
                        tv1.setText(String.valueOf("R/T 1:10 ,Ration 148  ,load 22"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                    }
                    else if (tn.equals("762 rjhi-isd") && (ln.equals(65)) && ld > 18) {
                        w4 = w3 - (ts + tst + 65);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = ld - 18;
                        lpr = Math.ceil((4.0 / 80.0) * lp1 * 59);
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil(129 + sr + dr + lpr);
                        tv1.setText(String.valueOf("R/T 1:05 ,Ration 129 ,load 18"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    }
                    else if (tn.equals("762 rjhi-isd") && (ln.equals(65)) && ld < 18) {
                        w4 = w3 - (ts + tst + 65);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = 18 - ld;
                        lpr = Math.floor((3.0 / 80.0) * lp1 * 59);
                        dr = Math.floor((w4 * 20.0) / 60);
                        sr = Math.floor((ts * 30.0) / 60);
                        tr = Math.floor(129+ sr + dr - lpr);
                        tv1.setText(String.valueOf("R/T 1:05 ,Ration 129  ,load 18"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    } else if (tn.equals("762 rjhi-isd") && (ln.equals(65)) && ld == 18) {
                        w4 = w3 - (ts + tst + 65);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil(129 + sr + dr);
                        tv1.setText(String.valueOf("R/T 1:05 ,Ration 129  ,load 18"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                    }
                    else if (tn.equals("804 pbt-rjhi") && (ln.equals(65)) && ld > 18) {
                        w4 = w3 - (ts + tst + 340);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = ld - 18;
                        lpr = Math.ceil((4.0 / 80.0) * lp1 * 200);
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil(450 + sr + dr + lpr);
                        tv1.setText(String.valueOf("R/T 5:40 ,Ration 450 ,load 18"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    }
                    else if (tn.equals("804 pbt-rjhi") && (ln.equals(65)) && ld < 18) {
                        w4 = w3 - (ts + tst + 340);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = 18 - ld;
                        lpr = Math.floor((3.0 / 80.0) * lp1 * 200);
                        dr = Math.floor((w4 * 20.0) / 60);
                        sr = Math.floor((ts * 30.0) / 60);
                        tr = Math.floor(450+ sr + dr - lpr);
                        tv1.setText(String.valueOf("R/T 5:40 ,Ration 450  ,load 18"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    } else if (tn.equals("804 pbt-rjhi") && (ln.equals(65)) && ld == 18) {
                        w4 = w3 - (ts + tst + 340);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil(450 + sr + dr);
                        tv1.setText(String.valueOf("R/T 5:40 ,Ration 450  ,load 18"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                    }
                    else if (tn.equals("803 rjhi-pbt") && (ln.equals(65)) && ld > 18) {
                        w4 = w3 - (ts + tst + 295);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = ld - 18;
                        lpr = Math.ceil((4.0 / 80.0) * lp1 * 200);
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil(438 + sr + dr + lpr);
                        tv1.setText(String.valueOf("R/T 4:55 ,Ration 438 ,load 18"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    }
                    else if (tn.equals("803 rjhi-pbt") && (ln.equals(65)) && ld < 18) {
                        w4 = w3 - (ts + tst + 295);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = 18 - ld;
                        lpr = Math.floor((3.0 / 80.0) * lp1 * 200);
                        dr = Math.floor((w4 * 20.0) / 60);
                        sr = Math.floor((ts * 30.0) / 60);
                        tr = Math.floor(438+ sr + dr - lpr);
                        tv1.setText(String.valueOf("R/T 4:55 ,Ration 438  ,load 18"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    } else if (tn.equals("803 rjhi-pbt") && (ln.equals(65)) && ld == 18) {
                        w4 = w3 - (ts + tst + 295);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil(438 + sr + dr);
                        tv1.setText(String.valueOf("R/T 4:55 ,Ration 438  ,load 18"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                    }
                    else if (tn.equals("716 rjhi-isd") && (ln.equals(66)) && ld > 22) {
                        w4 = w3 - (ts + tst + 60);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = ld - 22;
                        lpr = Math.ceil((4.0 / 80.0) * lp1 * 59);
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil(145 + sr + dr + lpr);
                        tv1.setText(String.valueOf("R/T 1:00 ,Ration 145 ,load 22"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    }
                    else if (tn.equals("716 rjhi-isd") && (ln.equals(66)) && ld < 22) {
                        w4 = w3 - (ts + tst + 60);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = 22 - ld;
                        lpr = Math.floor((3.0 / 80.0) * lp1 *59);
                        dr = Math.floor((w4 * 20.0) / 60);
                        sr = Math.floor((ts * 30.0) / 60);
                        tr = Math.floor(145+ sr + dr - lpr);
                        tv1.setText(String.valueOf("R/T 1:00 ,Ration 145  ,load 22"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    } else if (tn.equals("716 rjhi-isd") && (ln.equals(66)) && ld == 22) {
                        w4 = w3 - (ts + tst + 60);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil(145 + sr + dr);
                        tv1.setText(String.valueOf("R/T 1:00 ,Ration 145  ,load 22"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                    }
                    else if ((tn.equals("716 rjhi-isd")|| tn.equals("715 isd-rjhi")) && (ln.equals(65)) && ld > 24) {
                        w4 = w3 - (ts + tst + 65);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = ld - 24;
                        lpr = Math.ceil((4.0 / 80.0) * lp1 * 59);
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil(135 + sr + dr + lpr);
                        tv1.setText(String.valueOf("R/T 1:05 ,Ration 135 ,load 24"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    }
                    else if ((tn.equals("716 rjhi-isd")|| tn.equals("715 isd-rjhi")) && (ln.equals(65)) && ld < 24) {
                        w4 = w3 - (ts + tst + 65);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = 24 - ld;
                        lpr = Math.floor((3.0 / 80.0) * lp1 *59);
                        dr = Math.floor((w4 * 20.0) / 60);
                        sr = Math.floor((ts * 30.0) / 60);
                        tr = Math.floor(135+ sr + dr - lpr);
                        tv1.setText(String.valueOf("R/T 1:05 ,Ration 135  ,load 24"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    } else if ((tn.equals("716 rjhi-isd")|| tn.equals("715 isd-rjhi")) && (ln.equals(65)) && ld == 24) {
                        w4 = w3 - (ts + tst + 65);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil(135 + sr + dr);
                        tv1.setText(String.valueOf("R/T 1:05 ,Ration 135  ,load 24"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                    }
                    else if (tn.equals("791 da-rjhi") && (ln.equals(65)) && ld > 24) {
                        w4 = w3 - (ts + tst + 285);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = ld - 24;
                        lpr = Math.ceil((4.0 / 80.0) * lp1 * 263);
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil(630 + sr + dr + lpr);
                        tv1.setText(String.valueOf("R/T 4:45 ,Ration 630 ,load 24"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    }
                    else if (tn.equals("791 da-rjhi") && (ln.equals(65)) && ld < 24) {
                        w4 = w3 - (ts + tst + 285);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = 24 - ld;
                        lpr = Math.floor((3.0 / 80.0) * lp1 *263);
                        dr = Math.floor((w4 * 20.0) / 60);
                        sr = Math.floor((ts * 30.0) / 60);
                        tr = Math.floor(630+ sr + dr - lpr);
                        tv1.setText(String.valueOf("R/T 4:45 ,Ration 630  ,load 24"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    } else if (tn.equals("791 da-rjhi") && (ln.equals(65)) && ld == 24) {
                        w4 = w3 - (ts + tst + 285);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil(630 + sr + dr);
                        tv1.setText(String.valueOf("R/T 4:45 ,Ration 630  ,load 24"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                    }
                    else if (tn.equals("792 rjhi-da") && (ln.equals(65)) && ld > 24) {
                        w4 = w3 - (ts + tst + 270);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = ld - 24;
                        lpr = Math.ceil((4.0 / 80.0) * lp1 * 263);
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil(635 + sr + dr + lpr);
                        tv1.setText(String.valueOf("R/T 4:30 ,Ration 635 ,load 24"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    }
                    else if (tn.equals("792 rjhi-da") && (ln.equals(65)) && ld < 24) {
                        w4 = w3 - (ts + tst + 270);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = 24 - ld;
                        lpr = Math.floor((3.0 / 80.0) * lp1 *263);
                        dr = Math.floor((w4 * 20.0) / 60);
                        sr = Math.floor((ts * 30.0) / 60);
                        tr = Math.floor(635+ sr + dr - lpr);
                        tv1.setText(String.valueOf("R/T 4:30 ,Ration 635  ,load 24"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    } else if (tn.equals("792 rjhi-da") && (ln.equals(65)) && ld == 24) {
                        w4 = w3 - (ts + tst + 270);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil(635 + sr + dr);
                        tv1.setText(String.valueOf("R/T 4:30 ,Ration 635  ,load 24"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                    }
                    else if (tn.equals("791 rjhi-cnbj") && (ln.equals(65)) && ld > 24) {
                        w4 = w3 - (ts + tst + 55);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = ld - 24;
                        lpr = Math.ceil((4.0 / 80.0) * lp1 * 50);
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil(110 + sr + dr + lpr);
                        tv1.setText(String.valueOf("R/T 00:55 ,Ration 110 ,load 24"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    }
                    else if (tn.equals("791 rjhi-cnbj") && (ln.equals(65)) && ld < 24) {
                        w4 = w3 - (ts + tst + 55);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = 24 - ld;
                        lpr = Math.floor((3.0 / 80.0) * lp1 *50);
                        dr = Math.floor((w4 * 20.0) / 60);
                        sr = Math.floor((ts * 30.0) / 60);
                        tr = Math.floor(110+ sr + dr - lpr);
                        tv1.setText(String.valueOf("R/T 00:55 ,Ration 110  ,load 24"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    } else if (tn.equals("791 rjhi-cnbj") && (ln.equals(65)) && ld == 24) {
                        w4 = w3 - (ts + tst + 55);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil(110 + sr + dr);
                        tv1.setText(String.valueOf("R/T 00:55 ,Ration 110  ,load 24"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                    }
                    else if (tn.equals("792 cnbj-rjhi") && (ln.equals(65)) && ld > 24) {
                        w4 = w3 - (ts + tst + 60);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = ld - 24;
                        lpr = Math.ceil((4.0 / 80.0) * lp1 * 50);
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil(110 + sr + dr + lpr);
                        tv1.setText(String.valueOf("R/T 01:00 ,Ration 110 ,load 24"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    }
                    else if (tn.equals("792 cnbj-rjhi") && (ln.equals(65)) && ld < 24) {
                        w4 = w3 - (ts + tst + 60);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = 24 - ld;
                        lpr = Math.floor((3.0 / 80.0) * lp1 *50);
                        dr = Math.floor((w4 * 20.0) / 60);
                        sr = Math.floor((ts * 30.0) / 60);
                        tr = Math.floor(110+ sr + dr - lpr);
                        tv1.setText(String.valueOf("R/T 01:00 ,Ration 110  ,load 24"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    } else if (tn.equals("792 cnbj-rjhi") && (ln.equals(65)) && ld == 24) {
                        w4 = w3 - (ts + tst + 60);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil(110 + sr + dr);
                        tv1.setText(String.valueOf("R/T 01:00 ,Ration 110  ,load 24"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                    }
                    else if (tn.equals("759 da-rjhi") && (ln.equals(65)) && ld > 24) {
                        w4 = w3 - (ts + tst + 330);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = ld - 24;
                        lpr = Math.ceil((4.0 / 80.0) * lp1 * 263);
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil(665 + sr + dr + lpr);
                        tv1.setText(String.valueOf("R/T 05:30 ,Ration 665 ,load 24"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    }
                    else if (tn.equals("759 da-rjhi") && (ln.equals(65)) && ld < 24) {
                        w4 = w3 - (ts + tst + 330);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = 24 - ld;
                        lpr = Math.floor((3.0 / 80.0) * lp1 *263);
                        dr = Math.floor((w4 * 20.0) / 60);
                        sr = Math.floor((ts * 30.0) / 60);
                        tr = Math.floor(665+ sr + dr - lpr);
                        tv1.setText(String.valueOf("R/T 05:30 ,Ration 665  ,load 24"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    } else if (tn.equals("759 da-rjhi") && (ln.equals(65)) && ld == 24) {
                        w4 = w3 - (ts + tst + 330);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil(665 + sr + dr);
                        tv1.setText(String.valueOf("R/T 05:30 ,Ration 665  ,load 24"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                    }
                    else if (tn.equals("760 rjhi-da") && (ln.equals(65)) && ld > 24) {
                        w4 = w3 - (ts + tst + 340);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = ld - 24;
                        lpr = Math.ceil((4.0 / 80.0) * lp1 * 263);
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil(670 + sr + dr + lpr);
                        tv1.setText(String.valueOf("R/T 05:40 ,Ration 670 ,load 24"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    }
                    else if (tn.equals("760 rjhi-da") && (ln.equals(65)) && ld < 24) {
                        w4 = w3 - (ts + tst + 340);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        lp1 = 24 - ld;
                        lpr = Math.floor((3.0 / 80.0) * lp1 *263);
                        dr = Math.floor((w4 * 20.0) / 60);
                        sr = Math.floor((ts * 30.0) / 60);
                        tr = Math.floor(670+ sr + dr - lpr);
                        tv1.setText(String.valueOf("R/T 05:40 ,Ration 670  ,load 24"));
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    } else if (tn.equals("760 rjhi-da") && (ln.equals(65)) && ld == 24) {
                        w4 = w3 - (ts + tst + 340);
                        w5 = w4 / 60;
                        w6 = w4 % 60;
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil(670 + sr + dr);
                        tv1.setText(String.valueOf("R/T 05:40 ,Ration 670  ,load 24"));
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



