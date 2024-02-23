package com.example.com3025_midterm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val textView = findViewById<TextView>(R.id.textView)
        textView.text = "This is mid-term exam"
    }
}