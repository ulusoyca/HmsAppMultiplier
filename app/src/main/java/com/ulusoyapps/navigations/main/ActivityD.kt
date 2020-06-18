package com.ulusoyapps.navigations.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ulusoyapps.navigations.databinding.ActivityDBinding

class ActivityD : AppCompatActivity() {

    private lateinit var binding: ActivityDBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
