package com.example.crudcomup.dao.helpers;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.crudcomup.model.Borda;
import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

public class MyORMLiteHelper extends OrmLiteSqliteOpenHelper {
    private static final String DATABASE_NAME = "minha_pedida";
    private static final int DATABASE_VERSION = 3;

    public MyORMLiteHelper(Context c){
        super(c, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase, ConnectionSource connectionSource) {
        try {

            TableUtils.createTable(connectionSource, Borda.class);

        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, ConnectionSource connectionSource, int i, int i1) {

        try {
            TableUtils.dropTable(connectionSource, Borda.class , true);
            onCreate(sqLiteDatabase, connectionSource);

        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
}
