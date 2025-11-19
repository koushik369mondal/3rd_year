package com.example.sqlite_data_display

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etName = findViewById<EditText>(R.id.etName)
        val etFather = findViewById<EditText>(R.id.etFather)
        val etPhone = findViewById<EditText>(R.id.etPhone)
        val etAadhaar = findViewById<EditText>(R.id.etAadhaar)
        val btnSave = findViewById<Button>(R.id.btnSave)
        val btnView = findViewById<Button>(R.id.btnView)
        val listView = findViewById<ListView>(R.id.listViewData)

        val db = DBHelper(this)

        // Save data
        btnSave.setOnClickListener {
            val name = etName.text.toString()
            val father = etFather.text.toString()
            val phone = etPhone.text.toString()
            val aadhaar = etAadhaar.text.toString()

            val saved = db.insertUser(name, father, phone, aadhaar)

            if (saved) {
                Toast.makeText(this, "Data Saved successfully!", Toast.LENGTH_SHORT).show()
                etName.text.clear()
                etFather.text.clear()
                etPhone.text.clear()
                etAadhaar.text.clear()
            } else {
                Toast.makeText(this, "Failed to save data", Toast.LENGTH_SHORT).show()
            }
        }

        // Display saved data
        btnView.setOnClickListener {
            val list = db.getAllUsers()
            val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, list)
            listView.adapter = adapter
        }
    }
}