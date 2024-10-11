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

public class BalenceIsdIntercity extends AppCompatActivity {
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
        setContentView(R.layout.activity_balence_isd_intercity);

        autoCompleteTextView = findViewById(R.id.ed11);

        String[] Isd = getResources().getStringArray(R.array.isdsixtysix);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Isd);
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
                     if (tn.equals("748 isd-kln") && (ln.equals(66)) && ld > 26) {
                        w4 = w3 - (ts + tst + (265*wkk)/205);
                        w5 = w4 / 60; w6 = w4 % 60;  lp1 = ld - 26;km=205;
                        lpr = Math.ceil((4.0 / 80.0) * lp1 * wkk);
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr +lpr+ (580*wkk)/km);
                        tv1.setText(String.valueOf("R/T   "+(265*wkk/km)/60 )+" : "+(265*wkk/km)%60+"  "+" Ration " + (580*wkk)/km);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus " + lpr));
                    } else if (tn.equals("748 isd-kln") && (ln.equals(66)) && ld < 26) {
                        w4 = w3 - (ts + tst + (265*wkk)/205);
                        w5 = w4 / 60; w6 = w4 % 60; lp1 = 26 - ld;km=205;
                        lpr = Math.floor((3.0 / 80.0) * lp1 * wkk);
                        dr = Math.floor((w4 * 20.0) / 60);
                        sr = Math.floor((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr +(580*wkk)/km)-lpr;
                        tv1.setText(String.valueOf("R/T   "+(265*wkk/km)/60 )+" : "+(265*wkk/km)%60+"  "+" Ration "+(580*wkk)/km);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Minus " + lpr));
                    } else if (tn.equals("748 isd-kln") && (ln.equals(66)) && ld == 26) {
                        w4 = w3 - (ts + tst + (265*wkk)/205);
                        w5 = w4 / 60;  w6 = w4 % 60;km = 205;
                        dr = Math.ceil((w4 * 20.0) / 60);
                        sr = Math.ceil((ts * 30.0) / 60);
                        tr = Math.ceil( sr + dr + (580*wkk)/km);
                        tv1.setText(String.valueOf("R/T   "+(265*wkk/km)/60 )+" : "+(265*wkk/km)%60+"  "+" Ration "+(580*wkk)/km);
                        tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                        tv4.setText(String.valueOf("Total Ration " + tr));
                        tv5.setText(String.valueOf("Shunting Ration " + sr));
                        tv6.setText(String.valueOf(" Detention Ration " + dr));
                        tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                    }

                     else if (tn.equals("747 isd-clh") && (ln.equals(66)) && ld > 26) {
                         w4 = w3 - (ts + tst + (315*wkk)/242);
                         w5 = w4 / 60; w6 = w4 % 60;  lp1 = ld - 26;km=242;
                         lpr = Math.ceil((4.0 / 80.0) * lp1 * wkk);
                         dr = Math.ceil((w4 * 20.0) / 60);
                         sr = Math.ceil((ts * 30.0) / 60);
                         tr = Math.ceil( sr + dr +lpr+ (690*wkk)/km);
                         tv1.setText(String.valueOf("R/T   "+(315*wkk/km)/60 )+" : "+(315*wkk/km)%60+"  "+" Ration " + (690*wkk)/km);
                         tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                         tv4.setText(String.valueOf("Total Ration " + tr));
                         tv5.setText(String.valueOf("Shunting Ration " + sr));
                         tv6.setText(String.valueOf(" Detention Ration " + dr));
                         tv7.setText(String.valueOf(" Load Plus " + lpr));
                     } else if (tn.equals("747 isd-clh") && (ln.equals(66)) && ld < 26) {
                         w4 = w3 - (ts + tst + (315*wkk)/242);
                         w5 = w4 / 60; w6 = w4 % 60; lp1 = 26 - ld;km=242;
                         lpr = Math.floor((3.0 / 80.0) * lp1 * wkk);
                         dr = Math.floor((w4 * 20.0) / 60);
                         sr = Math.floor((ts * 30.0) / 60);
                         tr = Math.ceil( sr + dr +(690*wkk)/km)-lpr;
                         tv1.setText(String.valueOf("R/T   "+(315*wkk/km)/60 )+" : "+(315*wkk/km)%60+"  "+" Ration "+(690*wkk)/km);
                         tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                         tv4.setText(String.valueOf("Total Ration " + tr));
                         tv5.setText(String.valueOf("Shunting Ration " + sr));
                         tv6.setText(String.valueOf(" Detention Ration " + dr));
                         tv7.setText(String.valueOf(" Load Minus " + lpr));
                     } else if (tn.equals("747 isd-clh") && (ln.equals(66)) && ld == 26) {
                         w4 = w3 - (ts + tst + (315*wkk)/242);
                         w5 = w4 / 60;  w6 = w4 % 60;km = 242;
                         dr = Math.ceil((w4 * 20.0) / 60);
                         sr = Math.ceil((ts * 30.0) / 60);
                         tr = Math.ceil( sr + dr + (690*wkk)/km);
                         tv1.setText(String.valueOf("R/T   "+(315*wkk/km)/60 )+" : "+(315*wkk/km)%60+"  "+" Ration "+(690*wkk)/km);
                         tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                         tv4.setText(String.valueOf("Total Ration " + tr));
                         tv5.setText(String.valueOf("Shunting Ration " + sr));
                         tv6.setText(String.valueOf(" Detention Ration " + dr));
                         tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                     }

                     else if (tn.equals("748 chi-isd") && (ln.equals(66)) && ld > 26) {
                         w4 = w3 - (ts + tst + (290*wkk)/242);
                         w5 = w4 / 60; w6 = w4 % 60;  lp1 = ld - 26;km=242;
                         lpr = Math.ceil((4.0 / 80.0) * lp1 * wkk);
                         dr = Math.ceil((w4 * 20.0) / 60);
                         sr = Math.ceil((ts * 30.0) / 60);
                         tr = Math.ceil( sr + dr +lpr+ (670*wkk)/km);
                         tv1.setText(String.valueOf("R/T   "+(290*wkk/km)/60 )+" : "+(290*wkk/km)%60+"  "+" Ration " + (670*wkk)/km);
                         tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                         tv4.setText(String.valueOf("Total Ration " + tr));
                         tv5.setText(String.valueOf("Shunting Ration " + sr));
                         tv6.setText(String.valueOf(" Detention Ration " + dr));
                         tv7.setText(String.valueOf(" Load Plus " + lpr));
                     } else if (tn.equals("748 chi-isd") && (ln.equals(66)) && ld < 26) {
                         w4 = w3 - (ts + tst + (290*wkk)/242);
                         w5 = w4 / 60; w6 = w4 % 60; lp1 = 26 - ld;km=242;
                         lpr = Math.floor((3.0 / 80.0) * lp1 * wkk);
                         dr = Math.floor((w4 * 20.0) / 60);
                         sr = Math.floor((ts * 30.0) / 60);
                         tr = Math.ceil( sr + dr +(670*wkk)/km)-lpr;
                         tv1.setText(String.valueOf("R/T   "+(290*wkk/km)/60 )+" : "+(290*wkk/km)%60+"  "+" Ration "+(670*wkk)/km);
                         tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                         tv4.setText(String.valueOf("Total Ration " + tr));
                         tv5.setText(String.valueOf("Shunting Ration " + sr));
                         tv6.setText(String.valueOf(" Detention Ration " + dr));
                         tv7.setText(String.valueOf(" Load Minus " + lpr));
                     } else if (tn.equals("748 chi-isd") && (ln.equals(66)) && ld == 26) {
                         w4 = w3 - (ts + tst + (290*wkk)/242);
                         w5 = w4 / 60;  w6 = w4 % 60;km = 242;
                         dr = Math.ceil((w4 * 20.0) / 60);
                         sr = Math.ceil((ts * 30.0) / 60);
                         tr = Math.ceil( sr + dr + (670*wkk)/km);
                         tv1.setText(String.valueOf("R/T   "+(290*wkk/km)/60 )+" : "+(290*wkk/km)%60+"  "+" Ration "+(670*wkk)/km);
                         tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                         tv4.setText(String.valueOf("Total Ration " + tr));
                         tv5.setText(String.valueOf("Shunting Ration " + sr));
                         tv6.setText(String.valueOf(" Detention Ration " + dr));
                         tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                     }
                     else if (tn.equals("747 kln-isd") && (ln.equals(66)) && ld > 26) {
                         w4 = w3 - (ts + tst + (245*wkk)/205);
                         w5 = w4 / 60; w6 = w4 % 60;  lp1 = ld - 26;km=205;
                         lpr = Math.ceil((4.0 / 80.0) * lp1 * wkk);
                         dr = Math.ceil((w4 * 20.0) / 60);
                         sr = Math.ceil((ts * 30.0) / 60);
                         tr = Math.ceil( sr + dr +lpr+ (570*wkk)/km);
                         tv1.setText(String.valueOf("R/T   "+(245*wkk/km)/60 )+" : "+(245*wkk/km)%60+"  "+" Ration " + (570*wkk)/km);
                         tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                         tv4.setText(String.valueOf("Total Ration " + tr));
                         tv5.setText(String.valueOf("Shunting Ration " + sr));
                         tv6.setText(String.valueOf(" Detention Ration " + dr));
                         tv7.setText(String.valueOf(" Load Plus " + lpr));
                     } else if (tn.equals("747 kln-isd") && (ln.equals(66)) && ld < 26) {
                         w4 = w3 - (ts + tst + (245*wkk)/205);
                         w5 = w4 / 60; w6 = w4 % 60; lp1 = 26 - ld;km=205;
                         lpr = Math.floor((3.0 / 80.0) * lp1 * wkk);
                         dr = Math.floor((w4 * 20.0) / 60);
                         sr = Math.floor((ts * 30.0) / 60);
                         tr = Math.ceil( sr + dr +(570*wkk)/km)-lpr;
                         tv1.setText(String.valueOf("R/T   "+(245*wkk/km)/60 )+" : "+(245*wkk/km)%60+"  "+" Ration "+(570*wkk)/km);
                         tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                         tv4.setText(String.valueOf("Total Ration " + tr));
                         tv5.setText(String.valueOf("Shunting Ration " + sr));
                         tv6.setText(String.valueOf(" Detention Ration " + dr));
                         tv7.setText(String.valueOf(" Load Minus " + lpr));
                     } else if (tn.equals("747 kln-isd") && (ln.equals(66)) && ld == 26) {
                         w4 = w3 - (ts + tst + (245*wkk)/205);
                         w5 = w4 / 60;  w6 = w4 % 60;km = 205;
                         dr = Math.ceil((w4 * 20.0) / 60);
                         sr = Math.ceil((ts * 30.0) / 60);
                         tr = Math.ceil( sr + dr + (570*wkk)/km);
                         tv1.setText(String.valueOf("R/T   "+(245*wkk/km)/60 )+" : "+(245*wkk/km)%60+"  "+" Ration "+(570*wkk)/km);
                         tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                         tv4.setText(String.valueOf("Total Ration " + tr));
                         tv5.setText(String.valueOf("Shunting Ration " + sr));
                         tv6.setText(String.valueOf(" Detention Ration " + dr));
                         tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                     }
                     else if (tn.equals("727 kln-isd") && (ln.equals(66)) && ld > 26) {
                         w4 = w3 - (ts + tst + (260*wkk)/205);
                         w5 = w4 / 60; w6 = w4 % 60;  lp1 = ld - 26;km=205;
                         lpr = Math.ceil((4.0 / 80.0) * lp1 * wkk);
                         dr = Math.ceil((w4 * 20.0) / 60);
                         sr = Math.ceil((ts * 30.0) / 60);
                         tr = Math.ceil( sr + dr +lpr+ (580*wkk)/km);
                         tv1.setText(String.valueOf("R/T   "+(260*wkk/km)/60 )+" : "+(260*wkk/km)%60+"  "+" Ration " + (580*wkk)/km);
                         tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                         tv4.setText(String.valueOf("Total Ration " + tr));
                         tv5.setText(String.valueOf("Shunting Ration " + sr));
                         tv6.setText(String.valueOf(" Detention Ration " + dr));
                         tv7.setText(String.valueOf(" Load Plus " + lpr));
                     } else if (tn.equals("727 kln-isd") && (ln.equals(66)) && ld < 26) {
                         w4 = w3 - (ts + tst + (260*wkk)/205);
                         w5 = w4 / 60; w6 = w4 % 60; lp1 = 26 - ld;km=205;
                         lpr = Math.floor((3.0 / 80.0) * lp1 * wkk);
                         dr = Math.floor((w4 * 20.0) / 60);
                         sr = Math.floor((ts * 30.0) / 60);
                         tr = Math.ceil( sr + dr +(580*wkk)/km)-lpr;
                         tv1.setText(String.valueOf("R/T   "+(260*wkk/km)/60 )+" : "+(260*wkk/km)%60+"  "+" Ration "+(580*wkk)/km);
                         tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                         tv4.setText(String.valueOf("Total Ration " + tr));
                         tv5.setText(String.valueOf("Shunting Ration " + sr));
                         tv6.setText(String.valueOf(" Detention Ration " + dr));
                         tv7.setText(String.valueOf(" Load Minus " + lpr));
                     } else if (tn.equals("727 kln-isd") && (ln.equals(66)) && ld == 26) {
                         w4 = w3 - (ts + tst + (260*wkk)/205);
                         w5 = w4 / 60;  w6 = w4 % 60;km = 205;
                         dr = Math.ceil((w4 * 20.0) / 60);
                         sr = Math.ceil((ts * 30.0) / 60);
                         tr = Math.ceil( sr + dr + (580*wkk)/km);
                         tv1.setText(String.valueOf("R/T   "+(260*wkk/km)/60 )+" : "+(260*wkk/km)%60+"  "+" Ration "+(580*wkk)/km);
                         tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                         tv4.setText(String.valueOf("Total Ration " + tr));
                         tv5.setText(String.valueOf("Shunting Ration " + sr));
                         tv6.setText(String.valueOf(" Detention Ration " + dr));
                         tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                     }

                     else if (tn.equals("727 isd-clh") && (ln.equals(66)) && ld > 26) {
                         w4 = w3 - (ts + tst + (325*wkk)/242);
                         w5 = w4 / 60; w6 = w4 % 60;  lp1 = ld - 26;km=242;
                         lpr = Math.ceil((4.0 / 80.0) * lp1 * wkk);
                         dr = Math.ceil((w4 * 20.0) / 60);
                         sr = Math.ceil((ts * 30.0) / 60);
                         tr = Math.ceil( sr + dr +lpr+ (695*wkk)/km);
                         tv1.setText(String.valueOf("R/T   "+(325*wkk/km)/60 )+" : "+(325*wkk/km)%60+"  "+" Ration " + (695*wkk)/km);
                         tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                         tv4.setText(String.valueOf("Total Ration " + tr));
                         tv5.setText(String.valueOf("Shunting Ration " + sr));
                         tv6.setText(String.valueOf(" Detention Ration " + dr));
                         tv7.setText(String.valueOf(" Load Plus " + lpr));
                     } else if (tn.equals("727 isd-clh") && (ln.equals(66)) && ld < 26) {
                         w4 = w3 - (ts + tst + (325*wkk)/242);
                         w5 = w4 / 60; w6 = w4 % 60; lp1 = 26 - ld;km=242;
                         lpr = Math.floor((3.0 / 80.0) * lp1 * wkk);
                         dr = Math.floor((w4 * 20.0) / 60);
                         sr = Math.floor((ts * 30.0) / 60);
                         tr = Math.ceil( sr + dr +(695*wkk)/km)-lpr;
                         tv1.setText(String.valueOf("R/T   "+(325*wkk/km)/60 )+" : "+(325*wkk/km)%60+"  "+" Ration "+(695*wkk)/km);
                         tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                         tv4.setText(String.valueOf("Total Ration " + tr));
                         tv5.setText(String.valueOf("Shunting Ration " + sr));
                         tv6.setText(String.valueOf(" Detention Ration " + dr));
                         tv7.setText(String.valueOf(" Load Minus " + lpr));
                     } else if (tn.equals("727 isd-clh") && (ln.equals(66)) && ld == 26) {
                         w4 = w3 - (ts + tst + (325*wkk)/242);
                         w5 = w4 / 60;  w6 = w4 % 60;km = 242;
                         dr = Math.ceil((w4 * 20.0) / 60);
                         sr = Math.ceil((ts * 30.0) / 60);
                         tr = Math.ceil( sr + dr + (695*wkk)/km);
                         tv1.setText(String.valueOf("R/T   "+(325*wkk/km)/60 )+" : "+(325*wkk/km)%60+"  "+" Ration "+(695*wkk)/km);
                         tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                         tv4.setText(String.valueOf("Total Ration " + tr));
                         tv5.setText(String.valueOf("Shunting Ration " + sr));
                         tv6.setText(String.valueOf(" Detention Ration " + dr));
                         tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                     }
                     else if (tn.equals("728 clh-isd") && (ln.equals(66)) && ld > 26) {
                         w4 = w3 - (ts + tst + (310*wkk)/242);
                         w5 = w4 / 60; w6 = w4 % 60;  lp1 = ld - 26;km=242;
                         lpr = Math.ceil((4.0 / 80.0) * lp1 * wkk);
                         dr = Math.ceil((w4 * 20.0) / 60);
                         sr = Math.ceil((ts * 30.0) / 60);
                         tr = Math.ceil( sr + dr +lpr+ (675*wkk)/km);
                         tv1.setText(String.valueOf("R/T   "+(310*wkk/km)/60 )+" : "+(310*wkk/km)%60+"  "+" Ration " + (675*wkk)/km);
                         tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                         tv4.setText(String.valueOf("Total Ration " + tr));
                         tv5.setText(String.valueOf("Shunting Ration " + sr));
                         tv6.setText(String.valueOf(" Detention Ration " + dr));
                         tv7.setText(String.valueOf(" Load Plus " + lpr));
                     } else if (tn.equals("728 clh-isd") && (ln.equals(66)) && ld < 26) {
                         w4 = w3 - (ts + tst + (310*wkk)/242);
                         w5 = w4 / 60; w6 = w4 % 60; lp1 = 26 - ld;km=242;
                         lpr = Math.floor((3.0 / 80.0) * lp1 * wkk);
                         dr = Math.floor((w4 * 20.0) / 60);
                         sr = Math.floor((ts * 30.0) / 60);
                         tr = Math.ceil( sr + dr +(675*wkk)/km)-lpr;
                         tv1.setText(String.valueOf("R/T   "+(310*wkk/km)/60 )+" : "+(310*wkk/km)%60+"  "+" Ration "+(675*wkk)/km);
                         tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                         tv4.setText(String.valueOf("Total Ration " + tr));
                         tv5.setText(String.valueOf("Shunting Ration " + sr));
                         tv6.setText(String.valueOf(" Detention Ration " + dr));
                         tv7.setText(String.valueOf(" Load Minus " + lpr));
                     } else if (tn.equals("728 clh-isd") && (ln.equals(66)) && ld == 26) {
                         w4 = w3 - (ts + tst + (310*wkk)/242);
                         w5 = w4 / 60;  w6 = w4 % 60;km = 242;
                         dr = Math.ceil((w4 * 20.0) / 60);
                         sr = Math.ceil((ts * 30.0) / 60);
                         tr = Math.ceil( sr + dr + (675*wkk)/km);
                         tv1.setText(String.valueOf("R/T   "+(310*wkk/km)/60 )+" : "+(310*wkk/km)%60+"  "+" Ration "+(675*wkk)/km);
                         tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                         tv4.setText(String.valueOf("Total Ration " + tr));
                         tv5.setText(String.valueOf("Shunting Ration " + sr));
                         tv6.setText(String.valueOf(" Detention Ration " + dr));
                         tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                     }

                     else if (tn.equals("728 isd-kln") && (ln.equals(66)) && ld > 26) {
                         w4 = w3 - (ts + tst + (250*wkk)/205);
                         w5 = w4 / 60; w6 = w4 % 60;  lp1 = ld - 26;km=205;
                         lpr = Math.ceil((4.0 / 80.0) * lp1 * wkk);
                         dr = Math.ceil((w4 * 20.0) / 60);
                         sr = Math.ceil((ts * 30.0) / 60);
                         tr = Math.ceil( sr + dr +lpr+ (575*wkk)/km);
                         tv1.setText(String.valueOf("R/T   "+(250*wkk/km)/60 )+" : "+(250*wkk/km)%60+"  "+" Ration " + (575*wkk)/km);
                         tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                         tv4.setText(String.valueOf("Total Ration " + tr));
                         tv5.setText(String.valueOf("Shunting Ration " + sr));
                         tv6.setText(String.valueOf(" Detention Ration " + dr));
                         tv7.setText(String.valueOf(" Load Plus " + lpr));
                     } else if (tn.equals("728 isd-kln") && (ln.equals(66)) && ld < 26) {
                         w4 = w3 - (ts + tst + (250*wkk)/205);
                         w5 = w4 / 60; w6 = w4 % 60; lp1 = 26 - ld;km=205;
                         lpr = Math.floor((3.0 / 80.0) * lp1 * wkk);
                         dr = Math.floor((w4 * 20.0) / 60);
                         sr = Math.floor((ts * 30.0) / 60);
                         tr = Math.ceil( sr + dr +(575*wkk)/km)-lpr;
                         tv1.setText(String.valueOf("R/T   "+(250*wkk/km)/60 )+" : "+(250*wkk/km)%60+"  "+" Ration "+(575*wkk)/km);
                         tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                         tv4.setText(String.valueOf("Total Ration " + tr));
                         tv5.setText(String.valueOf("Shunting Ration " + sr));
                         tv6.setText(String.valueOf(" Detention Ration " + dr));
                         tv7.setText(String.valueOf(" Load Minus " + lpr));
                     } else if (tn.equals("728 isd-kln") && (ln.equals(66)) && ld == 26) {
                         w4 = w3 - (ts + tst + (250*wkk)/205);
                         w5 = w4 / 60;  w6 = w4 % 60;km = 205;
                         dr = Math.ceil((w4 * 20.0) / 60);
                         sr = Math.ceil((ts * 30.0) / 60);
                         tr = Math.ceil( sr + dr + (575*wkk)/km);
                         tv1.setText(String.valueOf("R/T   "+(250*wkk/km)/60 )+" : "+(250*wkk/km)%60+"  "+" Ration "+(575*wkk)/km);
                         tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                         tv4.setText(String.valueOf("Total Ration " + tr));
                         tv5.setText(String.valueOf("Shunting Ration " + sr));
                         tv6.setText(String.valueOf(" Detention Ration " + dr));
                         tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                     }
                     else if (tn.equals("761 kln-isd") && (ln.equals(66)) && ld > 22) {
                         w4 = w3 - (ts + tst + (255*wkk)/205);
                         w5 = w4 / 60; w6 = w4 % 60;  lp1 = ld - 22;km=205;
                         lpr = Math.ceil((4.0 / 80.0) * lp1 * wkk);
                         dr = Math.ceil((w4 * 20.0) / 60);
                         sr = Math.ceil((ts * 30.0) / 60);
                         tr = Math.ceil( sr + dr +lpr+ (540*wkk)/km);
                         tv1.setText(String.valueOf("R/T   "+(255*wkk/km)/60 )+" : "+(255*wkk/km)%60+"  "+" Ration " + (540*wkk)/km);
                         tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                         tv4.setText(String.valueOf("Total Ration " + tr));
                         tv5.setText(String.valueOf("Shunting Ration " + sr));
                         tv6.setText(String.valueOf(" Detention Ration " + dr));
                         tv7.setText(String.valueOf(" Load Plus " + lpr));
                     } else if (tn.equals("761 kln-isd") && (ln.equals(66)) && ld < 22) {
                         w4 = w3 - (ts + tst + (255*wkk)/205);
                         w5 = w4 / 60; w6 = w4 % 60; lp1 = 22 - ld;km=205;
                         lpr = Math.floor((3.0 / 80.0) * lp1 * wkk);
                         dr = Math.floor((w4 * 20.0) / 60);
                         sr = Math.floor((ts * 30.0) / 60);
                         tr = Math.ceil( sr + dr +(540*wkk)/km)-lpr;
                         tv1.setText(String.valueOf("R/T   "+(255*wkk/km)/60 )+" : "+(255*wkk/km)%60+"  "+" Ration "+(540*wkk)/km);
                         tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                         tv4.setText(String.valueOf("Total Ration " + tr));
                         tv5.setText(String.valueOf("Shunting Ration " + sr));
                         tv6.setText(String.valueOf(" Detention Ration " + dr));
                         tv7.setText(String.valueOf(" Load Minus " + lpr));
                     } else if (tn.equals("761 kln-isd") && (ln.equals(66)) && ld == 22) {
                         w4 = w3 - (ts + tst + (255*wkk)/205);
                         w5 = w4 / 60;  w6 = w4 % 60;km = 205;
                         dr = Math.ceil((w4 * 20.0) / 60);
                         sr = Math.ceil((ts * 30.0) / 60);
                         tr = Math.ceil( sr + dr + (540*wkk)/km);
                         tv1.setText(String.valueOf("R/T   "+(255*wkk/km)/60 )+" : "+(255*wkk/km)%60+"  "+" Ration "+(540*wkk)/km);
                         tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                         tv4.setText(String.valueOf("Total Ration " + tr));
                         tv5.setText(String.valueOf("Shunting Ration " + sr));
                         tv6.setText(String.valueOf(" Detention Ration " + dr));
                         tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                     }
                     else if (tn.equals("762 isd-kln") && (ln.equals(66)) && ld > 22) {
                         w4 = w3 - (ts + tst + (290*wkk)/205);
                         w5 = w4 / 60; w6 = w4 % 60;  lp1 = ld - 22;km=205;
                         lpr = Math.ceil((4.0 / 80.0) * lp1 * wkk);
                         dr = Math.ceil((w4 * 20.0) / 60);
                         sr = Math.ceil((ts * 30.0) / 60);
                         tr = Math.ceil( sr + dr +lpr+ (550*wkk)/km);
                         tv1.setText(String.valueOf("R/T   "+(290*wkk/km)/60 )+" : "+(290*wkk/km)%60+"  "+" Ration " + (550*wkk)/km);
                         tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                         tv4.setText(String.valueOf("Total Ration " + tr));
                         tv5.setText(String.valueOf("Shunting Ration " + sr));
                         tv6.setText(String.valueOf(" Detention Ration " + dr));
                         tv7.setText(String.valueOf(" Load Plus " + lpr));
                     } else if (tn.equals("762 isd-kln") && (ln.equals(66)) && ld < 22) {
                         w4 = w3 - (ts + tst + (290*wkk)/205);
                         w5 = w4 / 60; w6 = w4 % 60; lp1 = 22 - ld;km=205;
                         lpr = Math.floor((3.0 / 80.0) * lp1 * wkk);
                         dr = Math.floor((w4 * 20.0) / 60);
                         sr = Math.floor((ts * 30.0) / 60);
                         tr = Math.ceil( sr + dr +(550*wkk)/km)-lpr;
                         tv1.setText(String.valueOf("R/T   "+(290*wkk/km)/60 )+" : "+(290*wkk/km)%60+"  "+" Ration "+(550*wkk)/km);
                         tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                         tv4.setText(String.valueOf("Total Ration " + tr));
                         tv5.setText(String.valueOf("Shunting Ration " + sr));
                         tv6.setText(String.valueOf(" Detention Ration " + dr));
                         tv7.setText(String.valueOf(" Load Minus " + lpr));
                     } else if (tn.equals("762 isd-kln") && (ln.equals(66)) && ld == 22) {
                         w4 = w3 - (ts + tst + (290*wkk)/205);
                         w5 = w4 / 60;  w6 = w4 % 60;km = 205;
                         dr = Math.ceil((w4 * 20.0) / 60);
                         sr = Math.ceil((ts * 30.0) / 60);
                         tr = Math.ceil( sr + dr + (550*wkk)/km);
                         tv1.setText(String.valueOf("R/T   "+(290*wkk/km)/60 )+" : "+(290*wkk/km)%60+"  "+" Ration "+(550*wkk)/km);
                         tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                         tv4.setText(String.valueOf("Total Ration " + tr));
                         tv5.setText(String.valueOf("Shunting Ration " + sr));
                         tv6.setText(String.valueOf(" Detention Ration " + dr));
                         tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                     }
                     else if (tn.equals("754 rjhi-da") && (ln.equals(66)) && ld > 24) {
                         w4 = w3 - (ts + tst + (340*wkk)/263);
                         w5 = w4 / 60; w6 = w4 % 60;  lp1 = ld - 24;km=263;
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
                     } else if (tn.equals("754 rjhi-da") && (ln.equals(66)) && ld < 24) {
                         w4 = w3 - (ts + tst + (340*wkk)/263);
                         w5 = w4 / 60; w6 = w4 % 60; lp1 = 24 - ld;km=263;
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
                     } else if (tn.equals("754 rjhi-da") && (ln.equals(66)) && ld == 24) {
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
                     else if (tn.equals("764 da-isd") && (ln.equals(66)) && ld > 26) {
                         w4 = w3 - (ts + tst + (285*wkk)/208);
                         w5 = w4 / 60; w6 = w4 % 60;  lp1 = ld - 26;km=208;
                         lpr = Math.ceil((4.0 / 80.0) * lp1 * wkk);
                         dr = Math.ceil((w4 * 20.0) / 60);
                         sr = Math.ceil((ts * 30.0) / 60);
                         tr = Math.ceil( sr + dr +lpr+ (597*wkk)/km);
                         tv1.setText(String.valueOf("R/T   "+(285*wkk/km)/60 )+" : "+(285*wkk/km)%60+"  "+" Ration " + (597*wkk)/km);
                         tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                         tv4.setText(String.valueOf("Total Ration " + tr));
                         tv5.setText(String.valueOf("Shunting Ration " + sr));
                         tv6.setText(String.valueOf(" Detention Ration " + dr));
                         tv7.setText(String.valueOf(" Load Plus " + lpr));
                     } else if (tn.equals("764 da-isd") && (ln.equals(66)) && ld < 26) {
                         w4 = w3 - (ts + tst + (285*wkk)/208);
                         w5 = w4 / 60; w6 = w4 % 60; lp1 = 26 - ld;km=208;
                         lpr = Math.floor((3.0 / 80.0) * lp1 * wkk);
                         dr = Math.floor((w4 * 20.0) / 60);
                         sr = Math.floor((ts * 30.0) / 60);
                         tr = Math.ceil( sr + dr +(597*wkk)/km)-lpr;
                         tv1.setText(String.valueOf("R/T   "+(285*wkk/km)/60 )+" : "+(285*wkk/km)%60+"  "+" Ration "+(597*wkk)/km);
                         tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                         tv4.setText(String.valueOf("Total Ration " + tr));
                         tv5.setText(String.valueOf("Shunting Ration " + sr));
                         tv6.setText(String.valueOf(" Detention Ration " + dr));
                         tv7.setText(String.valueOf(" Load Minus " + lpr));
                     } else if (tn.equals("764 da-isd") && (ln.equals(66)) && ld == 26) {
                         w4 = w3 - (ts + tst + (285*wkk)/208);
                         w5 = w4 / 60;  w6 = w4 % 60;km = 208;
                         dr = Math.ceil((w4 * 20.0) / 60);
                         sr = Math.ceil((ts * 30.0) / 60);
                         tr = Math.ceil( sr + dr + (597*wkk)/km);
                         tv1.setText(String.valueOf("R/T   "+(285*wkk/km)/60 )+" : "+(285*wkk/km)%60+"  "+" Ration "+(597*wkk)/km);
                         tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                         tv4.setText(String.valueOf("Total Ration " + tr));
                         tv5.setText(String.valueOf("Shunting Ration " + sr));
                         tv6.setText(String.valueOf(" Detention Ration " + dr));
                         tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                     }
                     else if (tn.equals("756 isd-rb") && (ln.equals(66)) && ld > 24) {
                         w4 = w3 - (ts + tst + (165*wkk)/103);
                         w5 = w4 / 60; w6 = w4 % 60;  lp1 = ld - 24;km=103;
                         lpr = Math.ceil((8.0 / 80.0) * lp1 * wkk);
                         dr = Math.ceil((w4 * 20.0) / 60);
                         sr = Math.ceil((ts * 30.0) / 60);
                         tr = Math.ceil( sr + dr +lpr+ (330*wkk)/km);
                         tv1.setText(String.valueOf("R/T   "+(165*wkk/km)/60 )+" : "+(165*wkk/km)%60+"  "+" Ration " + (330*wkk)/km);
                         tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                         tv4.setText(String.valueOf("Total Ration " + tr));
                         tv5.setText(String.valueOf("Shunting Ration " + sr));
                         tv6.setText(String.valueOf(" Detention Ration " + dr));
                         tv7.setText(String.valueOf(" Load Plus " + lpr));
                     } else if (tn.equals("756 isd-rb") && (ln.equals(66)) && ld < 24) {
                         w4 = w3 - (ts + tst + (165*wkk)/103);
                         w5 = w4 / 60; w6 = w4 % 60; lp1 = 24 - ld;km=103;
                         lpr = Math.floor((6.0 / 80.0) * lp1 * wkk);
                         dr = Math.floor((w4 * 20.0) / 60);
                         sr = Math.floor((ts * 30.0) / 60);
                         tr = Math.ceil( sr + dr +(330*wkk)/km)-lpr;
                         tv1.setText(String.valueOf("R/T   "+(165*wkk/km)/60 )+" : "+(165*wkk/km)%60+"  "+" Ration "+(330*wkk)/km);
                         tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                         tv4.setText(String.valueOf("Total Ration " + tr));
                         tv5.setText(String.valueOf("Shunting Ration " + sr));
                         tv6.setText(String.valueOf(" Detention Ration " + dr));
                         tv7.setText(String.valueOf(" Load Minus " + lpr));
                     } else if (tn.equals("756 isd-rb") && (ln.equals(66)) && ld == 24) {
                         w4 = w3 - (ts + tst + (165*wkk)/103);
                         w5 = w4 / 60;  w6 = w4 % 60;km = 103;
                         dr = Math.ceil((w4 * 20.0) / 60);
                         sr = Math.ceil((ts * 30.0) / 60);
                         tr = Math.ceil( sr + dr + (330*wkk)/km);
                         tv1.setText(String.valueOf("R/T   "+(165*wkk/km)/60 )+" : "+(165*wkk/km)%60+"  "+" Ration "+(330*wkk)/km);
                         tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                         tv4.setText(String.valueOf("Total Ration " + tr));
                         tv5.setText(String.valueOf("Shunting Ration " + sr));
                         tv6.setText(String.valueOf(" Detention Ration " + dr));
                         tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                     }
                     else if (tn.equals("755 rb-isd") && (ln.equals(66)) && ld > 24) {
                         w4 = w3 - (ts + tst + (165*wkk)/103);
                         w5 = w4 / 60; w6 = w4 % 60;  lp1 = ld - 24;km=103;
                         lpr = Math.ceil((8.0 / 80.0) * lp1 * wkk);
                         dr = Math.ceil((w4 * 20.0) / 60);
                         sr = Math.ceil((ts * 30.0) / 60);
                         tr = Math.ceil( sr + dr +lpr+ (340*wkk)/km);
                         tv1.setText(String.valueOf("R/T   "+(165*wkk/km)/60 )+" : "+(165*wkk/km)%60+"  "+" Ration " + (340*wkk)/km);
                         tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                         tv4.setText(String.valueOf("Total Ration " + tr));
                         tv5.setText(String.valueOf("Shunting Ration " + sr));
                         tv6.setText(String.valueOf(" Detention Ration " + dr));
                         tv7.setText(String.valueOf(" Load Plus " + lpr));
                     } else if (tn.equals("755 rb-isd") && (ln.equals(66)) && ld < 24) {
                         w4 = w3 - (ts + tst + (165*wkk)/103);
                         w5 = w4 / 60; w6 = w4 % 60; lp1 = 24 - ld;km=103;
                         lpr = Math.floor((6.0 / 80.0) * lp1 * wkk);
                         dr = Math.floor((w4 * 20.0) / 60);
                         sr = Math.floor((ts * 30.0) / 60);
                         tr = Math.ceil( sr + dr +(340*wkk)/km)-lpr;
                         tv1.setText(String.valueOf("R/T   "+(165*wkk/km)/60 )+" : "+(165*wkk/km)%60+"  "+" Ration "+(340*wkk)/km);
                         tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                         tv4.setText(String.valueOf("Total Ration " + tr));
                         tv5.setText(String.valueOf("Shunting Ration " + sr));
                         tv6.setText(String.valueOf(" Detention Ration " + dr));
                         tv7.setText(String.valueOf(" Load Minus " + lpr));
                     } else if (tn.equals("755 rb-isd") && (ln.equals(66)) && ld == 24) {
                         w4 = w3 - (ts + tst + (165*wkk)/103);
                         w5 = w4 / 60;  w6 = w4 % 60;km = 103;
                         dr = Math.ceil((w4 * 20.0) / 60);
                         sr = Math.ceil((ts * 30.0) / 60);
                         tr = Math.ceil( sr + dr + (340*wkk)/km);
                         tv1.setText(String.valueOf("R/T   "+(165*wkk/km)/60 )+" : "+(165*wkk/km)%60+"  "+" Ration "+(340*wkk)/km);
                         tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                         tv4.setText(String.valueOf("Total Ration " + tr));
                         tv5.setText(String.valueOf("Shunting Ration " + sr));
                         tv6.setText(String.valueOf(" Detention Ration " + dr));
                         tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                     }
                     else if (tn.equals("763 isd-da") && (ln.equals(66)) && ld > 26) {
                         w4 = w3 - (ts + tst + (280*wkk)/208);
                         w5 = w4 / 60; w6 = w4 % 60;  lp1 = ld - 26;km=208;
                         lpr = Math.ceil((4.0 / 80.0) * lp1 * wkk);
                         dr = Math.ceil((w4 * 20.0) / 60);
                         sr = Math.ceil((ts * 30.0) / 60);
                         tr = Math.ceil( sr + dr +lpr+ (595*wkk)/km);
                         tv1.setText(String.valueOf("R/T   "+(280*wkk/km)/60 )+" : "+(280*wkk/km)%60+"  "+" Ration " + (595*wkk)/km);
                         tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                         tv4.setText(String.valueOf("Total Ration " + tr));
                         tv5.setText(String.valueOf("Shunting Ration " + sr));
                         tv6.setText(String.valueOf(" Detention Ration " + dr));
                         tv7.setText(String.valueOf(" Load Plus " + lpr));
                     } else if (tn.equals("763 isd-da") && (ln.equals(66)) && ld < 26) {
                         w4 = w3 - (ts + tst + (280*wkk)/208);
                         w5 = w4 / 60; w6 = w4 % 60; lp1 = 26 - ld;km=208;
                         lpr = Math.floor((3.0 / 80.0) * lp1 * wkk);
                         dr = Math.floor((w4 * 20.0) / 60);
                         sr = Math.floor((ts * 30.0) / 60);
                         tr = Math.ceil( sr + dr +(595*wkk)/km)-lpr;
                         tv1.setText(String.valueOf("R/T   "+(280*wkk/km)/60 )+" : "+(280*wkk/km)%60+"  "+" Ration "+(595*wkk)/km);
                         tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                         tv4.setText(String.valueOf("Total Ration " + tr));
                         tv5.setText(String.valueOf("Shunting Ration " + sr));
                         tv6.setText(String.valueOf(" Detention Ration " + dr));
                         tv7.setText(String.valueOf(" Load Minus " + lpr));
                     } else if (tn.equals("763 isd-da") && (ln.equals(66)) && ld == 26) {
                         w4 = w3 - (ts + tst + (280*wkk)/208);
                         w5 = w4 / 60;  w6 = w4 % 60;km = 208;
                         dr = Math.ceil((w4 * 20.0) / 60);
                         sr = Math.ceil((ts * 30.0) / 60);
                         tr = Math.ceil( sr + dr + (595*wkk)/km);
                         tv1.setText(String.valueOf("R/T   "+(280*wkk/km)/60 )+" : "+(280*wkk/km)%60+"  "+" Ration "+(595*wkk)/km);
                         tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                         tv4.setText(String.valueOf("Total Ration " + tr));
                         tv5.setText(String.valueOf("Shunting Ration " + sr));
                         tv6.setText(String.valueOf(" Detention Ration " + dr));
                         tv7.setText(String.valueOf(" Load Plus Minus Zero "));
                     }
                     else if (tn.equals("753 da-rjhi") && (ln.equals(66)) && ld > 28) {
                         w4 = w3 - (ts + tst + (350*wkk)/263);
                         w5 = w4 / 60; w6 = w4 % 60;  lp1 = ld - 28;km=263;
                         lpr = Math.ceil((4.0 / 80.0) * lp1 * wkk);
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
                         lpr = Math.floor((3.0 / 80.0) * lp1 * wkk);
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
                     else if (tn.equals("715 isd-rjhi") && (ln.equals(66)) && ld > 22) {
                         w4 = w3 - (ts + tst + (60*wkk)/59);
                         w5 = w4 / 60; w6 = w4 % 60;  lp1 = ld - 22;km=59;
                         lpr = Math.ceil((4.0 / 80.0) * lp1 * wkk);
                         dr = Math.ceil((w4 * 20.0) / 60);
                         sr = Math.ceil((ts * 30.0) / 60);
                         tr = Math.ceil( sr + dr +lpr+ (148*wkk)/km);
                         tv1.setText(String.valueOf("R/T   "+(60*wkk/km)/60 )+" : "+(60*wkk/km)%60+"  "+" Ration " + (148*wkk)/km);
                         tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                         tv4.setText(String.valueOf("Total Ration " + tr));
                         tv5.setText(String.valueOf("Shunting Ration " + sr));
                         tv6.setText(String.valueOf(" Detention Ration " + dr));
                         tv7.setText(String.valueOf(" Load Plus " + lpr));
                     } else if (tn.equals("715 isd-rjhi") && (ln.equals(66)) && ld < 22) {
                         w4 = w3 - (ts + tst + (60*wkk)/59);
                         w5 = w4 / 60; w6 = w4 % 60; lp1 = 22 - ld;km=59;
                         lpr = Math.floor((3.0 / 80.0) * lp1 * wkk);
                         dr = Math.floor((w4 * 20.0) / 60);
                         sr = Math.floor((ts * 30.0) / 60);
                         tr = Math.ceil( sr + dr +(148*wkk)/km)-lpr;
                         tv1.setText(String.valueOf("R/T   "+(60*wkk/km)/60 )+" : "+(60*wkk/km)%60+"  "+" Ration "+(148*wkk)/km);
                         tv3.setText(String.valueOf("Detention Work " + w5 + " Hour " + w6 + " Minute"));
                         tv4.setText(String.valueOf("Total Ration " + tr));
                         tv5.setText(String.valueOf("Shunting Ration " + sr));
                         tv6.setText(String.valueOf(" Detention Ration " + dr));
                         tv7.setText(String.valueOf(" Load Minus " + lpr));
                     } else if (tn.equals("715 isd-rjhi") && (ln.equals(66)) && ld == 22) {
                         w4 = w3 - (ts + tst + (60*wkk)/59);
                         w5 = w4 / 60;  w6 = w4 % 60;km = 59;
                         dr = Math.ceil((w4 * 20.0) / 60);
                         sr = Math.ceil((ts * 30.0) / 60);
                         tr = Math.ceil( sr + dr + (148*wkk)/km);
                         tv1.setText(String.valueOf("R/T   "+(60*wkk/km)/60 )+" : "+(60*wkk/km)%60+"  "+" Ration "+(148*wkk)/km);
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
                     else if (tn.equals("769 da-rjhi") && (ln.equals(66)) && ld > 28) {
                         w4 = w3 - (ts + tst + (340*wkk)/263);
                         w5 = w4 / 60; w6 = w4 % 60;  lp1 = ld - 28;km=263;
                         lpr = Math.ceil((8.0 / 80.0) * lp1 * wkk);
                         dr = Math.ceil((w4 * 20.0) / 60);
                         sr = Math.ceil((ts * 30.0) / 60);
                         tr = Math.ceil( sr + dr +lpr+ (905*wkk)/km);
                         tv1.setText(String.valueOf("R/T   "+(340*wkk/km)/60 )+" : "+(340*wkk/km)%60+"  "+" Ration " + (900*wkk)/km);
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
                         tv1.setText(String.valueOf("R/T   "+(340*wkk/km)/60 )+" : "+(340*wkk/km)%60+"  "+" Ration "+(900*wkk)/km);
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
                         tv1.setText(String.valueOf("R/T   "+(340*wkk/km)/60 )+" : "+(340*wkk/km)%60+"  "+" Ration "+(900*wkk)/km);
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