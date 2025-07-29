package com.example.purr

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_signup)
        var button1 = findViewById<Button>(R.id.btn_sign_up)
        button1.setOnClickListener {
            val intent = Intent(this, mainPage::class.java)
            startActivity(intent)
            }


        }
    }
