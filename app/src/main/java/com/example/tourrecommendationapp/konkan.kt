package com.example.tourrecommendationapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent


class konkan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_konkan)


        val btnalibaug2=findViewById<Button>(R.id.alibaug2)
        val btnamboli2=findViewById<Button>(R.id.amboli2)
        val btnganpatipule2=findViewById<Button>(R.id.ganpatipule2)
        val btnnashik2=findViewById<Button>(R.id.nashik2)
        val btnkolhapur2=findViewById<Button>(R.id.kolhapur2)
        val btnpanvel2=findViewById<Button>(R.id.panvel2)
        val btnratnagiri2=findViewById<Button>(R.id.ratnagiri2)
        val btntarakarli=findViewById<Button>(R.id.tarakarli2)

        btnalibaug2.setOnClickListener {
            val intentalibaug=Intent(this,alibaug::class.java)
            startActivity(intentalibaug)
        }
        btnamboli2.setOnClickListener {
            val intentamboli=Intent(this,amboli::class.java)
            startActivity(intentamboli)
        }
        btnganpatipule2.setOnClickListener {
            val intentganpatipule=Intent(this,ganpatipule::class.java)
            startActivity(intentganpatipule)
        }
        btnnashik2.setOnClickListener {
            val intentnashik=Intent(this,nashik::class.java)
            startActivity(intentnashik)
        }
        btnkolhapur2.setOnClickListener {
            val intentkolhapur=Intent(this,kolhapur::class.java)
            startActivity(intentkolhapur)
        }
        btnpanvel2.setOnClickListener {
            val intentpanvel=Intent(this,panvel::class.java)
            startActivity(intentpanvel)
        }
        btnratnagiri2.setOnClickListener {
            val intentratnagiri=Intent(this,ratnagiri::class.java)
            startActivity(intentratnagiri)
        }
        btntarakarli.setOnClickListener {
            val intenttarakarli=Intent(this,tarakarli::class.java)
            startActivity(intenttarakarli)
        }


    }


}