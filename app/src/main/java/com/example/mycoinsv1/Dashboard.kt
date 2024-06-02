package com.example.mycoinsv1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Dashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_dashboard)
        supportActionBar?.hide()

        btnBukaTabunganListener()

    }

    private fun btnBukaTabunganListener() {
        val btnBukaTabungan = findViewById<Button>(R.id.btnBukaTabungan)
        btnBukaTabungan.setOnClickListener {
            val intent = Intent(this, TambahTabungan::class.java)
            startActivity(intent)
        }

    }
}
