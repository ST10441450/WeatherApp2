package com.example.weatherapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

private lateinit var dailyTemps: Array<Double>
private lateinit var tvDisplay: TextView
private lateinit var tempInputs: Array<EditText>

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        dailyTemps = Array(7) { 0.0 }
        val display = findViewById<TextView>(R.id.tvDisplay)
        tempInputs = arrayOf(
            findViewById(R.id.editMon),
            findViewById(R.id.editTue),
            findViewById(R.id.editWed),
            findViewById(R.id.editThurs),
            findViewById(R.id.editFriday),
            findViewById(R.id.editSat),
            findViewById(R.id.editSun)
        )

        val btnCalcAvg = findViewById<Button>(R.id.btnAverage)
        val btnClear = findViewById<Button>(R.id.btnClear)
        val btnDetailed = findViewById<Button>(R.id.btnDetailed)
        val btnExit = findViewById<Button>(R.id.btnExit2)

        btnCalcAvg.setOnClickListener {
            for (i in tempInputs.indices) {
                val temp = tempInputs[i].text.toString().toDoubleOrNull() ?:0
            }

            var sum = 0
            for (number in tempInputs) {

            }
            val average = sum / tempInputs.size.toDouble()

        btnClear.setOnClickListener {
            clearData()
        }

        btnDetailed.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }

        btnExit.setOnClickListener {
            finishAffinity()
        }

    }


    }

    private fun clearData(){
        for (tempInput in tempInputs) {
            tempInput.text.clear()
        }
        tvDisplay.text= ""


                }
            }


