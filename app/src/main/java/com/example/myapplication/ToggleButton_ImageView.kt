package com.example.myapplication

import android.content.Intent
import android.graphics.Bitmap
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import com.example.myapplication.databinding.ActivityActivityedittextAddtextchangelistnerBinding
import com.example.myapplication.databinding.ActivityToggleButtonImageViewBinding

class ToggleButton_ImageView : AppCompatActivity() {
    private val cameraRequest = 1888
    private val pickImage = 100
    private var imageUri: Uri? = null

    private lateinit var binding: ActivityToggleButtonImageViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityToggleButtonImageViewBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.capture.setOnClickListener {
            val cameraIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(cameraIntent, cameraRequest)

        }
        binding.select.setOnClickListener {
            val gallery = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI)
            val pickImage = 100
            startActivityForResult(gallery, pickImage)

        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == cameraRequest) {
            val photo: Bitmap = data?.extras?.get("data") as Bitmap
            binding.imageView.setImageBitmap(photo)
        }
        if (resultCode == RESULT_OK && requestCode == pickImage)
        {
            imageUri = data?.data

            binding.imageView.setImageURI(imageUri)
        }
    }
}