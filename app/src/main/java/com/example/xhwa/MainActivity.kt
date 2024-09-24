package com.example.xhwa

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val exploreButton: Button = findViewById(R.id.explore_button)
        exploreButton.setOnClickListener {
            // Navigate to the courses page
            val intent = Intent(this, CoursesActivity::class.java)
            startActivity(intent)
        }
    }
}
