package com.hodiau.timeofyourlife

import android.content.Intent
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
        val intent = Intent(this, ResultActivity::class.java)
        var age:String = etAge.text.toString()
        if(age.trim().length>0) {
            intent.putExtra("age", age.toInt())
            startActivity(intent)
        } else {
            Toast.makeText(this, "Please Enter Your Age", Toast.LENGTH_SHORT).show()
        }
    }
}