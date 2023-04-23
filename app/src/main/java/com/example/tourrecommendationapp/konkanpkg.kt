package com.example.tourrecommendationapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent

class konkanpkg : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_konkanpkg)

        val btnkolhapur=findViewById<Button>(R.id.kolhapurkonkanpkg)
        val btnpanvel=findViewById<Button>(R.id.panvelkonkanpkg)
        val btnratnagiri=findViewById<Button>(R.id.ratnagirikonkanpkg)
        val btntarakarli=findViewById<Button>(R.id.tarakarlikonkanpkg)

        btnkolhapur.setOnClickListener {
            val intentkolhapur=Intent(this,kolhapur::class.java)
            startActivity(intentkolhapur)
        }
        btnpanvel.setOnClickListener {
            val intentpanvel=Intent(this,panvel::class.java)
            startActivity(intentpanvel)
        }
        btnratnagiri.setOnClickListener {
            val intentratnagiri=Intent(this,ratnagiri::class.java)
            startActivity(intentratnagiri)
        }
        btntarakarli.setOnClickListener {
            val intenttarakarli=Intent(this,tarakarli::class.java)
            startActivity(intenttarakarli)
        }
    }
}