package com.example.tourrecommendationapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent

class marathwada : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_marathwada)

        val btnaurangabad2=findViewById<Button>(R.id.aurangabad2)
        val btnshirdi2=findViewById<Button>(R.id.shirdi2)

        btnaurangabad2.setOnClickListener {
            val intentaurangabad=Intent(this,aurangabad::class.java)
            startActivity(intentaurangabad)
        }
        btnshirdi2.setOnClickListener {
            val intentshirdi=Intent(this,shirdi::class.java)
            startActivity(intentshirdi)
        }

    }
}