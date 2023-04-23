package com.example.tourrecommendationapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent

class desh : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_desh)

        val btnbhandardara2=findViewById<Button>(R.id.bhandardara2)
        val btnbhimashankar2=findViewById<Button>(R.id.bhimashankar2)
        val btnkhandala2=findViewById<Button>(R.id.khandala2)
        val btnkolad2=findViewById<Button>(R.id.kolad2)
        val btnlavasa2=findViewById<Button>(R.id.lavasa2)
        val btnlonavala2=findViewById<Button>(R.id.lonavala2)
        val btnmahabaleshwar2=findViewById<Button>(R.id.mahabaleshwar2)
        val btnmumbai2=findViewById<Button>(R.id.mumbai2)
        val btnpanchgani2=findViewById<Button>(R.id.panchgani2)
        val btnpune2=findViewById<Button>(R.id.pune2)

        btnbhandardara2.setOnClickListener {
            val intentbhandardara=Intent(this,bhandardara::class.java)
            startActivity(intentbhandardara)
        }
        btnbhimashankar2.setOnClickListener {
            val intentbhimashankar=Intent(this,bhimashankar::class.java)
            startActivity(intentbhimashankar)
        }
        btnkhandala2.setOnClickListener {
            val intentkhandala=Intent(this,khandala::class.java)
            startActivity(intentkhandala)
        }
        btnkolad2.setOnClickListener {
            val intentkolad=Intent(this,kolad::class.java)
            startActivity(intentkolad)
        }
        btnlavasa2.setOnClickListener {
            val intentlavasa=Intent(this,lavasa::class.java)
            startActivity(intentlavasa)
        }
        btnlonavala2.setOnClickListener {
            val intentlonavala=Intent(this,lonavala::class.java)
            startActivity(intentlonavala)
        }
        btnmahabaleshwar2.setOnClickListener {
            val intentmahabaleshwar=Intent(this,mahabaleshwar::class.java)
            startActivity(intentmahabaleshwar)
        }
        btnmumbai2.setOnClickListener {
            val intentmumbai=Intent(this,mumbai::class.java)
            startActivity(intentmumbai)
        }
        btnpanchgani2.setOnClickListener {
            val intentpanchgani=Intent(this,panchgani::class.java)
            startActivity(intentpanchgani)
        }
        btnpune2.setOnClickListener {
            val intentpune=Intent(this,pune::class.java)
            startActivity(intentpune)
        }

    }
}