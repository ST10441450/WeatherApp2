package com.example.weatherapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.weatherapp.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val maxTemps = intent.getDoubleArrayExtra("maxTemps")
        val minTemps = intent.getDoubleArrayExtra("minTemps")
        val weatherIcons = intent.getDoubleArrayExtra("weatherIcons")

        if (maxTemps != null && minTemps != null && weatherIcons != null){
            findViewById<TextView>(R.id.monTemp).text = "maxTemps: ${maxTemps[0]}"
        }

        val btnBack = findViewById<Button>(R.id.btnExit3)

        btnBack.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }




    }
}