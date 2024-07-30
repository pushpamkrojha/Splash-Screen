package com.example.splashscreen

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        //val mail = findViewById<ImageView>(R.id.image1)

        Handler().postDelayed({
            val intent = Intent(this,SecondActivity::class.java)
            startActivity(intent)
            finish()
        },3000)

    }
}