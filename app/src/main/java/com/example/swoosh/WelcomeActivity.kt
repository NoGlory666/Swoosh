package com.example.swoosh

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class WelcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
    }

    fun sendMessage(view: View){
        Toast.makeText(applicationContext, "EuchiMano", Toast.LENGTH_SHORT).show()
    }
}
