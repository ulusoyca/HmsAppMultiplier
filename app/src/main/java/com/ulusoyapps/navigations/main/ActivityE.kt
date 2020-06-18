package com.ulusoyapps.navigations.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ulusoyapps.navigations.databinding.ActivityEBinding

class ActivityE : AppCompatActivity() {

    private lateinit var binding: ActivityEBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
