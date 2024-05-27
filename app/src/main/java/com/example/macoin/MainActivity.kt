package com.example.macoin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {

    private lateinit var btnBerlangsung: Button
    private lateinit var btnTercapai: Button
    private lateinit var btnNavigate: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnBerlangsung = findViewById(R.id.btnBerlangsung)
        btnTercapai = findViewById(R.id.btnTercapai)
        btnNavigate = findViewById(R.id.btnNavigate)

        btnBerlangsung.setOnClickListener {
            selectTab(btnBerlangsung, btnTercapai)
        }

        btnTercapai.setOnClickListener {
            selectTab(btnTercapai, btnBerlangsung)
        }

        btnNavigate.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }

    private fun selectTab(selectedButton: Button, unselectedButton: Button) {
        selectedButton.setBackgroundResource(R.drawable.tab_background_selected)
        selectedButton.setTextColor(resources.getColor(android.R.color.white))

        unselectedButton.setBackgroundResource(R.drawable.tab_background_unselected)
        unselectedButton.setTextColor(resources.getColor(android.R.color.black))
    }
}
