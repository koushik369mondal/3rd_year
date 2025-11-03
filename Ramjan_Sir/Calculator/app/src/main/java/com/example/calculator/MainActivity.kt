package com.example.calculator

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var e1: EditText
    lateinit var e2: EditText
    lateinit var b1: Button
    lateinit var b2: Button
    lateinit var b3: Button
    lateinit var b4: Button
    lateinit var bs: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        e1 = findViewById(R.id.num1)
        e2 = findViewById(R.id.num2)
        b1 = findViewById(R.id.btn1)
        b2 = findViewById(R.id.btn2)
        b3 = findViewById(R.id.btn3)
        b4 = findViewById(R.id.btn4)
        bs = findViewById(R.id.btnSubmit)

        b1.setOnClickListener(this)
        b2.setOnClickListener(this)
        b3.setOnClickListener(this)
        b4.setOnClickListener(this)
        bs.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        // handle button clicks
    }
}
