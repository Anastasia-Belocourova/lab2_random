package com.example.random2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.btn)
        val textView = findViewById<TextView>(R.id.textView)
        val sum = findViewById<TextView>(R.id.sumTextView)
        var count =0

        btn.setOnClickListener {
            val random = Random.nextInt(10, 99) +1
            textView.text = random.toString()
            count++
            sum.text = "Количество сгенерированных чисел: " + count.toString()
        }
    }
}