package com.example.lab2_belyakov

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailsActivity: AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.details_activiy)
        findViewById<TextView>(R.id.title).text = intent.getStringExtra("title")
        findViewById<TextView>(R.id.overview_text).text = intent.getStringExtra("info")
        findViewById<TextView>(R.id.date).text = intent.getStringExtra("date")
        findViewById<ImageView>(R.id.avatar).setImageResource(intent.getIntExtra("image", 0))
        findViewById<ImageView>(R.id.poster).setImageResource(R.drawable.rain)
    }
}