package com.example.codetocoffee

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // create variable from button

        val button: Button =
            findViewById(R.id.calcButton)
        button.setOnClickListener { view ->
            
            val inputEditText: EditText = findViewById(R.id.userInput_addTextChangedListener)
            val userInput = inputEditText.text.toString().toDoubleOrNull() // Convert user input to a Double
            if (userInput != null) {
                val stringBuilder = StringBuilder()

                for (i in 1..10) { // Multiply by 1, 2, 3, and so on, up to 10 times
                    val result = userInput * i
                    stringBuilder.append("$userInput * $i = $result\n")
                }

                val resultTextView: TextView = findViewById(R.id.resultTextView)
                resultTextView.text = stringBuilder.toString()
            } else {
                val resultTextView: TextView = findViewById(R.id.resultTextView)
                resultTextView.text = "Invalid input. Please enter a number."
            }
        }

        }


    }








