package com.example.activitiesandfragments.presentation

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.activitiesandfragments.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    companion object {

        fun newIntentActivityA(context: Context): Intent = Intent(context, MainActivity::class.java)
    }

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.launchActivityBBtn.setOnClickListener { launchActivityB() }
    }

    private fun launchActivityB() {
        val activityBIntent = ActivityB.newIntentActivityB(this)
        startActivity(activityBIntent)
    }
}