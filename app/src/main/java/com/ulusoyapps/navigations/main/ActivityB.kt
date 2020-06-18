package com.ulusoyapps.navigations.main

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ulusoyapps.navigations.databinding.ActivityBBinding

class ActivityB : AppCompatActivity() {

    private lateinit var binding: ActivityBBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.root.setOnClickListener {
            startActivity(Intent(this, ActivityC::class.java))
        }
    }
}
