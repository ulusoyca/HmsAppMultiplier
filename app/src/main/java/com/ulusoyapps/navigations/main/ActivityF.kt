package com.ulusoyapps.navigations.main

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ulusoyapps.navigations.R
import com.ulusoyapps.navigations.databinding.ActivityFBinding

class ActivityF : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityFBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.run {
            activityName.text = getString(R.string.activity_F)
            botton1.run {
                text = getString(R.string.activity_D)
                setOnClickListener {
                    startActivity(Intent(this@ActivityF, ActivityD::class.java))
                }
            }
            botton2.run {
                text = getString(R.string.activity_E)
                setOnClickListener {
                    startActivity(Intent(this@ActivityF, ActivityE::class.java))
                }
            }
            price.text = getString(R.string.price_300_euros)
        }
    }
}
