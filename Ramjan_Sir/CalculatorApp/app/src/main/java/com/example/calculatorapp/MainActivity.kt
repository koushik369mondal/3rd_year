package com.example.calculatorapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var e1: EditText
    lateinit var e2: EditText
    lateinit var b1: Button
    lateinit var b2: Button
    lateinit var b3: Button
    lateinit var b4: Button
    lateinit var resultView: TextView   // changed from Button to TextView (your "Result")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // connect all UI elements
        e1 = findViewById(R.id.num1)
        e2 = findViewById(R.id.num2)
        b1 = findViewById(R.id.btn1)
        b2 = findViewById(R.id.btn2)
        b3 = findViewById(R.id.btn3)
        b4 = findViewById(R.id.btn4)
        resultView = findViewById(R.id.btnSubmit)

        // set button click listeners
        b1.setOnClickListener(this)
        b2.setOnClickListener(this)
        b3.setOnClickListener(this)
        b4.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        // safely convert input to numbers
        val a = e1.text.toString().trim().toDoubleOrNull()
        val b = e2.text.toString().trim().toDoubleOrNull()

        if (a == null || b == null) {
            resultView.text = "Please enter valid numbers"
            return
        }

        val result = when (v?.id) {
            R.id.btn1 -> { // DIV
                if (b == 0.0) {
                    resultView.text = "Cannot divide by 0"
                    return
                }
                a / b
            }
            R.id.btn2 -> a + b // ADD
            R.id.btn3 -> a - b // SUB
            R.id.btn4 -> a * b // MUL
            else -> 0.0
        }

        resultView.text = "Result is: $result"
    }
}
