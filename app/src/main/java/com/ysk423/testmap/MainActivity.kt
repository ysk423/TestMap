package com.ysk423.testmap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv:TextView = findViewById(R.id.tv)

        //Mapを用意
        //val like = mapOf("apple" to "takashi", "melon" to "miki", "orange" to "naoto")
        //val food = mapOf("apple" to 200, "melon" to 800, "orange" to 150)
        val item = mapOf(1 to "ball", 2 to "Toast", 3 to "apple")

        //TextViewに表示
        //tv.text = food["apple"].toString
        tv.text = item[2]

    }
}