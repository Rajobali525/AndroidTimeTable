package com.example.timetable;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Mileage extends AppCompatActivity {
    MyDatabaseHelper myDatabaseHelper;
    private EditText ed1,ed2,ed3,ed4,ur,date,ed5,ed6;
    private TextView totalwork,runningtime,detentiontime,detentionmileage,  totalmileages,tot,datee ;
    private Button clculate,clear,save,display,update,delete,selectdate;
    private AutoCompleteTextView autoCompleteTextView;
    Integer n1,n2,n3,n4,w1,w2,r1,r2,w3,w4,under;
    String tn,id,d,total,dd,fuel;
    Double totalmileage;
    private DatePickerDialog datePickerDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_mileage2);

        myDatabaseHelper = new MyDatabaseHelper(this);
       SQLiteDatabase sqLiteDatabase= myDatabaseHelper.getWritableDatabase();

        ed1 = findViewById(R.id.starthour);
        ed2 = findViewById(R.id.startminute);
        ed3 = findViewById(R.id.endhour);
        ed4 = findViewById(R.id.endtminute);
        ed6 = findViewById(R.id.fuelid);
        autoCompleteTextView = findViewById(R.id.trainno);
        detentiontime = findViewById(R.id.detentiontime);
        detentionmileage = findViewById(R.id.detentionmileage);
        totalmileages = findViewById(R.id.totalmileage);
        ur = findViewById(R.id.underrest);

        tot = findViewById(R.id.tot);
        update = findViewById(R.id.updateid);
        delete = findViewById(R.id.deleteid);
        ed5  = findViewById(R.id.newid);

        clculate= findViewById(R.id.calculatebuttonid);
        clear = findViewById(R.id.clearbuttonid);
        save = findViewById(R.id.savemileage);
        display = findViewById(R.id.displayid);

        totalwork = findViewById(R.id.totalwork);
        runningtime = findViewById(R.id.runningtime);

        datee = findViewById(R.id.selectdatetext);
        selectdate = findViewById(R.id.selectdate);


        String[]  countryNames = getResources().getStringArray(R.array.country);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,countryNames);
        autoCompleteTextView.setThreshold(1);
        autoCompleteTextView.setAdapter(adapter);

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
                    ur.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        ur.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(ur.getText().toString().length()==2){
                    autoCompleteTextView.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


        clculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1.length()==0||ed2.length()==0||ed3.length()==0||ed4.length()==0||autoCompleteTextView.length()==0){
                    Toast.makeText(getApplicationContext(),"Please fill all items",Toast.LENGTH_LONG).show();

                }
                else {
                    n1 = Integer.valueOf(ed1.getText().toString());
                    n2 = Integer.valueOf(ed2.getText().toString());
                    n3 = Integer.valueOf(ed3.getText().toString());
                    n4 = Integer.valueOf(ed4.getText().toString());
                    under = Integer.valueOf(ur.getText().toString());
                    tn = String.valueOf(autoCompleteTextView.getText().toString()).trim();
                    Integer r1;


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
                        w2 = 60 + n4 - n2;

                    } else if (n1 == n3 && n2 == n4) {
                        w1 = 0;
                        w2 = 0;

                    } else if (n1 == n3 && n2 < n4) {
                        w1 = 0;
                        w2 = n4 - n2;

                    } else if (n2 == n4 && n1 > n3) {
                        w1 = 24 - n1 + n3;
                        w2 = 0;

                    } else if (n2 == n4 && n3 > n1) {
                        w1 = n3 - n1;
                        w2 = 0;

                    }

                    totalwork.setText("Total Work  " + w1 + "  Hour  " + w2 + "  Minute ");
                    if (tn.equals("705 da-pbt")) {
                        runningtime.setText(String.valueOf("R/T: 08 Hour 05 Minute " + "  Mileage : 280"));
                        r1 = w1 * 60 + w2;
                        int rt = 485;
                        int det = r1 - rt;
                        int deth = det / 60;
                        int detm = det % 60;
                        detentiontime.setText(String.valueOf("Detention " + deth + "  Hour " + detm + "  Minute "));
                        double detmileage = deth * 12.5 + (detm * 10 / 48.0);
                        double x = (int) Math.ceil(detmileage);
                        detentionmileage.setText(String.valueOf("Detention Mileage : " + x));
                         totalmileage = 280 + x + under;
                        totalmileages.setText(String.valueOf("Total Mileage " + totalmileage));
                    }
                    else  if (tn.equals("705 pbt-bmsm")) {
                        runningtime.setText(String.valueOf("R/T: 02 Hour 35 Minute " + "  Mileage : 85"));
                        r1 = w1 * 60 + w2;
                        int rt = 155;
                        int det = r1 - rt;
                        int deth = det / 60;
                        int detm = det % 60;
                        detentiontime.setText(String.valueOf("Detention " + deth + "  Hour " + detm + "  Minute "));
                        double detmileage = (deth * 12.5) + detm * 10 / 48.0;
                        double x = (int) Math.ceil(detmileage);
                        detentionmileage.setText(String.valueOf("Detention Mileage : " + x));
                      totalmileage = 85 + x + under;
                        totalmileages.setText(String.valueOf("Total Mileage  " + totalmileage));

                    }
                    else  if (tn.equals("706 bmsm-pbt")) {
                        runningtime.setText(String.valueOf("R/T: 02 Hour 40 Minute " + "  Mileage : 85"));
                        r1 = w1 * 60 + w2;
                        int rt = 160;
                        int det = r1 - rt;
                        int deth = det / 60;
                        int detm = det % 60;
                        detentiontime.setText(String.valueOf("Detention " + deth + "  Hour " + detm + "  Minute "));
                        double detmileage = (deth * 12.5) + detm * 10 / 48.0;
                        double x = (int) Math.ceil(detmileage);
                        detentionmileage.setText(String.valueOf("Detention Mileage : " + x));
                       totalmileage = 85 + x + under;
                        totalmileages.setText(String.valueOf("Total Mileage  " + totalmileage));

                    }
                    else  if (tn.equals("706 pbt-da")) {
                        runningtime.setText(String.valueOf("R/T: 08 Hour 00 Minute " + "  Mileage : 280"));
                        r1 = w1 * 60 + w2;
                        int rt = 480;
                        int det = r1 - rt;
                        int deth = det / 60;
                        int detm = det % 60;
                        detentiontime.setText(String.valueOf("Detention " + deth + "  Hour " + detm + "  Minute "));
                        double detmileage = (deth * 12.5) + detm * 10 / 48.0;
                        double x = (int) Math.ceil(detmileage);
                        detentionmileage.setText(String.valueOf("Detention Mileage : " + x));
                         totalmileage = 280 + x + under;
                        totalmileages.setText(String.valueOf("Total Mileage  " + totalmileage));

                    }
                    else if (tn.equals("731 rjhi-pbt")) {
                        runningtime.setText(String.valueOf("R/T: 04 Hour 25 Minute " + "  Mileage : 125"));
                        r1 = w1 * 60 + w2;
                        int rt = 265;
                        int det = r1 - rt;
                        int deth = det / 60;
                        int detm = det % 60;
                        detentiontime.setText(String.valueOf("Detention " + deth + "  Hour " + detm + "  Minute "));
                        double detmileage = (deth * 12.5) + detm * 10 / 48.0;
                        double x = (int) Math.ceil(detmileage);
                        detentionmileage.setText(String.valueOf("Detention Mileage : " + x));
                        totalmileage = 125 + x + under;
                        totalmileages.setText(String.valueOf("Total Mileage  " + totalmileage));

                    }
                    else if (tn.equals("731/732 pbt-clh-pbt")) {
                        runningtime.setText(String.valueOf("R/T: 03 Hour 40 Minute " + "  Mileage : 85"));
                        r1 = w1 * 60 + w2;
                        int rt = 220;
                        int det = r1 - rt;
                        int deth = det / 60;
                        int detm = det % 60;
                        detentiontime.setText(String.valueOf("Detention " + deth + "  Hour " + detm + "  Minute "));
                        double detmileage = (deth * 12.5) + detm * 10 / 48.0;
                        double x = (int) Math.ceil(detmileage);
                        detentionmileage.setText(String.valueOf("Detention Mileage : " + x));
                        totalmileage = 85 + x + under;
                        totalmileages.setText(String.valueOf("Total Mileage  " + totalmileage));

                    }
                    else if (tn.equals("732 pbt-rjhi")) {
                        runningtime.setText(String.valueOf("R/T: 04 Hour 20 Minute " + "  Mileage : 125"));
                        r1 = w1 * 60 + w2;
                        int rt = 260;
                        int det = r1 - rt;
                        int deth = det / 60;
                        int detm = det % 60;
                        detentiontime.setText(String.valueOf("Detention " + deth + "  Hour " + detm + "  Minute "));
                        double detmileage = (deth * 12.5) + detm * 10 / 48.0;
                        double x = (int) Math.ceil(detmileage);
                        detentionmileage.setText(String.valueOf("Detention Mileage : " + x));
                        totalmileage = 125 + x + under;
                        totalmileages.setText(String.valueOf("Total Mileage  " + totalmileage));

                    }
                    else if (tn.equals("733 rjhi-pbt")) {
                        runningtime.setText(String.valueOf("R/T: 04 Hour 50 Minute " + "  Mileage : 125"));
                        r1 = w1 * 60 + w2;
                        int rt = 290;
                        int det = r1 - rt;
                        int deth = det / 60;
                        int detm = det % 60;
                        detentiontime.setText(String.valueOf("Detention " + deth + "  Hour " + detm + "  Minute "));
                        double detmileage = (deth * 12.5) + detm * 10 / 48.0;
                        double x = (int) Math.ceil(detmileage);
                        detentionmileage.setText(String.valueOf("Detention Mileage : " + x));
                    totalmileage = 125 + x + under;
                        totalmileages.setText(String.valueOf("Total Mileage  " + totalmileage));

                    }
                    else  if (tn.equals("733/734 pbt-clh-pbt")) {
                        runningtime.setText(String.valueOf("R/T: 03 Hour 20 Minute " + "  Mileage : 85"));
                        r1 = w1 * 60 + w2;
                        int rt = 200;
                        int det = r1 - rt;
                        int deth = det / 60;
                        int detm = det % 60;
                        detentiontime.setText(String.valueOf("Detention " + deth + "  Hour " + detm + "  Minute "));
                        double detmileage = (deth * 12.5) + detm * 10 / 48.0;
                        double x = (int) Math.ceil(detmileage);
                        detentionmileage.setText(String.valueOf("Detention Mileage : " + x));
                        totalmileage = 85 + x + under;
                        totalmileages.setText(String.valueOf("Total Mileage  " + totalmileage));

                    }
                    else  if (tn.equals("734 pbt-rjhi")) {
                        runningtime.setText(String.valueOf("R/T: 05 Hour 10 Minute " + "  Mileage : 125"));
                        r1 = w1 * 60 + w2;
                        int rt = 310;
                        int det = r1 - rt;
                        int deth = det / 60;
                        int detm = det % 60;
                        detentiontime.setText(String.valueOf("Detention " + deth + "  Hour " + detm + "  Minute "));
                        double detmileage = (deth * 12.5) + detm * 10 / 48.0;
                        double x = (int) Math.ceil(detmileage);
                        detentionmileage.setText(String.valueOf("Detention Mileage : " + x));
                        totalmileage = 125 + x + under;
                        totalmileages.setText(String.valueOf("Total Mileage  " + totalmileage));

                    }
                    else  if (tn.equals("757 da-pbt")) {
                        runningtime.setText(String.valueOf("R/T: 02 Hour 55 Minute " + "  Mileage : 85"));
                        r1 = w1 * 60 + w2;
                        int rt = 175;
                        int det = r1 - rt;
                        int deth = det / 60;
                        int detm = det % 60;
                        detentiontime.setText(String.valueOf("Detention " + deth + "  Hour " + detm + "  Minute "));
                        double detmileage = (deth * 12.5) + detm * 10 / 48.0;
                        double x = (int) Math.ceil(detmileage);
                        detentionmileage.setText(String.valueOf("Detention Mileage : " + x));
                      totalmileage = 85 + x + under;
                        totalmileages.setText(String.valueOf("Total Mileage  " + totalmileage));

                    }
                    else  if (tn.equals("757 pbt-bmsm")) {
                        runningtime.setText(String.valueOf("R/T: 02 Hour 55 Minute " + "  Mileage : 85"));
                        r1 = w1 * 60 + w2;
                        int rt = 175;
                        int det = r1 - rt;
                        int deth = det / 60;
                        int detm = det % 60;
                        detentiontime.setText(String.valueOf("Detention " + deth + "  Hour " + detm + "  Minute "));
                        double detmileage = (deth * 12.5) + detm * 10 / 48.0;
                        double x = (int) Math.ceil(detmileage);
                        detentionmileage.setText(String.valueOf("Detention Mileage : " + x));
                        totalmileage = 85 + x + under;
                        totalmileages.setText(String.valueOf("Total Mileage  " + totalmileage));

                    }
                    else  if (tn.equals("757 da-pbt")) {
                        runningtime.setText(String.valueOf("R/T: 07 Hour 15 Minute " + "  Mileage : 280"));
                        r1 = w1 * 60 + w2;
                        int rt = 435;
                        int det = r1 - rt;
                        int deth = det / 60;
                        int detm = det % 60;
                        detentiontime.setText(String.valueOf("Detention " + deth + "  Hour " + detm + "  Minute "));
                        double detmileage = (deth * 12.5) + detm * 10 / 48.0;
                        double x = (int) Math.ceil(detmileage);
                        detentionmileage.setText(String.valueOf("Detention Mileage : " + x));
                       totalmileage = 280 + x + under;
                        totalmileages.setText(String.valueOf("Total Mileage  " + totalmileage));

                    }
                    else  if (tn.equals("758 bmsm-pbt")) {
                        runningtime.setText(String.valueOf("R/T: 03 Hour 00 Minute " + "  Mileage : 85"));
                        r1 = w1 * 60 + w2;
                        int rt = 180;
                        int det = r1 - rt;
                        int deth = det / 60;
                        int detm = det % 60;
                        detentiontime.setText(String.valueOf("Detention " + deth + "  Hour " + detm + "  Minute "));
                        double detmileage = (deth * 12.5) + detm * 10 / 48.0;
                        double x = (int) Math.ceil(detmileage);
                        detentionmileage.setText(String.valueOf("Detention Mileage : " + x));
                       totalmileage = 85 + x + under;
                        totalmileages.setText(String.valueOf("Total Mileage  " + totalmileage));

                    }
                    else if (tn.equals("758 pbt-da")) {
                        runningtime.setText(String.valueOf("R/T: 07 Hour 45 Minute " + "  Mileage : 280"));
                        r1 = w1 * 60 + w2;
                        int rt = 465;
                        int det = r1 - rt;
                        int deth = det / 60;
                        int detm = det % 60;
                        detentiontime.setText(String.valueOf("Detention " + deth + "  Hour " + detm + "  Minute "));
                        double detmileage = (deth * 12.5) + detm * 10 / 48.0;
                        double x = (int) Math.ceil(detmileage);
                        detentionmileage.setText(String.valueOf("Detention Mileage : " + x));
                        totalmileage = 280 + x + under;
                        totalmileages.setText(String.valueOf("Total Mileage  " + totalmileage));

                    }
                    else if (tn.equals("765 da-pbt")) {
                        runningtime.setText(String.valueOf("R/T: 07 Hour 55 Minute " + "  Mileage : 280"));
                        r1 = w1 * 60 + w2;
                        int rt = 475;
                        int det = r1 - rt;
                        int deth = det / 60;
                        int detm = det % 60;
                        detentiontime.setText(String.valueOf("Detention " + deth + "  Hour " + detm + "  Minute "));
                        double detmileage = (deth * 12.5) + detm * 10 / 48.0;
                        double x = (int) Math.ceil(detmileage);
                        detentionmileage.setText(String.valueOf("Detention Mileage : " + x));
                        totalmileage = 280 + x + under;
                        totalmileages.setText(String.valueOf("Total Mileage  " + totalmileage));

                    }
                    else  if (tn.equals("765/766 pbt-clh-pbt")) {
                        runningtime.setText(String.valueOf("R/T: 03 Hour 05 Minute " + "  Mileage : 85"));
                        r1 = w1 * 60 + w2;
                        int rt = 185;
                        int det = r1 - rt;
                        int deth = det / 60;
                        int detm = det % 60;
                        detentiontime.setText(String.valueOf("Detention " + deth + "  Hour " + detm + "  Minute "));
                        double detmileage = (deth * 12.5) + detm * 10 / 48.0;
                        double x = (int) Math.ceil(detmileage);
                        detentionmileage.setText(String.valueOf("Detention Mileage : " + x));
                        totalmileage = 85 + x + under;
                        totalmileages.setText(String.valueOf("Total Mileage  " + totalmileage));

                    }
                    else  if (tn.equals("766 pbt-da")) {
                        runningtime.setText(String.valueOf("R/T: 08 Hour 00 Minute " + "  Mileage : 280"));
                        r1 = w1 * 60 + w2;
                        int rt = 480;
                        int det = r1 - rt;
                        int deth = det / 60;
                        int detm = det % 60;
                        detentiontime.setText(String.valueOf("Detention " + deth + "  Hour " + detm + "  Minute "));
                        double detmileage = (deth * 12.5) + detm * 10 / 48.0;
                        double x = (int) Math.ceil(detmileage);
                        detentionmileage.setText(String.valueOf("Detention Mileage : " + x));
                       totalmileage = 280 + x + under;
                        totalmileages.setText(String.valueOf("Total Mileage  " + totalmileage));

                    }
                    else if (tn.equals("767 pbt-bmsm")) {
                        runningtime.setText(String.valueOf("R/T: 03 Hour 15 Minute " + "  Mileage : 85"));
                        r1 = w1 * 60 + w2;
                        int rt = 195;
                        int det = r1 - rt;
                        int deth = det / 60;
                        int detm = det % 60;
                        detentiontime.setText(String.valueOf("Detention " + deth + "  Hour " + detm + "  Minute "));
                        double detmileage = (deth * 12.5) + detm * 10 / 48.0;
                        double x = (int) Math.ceil(detmileage);
                        detentionmileage.setText(String.valueOf("Detention Mileage : " + x));
                       totalmileage = 85 + x + under;
                        totalmileages.setText(String.valueOf("Total Mileage  " + totalmileage));

                    }
                    else  if (tn.equals("768 bmsm-pbt")) {
                        runningtime.setText(String.valueOf("R/T: 03 Hour 20 Minute " + "  Mileage : 85"));
                        r1 = w1 * 60 + w2;
                        int rt = 200;
                        int det = r1 - rt;
                        int deth = det / 60;
                        int detm = det % 60;
                        detentiontime.setText(String.valueOf("Detention " + deth + "  Hour " + detm + "  Minute "));
                        double detmileage = (deth * 12.5) + detm * 10 / 48.0;
                        double x = (int) Math.ceil(detmileage);
                        detentionmileage.setText(String.valueOf("Detention Mileage : " + x));
                      totalmileage = 85 + x + under;
                        totalmileages.setText(String.valueOf("Total Mileage  " + totalmileage));

                    }
                    else  if (tn.equals("793 da-pbt")) {
                        runningtime.setText(String.valueOf("R/T: 07 Hour 05 Minute " + "  Mileage : 280"));
                        r1 = w1 * 60 + w2;
                        int rt = 425;
                        int det = r1 - rt;
                        int deth = det / 60;
                        int detm = det % 60;
                        detentiontime.setText(String.valueOf("Detention " + deth + "  Hour " + detm + "  Minute "));
                        double detmileage = (deth * 12.5) + detm * 10 / 48.0;
                        double x = (int) Math.ceil(detmileage);
                        detentionmileage.setText(String.valueOf("Detention Mileage : " + x));
                         totalmileage = 280 + x + under;
                        totalmileages.setText(String.valueOf("Total Mileage  " + totalmileage));

                    }
                    else if (tn.equals("793 pbt-bmsm")) {
                        runningtime.setText(String.valueOf("R/T: 02 Hour 50 Minute " + "  Mileage : 85"));
                        r1 = w1 * 60 + w2;
                        int rt = 170;
                        int det = r1 - rt;
                        int deth = det / 60;
                        int detm = det % 60;
                        detentiontime.setText(String.valueOf("Detention " + deth + "  Hour " + detm + "  Minute "));
                        double detmileage = (deth * 12.5) + detm * 10 / 48.0;
                        double x = (int) Math.ceil(detmileage);
                        detentionmileage.setText(String.valueOf("Detention Mileage : " + x));
                         totalmileage = 85 + x + under;
                        totalmileages.setText(String.valueOf("Total Mileage  " + totalmileage));

                    }
                    else  if (tn.equals("794 bmsm-pbt")) {
                        runningtime.setText(String.valueOf("R/T: 02 Hour 45 Minute " + "  Mileage : 85"));
                        r1 = w1 * 60 + w2;
                        int rt = 165;
                        int det = r1 - rt;
                        int deth = det / 60;
                        int detm = det % 60;
                        detentiontime.setText(String.valueOf("Detention " + deth + "  Hour " + detm + "  Minute "));
                        double detmileage = (deth * 12.5) + detm * 10 / 48.0;
                        double x = (int) Math.ceil(detmileage);
                        detentionmileage.setText(String.valueOf("Detention Mileage : " + x));
                         totalmileage = 85 + x + under;
                        totalmileages.setText(String.valueOf("Total Mileage  " + totalmileage));

                    }

                    else  if (tn.equals("794 pbt-da")) {
                        runningtime.setText(String.valueOf("R/T: 06 Hour 20 Minute " + "  Mileage : 280"));
                        r1 = w1 * 60 + w2;
                        int rt = 380;
                        int det = r1 - rt;
                        int deth = det / 60;
                        int detm = det % 60;
                        detentiontime.setText(String.valueOf("Detention " + deth + "  Hour " + detm + "  Minute "));
                        double detmileage = (deth * 12.5) + detm * 10 / 48.0;
                        double x = (int) Math.ceil(detmileage);
                        detentionmileage.setText(String.valueOf("Detention Mileage : " + x));
                        totalmileage = 280 + x + under;
                        totalmileages.setText(String.valueOf("Total Mileage  " + totalmileage));

                    }
                    else  if (tn.equals("797 da-pbt")) {
                        runningtime.setText(String.valueOf("R/T: 07 Hour 05 Minute " + "  Mileage : 280"));
                        r1 = w1 * 60 + w2;
                        int rt = 425;
                        int det = r1 - rt;
                        int deth = det / 60;
                        int detm = det % 60;
                        detentiontime.setText(String.valueOf("Detention " + deth + "  Hour " + detm + "  Minute "));
                        double detmileage = (deth * 12.5) + detm * 10 / 48.0;
                        double x = (int) Math.ceil(detmileage);
                        detentionmileage.setText(String.valueOf("Detention Mileage : " + x));
                       totalmileage = 280 + x + under;
                        totalmileages.setText(String.valueOf("Total Mileage  " + totalmileage));

                    }
                    else  if (tn.equals("797/798 pbt-krm-pbt")) {
                        runningtime.setText(String.valueOf("R/T: 04 Hour 30 Minute " + "  Mileage : 98"));
                        r1 = w1 * 60 + w2;
                        int rt = 270;
                        int det = r1 - rt;
                        int deth = det / 60;
                        int detm = det % 60;
                        detentiontime.setText(String.valueOf("Detention " + deth + "  Hour " + detm + "  Minute "));
                        double detmileage = (deth * 12.5) + detm * 10 / 48.0;
                        double x = (int) Math.ceil(detmileage);
                        detentionmileage.setText(String.valueOf("Detention Mileage : " + x));
                      totalmileage = 98 + x + under;
                        totalmileages.setText(String.valueOf("Total Mileage  " + totalmileage));

                    }
                    else  if (tn.equals("798 pbt-da")) {
                        runningtime.setText(String.valueOf("R/T: 07 Hour 55 Minute " + "  Mileage : 280"));
                        r1 = w1 * 60 + w2;
                        int rt = 475;
                        int det = r1 - rt;
                        int deth = det / 60;
                        int detm = det % 60;
                        detentiontime.setText(String.valueOf("Detention " + deth + "  Hour " + detm + "  Minute "));
                        double detmileage = (deth * 12.5) + detm * 10 / 48.0;
                        double x = (int) Math.ceil(detmileage);
                        detentionmileage.setText(String.valueOf("Detention Mileage : " + x));
                     totalmileage = 280 + x + under;
                        totalmileages.setText(String.valueOf("Total Mileage  " + totalmileage));

                    }
                    else if (tn.equals("803 pbt-bmsm")) {
                        runningtime.setText(String.valueOf("R/T: 02 Hour 40 Minute " + "  Mileage : 85"));
                        r1 = w1 * 60 + w2;
                        int rt = 160;
                        int det = r1 - rt;
                        int deth = det / 60;
                        int detm = det % 60;
                        detentiontime.setText(String.valueOf("Detention " + deth + "  Hour " + detm + "  Minute "));
                        double detmileage = (deth * 12.5) + detm * 10 / 48.0;
                        double x = (int) Math.ceil(detmileage);
                        detentionmileage.setText(String.valueOf("Detention Mileage : " + x));
                    totalmileage = 85 + x + under;
                        totalmileages.setText(String.valueOf("Total Mileage  " + totalmileage));

                    }
                    else  if (tn.equals("804 bmsm-pbt")) {
                        runningtime.setText(String.valueOf("R/T: 03 Hour 00 Minute " + "  Mileage : 85"));
                        r1 = w1 * 60 + w2;
                        int rt = 180;
                        int det = r1 - rt;
                        int deth = det / 60;
                        int detm = det % 60;
                        detentiontime.setText(String.valueOf("Detention " + deth + "  Hour " + detm + "  Minute "));
                        double detmileage = (deth * 12.5) + detm * 10 / 48.0;
                        double x = (int) Math.ceil(detmileage);
                        detentionmileage.setText(String.valueOf("Detention Mileage : " + x));
                         totalmileage = 85 + x + under;
                        totalmileages.setText(String.valueOf("Total Mileage  " + totalmileage));

                    }
                    else  if (tn.equals("805 da-pbt")) {
                        runningtime.setText(String.valueOf("R/T: 08 Hour 05 Minute " + "  Mileage : 280"));
                        r1 = w1 * 60 + w2;
                        int rt = 485;
                        int det = r1 - rt;
                        int deth = det / 60;
                        int detm = det % 60;
                        detentiontime.setText(String.valueOf("Detention " + deth + "  Hour " + detm + "  Minute "));
                        double detmileage = (deth * 12.5) + detm * 10 / 48.0;
                        double x = (int) Math.ceil(detmileage);
                        detentionmileage.setText(String.valueOf("Detention Mileage : " + x));
                      totalmileage = 280 + x + under;
                        totalmileages.setText(String.valueOf("Total Mileage  " + totalmileage));

                    }
                    else  if (tn.equals("805/806 pbt-clh-pbt")) {
                        runningtime.setText(String.valueOf("R/T: 03 Hour 20 Minute " + "  Mileage : 85"));
                        r1 = w1 * 60 + w2;
                        int rt = 200;
                        int det = r1 - rt;
                        int deth = det / 60;
                        int detm = det % 60;
                        detentiontime.setText(String.valueOf("Detention " + deth + "  Hour " + detm + "  Minute "));
                        double detmileage = (deth * 12.5) + detm * 10 / 48.0;
                        double x = (int) Math.ceil(detmileage);
                        detentionmileage.setText(String.valueOf("Detention Mileage : " + x));
                      totalmileage = 85 + x + under;
                        totalmileages.setText(String.valueOf("Total Mileage  " + totalmileage));

                    }
                    else  if (tn.equals("806 pbt-da")) {
                        runningtime.setText(String.valueOf("R/T: 07 Hour 25 Minute " + "  Mileage : 280"));
                        r1 = w1 * 60 + w2;
                        int rt = 445;
                        int det = r1 - rt;
                        int deth = det / 60;
                        int detm = det % 60;
                        detentiontime.setText(String.valueOf("Detention " + deth + "  Hour " + detm + "  Minute "));
                        double detmileage = (deth * 12.5) + detm * 10 / 48.0;
                        double x = (int) Math.ceil(detmileage);
                        detentionmileage.setText(String.valueOf("Detention Mileage : " + x));
                        totalmileage = 280 + x + under;
                        totalmileages.setText(String.valueOf("Total Mileage  " + totalmileage));

                    }
                    else  if (tn.equals("23 isd-pbt")) {
                        runningtime.setText(String.valueOf("R/T: 05 Hour 25 Minute " + "  Mileage : 110"));
                        r1 = w1 * 60 + w2;
                        int rt = 325;
                        int det = r1 - rt;
                        int deth = det / 60;
                        int detm = det % 60;
                        detentiontime.setText(String.valueOf("Detention " + deth + "  Hour " + detm + "  Minute "));
                        double detmileage = (deth * 12.5) + detm * 10 / 48.0;
                        double x = (int) Math.ceil(detmileage);
                        detentionmileage.setText(String.valueOf("Detention Mileage : " + x));
                         totalmileage = 110 + x + under;
                        totalmileages.setText(String.valueOf("Total Mileage  " + totalmileage));

                    }
                    else  if (tn.equals("24 pbt-isd")) {
                        runningtime.setText(String.valueOf("R/T: 07 Hour 50 Minute " + "  Mileage : 110"));
                        r1 = w1 * 60 + w2;
                        int rt = 470;
                        int det = r1 - rt;
                        int deth = det / 60;
                        int detm = det % 60;
                        detentiontime.setText(String.valueOf("Detention " + deth + "  Hour " + detm + "  Minute "));
                        double detmileage = (deth * 12.5) + detm * 10 / 48.0;
                        double x = (int) Math.ceil(detmileage);
                        detentionmileage.setText(String.valueOf("Detention Mileage : " + x));
                        totalmileage = 110 + x + under;
                        totalmileages.setText(String.valueOf("Total Mileage  " + totalmileage));

                    }
                    else if (tn.equals("27/28 pbt-clh-pbt")) {
                        runningtime.setText(String.valueOf("R/T: 03 Hour 30 Minute " + "  Mileage : 85"));
                        r1 = w1 * 60 + w2;
                        int rt = 210;
                        int det = r1 - rt;
                        int deth = det / 60;
                        int detm = det % 60;
                        detentiontime.setText(String.valueOf("Detention " + deth + "  Hour " + detm + "  Minute "));
                        double detmileage = (deth * 12.5) + detm * 10 / 48.0;
                        double x = (int) Math.ceil(detmileage);
                        detentionmileage.setText(String.valueOf("Detention Mileage : " + x));
                         totalmileage = 85 + x + under;
                        totalmileages.setText(String.valueOf("Total Mileage  " + totalmileage));

                    }
                    else  if (tn.equals("31 rjhi-pbt")) {
                        runningtime.setText(String.valueOf("R/T: 06 Hour 50 Minute " + "  Mileage : 125"));
                        r1 = w1 * 60 + w2;
                        int rt = 410;
                        int det = r1 - rt;
                        int deth = det / 60;
                        int detm = det % 60;
                        detentiontime.setText(String.valueOf("Detention " + deth + "  Hour " + detm + "  Minute "));
                        double detmileage = (deth * 12.5) + detm * 10 / 48.0;
                        double x = (int) Math.ceil(detmileage);
                        detentionmileage.setText(String.valueOf("Detention Mileage : " + x));
                         totalmileage = 125 + x + under;
                        totalmileages.setText(String.valueOf("Total Mileage  " + totalmileage));

                    }
                    else if (tn.equals("32 pbt-rjhi")) {
                        runningtime.setText(String.valueOf("R/T: 06 Hour 40 Minute " + "  Mileage : 125"));
                        r1 = w1 * 60 + w2;
                        int rt = 400;
                        int det = r1 - rt;
                        int deth = det / 60;
                        int detm = det % 60;
                        detentiontime.setText(String.valueOf("Detention " + deth + "  Hour " + detm + "  Minute "));
                        double detmileage = (deth * 12.5) + detm * 10 / 48.0;
                        double x = (int) Math.ceil(detmileage);
                        detentionmileage.setText(String.valueOf("Detention Mileage : " + x));
                        totalmileage = 125 + x + under;
                        totalmileages.setText(String.valueOf("Total Mileage  " + totalmileage));

                    }
                    else if (tn.equals("41/42 pbt-bmsm-pbt")) {
                        runningtime.setText(String.valueOf("R/T: 08 Hour 00 Minute " + "  Mileage : 170"));
                        r1 = w1 * 60 + w2;
                        int rt = 480;
                        int det = r1 - rt;
                        int deth = det / 60;
                        int detm = det % 60;
                        detentiontime.setText(String.valueOf("Detention " + deth + "  Hour " + detm + "  Minute "));
                        double detmileage = (deth * 12.5) + detm * 10 / 48.0;
                        double x = (int) Math.ceil(detmileage);
                        detentionmileage.setText(String.valueOf("Detention Mileage : " + x));
                        totalmileage = 170 + x + under;
                        totalmileages.setText(String.valueOf("Total Mileage  " + totalmileage));

                    }
                   else if (tn.equals("64/65/66/63 pbt-bqx-pbt")) {
                        runningtime.setText(String.valueOf("R/T: 08 Hour 45 Minute " + "  Mileage : 193"));
                        r1 = w1 * 60 + w2;
                        int rt = 525;
                        int det = r1 - rt;
                        int deth = det / 60;
                        int detm = det % 60;
                        detentiontime.setText(String.valueOf("Detention " + deth + "  Hour " + detm + "  Minute "));
                        double detmileage = (deth * 12.5) + detm * 10 / 48.0;
                        double x = (int) Math.ceil(detmileage);
                        detentionmileage.setText(String.valueOf("Detention Mileage : " + x));
                       totalmileage = 193 + x + under;
                        totalmileages.setText(String.valueOf("Total Mileage  " + totalmileage));

                    }
                   else if (tn.equals("Shed Duty")) {
                        runningtime.setText(String.valueOf("R/T: 08 Hour 00 Minute " + "  Mileage : 100"));
                        r1 = w1 * 60 + w2;
                        int rt = 480;
                        int det = r1 - rt;
                        int deth = det / 60;
                        int detm = det % 60;
                        detentiontime.setText(String.valueOf("Detention " + deth + "  Hour " + detm + "  Minute "));
                        double detmileage = (deth * 12.5) + detm * 10 / 48.0;
                        double x = (int) Math.ceil(detmileage);
                        detentionmileage.setText(String.valueOf("Detention Mileage : " + x));
                       totalmileage = 100.00 + under;
                        totalmileages.setText(String.valueOf("Total Mileage  " + totalmileage));

                    }
                   else if (tn.equals("Dead Engine")) {
                        runningtime.setText(String.valueOf("R/T: 08 Hour 00 Minute " + "  Mileage : 100"));
                        r1 = w1 * 60 + w2;
                        int rt = 480;
                        int det = r1 - rt;
                        int deth = det / 60;
                        int detm = det % 60;
                        detentiontime.setText(String.valueOf("Detention " + deth + "  Hour " + detm + "  Minute "));
                        double detmileage = (deth * 12.5) + detm * 10 / 48.0;
                        double x = (int) Math.ceil(detmileage);
                        detentionmileage.setText(String.valueOf("Detention Mileage : " + x));
                       totalmileage = 100.00 + under;
                        totalmileages.setText(String.valueOf("Total Mileage  " + totalmileage));

                    }
                   else if (tn.equals("CLW")||tn.equals("DLW")||tn.equals("Load Trial")||tn.equals("Light Trial")||tn.equals("Releif Train")) {
                        r1 = w1 * 60 + w2;
                        double detmileage = (w1 * 12.5) + w2 * 10 / 48.0;
                        double x = (int) Math.ceil(detmileage);
                       totalmileage = detmileage + under;
                        detentiontime.setText(String.valueOf("Total Mileage  " + totalmileage));

                    }
                   else if (tn.equals("Spare")) {
                       r1 = w1 * 60 + w2;
                        double detmileage = (w1 * 12.5) + w2 * 10 / 48.0;
                       totalmileage = (detmileage)/2 + under;
                        detentiontime.setText(String.valueOf("Total Mileage  " + totalmileage));

                    }

                }

            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText("");
                ed2.setText("");
                ed3.setText("");
                ed4.setText("");
                autoCompleteTextView.setText("");
                ur.setText("");
                runningtime.setText("");
                detentiontime.setText("");
                detentionmileage.setText("");
                totalmileages.setText("");
                totalwork.setText("");
                tot.setText("");
                datee.setText("");
                ed5.setText("");
                ed6.setText("");
            }
        });



        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                fuel = ed6.getText().toString().trim();
               String name ="  Train No  : " + tn + " \n " +"  Date  : "+  dd;
//               String age = d;
               String age = String.valueOf(" Total Mileage  :  " +totalmileage + " \n " + " Fuel "+fuel);


//                tot.setText(String.valueOf(  name +" \n "  +" Total Mileage " + age ));
                if(ed1.equals("") || ed2.equals("") || ed3.equals("")||ed4.equals("")||autoCompleteTextView.equals("")||ur.equals("")){
                    Toast.makeText(getApplicationContext(),"Please enter data",Toast.LENGTH_LONG).show();
                }
                else{
                    long rowId= myDatabaseHelper.insertData(name,age);
                    if(rowId>-1){
                        Toast.makeText(getApplicationContext(),"Row "+rowId+" is successfully inserted",Toast.LENGTH_LONG).show();


                    }
                    else {
                        Toast.makeText(getApplicationContext(),"unsuccessful",Toast.LENGTH_LONG).show();


                    }

                }



            }
        });
        display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Mileage.this,LIstDataActivity.class);
                startActivity(intent);

            }
        });
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fuel = ed6.getText().toString().trim();

              id = ed5.getText().toString();
              String name ="  Train No  : " + tn + " \n " +"  Date  : "+  dd;
              String age = String.valueOf(" Total Mileage  :  " +totalmileage + " \n" + " Fuel " + fuel);

              Boolean isUpdated = myDatabaseHelper.updateDate(id,name,age);
              if(isUpdated==true){
                  Toast.makeText(getApplicationContext()," Data is updated " ,Toast.LENGTH_LONG).show();
              }
              else{
                  Toast.makeText(getApplicationContext()," Data is not  updated " ,Toast.LENGTH_LONG).show();

              }

            }
        });
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fuel = ed6.getText().toString().trim();
                id = ed5.getText().toString();
                int value = myDatabaseHelper.deleteData(id);
                if(value<0){
                    Toast.makeText(getApplicationContext()," Data is not deleted " ,Toast.LENGTH_LONG).show();


                }
                else {
                    Toast.makeText(getApplicationContext()," Data is  deleted " ,Toast.LENGTH_LONG).show();

                }
            }
        });
        selectdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePicker datePicker = new DatePicker(Mileage.this);
                int currentYear = datePicker.getYear();
                int currentMonth = datePicker.getMonth();
                int currentDay = datePicker.getDayOfMonth();


                datePickerDialog = new DatePickerDialog(Mileage.this,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                              if(month==0){
                                  datee.setText(dayOfMonth +"/"+ "Jan" + "/" + year);
                                  dd = dayOfMonth + " /" + " January " + "/ " + year;
                              }
                              else if(month==1){
                                  datee.setText(dayOfMonth + "/" + "Feb" + "/" + year);
                                  dd = dayOfMonth + " /" + " February " + "/ " + year;
                              } else if(month==2){
                                  datee.setText(dayOfMonth + "/" + "March" + "/" + year);
                                  dd = dayOfMonth + " /" + " March " + "/ " + year;
                              } else if(month==3){
                                  datee.setText(dayOfMonth +"/" +"April" + " / " + year);
                                  dd = dayOfMonth + " /" + " April " + "/ " + year;
                              } else if(month==4){
                                  datee.setText(dayOfMonth +"/" + "May " +"/" + year);
                                  dd = dayOfMonth + " /" + " May " + "/ " + year;
                              } else if(month==5){
                                  datee.setText(dayOfMonth +"/"+ "June" +"/" + year);
                                  dd = dayOfMonth + " /" + " June " + "/ " + year;
                              } else if(month==6){
                                  datee.setText(dayOfMonth +"/" +"July" + "/" + year);
                                  dd = dayOfMonth + " /" + " July " + "/ " + year;
                              } else if(month==7){
                                  datee.setText(dayOfMonth +"/" + "August" + "/" + year);
                                  dd = dayOfMonth + " /" + " August " + "/ " + year;
                              } else if(month==8){
                                  datee.setText(dayOfMonth +"/" + "Sep" +"/" + year);
                                  dd = dayOfMonth + " /" + " September " + "/ " + year;
                              } else if(month==9){
                                  datee.setText(dayOfMonth +"/" +"October" + "/" + year);
                                  dd = dayOfMonth + " /" + " October " + "/ " + year;
                              } else if(month==10){
                                  datee.setText(dayOfMonth +"/" + "November" +"/" + year);
                                  dd = dayOfMonth + " /" + " November " + "/ " + year;
                              } else if(month==11){
                                  datee.setText(dayOfMonth +"/" +"Dec" + "/" + year);
                                  dd = dayOfMonth + "/" +"December" + "/" + year;
                              }


                            }
                        },currentYear,currentMonth,currentDay);
                    datePickerDialog.show();

            }
        });



    }
}