package com.example.tourrecommendationapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent

class vidarbha : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vidarbha)

        val btnnagpur2=findViewById<Button>(R.id.nagpur2)
        val btnchikhaldhara2=findViewById<Button>(R.id.chikhaldhara2)
        val btntadoba2=findViewById<Button>(R.id.tadoba2)

        btnnagpur2.setOnClickListener {
            val intentnagpur=Intent(this,nagpur::class.java)
            startActivity(intentnagpur)
        }
        btnchikhaldhara2.setOnClickListener {
            val intentchikhaldhara=Intent(this,chikhaldhara::class.java)
            startActivity(intentchikhaldhara)
        }
        btntadoba2.setOnClickListener {
            val intenttadoba=Intent(this,tadobanationalpark::class.java)
            startActivity(intenttadoba)
        }
    }
}