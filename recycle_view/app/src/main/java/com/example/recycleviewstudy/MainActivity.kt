package com.example.recycleviewstudy

import CustomAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager

class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /// 表示するテキスト配列を作る [テキスト１, テキスト２, ....]
        val list = Array<String>(10) {"テキスト$it"}
        val adapter = CustomAdapter(list)
        val layoutManager = LinearLayoutManager(this )

        // アダプターとレイアウトマネージャーをセット
        simpleRecyclerView.layoutManager = layoutManager
        simpleRecyclerView.adapter = adapter
        simpleRecyclerView.setHasFixedSize(true)

        // インターフェースの実装
        adapter.setOnItemClickListener(object:CustomAdapter.OnItemClickListener{
            override fun onItemClickListener(view: View, position: Int, clickedText: String) {
                Toast.makeText(applicationContext, "${clickedText}がタップされました", Toast.LENGTH_LONG).show()
            }
        })
    }
}