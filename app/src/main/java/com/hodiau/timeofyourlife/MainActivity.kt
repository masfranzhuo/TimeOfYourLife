package com.hodiau.timeofyourlife

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun buCalculate(view:View) {
        var result = calculateTOYL(etAge.text.toString().toInt())
        Toast.makeText(applicationContext, "Calculate Time of Your Life: "+result, Toast.LENGTH_SHORT).show()
    }

    fun calculateTOYL(age:Int):String {
        val hour = Math.ceil(((age*oneYearMinute)/60).toDouble())
        val minute = (age*oneYearMinute)%60
        var toyl = "$hour:$minute"
        return toyl
    }

    companion object {
        val life = 80
        val oneYearMinute = 24*60/life
    }
}