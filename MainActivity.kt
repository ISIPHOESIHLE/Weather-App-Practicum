package com.example.practicum

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnNext=findViewById<Button>(R.id.btnNext)
        val btnExit=findViewById<Button>(R.id.btnExit)
        // Set an OnClickListener for the Next button to navigate to main screen
        btnNext?.setOnClickListener{
            val intent= Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        //Set an OnClickListener for the Exit button to close the application
        btnExit?.setOnClickListener {
            finish()
        }
    }
}