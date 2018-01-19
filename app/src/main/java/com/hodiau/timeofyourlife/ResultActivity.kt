package com.hodiau.timeofyourlife

import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val bundle = intent.extras
        calculateTOYLTP(bundle.getInt("age"))
    }

    fun calculateTOYLTP(age:Int) {
        val hour = Math.ceil(((age*oneYearMinute)/60).toDouble()).toInt()
        val minute = (age*oneYearMinute)%60

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            timePicker.hour = hour
            timePicker.minute = minute
        } else {
            timePicker.currentHour = 8
            timePicker.currentMinute = minute
        }
    }

    companion object {
        val life = 80
        val oneYearMinute = 24*60/life
    }
}