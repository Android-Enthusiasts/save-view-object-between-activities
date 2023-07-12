package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.LinearLayoutCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        SampleApplication.view?.let {
            val textView = it as TextView

            Toast.makeText(this, textView.text.toString(), Toast.LENGTH_SHORT).show()


        }

    }
}