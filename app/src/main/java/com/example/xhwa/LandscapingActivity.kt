package com.example.xhwa

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LandscapingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landscaping)

        val backButton: Button = findViewById(R.id.back_button)
        backButton.setOnClickListener {
            startActivity(Intent(this, CoursesActivity::class.java))
        }
    }
}
