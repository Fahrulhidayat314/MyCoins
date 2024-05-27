package com.example.macoin

import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {

    private lateinit var btnBerlangsung: Button
    private lateinit var btnTercapai: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnBerlangsung = findViewById(R.id.btnBerlangsung)
        btnTercapai = findViewById(R.id.btnTercapai)

        btnBerlangsung.setOnClickListener {
            selectTab(btnBerlangsung, btnTercapai)
        }

        btnTercapai.setOnClickListener {
            selectTab(btnTercapai, btnBerlangsung)
        }
    }

    private fun selectTab(selectedButton: Button, unselectedButton: Button) {
        selectedButton.setBackgroundResource(R.drawable.tab_background_selected)
        selectedButton.setTextColor(resources.getColor(android.R.color.white))

        unselectedButton.setBackgroundResource(R.drawable.tab_background_unselected)
        unselectedButton.setTextColor(resources.getColor(android.R.color.black))
    }
}