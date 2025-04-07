package com.example.startup_etnofit_2

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class ReckoningActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.reckoning)

        val buttonCalculate2 = findViewById<MaterialButton>(R.id.buttonCalculate)
        buttonCalculate2.setOnClickListener {
            val intent = Intent(this, Page3Activity::class.java)
            startActivity(intent)
        }
    }

}