package com.example.timetable;

import android.app.DatePickerDialog;
import android.content.Intent;
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
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AllShedMileage extends AppCompatActivity {

   MyDatabaseHelperTwo myDatabaseHelperTwo;
    private EditText ed1,ed2,ed3,ed4,ur,date,ed5,ed6,ed7,ed8,ed9;
    private TextView totalwork,runningtime,detentiontime,detentionmileage,  totalmileages,tot,datee ;
    private Button clculate,clear,save,display,update,delete,selectdate;
    private AutoCompleteTextView autoCompleteTextView;

    Integer n1,n2,n3,n4,w1,w2,r1,r2,w3,w4,under,n5,n6,n7,rtt,totall;
    String tn,id,d,total,dd,fuel;
    Double totalmileage;
    private DatePickerDialog datePickerDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_all_shed_mileage);

        myDatabaseHelperTwo = new MyDatabaseHelperTwo(this);
        SQLiteDatabase sqLiteDatabase= myDatabaseHelperTwo.getWritableDatabase();

        ed1 = findViewById(R.id.starthour);
        ed2 = findViewById(R.id.startminute);
        ed3 = findViewById(R.id.endhour);
        ed4 = findViewById(R.id.endtminute);
        ed6 = findViewById(R.id.fuelid);
        ed7 = findViewById(R.id.runninhhour);
        ed8 = findViewById(R.id.runningminute);
        ed9 = findViewById(R.id.tripmileage);

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


      String [] Common = getResources().getStringArray(R.array.common);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,Common);
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
                if(ed9.getText().toString().length()==3){
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
                if (ed1.length() == 0 || ed2.length() == 0 || ed3.length() == 0 || ed4.length() == 0 || autoCompleteTextView.length() == 0) {
                    Toast.makeText(getApplicationContext(), "Please fill all items", Toast.LENGTH_LONG).show();

                } else {
                    n1 = Integer.valueOf(ed1.getText().toString());
                    n2 = Integer.valueOf(ed2.getText().toString());
                    n3 = Integer.valueOf(ed3.getText().toString());
                    n4 = Integer.valueOf(ed4.getText().toString());
                    under = Integer.valueOf(ur.getText().toString());
                    n5 = Integer.valueOf(ed7.getText().toString());
                    n6 = Integer.valueOf(ed8.getText().toString());
                    n7 = Integer.valueOf(ed9.getText().toString());
                    fuel= ed6.getText().toString();

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

                    r1 = w1*60+w2;
                    rtt = n5*60+n6;
                    int dett = r1-rtt;
                    int dethh = dett/60;
                    int detmm = dett %60;
                    detentiontime.setText(String.valueOf(" Detention " + dethh + " Hour " + detmm + " Minute"));
                    double detmileagee = dethh*12.5 + (detmm*10 /48.0);
                    int  xx = (int) Math.ceil(detmileagee);
                    detentionmileage.setText(String.valueOf("Detention Mileage " + xx));
                    totall = n7  + under + xx;
                    totalmileage = totall+.0;
                    totalmileages.setText(String.valueOf(" Total Mileage " +totall + " \n " + " Fuel  " + fuel));

                }
            }
        });
        display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(AllShedMileage.this,ListAllShedDataActivity.class);
                startActivity(intent);

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
                    long rowId= myDatabaseHelperTwo.insertData(name,age);
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

                Intent intent = new Intent(AllShedMileage.this,ListAllShedDataActivity.class);
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

                Boolean isUpdated = myDatabaseHelperTwo.updateDate(id,name,age);
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
                int value = myDatabaseHelperTwo.deleteData(id);
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
                DatePicker datePicker = new DatePicker(AllShedMileage.this);
                int currentYear = datePicker.getYear();
                int currentMonth = datePicker.getMonth();
                int currentDay = datePicker.getDayOfMonth();


                datePickerDialog = new DatePickerDialog(AllShedMileage.this,
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
        clear.setOnClickListener(new View.OnClickListener() {
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
                autoCompleteTextView.setText("");
                ur.setText("");
                detentiontime.setText("");
                detentionmileage.setText("");
                totalmileages.setText("");
                datee.setText("");
                totalwork.setText("");

            }
        });

    }
}