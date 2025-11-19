package com.example.userregistrationapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etName = findViewById<EditText>(R.id.etName)
        val etFather = findViewById<EditText>(R.id.etFather)
        val etPhone = findViewById<EditText>(R.id.etPhone)
        val etAadhaar = findViewById<EditText>(R.id.etAadhaar)
        val btnSave = findViewById<Button>(R.id.btnSave)

        val db = DBHelper(this)

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
                Toast.makeText(this, "Failed to save data!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
