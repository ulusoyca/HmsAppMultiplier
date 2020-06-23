package com.ulusoyapps.navigations.main

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ulusoyapps.navigations.R
import com.ulusoyapps.navigations.databinding.ActivityEBinding

class ActivityE : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityEBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.run {
            activityName.text = getString(R.string.activity_E)
            botton1.run {
                text = getString(R.string.activity_D)
                setOnClickListener {
                    startActivity(Intent(this@ActivityE, ActivityD::class.java))
                }
            }
            botton2.run {
                text = getString(R.string.activity_F)
                setOnClickListener {
                    startActivity(Intent(this@ActivityE, ActivityF::class.java))
                }
            }
            price.text = getString(R.string.price_200_euros)
        }
    }
}
