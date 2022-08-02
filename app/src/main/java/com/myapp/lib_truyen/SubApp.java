package com.myapp.lib_truyen;

import android.app.Application;

public class SubApp extends Application {
    public  String DB_PATH= "/data/data/com.myapp.lib_truyen/databases/";
    public  String DATABASE_NAME = "db_tarot.db";

    public TruyenPGDB getTruyenPhatGiaoDB(){
        return TruyenPGDB.getInstance(this,DB_PATH,DATABASE_NAME);
    }
}
