package com.dicoding.asclepius.view

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dicoding.asclepius.R
import com.dicoding.asclepius.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    private lateinit var binding: ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val result = intent.getStringExtra("result")
        val image = intent.getStringExtra("image")
        // TODO: Menampilkan hasil gambar, prediksi, dan confidence score.
        binding.resultText.text = result.toString()
        binding.resultImage.setImageURI(Uri.parse(image.toString()))
    }

}