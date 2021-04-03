package com.example.uicomponetexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.uicomponetexample.databinding.ActivityUIComponentExampleBinding

class UIComponentExample : AppCompatActivity() {
    private lateinit var binding: ActivityUIComponentExampleBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUIComponentExampleBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.btnLayout.setOnClickListener {
            Toast.makeText(this,"button clicked", Toast.LENGTH_LONG).show()
        }
        binding.btnBell.setOnClickListener {
            Toast.makeText(this, "Bell clicked", Toast.LENGTH_LONG).show()
        }
    }
}