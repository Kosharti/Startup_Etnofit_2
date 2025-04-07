package com.example.startup_etnofit_2

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.checks)

        val buttonCalculate = findViewById<MaterialButton>(R.id.buttonCalculateChecks)
        buttonCalculate.setOnClickListener {
            val intent = Intent(this, ReckoningActivity::class.java)
            startActivity(intent)
        }
    }
}
