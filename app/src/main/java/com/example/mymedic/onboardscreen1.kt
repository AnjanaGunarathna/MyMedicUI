package com.example.mymedic

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class onboardscreen1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_onboardscreen1)

        val nextb = findViewById<Button>(R.id.nextb)
        nextb.setOnClickListener {
            val intent = Intent(this, onboardscreen2::class.java)
            startActivity(intent)
        }
        }
    }
