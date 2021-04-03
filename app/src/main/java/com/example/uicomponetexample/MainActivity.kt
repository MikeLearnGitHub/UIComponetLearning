package com.example.uicomponetexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.uicomponetexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        initView()
    }

    private fun initView() {
        binding.btnUIComponent.setOnClickListener {
            val intent = Intent(this, UIComponentExample::class.java)
            startActivity(intent)
        }
        binding.btnToast.setOnClickListener {
            val toast = Toast.makeText(this,"hello", Toast.LENGTH_LONG)
            toast.show()

        }
    }
}