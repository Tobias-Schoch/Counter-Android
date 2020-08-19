package com.tobiasschoch.counter

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val plusButton = findViewById<Button>(R.id.plusButton)
        val minusButton = findViewById<Button>(R.id.minusButton)
        val deleteButton = findViewById<Button>(R.id.deleteButton)
        val textView: TextView = findViewById<TextView>(R.id.textView)

        val sharedPreference =  getSharedPreferences("PREFERENCE_NAME", Context.MODE_PRIVATE)
        var editor = sharedPreference.edit()
        var counter = 0
        textView.text = sharedPreference.getInt("counter", "1".toInt()).toString()


        plusButton.setOnClickListener {
            counter = textView.text.toString().toInt()
            counter += 1
            textView.text = counter.toString()
            editor.putInt("counter", counter)
            editor.commit()
        }

        minusButton.setOnClickListener {
            counter = textView.text.toString().toInt()
            counter -= 1
            textView.text = counter.toString()
            editor.putInt("counter", counter)
            editor.commit()
        }

        deleteButton.setOnClickListener {
            textView.text = "0"
            editor.putInt("counter", "0".toInt())
            editor.commit()
        }
    }
}