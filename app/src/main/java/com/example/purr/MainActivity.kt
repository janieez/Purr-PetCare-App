package com.example.purr

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Delay for 2 seconds (2000 milliseconds) before moving to the next page
        Handler(Looper.getMainLooper()).postDelayed({
            // Start the next activity
            val intent = Intent(this, onbord::class.java)
            startActivity(intent)
            // Close the splash activity so the user can't go back to it
            finish()
        }, 2000) // 2-second delay
    }
}