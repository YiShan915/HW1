package com.example.hw1

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val editTextPersonName = findViewById<EditText>(R.id.editTextPersonName)
        val editTextPersonSex = findViewById<EditText>(R.id.editTextPersonSex)

        val button = findViewById<Button>(R.id.button)
            button.setOnClickListener {

                val name = editTextPersonName.text.toString()
                val sex = editTextPersonSex.text.toString()


                val bundle = Bundle()
                bundle.putString("EditName", name)
                bundle.putString("EditSex", sex)

                val intent =Intent(this, MainActivity2::class.java)
                intent.putExtras(bundle)
                startActivityForResult(intent, 1)
        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        data?.extras?.let {

            if (requestCode == 1 && resultCode ==Activity.RESULT_OK)
            {
                findViewById<TextView>(R.id.textView).text=
                    "尺寸: ${it.getString("EditSize")}\n\n"+
                    "顏色: ${it.getString("EditColor")}\n\n"
            }


        }
    }
}