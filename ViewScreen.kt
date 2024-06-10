package com.example.practicum

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle

class ViewScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_screen)
        //Weather data
        val days= arrayOf("Monday", "Tuesday", "Saturday", "Sunday")
        val min= arrayOf("12","15","10","10")
        val max= arrayOf("25","29","18","16")
        val weatherConditions= arrayOf("Sunny","Sunny","Raining","Cold")
        override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
            super.onCreate(savedInstanceState, persistentState)
            setContentView(R.layout.activity_view_screen)
            //Start Detailed view activity
            //Pass weather data as extras to detailed view activity if needed
        }
        //Button click listener to the exit the app
        exitButton.setOnClickListener{finish()
        }
    }
}