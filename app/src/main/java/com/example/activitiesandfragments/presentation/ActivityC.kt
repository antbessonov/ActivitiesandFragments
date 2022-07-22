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

    private val binding by lazy { ActivityCBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(binding.root)

        binding.launchActivityABtn.setOnClickListener { launchActivityA() }
    }

    private fun launchActivityA() {
        val activityAIntent = MainActivity.newIntentActivityA(this)
        activityAIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
        startActivity(activityAIntent)
    }
}