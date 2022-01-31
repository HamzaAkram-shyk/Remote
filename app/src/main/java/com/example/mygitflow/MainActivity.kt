package com.example.mygitflow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    private lateinit var profile: Profile
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        profile = Profile()
        println("Hello")
        println("This is My First Feature")
        println("This is feature Two")
        println("This is New Repo")
    }
}