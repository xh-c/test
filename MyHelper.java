package com.example.asus.sleepkeeper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MyHelper extends SQLiteOpenHelper {

public MyHelper(Context context, String name, SQLiteDatabase.CursorFactory factory,int version){
       super(context,"mydb.db",null,1);
   }
   @Override
   public void onCreate(SQLiteDatabase db) {
       db.execSQL("CREATE TABLE IF NOT EXISTS heart(id INTEGER PRIMARY KEY AUTOINCREMENT,date DATETEXT DEFAULT(date('now','localtime')) not null,time TEXT DEFAULT(time('now','localtime')) not null,heartrate INTEGER)");
       db.execSQL("CREATE TABLE IF NOT EXISTS sleep(id INTEGER PRIMARY KEY AUTOINCREMENT,date DATETEXT DEFAULT(date('now','localtime')) not null,time TEXT DEFAULT(time('now','localtime')) not null,sleepstate INTEGER,thisday TEXT)");
       db.execSQL("CREATE TABLE IF NOT EXISTS mrecord(id INTEGER PRIMARY KEY AUTOINCREMENT,date TEXT not null,zsm TEXT,ss TEXT,qs TEXT,ksyd TEXT,qx TEXT,rs TEXT,xl TEXT,sh TEXT,sm TEXT,ssnum INTEGER,qsnum INTEGER,ksydnum INTEGER,qxnum INTEGER,ssstart TEXT,ssend TEXT,qsstart TEXT,qsend TEXT,ksydstart TEXT,ksydend TEXT,qxstart TEXT,qxend TEXT,sstotal INTEGER,qstotal INTEGER,ksydtotal INTEGER,nxlnum INTEGER)");
         }
   @Override
   public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
       db.execSQL("drop if table exists sleep");
       db.execSQL("drop if table exists  heart");
       onCreate(db);
   }
}