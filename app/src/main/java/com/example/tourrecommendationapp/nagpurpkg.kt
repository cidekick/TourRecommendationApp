package com.example.tourrecommendationapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent

class nagpurpkg : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nagpurpkg)

        val btnnagpur=findViewById<Button>(R.id.nagpurngppkg)
        val btntadoba=findViewById<Button>(R.id.tadobangppkg)
        val btnchikh=findViewById<Button>(R.id.chikhaldharangppkg)

        btnnagpur.setOnClickListener {
            val intentnagpur=Intent(this,nagpur::class.java)
            startActivity(intentnagpur)
        }
        btntadoba.setOnClickListener {
            val intenttadoba=Intent(this,tadobanationalpark::class.java)
            startActivity(intenttadoba)
        }
        btnchikh.setOnClickListener {
            val intentchikh=Intent(this,chikhaldhara::class.java)
            startActivity(intentchikh)
        }

    }
}