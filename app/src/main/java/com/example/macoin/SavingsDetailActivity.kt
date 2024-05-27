package com.example.macoin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView

class SavingsDetailActivity : AppCompatActivity() {

    private lateinit var textSavingsName: TextView
    private lateinit var textSavingsDetails: TextView
    private lateinit var buttonAddSavings: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_savings_detail)

        textSavingsName = findViewById(R.id.text_savings_name)
        textSavingsDetails = findViewById(R.id.text_savings_details)
        buttonAddSavings = findViewById(R.id.button_add_savings)

        val savings = intent.getParcelableExtra<Savings>("savings")

        textSavingsName.text = savings?.name
        textSavingsDetails.text = savings?.details

        buttonAddSavings.setOnClickListener {
            // Handle adding savings logic
        }
    }
}