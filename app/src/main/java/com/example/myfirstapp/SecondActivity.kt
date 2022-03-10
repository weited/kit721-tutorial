package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myfirstapp.databinding.ActivitySecondBinding

//class SecondActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_second)
//    }
//}

class SecondActivity : AppCompatActivity()
{
    private lateinit var ui : ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ui = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(ui.root)

        val name = intent.getStringExtra(USERNAME_KEY)
        ui.lblEnteredText.text = name
    }
}