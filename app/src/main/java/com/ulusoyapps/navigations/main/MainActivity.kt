package com.ulusoyapps.navigations.main

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ulusoyapps.navigations.R
import com.ulusoyapps.navigations.databinding.ActivityMainBinding
import com.ulusoyapps.navigations.main.epoxy.MainEpoxyController

class MainActivity: AppCompatActivity(), TopicSelectedListener {

    private lateinit var binding: ActivityMainBinding

    private val topicList = listOf(
        Topic(
            title = R.string.title_navigation_bar_mode,
            description = R.string.description_navigation_bar_mode,
            image = android.R.drawable.zoom_plate,
            window1 = R.string.activity_A,
            window1Action = {this@MainActivity.onTopicSelectedWithActivityA()},
            window2 = R.string.activity_B,
            window2Action = {this@MainActivity.onTopicSelectedWithActivityB()},
            window3 = R.string.activity_C,
            window3Action = {this@MainActivity.onTopicSelectedWithActivityC()}
        ),
        Topic(
            title = R.string.title_custom_mode,
            description = R.string.description_custom_mode,
            image = android.R.drawable.zoom_plate,
            window1 = R.string.activity_D,
            window1Action = {this@MainActivity.onTopicSelectedWithActivityD()},
            window2 = R.string.activity_E,
            window2Action = {this@MainActivity.onTopicSelectedWithActivityE()},
            window3 = R.string.activity_F,
            window3Action = {this@MainActivity.onTopicSelectedWithActivityF()}
        )
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val controller = MainEpoxyController(topics = topicList)
        binding.recyclerView.setController(controller)
    }

    override fun onTopicSelectedWithActivityA() {
        startActivity(Intent(this, ActivityA::class.java))
    }

    override fun onTopicSelectedWithActivityB() {
        startActivity(Intent(this, ActivityB::class.java))
    }

    override fun onTopicSelectedWithActivityC() {
        startActivity(Intent(this, ActivityC::class.java))
    }

    override fun onTopicSelectedWithActivityD() {
        startActivity(Intent(this, ActivityD::class.java))
    }

    override fun onTopicSelectedWithActivityE() {
        startActivity(Intent(this, ActivityE::class.java))
    }

    override fun onTopicSelectedWithActivityF() {
        startActivity(Intent(this, ActivityF::class.java))
    }
}