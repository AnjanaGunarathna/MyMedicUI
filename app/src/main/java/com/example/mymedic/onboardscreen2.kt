package com.example.mymedic

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class onboardscreen2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_onboardscreen2)

        val nextb1 = findViewById<Button>(R.id.nextb1)
        nextb1.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }
        }

    }
