package com.example.activitiesandfragments.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.activitiesandfragments.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            launchAFragment()
        }
    }

    override fun onBackPressed() {
        if (isAFragment()) {
            this.finish()
        }
        super.onBackPressed()
    }

    private fun launchAFragment() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.main_container, AFragment.newInstance())
            .addToBackStack(AFragment.NAME)
            .commit()
    }

    private fun isAFragment(): Boolean =
        supportFragmentManager.findFragmentById(R.id.main_container) is AFragment
}