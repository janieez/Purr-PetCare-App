package com.example.purr

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class payment : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_payment)
        var button1 = findViewById<Button>(R.id.btn_payment)
        button1.setOnClickListener {
            val intent = Intent(this, paysuccess::class.java)
            startActivity(intent)
           }
    }
}