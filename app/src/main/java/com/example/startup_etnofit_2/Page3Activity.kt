package com.example.startup_etnofit_2

import android.app.DatePickerDialog
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton
import java.util.Calendar


class Page3Activity  : AppCompatActivity() {

    private lateinit var yearTextView: TextView
    private var currentYear: Int = Calendar.getInstance().get(Calendar.YEAR)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.page_3)

        yearTextView = findViewById(R.id.yearTextView)
        yearTextView.text = currentYear.toString()

        val buttonCalculate3 = findViewById<MaterialButton>(R.id.button_3)
        buttonCalculate3.setOnClickListener {
            val intent = Intent(this, Page4Activity::class.java)
            startActivity(intent)
        }
    }

    fun onYearClicked(view: android.view.View) {
        val calendar = Calendar.getInstance()
        val year = calendar.get(Calendar.YEAR)
        val month = calendar.get(Calendar.MONTH)
        val day = calendar.get(Calendar.DAY_OF_MONTH)

        val dpd = DatePickerDialog(this,
            { _, yearSelected, _, _ ->
                currentYear = yearSelected
                yearTextView.text = yearSelected.toString()
            }, year, month, day)

        // Set minimum and maximum dates using Calendar
        val minDateCalendar = Calendar.getInstance()
        minDateCalendar.set(2020, 0, 1) // January 1, 2020 (month is 0-indexed)
        dpd.datePicker.minDate = minDateCalendar.timeInMillis

        val maxDateCalendar = Calendar.getInstance()
        maxDateCalendar.set(2030, 11, 31) // December 31, 2030
        dpd.datePicker.maxDate = maxDateCalendar.timeInMillis

        dpd.show()
    }
}