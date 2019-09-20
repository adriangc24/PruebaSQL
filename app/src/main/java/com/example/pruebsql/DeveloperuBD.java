package com.example.pruebsql;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DeveloperuBD extends SQLiteOpenHelper {

    public static final String bd_name="developeru.bd";
    public static final int bd_version=1;
    public static final String tabla_cursos="CREATE TABLE CURSOS(CODIGO INTEGER AUTOINCREMENT PRIMARY KEY, USER TEXT, PASS TEXT)";

    public DeveloperuBD(Context context ) {
        super(context, bd_name, null, bd_version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(tabla_cursos);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+tabla_cursos);
        sqLiteDatabase.execSQL(tabla_cursos);
    }
    public void agregarCursos(String user, String pass ){
        SQLiteDatabase bd = getWritableDatabase();
        if(bd!=null){
            bd.execSQL("INSERT INTO CURSOS (user,pass) VALUES('"+user+"','"+pass+"')");
            bd.close();
        }
    }
}
