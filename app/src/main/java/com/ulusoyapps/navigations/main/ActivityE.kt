package com.ulusoyapps.navigations.main

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ulusoyapps.navigations.R
import com.ulusoyapps.navigations.databinding.ActivityABinding
import com.ulusoyapps.navigations.databinding.ActivityEBinding
import com.ulusoyapps.navigations.databinding.ActivityMainBinding
import com.ulusoyapps.navigations.main.epoxy.MainEpoxyController

class ActivityE: AppCompatActivity() {

    private lateinit var binding: ActivityEBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}