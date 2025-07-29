package com.example.purr

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class paysuccess : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_paysuccess)
        var button1 = findViewById<Button>(R.id.home)
        button1.setOnClickListener {
            val intent = Intent(this, mainPage::class.java)
            startActivity(intent)
            }
    }
}