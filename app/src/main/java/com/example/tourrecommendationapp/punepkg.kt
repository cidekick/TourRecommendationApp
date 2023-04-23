package com.example.tourrecommendationapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent

class punepkg : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_punepkg)

        val btnmumbai=findViewById<Button>(R.id.mumbaipunepkg)
        val btnpune=findViewById<Button>(R.id.punepunepkg)
        val btnnashik=findViewById<Button>(R.id.nashikpunepkg)

        btnmumbai.setOnClickListener {
            val intentMumbai=Intent(this,mumbai::class.java)
            startActivity(intentMumbai)
        }
        btnpune.setOnClickListener {
            val intentPune=Intent(this,pune::class.java)
            startActivity(intentPune)
        }
        btnnashik.setOnClickListener {
            val intentNashik=Intent(this,nashik::class.java)
            startActivity(intentNashik)
        }

    }
}