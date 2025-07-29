package com.example.purr

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Store : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_store)

        val imageView1 = findViewById<ImageView>(R.id.y)
        imageView1.setOnClickListener {
            // Create an Intent to start the UserAccountActivity
            val intent = Intent(this, fooddetails::class.java) // Ensure this class exists
            startActivity(intent)
        }
    }
}