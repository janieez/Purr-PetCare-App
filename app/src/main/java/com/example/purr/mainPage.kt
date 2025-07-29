package com.example.purr

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class mainPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_page)
        val imageView = findViewById<ImageView>(R.id.ibtn)
        imageView.setOnClickListener {
            // Create an Intent to start the UserAccountActivity
            val intent = Intent(this, userprofile::class.java) // Ensure this class exists
            startActivity(intent)


            val imageView1 = findViewById<ImageView>(R.id.storee)
            imageView1.setOnClickListener {
                // Create an Intent to start the UserAccountActivity
                val intent = Intent(this, Store::class.java) // Ensure this class exists
                startActivity(intent)

                val imageView2 = findViewById<ImageView>(R.id.mo)
                imageView2.setOnClickListener {
                    // Create an Intent to start the UserAccountActivity
                    val intent = Intent(this, morning::class.java) // Ensure this class exists
                    startActivity(intent)
                }

                val textview1 = findViewById<TextView>(R.id.sun)
                textview1.setOnClickListener {
                    // Create an Intent to start the UserAccountActivity
                    val intent = Intent(this, morning::class.java) // Ensure this class exists
                    startActivity(intent)
                }

            }
        }
    }
}

