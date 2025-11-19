package com.example.userregistrationapp

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper


class DBHelper(context: Context) :
    SQLiteOpenHelper(context, "UserData", null, 1) {

    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL(
            "CREATE TABLE users(" +
                    "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    "name TEXT, " +
                    "father TEXT, " +
                    "phone TEXT, " +
                    "aadhaar TEXT)"
        )
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        db?.execSQL("DROP TABLE IF EXISTS users")
        onCreate(db)
    }

    fun insertUser(name: String, father: String, phone: String, aadhaar: String): Boolean {
        val db = this.writableDatabase
        val cv = ContentValues()

        cv.put("name", name)
        cv.put("father", father)
        cv.put("phone", phone)
        cv.put("aadhaar", aadhaar)

        val result = db.insert("users", null, cv)

        return result != -1L  // returns true if saved
    }
}