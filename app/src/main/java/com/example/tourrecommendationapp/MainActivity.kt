package com.example.tourrecommendationapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var helper = dbHelper(applicationContext)
        var db = helper.readableDatabase
        var rs = db.rawQuery("SELECT * FROM USERS", null)
        if(rs.moveToNext())
            Toast.makeText(applicationContext, rs.getString(1), Toast.LENGTH_LONG).show()

        val button = findViewById<Button>(R.id.register)
        val unamefield = findViewById<EditText>(R.id.username)
        val pinfield = findViewById<EditText>(R.id.pin)

        button.setOnClickListener {
            val username = unamefield.text.toString()
            val enrollment = pinfield.text.toString()


            if (username.isEmpty() || username.length < 4) {
                unamefield.error = "Username should have at least 4 characters"
                return@setOnClickListener
            }
            if (enrollment.isEmpty()) {
                pinfield.error = "Enrollment cannot be empty"
                return@setOnClickListener
            }
        }



//            // Add user to database
//            var cv = ContentValues()
//            cv.put("UNAME", username)
//            cv.put("Enroll", enrollment)
//            cv.put("Phone", phone)
//            cv.put("Address", address)
//            db.insert("USERS", null, cv)
//
//            // Clear input fields and set focus to username field
//            editText.setText("")
//            editText2.setText("")
//            editText3.setText("")
//            editText4.setText("")
//            editText.requestFocus()
//
//            // Show toast message indicating successful registration
//            Toast.makeText(applicationContext, "Registration successful.", Toast.LENGTH_SHORT).show()
//
//



        val buttonClick = findViewById<Button>(R.id.button)


        buttonClick.setOnClickListener {
            val intent = Intent(this, SelectPackage::class.java)
            startActivity(intent)
        }
    }
}