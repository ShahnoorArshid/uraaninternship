package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.content.res.AppCompatResources

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button= findViewById<Button>(R.id.button)
        button.setOnClickListener {
            Toast.makeText(this,"You Clicked Button",Toast.LENGTH_LONG).show()
            button.text = "Again Click"
            button.setTextColor( AppCompatResources.getColorStateList(this,R.color.black))
        }
        val button2=findViewById<Button>(R.id.button2)
        button2.setOnClickListener {
            val intent=Intent (this,EditText_2::class.java)
            startActivity(intent)
            finish()

        }

    }
}