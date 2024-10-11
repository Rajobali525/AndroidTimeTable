package com.example.timetable;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class LIstDataActivity extends AppCompatActivity {
    private ListView listView;
    private MyDatabaseHelper databaseHelper;
    private SearchView searchView;
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_list_data);

        listView = findViewById(R.id.listviewid);
        searchView = findViewById(R.id.searchid);



        String[] Month = getResources().getStringArray(R.array.month);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Month);


        databaseHelper = new MyDatabaseHelper(this);
        loadData();



    }


    public void loadData() {
        ArrayList<String> listData = new ArrayList<>();
        Cursor cursor = databaseHelper.showAllData();


        if (cursor.getCount() == 0) {
            Toast.makeText(getApplicationContext(), "No data is available", Toast.LENGTH_LONG).show();

        } else {
            while (cursor.moveToNext()) {
                listData.add(cursor.getString(0) + " \n " + cursor.getString(1) + " \n " + cursor.getString(2));
            }
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_item, R.id.tevtviewlayoutid, listData);
        listView.setAdapter(adapter);

//        String value = adapter.getItem(0);
//        Intent intent = new Intent(LIstDataActivity.this, LandMeasurement.class);
//        intent.putExtra("key",value);
//        setResult(1,intent);
//        finish();

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

//             String value = adapter.getItem(0);
//             Toast.makeText(getApplicationContext()," Hallo " + value + " is called",Toast.LENGTH_LONG).show();


            }
        });

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                return false;
            }
        });

    }
}






//    String value = adapter.getItem(10);
//    Intent intent = new Intent(LIstDataActivity.this, LandMeasurement.class);
//    intent.putExtra("key",value);
//    setResult(1,intent);
//    finish();
//







