package com.example.practicum

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class MainScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)
        val txtDay = findViewById<>(R.id.txtDay)
        val txtMin = findViewById<>(R.id.txtMin)
        val txtMax = findViewById<>(R.id.txtMax)
        val txtWeatherCondition = findViewById<>(R.id.txtWeatherCondition)
        val txtViewMessage = findViewById<>(R.id.txtViewMessage)
        val btnBack = findViewById<>(R.id.btnBack)
        val btnClear = findViewById<>(R.id.btnClear)
        val btnDisplay = findViewById<>(R.id.btnDisplay)
        val validDays = arrayOf("Monday", "Tuesday", "Saturday", "Sunday")
        val validMinimumTemperature = arrayOf("12", "15", "10", "10")
        val validMaximumTemperature = arrayOf("25", "29", "18", "16")
        val validWeatherCondition = arrayOf("Sunny", "Sunny", "Raining", "Cold")
        btnDisplay.setOnClickListener {
            val day = txtDay.text.toSrting()
            val min = txtMin.text.toString()
            val max = txtMax.text.toString()
            val intent = Intent(this, MainScreen::class.java)
            startActivity(intent)
        } else run {
            getString(R.string.click_the_display_button_to_show_the_detailed_temperature).also { txtViewMessage.text = it }
        }
        btnClear.setOnClickListener {
            txtDay.text.clear()
            txtMin.text.clear()
            txtMax.text.clear()
            txtViewMessage.text.clear()
            txtWeatherCondition.text.clear()
        }
        btnBack SetOnClickListener{ finish()
        }
    }
}