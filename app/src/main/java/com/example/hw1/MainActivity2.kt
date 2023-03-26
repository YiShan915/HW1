package com.example.hw1

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val editTextSize = findViewById<EditText>(R.id.editTextSize)
        val editTextColor= findViewById<EditText>(R.id.editTextColor)







        val button = findViewById<Button>(R.id.button2)
        button.setOnClickListener {
            val size = editTextSize.text.toString()
            val color = editTextColor.text.toString()

            val bundle = Bundle()
            bundle.putString("EditSize", size)
            bundle.putString("EditColor", color)
            val intent =Intent().putExtras(bundle)
            setResult(Activity.RESULT_OK, intent.putExtras(bundle))
            finish()
        }

        intent?.extras?.let {
            val String = it.getString("EditName")
            val String2 = it.getString("EditSex")
        }


    }
}