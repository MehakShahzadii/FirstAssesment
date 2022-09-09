package com.example.firstassessment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class fourth_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth_page)
        val i=Intent(this,Fifth_page::class.java)
        startActivity(i)
    }
}