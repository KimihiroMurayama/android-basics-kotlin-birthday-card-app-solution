package com.example.recycleviewstudy

import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var LV: ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        LV = findViewById<View>(R.id.lv) as ListView
        val arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, foods)
        LV.adapter = arrayAdapter
    }

    companion object {
        
        private val foods = arrayOf("リンゴ", "あ", "i", "う", "あ", "i", "う")
    }
}
