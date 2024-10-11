package com.example.timetable;

import android.os.Bundle;
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

import java.util.ArrayList;

public class Practice extends AppCompatActivity {
    private AutoCompleteTextView ed1,ed2;
    private Button bt1,bt2;
    private TextView tv1,tv2,tv3,tv4,tv5,tv6,tv7,tv8,tv9,tv10,tv11,tv12,tv13,tv14,tv15,tv16,tv17,tv18,tv19,tv20;
    String [] chilahati = {"বরেন্দ্র","চিলাহাটি","রূপসা","রকেট","তিতুমীর","সীমান্ত","নীলসাগর","মিতালী"};
    String []domar = {"বরেন্দ্র","চিলাহাটি","রূপসা","রকেট","তিতুমীর","সীমান্ত","নীলসাগর"};
    String [] nilphamary = {"বরেন্দ্র","চিলাহাটি","রূপসা","রকেট","তিতুমীর","সীমান্ত","নীলসাগর"};
    String [] saidpur = {"বরেন্দ্র","চিলাহাটি","রূপসা","রকেট","তিতুমীর","সীমান্ত","নীলসাগর"};
    String [] parbatipur = {"বরেন্দ্র","চিলাহাটি","রূপসা","রকেট","তিতুমীর","সীমান্ত","নীলসাগর","মিতালী","একতা","দ্রতযান","পঞ্চগড়","কুড়িগ্রাম","বাংলাবান্ধা","লালমনি কমিউটার","দোলনচাঁপা","দিনাজপুর কমিউটার","লোকাল462","রামসাগর"};
    String [] phulbari = {"বরেন্দ্র","চিলাহাটি","রূপসা","রকেট","তিতুমীর","সীমান্ত","নীলসাগর","একতা","দ্রতযান","বাংলাবান্ধা"};
    String [] barampur = {"বরেন্দ্র","চিলাহাটি","রূপসা","রকেট","তিতুমীর","সীমান্ত","নীলসাগর","একতা","দ্রতযান","বাংলাবান্ধা"};
    String [] pitchbibe = {"বরেন্দ্র","রকেট","তিতুমীর","একতা","দ্রতযান","বাংলাবান্ধা"};
    String [] joypurhat = {"বরেন্দ্র","চিলাহাটি","রূপসা","রকেট","তিতুমীর","সীমান্ত","নীলসাগর","একতা","দ্রতযান","পঞ্চগড়","কুড়িগ্রাম","বাংলাবান্ধা"};
    String [] jamaljong = {"রকেট","তিতুমীর"};
    String [] accalpur = {"বরেন্দ্র","রূপসা","রকেট","তিতুমীর","সীমান্ত","নীলসাগর","একতা","দ্রতযান","বাংলাবান্ধা"};
    String [] tilokpur = {"রকেট"};
    String [] santahar = {"বরেন্দ্র","চিলাহাটি","রূপসা","রকেট","তিতুমীর","সীমান্ত","নীলসাগর","একতা","দ্রতযান","পঞ্চগড়","কুড়িগ্রাম","বাংলাবান্ধা","রংপুর","করতোয়া","দোলনচাঁপা","লালমনি","পদ্মরাগ","বগুড়া কমিউটার","লোকাল492","বুড়িমারী"};
    String [] raninogor = {"রকেট"};
    String [] shgagola = {"রকেট"};
    String [] ahshangong = {"বরেন্দ্র","রূপসা","রকেট","তিতুমীর","নীলসাগর","দ্রতযান","বাংলাবান্ধা"};
    String [] madnagor = {"রকেট","তিতুমীর","কুড়িগ্রাম","বাংলাবান্ধা"};
    String [] natore = {"বরেন্দ্র","চিলাহাটি","রূপসা","রকেট","তিতুমীর","সীমান্ত","নীলসাগর","একতা","দ্রতযান","পঞ্চগড়","কুড়িগ্রাম","বাংলাবান্ধা","রংপুর","লালমনি"};
    String [] abdulpur = {"বরেন্দ্র","রকেট","তিতুমীর","বাংলাবান্ধা","পদ্মা","লোকাল 563","ঈশ্বরদী কমিউটার","ঢালারচর","সাগরদাঁড়ী","সিল্কসিটি","রাজশাহী কমিউটার","ধূমকেতু","মহানান্দা"};
    String [] arani = {"লোকাল 563","ঈশ্বরদী কমিউটার","ঢালারচর","রাজশাহী কমিউটার","ধূমকেতু","মহানান্দা"};
    String [] sardah = {"লোকাল 563","ঈশ্বরদী কমিউটার","ঢালারচর","রাজশাহী কমিউটার","পদ্মা","মহানান্দা"};
    String [] horian = {"লোকাল 563","ঈশ্বরদী কমিউটার","রাজশাহী কমিউটার","মহানান্দা"};
    String [] rajshahi = {"বরেন্দ্র","তিতুমীর","বাংলাবান্ধা","পদ্মা","লোকাল 563","ঈশ্বরদী কমিউটার","ঢালারচর","সাগরদাঁড়ী","সিল্কসিটি","রাজশাহী কমিউটার","ধূমকেতু","মহানান্দা","কপোতাক্ষ","বনলতা","টুঙ্গিপাড়া"};
    String [] azimnagor = {"লোকাল 563","রকেট","কপোতাক্ষ","লালমনি","সাগরদাঁড়ী","ঢালারচর","ঈশ্বরদী কমিউটার","রাজশাহী কমিউটার","মহানান্দা"};




    int i,j;

    String l,m;
    String [] x;
    String [] y;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_practice);


        ed1 = findViewById(R.id.ed1id);
        ed2 = findViewById(R.id.ed2id);
        bt1 = findViewById(R.id.bt1id);
        bt2 = findViewById(R.id.bt2id);
        tv1 = findViewById(R.id.tv1id);
        tv2 = findViewById(R.id.tv2id);
        tv3 = findViewById(R.id.tv3id);
        tv4 = findViewById(R.id.tv4id);
        tv5 = findViewById(R.id.tv5id);
        tv6 = findViewById(R.id.tv6id);
        tv7 = findViewById(R.id.tv7id);
        tv8 = findViewById(R.id.tv8id);
        tv9 = findViewById(R.id.tv9id);
        tv10 = findViewById(R.id.tv10id);
        tv11 = findViewById(R.id.tv11id);
        tv12 = findViewById(R.id.tv12id);
        tv13 = findViewById(R.id.tv13id);
        tv14 = findViewById(R.id.tv14id);
        tv15 = findViewById(R.id.tv15id);
        tv16 = findViewById(R.id.tv16id);
        tv17 = findViewById(R.id.tv17id);
        tv18 = findViewById(R.id.tv18id);
        tv19 = findViewById(R.id.tv19id);
        tv20 = findViewById(R.id.tv20id);

        String [] FindOne = getResources().getStringArray(R.array.findtrainone);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,FindOne);
       ed1.setAdapter(adapter);
       ed1.setThreshold(1);
       String [] Findtwo = getResources().getStringArray(R.array.findtrainone);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,Findtwo);
       ed2.setAdapter(adapter1);
       ed2.setThreshold(1);




      bt1.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              ArrayList<String> k = new ArrayList<>();
              l = String.valueOf(ed1.getText().toString().trim());
              m = String.valueOf(ed2.getText().toString().trim());

              if(l.equals("chilahati")){
              x = chilahati;
          }
              else if(l.equals("domar")){
              x= domar;
          }
              else if(l.equals("nilphamary")){
              x= nilphamary;
          }

              else if(l.equals("saidpur")){
              x= saidpur;
          }
              else if(l.equals("parbatipur")){
              x= parbatipur;
          }
              else if(l.equals("phulbari")){
              x= phulbari;
          }
              else if(l.equals("barampur")){
              x= barampur;
          }
              else if(l.equals("pitchbibe")){
              x= pitchbibe;
          }
        else if(l.equals("joypurhat")){
              x= joypurhat;
          }
        else if(l.equals("jamaljong")){
              x= jamaljong;
          }
        else if(l.equals("accalpur")){
              x= accalpur;
          }
        else if(l.equals("tilokpur")){
              x= tilokpur;
          }
        else if(l.equals("santahar")){
              x= santahar;
          }
        else if(l.equals("raninogor")){
              x= raninogor;
          }
        else if(l.equals("ahshangong")){
              x= ahshangong;
          }
        else if(l.equals("shgagola")){
              x= shgagola;
          }
        else if(l.equals("madnagor")){
              x= madnagor;
          }
        else if(l.equals("natore")){
              x= natore;
          }
      else if(l.equals("abdulpur")){
              x= abdulpur;
          }
      else if(l.equals("arani")){
              x= arani;
          }
      else if(l.equals("sardah")){
              x= sardah;
          }
      else if(l.equals("horian")){
              x= horian;
          }
      else if(l.equals("rajshahi")){
              x= rajshahi;
          }  else if(l.equals("azimnagor")){
              x= azimnagor;
          }



           if(m.equals("chilahati")){
               y=chilahati;
           }
           else if(m.equals("domar")){
               y= domar;
           }
           else if(m.equals("nilphamary")){
               y= nilphamary;
           }

           else if(m.equals("saidpur")){
               y= saidpur;
           }
           else if(m.equals("parbatipur")){
               y= parbatipur;
           }
         else if(m.equals("phulbari")){
               y= phulbari;
           }
         else if(m.equals("barampur")){
               y= barampur;
           }
         else if(m.equals("pitchbibe")){
               y= pitchbibe;
           }
         else if(m.equals("joypurhat")){
               y= joypurhat;
           }
         else if(m.equals("jamaljong")){
               y= jamaljong;
           }
           else if(m.equals("accalpur")){
               y= accalpur;
           }
         else if(m.equals("tilokpur")){
               y= tilokpur;
           }
         else if(m.equals("santahar")){
               y= santahar;
           }
         else if(m.equals("raninogor")){
               y= raninogor;
           }
         else if(m.equals("ahshangong")){
               y= ahshangong;
           }
         else if(m.equals("shgagola")){
               y= shgagola;
           }
         else if(m.equals("madnagor")){
               y= madnagor;
           }
         else if(m.equals("natore")){
               y= natore;
           }
        else if(m.equals("abdulpur")){
               y= abdulpur;
           }
        else if(m.equals("arani")){
               y= arani;
           }
        else if(m.equals("sardah")){
               y= sardah;
           }
        else if(m.equals("horian")){
               y= horian;
           }
        else if(m.equals("rajshahi")){
               y= rajshahi;
           }   else if(m.equals("azimnagor")){
               y= azimnagor;
           }


              for(i=0;i<x.length;i++){
                      for(j=0;j<y.length;j++){
                          if(x[i]==y[j]){
                             k.add(x[i]);
//                          if(l.equals("chilahati")||l.equals("domar")||l.equals("parbatipur")||l.equals("nilphamary")||l.equals("saidpur")||l.equals("phulbari")||l.equals("barampur") && m.equals("hili")){
//                              tv1.setText("রকেট খুলনার  দিকে 10:01 ");
////                              tv2.setText("তিতুমীর চিলাহাটির দিকে 09:58");
//                              tv3.setText("বরেন্দ্র  রাজশাহীর দিকে 07:45  ");
//                          }
//                             else if(l.equals("chilahati")||l.equals("domar")||l.equals("parbatipur")||l.equals("nilphamary")||l.equals("saidpur")||l.equals("phulbari")||l.equals("barampur") && m.equals("hili")){
//
//                             tv2.setText("তিতুমীর চিলাহাটির দিকে 09:58");
//
//                              }
                         if(l.equals("chilahati") && x[i].contains("রূপসা")){
                             tv7.setText("রূপসা 08:30 খুলনার দিকে \n :  রূপসা 17:05 চিলাহাটির দিকে" );

                         }
                             else if(l.equals("chilahati")  && x[i].contains("বরেন্দ্র")){
                                  tv2.setText("বরেন্দ্র রাজশাহীর দিকে 05:00  \n বরেন্দ্র চিলাহাটির দিকে 21:35");

                              }
                             else if(l.equals("chilahati") && x[i].contains("চিলাহাটি")){
                                  tv3.setText("চিলাহাটি  ঢাকার দিকে  06:00 \n চিলাহাটি  চিলাহাটির দিকে 03:00");

                              }
                             else if(l.equals("chilahati") && x[i].contains("তিতুমীর")){
                                  tv4.setText("তিতুমীর  রাজশাহীর দিকে 15:00 \nতিতুমীর চিলাহাটির দিকে 13:00 ");

                              }
                             else if(l.equals("chilahati") && x[i].contains("সীমান্ত")){
                                  tv5.setText("সীমান্ত  খুলনার দিকে  18:45\n সীমান্ত চিলাহাটির দিকে 06:45");

                              }
                             else if(l.equals("chilahati") && x[i].contains("নীলসাগর")){
                                  tv6.setText("নীলসাগর  ঢাকার দিকে  20:00\nনীলসাগর  চিলাহাটির দিকে 16:00");

                              }
                             else if(l.equals("chilahati") && x[i].contains("রকেট")){
                                  tv1.setText("রকেট  খুলনার দিকে 06:50  \n রকেট চিলাহাটির দিকে 04:00");

                              }
                             else if(l.equals("chilahati") && x[i].contains("মিতালী")){
                                  tv8.setText("মিতালী  ঢাকার দিকে 14:25 \nমিতালী চিলাহাটির দিকে  05:45");

                              }
                            else if(l.equals("domar") && x[i].contains("রূপসা")){
                                  tv7.setText("রূপসা  খুলনার দিকে 08:30 \n রূপসা  চিলাহাটির দিকে 17:05" );

                              }
                              else if(l.equals("domar") && x[i].contains("চিলাহাটি")){
                                  tv3.setText("চিলাহাটি  ঢাকার দিকে 06:00 \n চিলাহাটি চিলাহাটির দিকে 03:00 ");

                              }
                              else if(l.equals("domar") && x[i].contains("তিতুমীর")){
                                  tv4.setText("তিতুমীর  রাজশাহীর দিকে 15:00 \n তিতুমীর চিলাহাটির দিকে 13:00  ");

                              }
                              else if(l.equals("domar") && x[i].contains("সীমান্ত")){
                                  tv5.setText("সীমান্ত  খুলনার দিকে 18:45 \n সীমান্ত চিলাহাটির দিকে 06:45");

                              }
                              else if(l.equals("domar") && x[i].contains("নীলসাগর")){
                                  tv6.setText("নীলসাগর  ঢাকার দিকে 20:00  \nনীলসাগর  চিলাহাটির দিকে 16:00");

                              }
                              else if(l.equals("domar") && x[i].contains("রকেট")){
                                  tv1.setText("রকেট  খুলনার দিকে 07:12 \nরকেট  চিলাহাটির দিকে 00:02");

                              }
                              else if(l.equals("domar") && x[i].contains("বরেন্দ্র")){
                                  tv1.setText("বরেন্দ্র  রাজশহীর দিকে 05:18 \n  বরেন্দ্র চিলাহাটির দিকে 20:58 ");

                              }

                              else if(l.equals("tarinibari") && x[i].contains("রকেট")){
                                  tv1.setText("রকেট এক্সপ্রেস খুলনার দিকে 07:25 \n রকেট চিলাহাটির দিকে স্টপেজ নাই");

                              }
                              else if(l.equals("nilphamary") && x[i].contains("রকেট")){
                                  tv1.setText("রকেট এক্সপ্রেস খুলনার দিকে 07:36 \nরকেট  চিলাহাটির দিকে 23:41  ");

                              }
                              else if(l.equals("nilphamary") && x[i].contains("রূপসা")){
                                  tv7.setText("রূপসা খুলনার দিকে 09:07 \n রূপসা চিলাহাটির দিকে 16:13");

                              }
                              else if(l.equals("nilphamary") && x[i].contains("বরেন্দ্র")){
                                  tv2.setText("বরেন্দ্র রাজশাহীর দিকে 05:45 \n বরেন্দ্র চিলাহাটির দিকে 20:32");

                              }
                              else if(l.equals("nilphamary") && x[i].contains("চিলাহাটি")){
                                  tv3.setText("চিলাহাটি ঢাকার দিকে 06:36 \n চিলাহাটি চিলাহাটির দিকে 02:01");

                              }
                              else if(l.equals("nilphamary") && x[i].contains("তিতুমীর")){
                                  tv4.setText("তিতুমীর রাজশাহীর দিকে 15:45 \n তিতুমীর চিলাহাটির দিকে 12:11");

                              }
                              else if(l.equals("nilphamary") && x[i].contains("সীমান্ত")){
                                  tv5.setText("সীমান্ত খুলনার দিকে 19:22 \n সীমান্ত চিলাহাটির দিকে 05:50");

                              }
                              else if(l.equals("nilphamary") && x[i].contains("নীলসাগর")){
                                  tv6.setText("নীলসাগর ঢাকার দিকে 15:05 \n নীলসাগর চিলাহাটির দিকে 05:50");

                              }


                              else if(l.equals("saidpur") && x[i].contains("রকেট")){
                                  tv1.setText("রকেট খুলনার  দিকে 08:12 \n রকেট চিলাহাটির দিকে 23:22");

                              }
                            else if(l.equals("saidpur") && x[i].contains("রূপসা")){
                             tv2.setText("রূপসা খুলনার দিকে 09:30 \n রূপসা চিলাহাটির দিকে 15:32");

                             }
                         else if(l.equals("saidpur") && x[i].contains("চিলাহাটি")){
                             tv3.setText("চিলাহাটি  ঢাকার দিকে 06:59 \n চিলাহাটি  চিলাহাটির দিকে 01:37");

                         }
                         else if(l.equals("saidpur") && x[i].contains("তিতুমীর")){
                             tv4.setText("তিতুমীর  রাজশাহীর দিকে 16:09 \n তিতুমীর চিলাহাটির দিকে 11:47");

                         }
                         else if(l.equals("saidpur") && x[i].contains("বরেন্দ্র")){
                             tv5.setText("বরেন্দ্র  রাজশাহীর দিকে 06:15 \n  বরেন্দ্র চিলাহাটির দিকে 20:09 ");

                         }
                         else if(l.equals("saidpur") && x[i].contains("নীলসাগর")){
                             tv6.setText("নীলসাগর ঢাকার দিকে 20:59 \n নীলসাগর চিলাহাটির দিকে 14:42");

                         }
                         else if(l.equals("saidpur") && x[i].contains("সীমান্ত")){
                             tv7.setText("সীমান্ত খুলনার দিকে 05:27 \n সীমান্ত চিলাহাটির দিকে 05:50");

                         }

                         else if(l.equals("parbatipur") && x[i].contains("রূপসা")){
                             tv2.setText("রূপসা খুলনার দিকে 10:15 \n রূপসা চিলাহাটির দিকে 15:15");

                         }
                         else if(l.equals("parbatipur") && x[i].contains("চিলাহাটি")){
                             tv3.setText("চিলাহাটি  ঢাকার দিকে 07:30 \n চিলাহাটি  চিলাহাটির দিকে 01:20");

                         }
                         else if(l.equals("parbatipur") && x[i].contains("তিতুমীর")){
                             tv4.setText("তিতুমীর  রাজশাহীর দিকে 16:50 \n তিতুমীর  চিলাহাটির দিকে 11:30");

                         }
                         else if(l.equals("parbatipur") && x[i].contains("বরেন্দ্র")){
                             tv5.setText("বরেন্দ্র  রাজশাহীর দিকে 06:55 \n  বরেন্দ্র চিলাহাটির দিকে 19:40 ");

                         }
                         else if(l.equals("parbatipur") && x[i].contains("নীলসাগর")){
                             tv6.setText("নীলসাগর ঢাকার দিকে 21:40 \n নীলসাগর চিলাহাটির দিকে 14:25");

                         }
                         else if(l.equals("parbatipur") && x[i].contains("সীমান্ত")){
                             tv7.setText("সীমান্ত খুলনার দিকে 20:25 \n সীমান্ত চিলাহাটির দিকে 05:10");

                         }

                         else if(l.equals("parbatipur") && x[i].contains("রকেট")){
                             tv1.setText("রকেট খুলনার  দিকে 08:55 \n রকেট চিলাহাটির দিকে 23:00");

                         }
                    else if(l.equals("parbatipur") && x[i].contains("কুড়িগ্রাম")){
                             tv8.setText("কুড়িগ্রাম ঢাকার দিকে 09:45 \n কুড়িগ্রাম কুড়িগ্রামের দিকে 04:15 ");

                         }
                    else if(l.equals("parbatipur") && x[i].contains("দ্রতযান")){
                             tv9.setText("দ্রতযান ঢাকার দিকে 10:45 \n দ্রতযান বি.এম.এস এম এর দিকে 03:35 ");

                         }
                    else if(l.equals("parbatipur") && x[i].contains("বাংলাবান্ধা")){
                             tv10.setText("বাংলাবান্ধা রাজশাহীর দিকে 12:20 \n বাংলাবান্ধা বি.এম.এস এম এর দিকে 01:45 ");

                         }
                   else if(l.equals("parbatipur") && x[i].contains("পঞ্চগড়")){
                             tv11.setText("পঞ্চগড় ঢাকার দিকে 15:20 \n পঞ্চগড় বি.এম.এস এম এর  দিকে 06:30 ");

                         }
                   else if(l.equals("parbatipur") && x[i].contains("মিতালী")){
                             tv12.setText("মিতালী ঢাকার দিকে 16:05 \n মিতালী চিলাহাটির  দিকে 04:35 ");

                         }
                   else if(l.equals("parbatipur") && x[i].contains("একতা")){
                             tv13.setText("একতা ঢাকার দিকে 00:10 \n একতা বি.এম.এস এম এর  দিকে 18:25 ");

                         }
                   else if(l.equals("parbatipur") && x[i].contains("লালমনি কমিউটার")){
                             tv14.setText("লালমনি কমিউটার বুড়িমারীর দিকে 06:10 \n লালমনি কমিউটার পার্বতীপুর এর দিকে 11:35 ");

                         }
                   else if(l.equals("parbatipur") && x[i].contains("দোলনচাঁপা")){
                             tv15.setText("দোলনচাঁপা  সান্তাহারের দিকে 09:35 \n দোলনচাঁপা  বি.এম.এস.এম এর দিকে 17:00 ");

                         }
                   else if(l.equals("parbatipur") && x[i].contains("দিনাজপুর কমিউটার")){
                             tv16.setText("দিনাজপুর কমিউটার লালমনিরহাট এর দিকে 12:00 \n দিনাজপুর কমিউটার বিরল এর দিকে 08:50 ");

                         }
                   else if(l.equals("parbatipur") && x[i].contains("লোকাল462")){
                             tv17.setText("লোকাল462  লালমনিরহাট এর দিকে 16:10 \n লোকাল462 পার্বতীপুর এর দিকে 11:45 ");

                         }
                   else if(l.equals("parbatipur") && x[i].contains("রামসাগর")){
                             tv18.setText("রামসাগর  বোনারপাড়া এর দিকে 18:20 \n রামসাগর পার্বতীপুর এর দিকে 11:10 ");

                         }

                      else if(l.equals("phulbari") && x[i].contains("রকেট")){
                             tv1.setText("রকেট খুলনার  দিকে 09:22 \n রকেট চিলাহাটির দিকে 20:58");
                         }
                         else if(l.equals("phulbari") && x[i].contains("রূপসা")){
                             tv4.setText("রূপসা খুলনার দিকে 10:39 \n রূপসা চিলাহাটির দিকে 14:48");
                         }

                         else if(l.equals("phulbari") && x[i].contains("বাংলাবান্ধা")){
                             tv5.setText("বাংলাবান্ধা রাজশাহীর দিকে 12:41 \n বাংলাবান্ধা বি.এম.এস এম এর দিকে 01:07 ");
                         }
                         else if(l.equals("phulbari") && x[i].contains("তিতুমীর")){
                             tv2.setText("তিতুমীর  রাজশাহীর দিকে 17:11 \n  চিলাহাটির দিকে 10:41");
                         }
                         else if(l.equals("phulbari") && x[i].contains("বরেন্দ্র")){
                             tv3.setText("বরেন্দ্র  রাজশাহীর দিকে 07:16 \n  বরেন্দ্র চিলাহাটির দিকে 19:07 ");
                         }
                         else if(l.equals("phulbari") && x[i].contains("নীলসাগর")){
                             tv6.setText("নীলসাগর ঢাকার দিকে 22:01 \n নীলসাগর চিলাহাটির দিকে 13:58");
                         }
                         else if(l.equals("phulbari") && x[i].contains("সীমান্ত")){
                             tv7.setText("সীমান্ত খুলনার দিকে 20:46 \n সীমান্ত চিলাহাটির দিকে 04:43");
                         }
                         else if(l.equals("phulbari") && x[i].contains("দ্রতযান")){
                             tv8.setText("দ্রতযান ঢাকার দিকে 11:07 \n দ্রতযান বি.এম.এস এম এর দিকে 03:00 ");
                         }
                         else if(l.equals("phulbari") && x[i].contains("চিলাহাটি")){
                             tv9.setText("চিলাহাটি  ঢাকার দিকে 07:50 \n চিলাহাটি  চিলাহাটির দিকে 00:36");
                         }
                         else if(l.equals("phulbari") && x[i].contains("একতা")){
                             tv10.setText("একতা ঢাকার দিকে 00:34 \n একতা বি.এম.এস এম এর  দিকে 17:51 ");
                         }

                         else if(l.equals("barampur") && x[i].contains("রকেট")){
                             tv1.setText("রকেট খুলনার  দিকে 09:37 \n রকেট চিলাহাটির দিকে 20:19");
                         }
                         else if(l.equals("barampur") && x[i].contains("তিতুমীর")){
                             tv2.setText("তিতুমীর  রাজশাহীর দিকে 17:39 \n তিতুমীর চিলাহাটির দিকে 10:20");
                         }
                         else if(l.equals("barampur") && x[i].contains("বরেন্দ্র")){
                             tv3.setText("বরেন্দ্র  রাজশাহীর দিকে 07:30 \n  বরেন্দ্র চিলাহাটির দিকে 18:53 ");
                         }
                         else if(l.equals("barampur") && x[i].contains("রূপসা")){
                             tv4.setText("রূপসা খুলনার দিকে 10:53 \n রূপসা চিলাহাটির দিকে 14:35");
                         }
                         else if(l.equals("barampur") && x[i].contains("বাংলাবান্ধা")){
                             tv5.setText("বাংলাবান্ধা রাজশাহীর দিকে 12:55 \n বাংলাবান্ধা বি.এম.এস এম এর দিকে 00:53 ");
                         }

                         else if(l.equals("barampur") && x[i].contains("নীলসাগর")){
                             tv6.setText("নীলসাগর ঢাকার দিকে 22:15 \n নীলসাগর চিলাহাটির দিকে 13:45");
                         }
                         else if(l.equals("barampur") && x[i].contains("সীমান্ত")){
                             tv7.setText("সীমান্ত খুলনার দিকে 21:00 \n সীমান্ত চিলাহাটির দিকে 04:29");
                         }
                         else if(l.equals("barampur") && x[i].contains("দ্রতযান")){
                             tv8.setText("দ্রতযান ঢাকার দিকে 11:21 \n দ্রতযান বি.এম.এস এম এর দিকে 02:46 ");
                         }
                         else if(l.equals("barampur") && x[i].contains("চিলাহাটি")){
                             tv9.setText("চিলাহাটি  ঢাকার দিকে 08:03 \n চিলাহাটি  চিলাহাটির দিকে 01:15");
                         }
                         else if(l.equals("barampur") && x[i].contains("একতা")){
                             tv10.setText("একতা ঢাকার দিকে 00:55 \n একতা বি.এম.এস এম এর  দিকে 17:37 ");
                         }

                         //

                         else if(l.equals("pitchbibe") && x[i].contains("রকেট")){
                             tv1.setText("রকেট খুলনার  দিকে 10:14 \n রকেট চিলাহাটির দিকে 19:48");
                         }
                         else if(l.equals("pitchbibe") && x[i].contains("তিতুমীর")){
                             tv2.setText("তিতুমীর  রাজশাহীর দিকে 18:01 \n তিতুমীর চিলাহাটির দিকে 09:46");
                         }
                         else if(l.equals("pitchbibe") && x[i].contains("বরেন্দ্র")){
                             tv3.setText("বরেন্দ্র  রাজশাহীর দিকে 07:57 \n  বরেন্দ্র চিলাহাটির দিকে 18:30 ");
                         }
                         else if(l.equals("pitchbibe") && x[i].contains("বাংলাবান্ধা")){
                             tv4.setText("বাংলাবান্ধা রাজশাহীর দিকে 13:29 \n বাংলাবান্ধা বি.এম.এস এম এর দিকে 00:22 ");
                         }

                         else if(l.equals("pitchbibe") && x[i].contains("দ্রতযান")){
                             tv5.setText("দ্রতযান ঢাকার দিকে 11:43 \n দ্রতযান বি.এম.এস এম এর দিকে 02:22 ");
                         }
                         else if(l.equals("pitchbibe") && x[i].contains("একতা")){
                             tv6.setText("একতা ঢাকার দিকে 01:17 \n একতা বি.এম.এস এম এর  দিকে 17:14 ");
                         }

                         else if(l.equals("joypurhat") && x[i].contains("রকেট")){
                             tv1.setText("রকেট খুলনার  দিকে 10:30 \n রকেট চিলাহাটির দিকে 19:35");
                         }
                         else if(l.equals("joypurhat") && x[i].contains("তিতুমীর")){
                             tv2.setText("তিতুমীর  রাজশাহীর দিকে 18:15 \n তিতুমীর চিলাহাটির দিকে 09:33");
                         }
                         else if(l.equals("joypurhat") && x[i].contains("বরেন্দ্র")){
                             tv3.setText("বরেন্দ্র  রাজশাহীর দিকে 08:11 \n  বরেন্দ্র চিলাহাটির দিকে 18:10 ");
                         }
                         else if(l.equals("joypurhat") && x[i].contains("রূপসা")){
                             tv4.setText("রূপসা খুলনার দিকে 11:25 \n রূপসা চিলাহাটির দিকে 14:05");
                         }
                         else if(l.equals("joypurhat") && x[i].contains("বাংলাবান্ধা")){
                             tv5.setText("বাংলাবান্ধা রাজশাহীর দিকে 13:43 \n বাংলাবান্ধা বি.এম.এস এম এর দিকে 00:09 ");
                         }
                         else if(l.equals("joypurhat") && x[i].contains("নীলসাগর")){
                             tv6.setText("নীলসাগর ঢাকার দিকে 22:47 \n নীলসাগর চিলাহাটির দিকে 13:14");
                         }
                         else if(l.equals("joypurhat") && x[i].contains("সীমান্ত")){
                             tv7.setText("সীমান্ত খুলনার দিকে 21:32 \n সীমান্ত চিলাহাটির দিকে 03:54");
                         }
                         else if(l.equals("joypurhat") && x[i].contains("দ্রতযান")){
                             tv8.setText("দ্রতযান ঢাকার দিকে 11:57 \n দ্রতযান বি.এম.এস এম এর দিকে 02:09 ");
                         }
                         else if(l.equals("joypurhat") && x[i].contains("চিলাহাটি")){
                             tv9.setText("চিলাহাটি  ঢাকার দিকে 08:35 \n চিলাহাটি  চিলাহাটির দিকে 23:44");
                         }
                         else if(l.equals("joypurhat") && x[i].contains("একতা")){
                             tv10.setText("একতা ঢাকার দিকে 01:31 \n একতা বি.এম.এস এম এর  দিকে 16:52 ");
                         }
                         else if(l.equals("joypurhat") && x[i].contains("পঞ্চগড়")){
                             tv11.setText("পঞ্চগড় ঢাকার দিকে 16:16 \n পঞ্চগড় বি.এম.এস এম এর  দিকে 05:19 ");

                         }
                         else if(l.equals("joypurhat") && x[i].contains("কুড়িগ্রাম")){
                             tv12.setText("কুড়িগ্রাম ঢাকার দিকে 10:46 \n কুড়িগ্রাম কুড়িগ্রামের দিকে 02:57 ");
                         }

                         else if(l.equals("jamaljong") && x[i].contains("রকেট")){
                             tv1.setText("রকেট খুলনার  দিকে 10:40 \n রকেট চিলাহাটির দিকে 19:19");
                         }
                         else if(l.equals("jamaljong") && x[i].contains("তিতুমীর")){
                             tv2.setText("তিতুমীর  রাজশাহীর দিকে 18:25 \n তিতুমীর চিলাহাটির দিকে 09:22");
                         }

                         else if(l.equals("accalpur") && x[i].contains("রকেট")){
                             tv1.setText("রকেট খুলনার  দিকে 11:14 \n রকেট চিলাহাটির দিকে 19:10");
                         }
                         else if(l.equals("accalpur") && x[i].contains("তিতুমীর")){
                             tv2.setText("তিতুমীর  রাজশাহীর দিকে 18:35 \n তিতুমীর চিলাহাটির দিকে 09:12");
                         }
                         else if(l.equals("accalpur") && x[i].contains("বরেন্দ্র")){
                             tv3.setText("বরেন্দ্র  রাজশাহীর দিকে 08:26 \n  বরেন্দ্র চিলাহাটির দিকে 17:52 ");
                         }
                         else if(l.equals("accalpur") && x[i].contains("রূপসা")){
                             tv4.setText("রূপসা খুলনার দিকে 11:40 \n রূপসা চিলাহাটির দিকে 13:47");
                         }
                         else if(l.equals("accalpur") && x[i].contains("বাংলাবান্ধা")){
                             tv5.setText("বাংলাবান্ধা রাজশাহীর দিকে 14:11 \n বাংলাবান্ধা বি.এম.এস এম এর দিকে 23:52 ");
                         }
                         else if(l.equals("accalpur") && x[i].contains("নীলসাগর")){
                             tv6.setText("নীলসাগর ঢাকার দিকে 23:02 \n নীলসাগর চিলাহাটির দিকে 12:57");
                         }
                         else if(l.equals("accalpur") && x[i].contains("সীমান্ত")){
                             tv7.setText("সীমান্ত খুলনার দিকে 21:48 \n সীমান্ত চিলাহাটির দিকে 03:37");
                         }
                         else if(l.equals("accalpur") && x[i].contains("দ্রতযান")){
                             tv8.setText("দ্রতযান ঢাকার দিকে 12:12 \n দ্রতযান বি.এম.এস এম এর দিকে 01:52 ");
                         }
                         else if(l.equals("accalpur") && x[i].contains("একতা")){
                             tv9.setText("একতা ঢাকার দিকে 01:47 \n একতা বি.এম.এস এম এর  দিকে 16:22 ");
                         }

                         else if(l.equals("tilokpur") && x[i].contains("রকেট")){
                             tv1.setText("রকেট খুলনার  দিকে 11:34 \n রকেট চিলাহাটির দিকে 18:51");
                         }

                         else if(l.equals("santahar") && x[i].contains("রকেট")){
                             tv1.setText("রকেট খুলনার  দিকে 12:50 \n রকেট চিলাহাটির দিকে 18:20");
                         }
                         else if(l.equals("santahar") && x[i].contains("তিতুমীর")){
                             tv2.setText("তিতুমীর রাজশাহীর দিকে 19:00 \n তিতুমীর চিলাহাটির দিকে 08:50");
                         }
                         else if(l.equals("santahar") && x[i].contains("বরেন্দ্র")){
                             tv3.setText("বরেন্দ্র  রাজশাহীর দিকে 08:50 \n  বরেন্দ্র চিলাহাটির দিকে 17:25 ");
                         }
                         else if(l.equals("santahar") && x[i].contains("রূপসা")){
                             tv4.setText("রূপসা খুলনার দিকে 12:05 \n রূপসা চিলাহাটির দিকে 13:25");
                         }
                         else if(l.equals("santahar") && x[i].contains("বাংলাবান্ধা")){
                             tv5.setText("বাংলাবান্ধা রাজশাহীর দিকে 14:35 \n বাংলাবান্ধা বি.এম.এস এম এর দিকে 23:30 ");
                         }
                         else if(l.equals("santahar") && x[i].contains("নীলসাগর")){
                             tv6.setText("নীলসাগর ঢাকার দিকে 23:25 \n নীলসাগর চিলাহাটির দিকে 12:35");
                         }
                         else if(l.equals("santahar") && x[i].contains("সীমান্ত")){
                             tv7.setText("সীমান্ত খুলনার দিকে 22:15 \n সীমান্ত চিলাহাটির দিকে 03:15");
                         }
                         else if(l.equals("santahar") && x[i].contains("দ্রতযান")){
                             tv8.setText("দ্রতযান ঢাকার দিকে 12:35 \n দ্রতযান বি.এম.এস এম এর দিকে 01:30 ");
                         }
                         else if(l.equals("santahar") && x[i].contains("চিলাহাটি")){
                             tv9.setText("চিলাহাটি  ঢাকার দিকে 09:20 \n চিলাহাটি  চিলাহাটির দিকে 22:50");
                         }
                         else if(l.equals("santahar") && x[i].contains("একতা")){
                             tv10.setText("একতা ঢাকার দিকে 02:20 \n একতা বি.এম.এস এম এর  দিকে 10:00 ");
                         }
                         else if(l.equals("santahar") && x[i].contains("পঞ্চগড়")){
                             tv11.setText("পঞ্চগড় ঢাকার দিকে 16:55 \n পঞ্চগড় বি.এম.এস এম এর  দিকে 04:45 ");

                         }
                         else if(l.equals("santahar") && x[i].contains("কুড়িগ্রাম")){
                             tv12.setText("কুড়িগ্রাম ঢাকার দিকে 11:25 \n কুড়িগ্রাম কুড়িগ্রামের দিকে 02:20 ");

                         }
                         else if(l.equals("santahar") && x[i].contains("রংপুর")){
                             tv13.setText("রংপুর ঢাকার দিকে 00:12 \n রংপুর লালমনিরহাটের দিকে 15:10 ");

                         }
                         else if(l.equals("santahar") && x[i].contains("করতোয়া")){
                             tv14.setText("করতোয়া সান্তাহারের দিকে 22:40 \n করতোয়া বুড়িমারীর দিকে 09:15 ");

                         }
                         else if(l.equals("santahar") && x[i].contains("দোলনচাঁপা")){
                             tv15.setText("দোলনচাঁপা সান্তাহারের দিকে 16:10 \n দোলনচাঁপা বি.এম.এস এম এর দিকে 11:00 ");

                         }
                         else if(l.equals("santahar") && x[i].contains("লালমনি")){
                             tv16.setText("লালমনি ঢাকার দিকে 13:40 \n লালমনি লালমনিরহাট এর দিকে 03:50 ");

                         }
                         else if(l.equals("santahar") && x[i].contains("পদ্মরাগ")){
                             tv17.setText("পদ্মরাগ সান্তাহারের দিকে 20:20 \n পদ্মরাগ লালমনিরহাট এর দিকে 06:30 ");

                         }
                         else if(l.equals("santahar") && x[i].contains("বগুড়া কমিউটার")){
                             tv18.setText("বগুড়া কমিউটার সান্তাহারের দিকে 12:45 \n বগুড়া কমিউটার লালমনিরহাট এর দিকে 13:50 ");

                         }
                         else if(l.equals("santahar") && x[i].contains("লোকাল492")){
                             tv19.setText("লোকাল492 সান্তাহারের দিকে 10:15 \n লোকাল492 বোনারপাড়ার দিকে 18:40 ");

                         }
                         else if(l.equals("santahar") && x[i].contains("বুড়িমারী")){
                             tv20.setText("বুড়িমারী ঢাকার দিকে 00:55 \n বুড়িমারী লালমনিরহার এর দিকে 14:20 ");

                         }
                         else if(l.equals("raninogor") && x[i].contains("রকেট")){
                             tv1.setText("রকেট খুলনার  দিকে 13:16 \n রকেট চিলাহাটির দিকে 18:08");
                         }
                         else if(l.equals("shgagola") && x[i].contains("রকেট")){
                             tv1.setText("রকেট খুলনার  দিকে 14:07 \n রকেট চিলাহাটির দিকে 17:58");
                         }

                         else if(l.equals("ahshangong") && x[i].contains("রকেট")){
                             tv1.setText("রকেট খুলনার  দিকে 14:38 \n রকেট চিলাহাটির দিকে 17:47");
                         }
                         else if(l.equals("ahshangong") && x[i].contains("তিতুমীর")){
                             tv2.setText("তিতুমীর  রাজশাহীর দিকে 19:25 \n তিতুমীর চিলাহাটির দিকে 08:19");
                         }
                         else if(l.equals("ahshangong") && x[i].contains("বরেন্দ্র")){
                             tv3.setText("বরেন্দ্র  রাজশাহীর দিকে 09:15 \n  বরেন্দ্র চিলাহাটির দিকে 16:46 ");
                         }
                         else if(l.equals("ahshangong") && x[i].contains("রূপসা")){
                             tv4.setText("রূপসা খুলনার দিকে 12:31 \n রূপসা চিলাহাটির দিকে 12:57");
                         }
                         else if(l.equals("ahshangong") && x[i].contains("বাংলাবান্ধা")){
                             tv5.setText("বাংলাবান্ধা রাজশাহীর দিকে 15:05 \n বাংলাবান্ধা বি.এম.এস এম এর দিকে 23:00 ");
                         }
                         else if(l.equals("ahshangong") && x[i].contains("নীলসাগর")){
                             tv6.setText("নীলসাগর ঢাকার দিকে 23:49 \n নীলসাগর চিলাহাটির দিকে 11:43");
                         }
                         else if(l.equals("ahshangong") && x[i].contains("দ্রতযান")){
                             tv7.setText("দ্রতযান ঢাকার দিকে 13:11 \n দ্রতযান বি.এম.এস এম এর দিকে 00:57 ");
                         }

                         else if(l.equals("madnagor") && x[i].contains("রকেট")){
                             tv1.setText("রকেট খুলনার  দিকে 14:54 \n রকেট চিলাহাটির দিকে 17:29");
                         }
                         else if(l.equals("madnagor") && x[i].contains("তিতুমীর")){
                             tv2.setText("তিতুমীর  রাজশাহীর দিকে 19:36 \n তিতুমীর চিলাহাটির দিকে 08:07");
                         }
                         else if(l.equals("madnagor") && x[i].contains("বাংলাবান্ধা")){
                             tv3.setText("বাংলাবান্ধা রাজশাহীর দিকে 15:17 \n বাংলাবান্ধা বি.এম.এস এম এর দিকে 22:40 ");
                         }
                         else if(l.equals("madnagor") && x[i].contains("কুড়িগ্রাম")){
                             tv4.setText("কুড়িগ্রাম ঢাকার দিকে 12:03 \n কুড়িগ্রাম কুড়িগ্রামের দিকে 01:34 ");
                         }
                         else if(l.equals("natore") && x[i].contains("রকেট")){
                             tv1.setText("রকেট খুলনার  দিকে 15:29 \n রকেট চিলাহাটির দিকে 16:54");
                         }
                         else if(l.equals("natore") && x[i].contains("তিতুমীর")){
                             tv2.setText("তিতুমীর রাজশাহীর দিকে 19:53 \n তিতুমীর চিলাহাটির দিকে 07:52");
                         }
                         else if(l.equals("natore") && x[i].contains("বরেন্দ্র")){
                             tv3.setText("বরেন্দ্র  রাজশাহীর দিকে 09:39 \n  বরেন্দ্র চিলাহাটির দিকে 16:23 ");
                         }
                         else if(l.equals("natore") && x[i].contains("রূপসা")){
                             tv4.setText("রূপসা খুলনার দিকে 12:55 \n রূপসা চিলাহাটির দিকে 12:15");
                         }
                         else if(l.equals("natore") && x[i].contains("বাংলাবান্ধা")){
                             tv5.setText("বাংলাবান্ধা রাজশাহীর দিকে 15:42 \n বাংলাবান্ধা বি.এম.এস এম এর দিকে 22:24 ");
                         }
                         else if(l.equals("natore") && x[i].contains("নীলসাগর")){
                             tv6.setText("নীলসাগর ঢাকার দিকে 00:13 \n নীলসাগর চিলাহাটির দিকে 11:21");
                         }
                         else if(l.equals("natore") && x[i].contains("সীমান্ত")){
                             tv7.setText("সীমান্ত খুলনার দিকে 22:58 \n সীমান্ত চিলাহাটির দিকে 02:23");
                         }
                         else if(l.equals("natore") && x[i].contains("দ্রতযান")){
                             tv8.setText("দ্রতযান ঢাকার দিকে 13:47 \n দ্রতযান বি.এম.এস এম এর দিকে 00:35 ");
                         }
                         else if(l.equals("natore") && x[i].contains("চিলাহাটি")){
                             tv9.setText("চিলাহাটি  ঢাকার দিকে 10:03 \n চিলাহাটি  চিলাহাটির দিকে 21:47");
                         }
                         else if(l.equals("natore") && x[i].contains("একতা")){
                             tv10.setText("একতা ঢাকার দিকে 03:16 \n একতা বি.এম.এস এম এর  দিকে 15:06 ");
                         }
                         else if(l.equals("natore") && x[i].contains("পঞ্চগড়")){
                             tv11.setText("পঞ্চগড় ঢাকার দিকে 17:39 \n পঞ্চগড় বি.এম.এস এম এর  দিকে 03:57 ");

                         }
                         else if(l.equals("natore") && x[i].contains("কুড়িগ্রাম")){
                             tv12.setText("কুড়িগ্রাম ঢাকার দিকে 12:20 \n কুড়িগ্রাম কুড়িগ্রামের দিকে 01:16 ");

                         }
                         else if(l.equals("natore") && x[i].contains("রংপুর")){
                             tv13.setText("রংপুর ঢাকার দিকে 01:11 \n রংপুর লালমনিরহাটের দিকে 13:52 ");

                         }
                         else if(l.equals("natore") && x[i].contains("লালমনি")){
                             tv14.setText("লালমনি ঢাকার দিকে 14:26 \n লালমনি লালমনিরহাট এর দিকে 02:42 ");

                         }
                         else if(l.equals("natore") && x[i].contains("বুড়িমারী")){
                             tv15.setText("বুড়িমারী ঢাকার দিকে 01:53 \n বুড়িমারী লালমনিরহার এর দিকে 13:05 ");
                         }

                         else if(l.equals("abdulpur") && x[i].contains("রকেট")){
                             tv1.setText("রকেট খুলনার  দিকে 16:25 \n রকেট চিলাহাটির দিকে 16:26");
                         }
                         else if(l.equals("abdulpur") && x[i].contains("তিতুমীর")){
                             tv6.setText("তিতুমীর রাজশাহীর দিকে 20:30 \n তিতুমীর চিলাহাটির দিকে 07:20");
                         }
                         else if(l.equals("abdulpur") && x[i].contains("বরেন্দ্র")){
                             tv7.setText("বরেন্দ্র  রাজশাহীর দিকে 10:15 \n  বরেন্দ্র চিলাহাটির দিকে 16:04 ");
                         }
                         else if(l.equals("abdulpur") && x[i].contains("বাংলাবান্ধা")){
                             tv8.setText("বাংলাবান্ধা রাজশাহীর দিকে 16:20 \n বাংলাবান্ধা বি.এম.এস এম এর দিকে 22:05 ");
                         }
                         else if(l.equals("abdulpur") && x[i].contains("পদ্মা")){
                             tv5.setText("পদ্মা ঢাকার দিকে 16:48 \n পদ্মা  রাজশাহীর দিকে 03:26 ");
                         }
                        else if(l.equals("abdulpur") && x[i].contains("লোকাল 563")){
                             tv2.setText("লোকাল 563 ঈশ্বরদীর দিকে 23:24 \n লোকাল 563 রহনপুর এর দিকে 04:33 ");
                         }
                        else if(l.equals("abdulpur") && x[i].contains("ঈশ্বরদী কমিউটার")){
                             tv3.setText("ঈশ্বরদী কমিউটার ঈশ্বরদীর দিকে 19:34 \nঈশ্বরদী কমিউটার রহনপুর এর দিকে 07:45 ");
                         }
                        else if(l.equals("abdulpur") && x[i].contains("ঢালারচর")){
                             tv4.setText("ঢালারচর ঢালারচর এর দিকে 18:05 \nঢালারচর চা: নবাবগঞ্জ এর দিকে 09:31 ");
                         }
                        else if(l.equals("abdulpur") && x[i].contains("সাগরদাঁড়ী")){
                             tv9.setText("সাগরদাঁড়ী খুলনার দিকে 06:42 \nসাগরদাঁড়ী  রাজশাহীর দিকে 21:00 ");
                         }
                        else if(l.equals("abdulpur") && x[i].contains("সিল্কসিটি")){
                             tv10.setText("সিল্কসিটি ঢাকার দিকে 08:12 \nসিল্কসিটি রাজশাহীর দিকে 19:40 ");
                         }
                        else if(l.equals("abdulpur") && x[i].contains("রাজশাহী কমিউটার")){
                             tv11.setText("রাজশাহী কমিউটার ঈশ্বরদীর দিকে 12:06 \nরাজশাহী কমিউটার চা: নবাবগঞ্জ এর দিকে 18:52 ");
                         }
                        else if(l.equals("abdulpur") && x[i].contains("ধূমকেতু")){
                             tv12.setText("ধূমকেতু ঢাকার দিকে 00:07 \nধূমকেতু রাজশাহীর দিকে 10:41 ");
                         }
                        else if(l.equals("abdulpur") && x[i].contains("মহানান্দা")){
                             tv13.setText("মহানান্দা খুলনার দিকে 09:24 \nমহানান্দা চাঁ:নবাবগঞ্জ এর দিকে 18:05 ");
                         }
                        else if(l.equals("arani") && x[i].contains("লোকাল 563")){
                             tv1.setText("লোকাল 563 ঈশ্বরদীর দিকে 23:02 \n লোকাল 563 রহনপুর এর দিকে 04:46 ");
                         }
                         else if(l.equals("arani") && x[i].contains("ঈশ্বরদী কমিউটার")){
                             tv2.setText("ঈশ্বরদী কমিউটার ঈশ্বরদীর দিকে 19:16 \nঈশ্বরদী কমিউটার রহনপুর এর দিকে 08:15 ");
                         }
                         else if(l.equals("arani") && x[i].contains("ঢালারচর")){
                             tv3.setText("ঢালারচর ঢালারচর এর দিকে 17:48 \nঢালারচর চা: নবাবগঞ্জ এর দিকে 09:42 ");
                         }
                         else if(l.equals("arani") && x[i].contains("রাজশাহী কমিউটার")){
                             tv4.setText("রাজশাহী কমিউটার ঈশ্বরদীর দিকে 11:47 \nরাজশাহী কমিউটার চা: নবাবগঞ্জ এর দিকে 19:13 ");
                         }
                         else if(l.equals("arani") && x[i].contains("ধূমকেতু")){
                             tv5.setText("ধূমকেতু ঢাকার দিকে 23:51 \nধূমকেতু রাজশাহীর দিকে 10:53 ");
                         }
                         else if(l.equals("arani") && x[i].contains("মহানান্দা")){
                             tv6.setText("মহানান্দা খুলনার দিকে 09:03 \nমহানান্দা চাঁ:নবাবগঞ্জ এর দিকে 18:23 ");
                         }
                         else if(l.equals("sardah") && x[i].contains("লোকাল 563")){
                             tv1.setText("লোকাল 563 ঈশ্বরদীর দিকে 22:41 \n লোকাল 563 রহনপুর এর দিকে 05:13 ");
                         }   else if(l.equals("sardah") && x[i].contains("পদ্মা")){
                             tv2.setText("পদ্মা ঢাকার দিকে 16:19 \n পদ্মা রাজশাহীর দিকে 03:54 ");
                         }
                         else if(l.equals("sardah") && x[i].contains("ঈশ্বরদী কমিউটার")){
                             tv3.setText("ঈশ্বরদী কমিউটার ঈশ্বরদীর দিকে 18:50 \nঈশ্বরদী কমিউটার রহনপুর এর দিকে 08:37 ");
                         }
                         else if(l.equals("sardah") && x[i].contains("ঢালারচর")){
                             tv4.setText("ঢালারচর ঢালারচর এর দিকে 17:20 \nঢালারচর চা: নবাবগঞ্জ এর দিকে 10:04 ");
                         }
                         else if(l.equals("sardah") && x[i].contains("রাজশাহী কমিউটার")){
                             tv5.setText("রাজশাহী কমিউটার ঈশ্বরদীর দিকে 11:14 \nরাজশাহী কমিউটার চা: নবাবগঞ্জ এর দিকে 19:35 ");
                         }

                         else if(l.equals("sardah") && x[i].contains("মহানান্দা")){
                             tv6.setText("মহানান্দা খুলনার দিকে 08:40 \nমহানান্দা চাঁ:নবাবগঞ্জ এর দিকে 18:53 ");
                         }
                         else if(l.equals("horian") && x[i].contains("লোকাল 563")){
                             tv1.setText("লোকাল 563 ঈশ্বরদীর দিকে 22:26 \n লোকাল 563 রহনপুর এর দিকে 05:25 ");
                         }
                         else if(l.equals("horian") && x[i].contains("ঈশ্বরদী কমিউটার")){
                             tv3.setText("ঈশ্বরদী কমিউটার ঈশ্বরদীর দিকে 18:40 \nঈশ্বরদী কমিউটার রহনপুর এর দিকে 08:47 ");
                         }
                         else if(l.equals("horian") && x[i].contains("রাজশাহী কমিউটার")){
                             tv5.setText("রাজশাহী কমিউটার ঈশ্বরদীর দিকে 10:54 \nরাজশাহী কমিউটার চা: নবাবগঞ্জ এর দিকে 19:46 ");
                         }
                         else if(l.equals("horian") && x[i].contains("মহানান্দা")){
                             tv6.setText("মহানান্দা খুলনার দিকে 08:21 \nমহানান্দা চাঁ:নবাবগঞ্জ এর দিকে 19:05 ");
                         }

                         else if(l.equals("rajshahi") && x[i].contains("মহানান্দা")){
                             tv1.setText("মহানান্দা খুলনার দিকে 08:05 \nমহানান্দা চাঁ:নবাবগঞ্জ এর দিকে 19:30 ");
                         }
                         else if(l.equals("rajshahi") && x[i].contains("ঈশ্বরদী কমিউটার")){
                             tv2.setText("ঈশ্বরদী কমিউটার ঈশ্বরদীর দিকে 18:30 \nঈশ্বরদী কমিউটার রহনপুর এর দিকে 09:10 ");
                         }
                         else if(l.equals("rajshahi") && x[i].contains("লোকাল 563")){
                             tv3.setText("লোকাল 563 ঈশ্বরদীর দিকে 22:05 \n লোকাল 563 রহনপুর এর দিকে 06:10 ");
                         }
                         else if(l.equals("rajshahi") && x[i].contains("রাজশাহী কমিউটার")){
                             tv4.setText("রাজশাহী কমিউটার ঈশ্বরদীর দিকে 10:30 \nরাজশাহী কমিউটার চা: নবাবগঞ্জ এর দিকে 20:15 ");
                         }
                         else if(l.equals("rajshahi") && x[i].contains("তিতুমীর")){
                             tv5.setText("তিতুমীর রাজশাহী পেীছে 21:30 \n তিতুমীর চিলাহাটির দিকে 06:20");
                         }
                         else if(l.equals("rajshahi") && x[i].contains("বরেন্দ্র")){
                             tv6.setText("বরেন্দ্র  রাজশাহী পেীছে 11:10 \n  বরেন্দ্র চিলাহাটির দিকে 15:00 ");
                         }
                         else if(l.equals("rajshahi") && x[i].contains("বাংলাবান্ধা")){
                             tv7.setText("বাংলাবান্ধা রাজশাহী পেীছে 17:35 \n বাংলাবান্ধা বি.এম.এস এম এর দিকে 21:00 ");
                         }
                         else if(l.equals("rajshahi") && x[i].contains("পদ্মা")){
                             tv8.setText("পদ্মা ঢাকার দিকে 16:00 \n পদ্মা  রাজশাহী পেীছে 04:25 ");
                         }

                         else if(l.equals("rajshahi") && x[i].contains("ঢালারচর")){
                             tv9.setText("ঢালারচর ঢালারচর এর দিকে 17:00 \nঢালারচর চা: নবাবগঞ্জ এর দিকে 10:35 ");
                         }
                         else if(l.equals("rajshahi") && x[i].contains("সাগরদাঁড়ী")){
                             tv10.setText("সাগরদাঁড়ী খুলনার দিকে 06:00 \nসাগরদাঁড়ী  রাজশাহী পেীছে 22:00 ");
                         }
                         else if(l.equals("rajshahi") && x[i].contains("সিল্কসিটি")){
                             tv11.setText("সিল্কসিটি ঢাকার দিকে 07:40 \nসিল্কসিটি রাজশাহী পেীছে 20:30 ");
                         }

                         else if(l.equals("rajshahi") && x[i].contains("ধূমকেতু")){
                             tv12.setText("ধূমকেতু ঢাকার দিকে 23:20 \nধূমকেতু রাজশাহী পেীছে 11:40 ");
                         }

                         else if(l.equals("rajshahi") && x[i].contains("কপোতাক্ষ")){
                             tv13.setText("কপোতাক্ষ খুলনার দিকে 14:30 \nকপোতাক্ষ রাজশাহী পেীছে 12:20 ");
                         }
                         else if(l.equals("rajshahi") && x[i].contains("বনলতা")){
                             tv14.setText("বনলতা ঢাকার দিকে 07:00 \nবনলতা চা:নবাবগঞ্জ এর দিকে 18:25 ");
                         }
                         else if(l.equals("rajshahi") && x[i].contains("টুঙ্গিপাড়া")){
                             tv15.setText("টুঙ্গিপাড়া গোবরার দিকে 15:30 \nটুঙ্গিপাড়া রাজশাহী এর দিকে 13:15 ");
                         }

                         //


                         else if(l.equals("azimnagor") && x[i].contains("মহানান্দা")){
                             tv1.setText("মহানান্দা খুলনার দিকে 09:38 \nমহানান্দা চাঁ:নবাবগঞ্জ এর দিকে 17:35 ");
                         }
                         else if(l.equals("azimnagor") && x[i].contains("ঈশ্বরদী কমিউটার")){
                             tv2.setText("ঈশ্বরদী কমিউটার ঈশ্বরদীর দিকে 19:45 \nঈশ্বরদী কমিউটার রহনপুর এর দিকে 07:15 ");
                         }
                         else if(l.equals("azimnagor") && x[i].contains("রকেট")){
                             tv1.setText("রকেট খুলনার  দিকে 16:36 \n রকেট চিলাহাটির দিকে 16:04");
                         }
                         else if(l.equals("azimnagor") && x[i].contains("লোকাল 563")){
                             tv3.setText("লোকাল 563 ঈশ্বরদীর দিকে 23:38 \n লোকাল 563 রহনপুর এর দিকে 04:18 ");
                         }
                         else if(l.equals("azimnagor") && x[i].contains("রাজশাহী কমিউটার")){
                             tv4.setText("রাজশাহী কমিউটার ঈশ্বরদীর দিকে 12:17 \nরাজশাহী কমিউটার চা: নবাবগঞ্জ এর দিকে 18:40 ");
                         }
                         else if(l.equals("azimnagor") && x[i].contains("ঢালারচর")){
                             tv9.setText("ঢালারচর ঢালারচর এর দিকে 17:16 \nঢালারচর চা: নবাবগঞ্জ এর দিকে 09:19 ");
                         }
                         else if(l.equals("azimnagor") && x[i].contains("সাগরদাঁড়ী")){
                             tv10.setText("সাগরদাঁড়ী খুলনার দিকে 06:53 \nসাগরদাঁড়ী  রাজশাহী পেীছে 20:49 ");
                         }
                         else if(l.equals("azimnagor") && x[i].contains("কপোতাক্ষ")){
                             tv13.setText("কপোতাক্ষ খুলনার দিকে 15:18 \nকপোতাক্ষ রাজশাহী পেীছে 11:24 ");
                         }
                         else if(l.equals("azimnagor") && x[i].contains("লালমনি")){
                             tv14.setText("লালমনি ঢাকার দিকে 14:53 \n লালমনি লালমনিরহাট এর দিকে 02:03 ");
                         }

















                         else{

                             tv1.setText("");
                             tv2.setText("");
                             tv3.setText("");
                             tv4.setText("");
                             tv5.setText("");
                             tv6.setText("");
                             tv7.setText("");
                             tv8.setText("");
                             tv9.setText("");
                             tv10.setText("");
                             tv11.setText("");
                             tv12.setText("");
                             tv13.setText("");
                             tv14.setText("");
                             tv15.setText("");
                             tv16.setText("");
                             tv17.setText("");
                             tv18.setText("");
                             tv19.setText("");

                         }




//                              tv1.setText(String.valueOf(k));
                          }

                      }
                  }
          }
      });
      bt2.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              ed2.setText("");
              ed1.setText("");
              tv1.setText("");
              tv2.setText("");
              tv3.setText("");
              tv4.setText("");
              tv5.setText("");
              tv6.setText("");
              tv7.setText("");
              tv8.setText("");
              tv9.setText("");
              tv10.setText("");
              tv11.setText("");
              tv12.setText("");
              tv13.setText("");
              tv14.setText("");
              tv15.setText("");
              tv16.setText("");
              tv17.setText("");
              tv18.setText("");
              tv19.setText("");

          }
      });


    }
}