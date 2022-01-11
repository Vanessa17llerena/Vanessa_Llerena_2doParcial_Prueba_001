package com.aperez.apps.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;

public class VELLC_DBHELPER  extends SQLiteOpenHelper {
    private String createTable_Usuarios ="CREATE TABLE Usuarios("+
            "Codigo INTEGER PRIMARY KEY AUTOINCREMENT,"+
            "Nombre TEXT,"+
            "Contraseña TEXT)";

    public VELLC_DBHELPER(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(createTable_Usuarios);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}

