package com.example.timetable;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class MyDatabaseHelperTwo extends SQLiteOpenHelper {

    private static final String DATABASE = "Students.db";
    private static final String TABLE = "students_detail";
    private static final String ID = "_id";
    private static final String NAME = "Name";
    private static final String AGE = "Age";
    private static final String GENDER = "Gender";
    private static final int VERSION_NUMBER = 1;
    private static final String CREATE_TABLE = "CREATE TABLE "+TABLE+" ("+ID+" INTEGER PRIMARY KEY AUTOINCREMENT,"+NAME+" VARCHAR(255),"+AGE+" INTEGER(3));";
    private static final String DROP_TABLE = "DROP TABLE IF EXISTS " + TABLE;
    private static final String SELECT_ALL = "SELECT * FROM " + TABLE;
    private Context context;
    public MyDatabaseHelperTwo(@Nullable Context context) {
        super(context, DATABASE, null, VERSION_NUMBER);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        try {
            Toast.makeText(context," Oncreate is called",Toast.LENGTH_LONG).show();
            db.execSQL(CREATE_TABLE);



        }catch (Exception e){
            Toast.makeText(context,"Exception : "+e,Toast.LENGTH_LONG).show();

        }

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        try {
            Toast.makeText(context," OnUpgrade is called",Toast.LENGTH_LONG).show();

            db.execSQL(DROP_TABLE);
            onCreate(db);

        }catch (Exception e){
            Toast.makeText(context,"Exception : "+e,Toast.LENGTH_LONG).show();


        }

    }
    public long insertData(String name,String age){
        SQLiteDatabase sqLiteDatabase =this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(NAME,name);
        contentValues.put(AGE,age);
//        contentValues.put(GENDER,gender);
        long rowId=  sqLiteDatabase.insert(TABLE,null,contentValues);
        return rowId;

    }
    public Cursor showAllData()
    {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        Cursor cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + TABLE,null);
        return cursor;
    }
    public boolean updateDate(String id,String name,String age){
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(ID,id);
        contentValues.put(NAME,name);
        contentValues.put(AGE,age);


        sqLiteDatabase.update(TABLE,contentValues,ID+" = ?",new String[]{id});
        return true;
    }
    public int deleteData(String id){
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        int value = sqLiteDatabase.delete(TABLE,ID+ " = ?",new String[] {id});
        return value;
    }
}
