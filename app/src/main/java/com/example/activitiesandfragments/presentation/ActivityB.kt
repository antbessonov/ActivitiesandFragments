package com.example.activitiesandfragments.presentation

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.activitiesandfragments.databinding.ActivityBBinding

class ActivityB : AppCompatActivity() {

    companion object {

        fun newIntentActivityB(context: Context): Intent = Intent(context, ActivityB::class.java)
    }

    private val binding by lazy { ActivityBBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(binding.root)

        binding.launchActivityCBtn.setOnClickListener { launchActivityC() }
    }

    private fun launchActivityC() {
        val activityCIntent = ActivityC.newIntentActivityC(this)
        startActivity(activityCIntent)
    }
}