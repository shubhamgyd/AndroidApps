package com.example.birthdaygreet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val editText: EditText = findViewById(R.id.editText)
    fun createBirthdayCard(view: View) {

        val enteredData: String = editText.text.toString()


        Toast.makeText(this, enteredData, Toast.LENGTH_LONG).show()
    }
    }
}

