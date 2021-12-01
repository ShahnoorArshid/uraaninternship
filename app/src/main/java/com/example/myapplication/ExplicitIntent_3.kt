package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ExplicitIntent_3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ExplicitIntent3)

        val button=findViewById<Button>(R.id.button5)
        button.setOnClickListener {
            val intent=Intent(this,Activityedittext_addtextchangelistner::class.java)
            startActivity(intent)

        }



        val name=findViewById<TextView>(R.id.textView2)
        val email=findViewById<TextView>(R.id.textView3)
        val password=findViewById<TextView>(R.id.textView4)

        name.text=intent?.getStringExtra("name")
        email.text=intent?.getStringExtra("email")
        password.text=intent?.getStringExtra("password")


    }
}