package com.example.activitiesandfragments.presentation

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.activitiesandfragments.databinding.ActivityCBinding

class ActivityC : AppCompatActivity() {

    companion object {

        fun newIntentActivityC(context: Context): Intent = Intent(context, ActivityC::class.java)
    }

    private lateinit var binding: ActivityCBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding = ActivityCBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.launchActivityABtn.setOnClickListener { launchActivityA() }
    }

    private fun launchActivityA() {
        val activityAIntent = MainActivity.newIntentActivityA(this)
        activityAIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
        startActivity(activityAIntent)
    }
}