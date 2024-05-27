package com.example.macoin

import android.app.DatePickerDialog
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class AddSavingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_savings_detail)

        val backButton: ImageButton = findViewById(R.id.backButton)
        val etTanggal: EditText = findViewById(R.id.etTanggal)

        backButton.setOnClickListener {
            // Handle back button click
            finish()
        }

        etTanggal.setOnClickListener {
            // Handle date picker dialog
            val calendar = Calendar.getInstance()
            val year = calendar.get(Calendar.YEAR)
            val month = calendar.get(Calendar.MONTH)
            val day = calendar.get(Calendar.DAY_OF_MONTH)

            val datePickerDialog = DatePickerDialog(this, { _, selectedYear, selectedMonth, selectedDay ->
                val formattedDate = "${selectedDay}/${selectedMonth + 1}/${selectedYear}"
                etTanggal.setText(formattedDate)
            }, year, month, day)
            datePickerDialog.show()
        }
    }
}
