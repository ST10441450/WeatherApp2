package com.example.weatherapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMoveMain=findViewById<Button>(R.id.btnMoveMain)
        btnMoveMain.setOnClickListener {

            val intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }

        val btnExit = findViewById<Button>(R.id.btnExit1)
        btnExit.setOnClickListener {
            // Exit the App
            finishAffinity()
        }
    }
}