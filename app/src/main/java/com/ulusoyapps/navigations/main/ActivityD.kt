package com.ulusoyapps.navigations.main

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ulusoyapps.navigations.R
import com.ulusoyapps.navigations.databinding.ActivityDBinding

class ActivityD : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityDBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.run {
            activityName.text = getString(R.string.activity_D)
            botton1.run {
                text = getString(R.string.activity_E)
                setOnClickListener {
                    startActivity(Intent(this@ActivityD, ActivityE::class.java))
                }
            }
            botton2.run {
                text = getString(R.string.activity_F)
                setOnClickListener {
                    startActivity(Intent(this@ActivityD, ActivityF::class.java))
                }
            }
            price.text = getString(R.string.price_100_euros)
        }
    }
}
