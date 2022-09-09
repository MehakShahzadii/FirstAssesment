package com.example.firstassessment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Third_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third_page)
        val i= Intent(this,fourth_page::class.java)
        startActivity(i)
    }
}