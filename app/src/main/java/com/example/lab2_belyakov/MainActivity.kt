package com.example.lab2_belyakov

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView
import com.example.lab2_belyakov.data.DataStorage

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val android = DataStorage.getVersionsList()
        val adapter = AndroidAdapter({position ->
            val intent = Intent(this, DetailsActivity::class.java).apply {
                putExtra("title", position.title)
                putExtra("date", position.release_data)
                putExtra("info", position.description)
                putExtra("image", position.ImageAndroid)            }
            startActivity(intent)
        }, this, android)

        val list = findViewById<RecyclerView>(R.id.androidList)
        list.adapter = adapter

        val decoration = DividerItemDecoration(this, DividerItemDecoration.HORIZONTAL)
        decoration.setDrawable(ContextCompat.getDrawable(this, R.color.grey)!!)
        list.addItemDecoration(decoration)
    }
}