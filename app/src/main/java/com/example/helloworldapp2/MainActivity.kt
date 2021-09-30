package com.example.helloworldapp2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var editText: EditText
    lateinit var button: Button
    lateinit var textView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText=findViewById(R.id.edname)
        button=findViewById(R.id.btn)
        textView=findViewById(R.id.tv)

        button.setOnClickListener {
            textView.setText("Hello ${editText.text}!")
        }
    }
}