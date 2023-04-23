package com.example.tourrecommendationapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent
import android.widget.Toast




class SelectPackage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_package)

        val btnvidarbha=findViewById<Button>(R.id.vidarbha)
        val btnkonkan=findViewById<Button>(R.id.konkan)
        val btndesh=findViewById<Button>(R.id.desh)
        val btnmarathwada=findViewById<Button>(R.id.marathwada)
        val btnnagpurpkg=findViewById<Button>(R.id.nagpurpkg)
        val btnkonkanpkg=findViewById<Button>(R.id.konkanpkg)
        val btnpunepkg=findViewById<Button>(R.id.punepkg)


        btnvidarbha.setOnClickListener {
            val intentvidarbha=Intent(this,vidarbha::class.java)
            startActivity(intentvidarbha)
        }

        btndesh.setOnClickListener {
            val intentdesh=Intent(this,desh::class.java)
            startActivity(intentdesh)
        }

        btnkonkan.setOnClickListener {
            val intentkonkan=Intent(this,konkan::class.java)
            startActivity(intentkonkan)
        }

        btnmarathwada.setOnClickListener {
            val intentmarathwada=Intent(this,marathwada::class.java)
            startActivity(intentmarathwada)
        }

        btnnagpurpkg.setOnClickListener {
            val intentngp=Intent(this,nagpurpkg::class.java)
            startActivity(intentngp)
        }
        btnkonkanpkg.setOnClickListener {
            val intentkonkan=Intent(this,konkanpkg::class.java)
            startActivity(intentkonkan)
        }
        btnpunepkg.setOnClickListener {
            val intentpune=Intent(this,punepkg::class.java)
            startActivity(intentpune)
        }

    }



}