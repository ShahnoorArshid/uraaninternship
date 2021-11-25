package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class EditText_2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)
        val button = findViewById<Button>(R.id.button3)
        val name= findViewById<EditText>(R.id.editTextTextPersonName)
        val email=findViewById<EditText>(R.id.editTextTextPersonName2)
        val password=findViewById<EditText>(R.id.editTextTextPersonName3)
        button.setOnClickListener {
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
            finish()

        }

        val button2 = findViewById<Button>(R.id.button4)
        button2.setOnClickListener {
            val abc = Intent(this, ExplicitIntent_3::class.java)
            abc.putExtra("email",email.text.toString())
            abc.putExtra("name",name.text.toString())
            abc.putExtra("password",password.text.toString())
            startActivity(abc)


        }


    }
}