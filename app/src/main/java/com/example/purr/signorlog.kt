package com.example.purr

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class signorlog : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_signorlog)
        var button1 = findViewById<Button>(R.id.btn_sign_in)
        button1.setOnClickListener {
            val intent = Intent(this, signIn::class.java)
            startActivity(intent)


            var button2 = findViewById<Button>(R.id.btn_create_account)
            button2.setOnClickListener {
                val intent = Intent(this, signup::class.java)
                startActivity(intent)
           }
        }
    }

}