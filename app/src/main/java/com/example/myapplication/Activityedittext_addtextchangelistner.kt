package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.widget.addTextChangedListener

class Activityedittext_addtextchangelistner : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activityedittext_addtextchangelistner)
        val et_name = findViewById<EditText>(R.id.editTextTextPersonName)
        val et_email = findViewById<EditText>(R.id.ed_email)
        val et_password = findViewById<EditText>(R.id.et_password)

        val tv_name = findViewById<TextView>(R.id.tv_name)
        val tv_email = findViewById<TextView>(R.id.tv_email)
        val tv_password = findViewById<TextView>(R.id.tv_password)



        et_name.addTextChangedListener {
            tv_name.text = it

        }

        et_email.addTextChangedListener {
            tv_email.text = it
        }
        et_password.addTextChangedListener {
            tv_password.text = it
        }

        val button=findViewById<Button>(R.id.button6)
        button.setOnClickListener {
            val intent=Intent(this,ToggleButton_ImageView::class.java)
            startActivity(intent)
        }



    }

}





