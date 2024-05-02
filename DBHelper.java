package com.example.demoproject;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {

    public static final String DBNAME="LoginProj.db";

    public DBHelper(@Nullable Context context) {
        super(context, "LoginProj.db", null, 1);
    }


    @Override
    public void onCreate(SQLiteDatabase MyDB) {
        MyDB.execSQL("create Table users_s(username TEXT primary key,password TEXT,utype TEXT)");
        MyDB.execSQL("create Table users_t(username TEXT primary key,password TEXT,utype TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase MyDB, int oldVersion, int newVersion) {
        MyDB.execSQL("drop Table if exists users_s");
        MyDB.execSQL("drop Table if exists users_t");

    }
    public Boolean insertDataS(String username,String password,String utype){
        SQLiteDatabase MyDB=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("username",username);
        contentValues.put("password",password);
        contentValues.put("utype",utype);
        long result=MyDB.insert("users_s",null,contentValues);
        if(result==-1)return false;
        else
            return true;

    }

    public Boolean checkusernameS(String username,String utype){
        SQLiteDatabase MyDB=this.getWritableDatabase();
        Cursor cursor=MyDB.rawQuery("Select * from users_s where username=? and utype=?",new String[]{username,utype});
        if (cursor.getCount()>0)
            return true;
        else
            return false;
    }

    public Boolean checkusernamepasswordS(String username,String password,String utype){
        SQLiteDatabase MyDB=this.getWritableDatabase();
        Cursor cursor=MyDB.rawQuery("Select * from users_s where username=? and password=? and utype=?",new String[]{username,password,utype});
        if(cursor.getCount()>0)
            return true;
        else
            return false;
    }

    public Boolean insertDataT(String username,String password,String utype){
        SQLiteDatabase MyDB=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("username",username);
        contentValues.put("password",password);
        contentValues.put("utype",utype);
        long result=MyDB.insert("users_t",null,contentValues);
        if(result==-1)return false;
        else
            return true;

    }

    public Boolean checkusernameT(String username,String utype){
        SQLiteDatabase MyDB=this.getWritableDatabase();
        Cursor cursor=MyDB.rawQuery("Select * from users_t where username=? and utype=?",new String[]{username,utype});
        if (cursor.getCount()>0)
            return true;
        else
            return false;
    }

    public Boolean checkusernamepasswordT(String username,String password,String utype){
        SQLiteDatabase MyDB=this.getWritableDatabase();
        Cursor cursor=MyDB.rawQuery("Select * from users_t where username=? and password=? and utype=?",new String[]{username,password,utype});
        if(cursor.getCount()>0)
            return true;
        else
            return false;
    }
}
