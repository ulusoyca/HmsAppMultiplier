package com.ulusoyapps.navigations.main

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ulusoyapps.navigations.databinding.ActivityCBinding

class ActivityC : AppCompatActivity() {

    private lateinit var binding: ActivityCBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.root.setOnClickListener {
            startActivity(Intent(this, ActivityA::class.java))
        }
    }
}
