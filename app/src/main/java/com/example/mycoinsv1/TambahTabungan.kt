package com.example.mycoinsv1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class TambahTabungan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tambah_tabungan)
        supportActionBar?.hide()

        btn_back2()
        btn_tambahkan_tabungan()
    }

    private fun btn_back2() {
        val btnBack2 = findViewById<ImageButton>(R.id.btn_back2)
        btnBack2.setOnClickListener {
            val intent = Intent(this, Dashboard::class.java)
            startActivity(intent)
        }
    }

    private fun btn_tambahkan_tabungan() {
        val btnTambahkanTabungan = findViewById<Button>(R.id.btnTambahkanTabungan)
        btnTambahkanTabungan.setOnClickListener {
            val intent = Intent(this, Tabungan::class.java)
            startActivity(intent)
        }
    }
}