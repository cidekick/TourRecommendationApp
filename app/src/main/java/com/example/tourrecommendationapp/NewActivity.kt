package com.example.tourrecommendationapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class NewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.new_activity)

        val btnalibaug = findViewById<Button>(R.id.alibaug)
        val btnamboli= findViewById<Button>(R.id.amboli)
        val btnaurangabad= findViewById<Button>(R.id.aurangabad)
        val btnbhandardara= findViewById<Button>(R.id.bhandardara)
        val btnbhimashankar= findViewById<Button>(R.id.bhimashankar)
        val btnchikhaldhara= findViewById<Button>(R.id.chikhaldhara)
        val btnganpatipule= findViewById<Button>(R.id.ganpatipule)
        val btnkhandala= findViewById<Button>(R.id.khandala)
        val btnkolad= findViewById<Button>(R.id.kolad)
        val btnkolhapur= findViewById<Button>(R.id.kolhapur)
        val btnlavasa= findViewById<Button>(R.id.lavasa)
        val btnlonavala= findViewById<Button>(R.id.lonavala)
        val btnmahabaleshwar= findViewById<Button>(R.id.mahabaleshwar)
        val btnmumbai= findViewById<Button>(R.id.mumbai)
        val btnnagpur= findViewById<Button>(R.id.nagpur)
        val btnnashik= findViewById<Button>(R.id.nashik)
        val btnpanchgani= findViewById<Button>(R.id.panchgani)
        val btnpanvel= findViewById<Button>(R.id.panvel)
        val btnpune= findViewById<Button>(R.id.pune)
        val btnraigad= findViewById<Button>(R.id.raigad)
        val btnratnagiri= findViewById<Button>(R.id.ratnagiri)
        val btnshirdi= findViewById<Button>(R.id.shirdi)
        val btntadoba= findViewById<Button>(R.id.tadoba)
        val btntarakarli= findViewById<Button>(R.id.tarakarli)

        btnalibaug.setOnClickListener {
            val intentalibaug=Intent(this,alibaug::class.java)
            startActivity(intentalibaug)
        }

        btnamboli.setOnClickListener{
            val intentamboli= Intent(this,amboli::class.java)
            startActivity(intentamboli)
        }

        btnaurangabad.setOnClickListener{
            val intentaurangabad= Intent(this,aurangabad::class.java)
            startActivity(intentaurangabad)
        }

        btnbhandardara.setOnClickListener{
            val intentbhandardara= Intent(this,bhandardara::class.java)
            startActivity(intentbhandardara)
        }

        btnbhimashankar.setOnClickListener{
            val intentbhimashankar= Intent(this,bhimashankar::class.java)
            startActivity(intentbhimashankar)
        }

        btnchikhaldhara.setOnClickListener{
            val intentchikhaldhara= Intent(this,chikhaldhara::class.java)
            startActivity(intentchikhaldhara)
        }

        btnganpatipule.setOnClickListener{
            val intentganpatipule= Intent(this,ganpatipule::class.java)
            startActivity(intentganpatipule)
        }

        btnkhandala.setOnClickListener{
            val intentkhandala= Intent(this,khandala::class.java)
            startActivity(intentkhandala)
        }

        btnkolad.setOnClickListener{
            val intentkolad= Intent(this,kolad::class.java)
            startActivity(intentkolad)
        }

        btnkolhapur.setOnClickListener{
            val intentkolhapur= Intent(this,kolhapur::class.java)
            startActivity(intentkolhapur)
        }

        btnlavasa.setOnClickListener{
            val intentlavasa= Intent(this,lavasa::class.java)
            startActivity(intentlavasa)
        }

        btnlonavala.setOnClickListener{
            val intentlonavala= Intent(this,lonavala::class.java)
            startActivity(intentlonavala)
        }

        btnmahabaleshwar.setOnClickListener{
            val intentmahabaleshwar= Intent(this,mahabaleshwar::class.java)
            startActivity(intentmahabaleshwar)
        }

        btnmumbai.setOnClickListener{
            val intentmumbai= Intent(this,mumbai::class.java)
            startActivity(intentmumbai)
        }

        btnnagpur.setOnClickListener{
            val intentnagpur= Intent(this,nagpur::class.java)
            startActivity(intentnagpur)
        }

        btnnashik.setOnClickListener{
            val intentnashik= Intent(this,nashik::class.java)
            startActivity(intentnashik)
        }

        btnpanchgani.setOnClickListener{
            val intentpanchgani= Intent(this,panchgani::class.java)
            startActivity(intentpanchgani)
        }

        btnpanvel.setOnClickListener{
            val intentpanvel= Intent(this,panvel::class.java)
            startActivity(intentpanvel)
        }

        btnpune.setOnClickListener{
            val intentpune= Intent(this,pune::class.java)
            startActivity(intentpune)
        }

        btnraigad.setOnClickListener{
            val intentraigad= Intent(this,raigad::class.java)
            startActivity(intentraigad)
        }

        btnratnagiri.setOnClickListener{
            val intentratnagiri= Intent(this,ratnagiri::class.java)
            startActivity(intentratnagiri)
        }

        btnshirdi.setOnClickListener{
            val intentshirdi= Intent(this,shirdi::class.java)
            startActivity(intentshirdi)
        }

        btntadoba.setOnClickListener{
            val intenttadoba= Intent(this,tadobanationalpark::class.java)
            startActivity(intenttadoba)
        }

        btntarakarli.setOnClickListener{
            val intenttarakarli= Intent(this,tarakarli::class.java)
            startActivity(intenttarakarli)
        }


    }
}