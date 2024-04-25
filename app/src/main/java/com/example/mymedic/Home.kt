package com.example.mymedic

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val navi1 = findViewById<ImageView>(R.id.navi1)
        navi1.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }
        val navi2 = findViewById<ImageView>(R.id.navi2)
        navi2.setOnClickListener {
            val intent = Intent(this, Health::class.java)
            startActivity(intent)
        }
        val navi3 = findViewById<ImageView>(R.id.navi3)
        navi3.setOnClickListener {
            val intent = Intent(this, Doctor::class.java)
            startActivity(intent)
        }
        val navi4 = findViewById<ImageView>(R.id.navi4)
        navi4.setOnClickListener {
            val intent = Intent(this, Profile::class.java)
            startActivity(intent)
        }
        val d1 = findViewById<ImageView>(R.id.d1)
        d1.setOnClickListener {
            val intent = Intent(this, Doctor::class.java)
            startActivity(intent)
        }
        val profile1 = findViewById<ImageView>(R.id.profile1)
        profile1.setOnClickListener {
            val intent = Intent(this, Profile::class.java)
            startActivity(intent)
        }

    }
}