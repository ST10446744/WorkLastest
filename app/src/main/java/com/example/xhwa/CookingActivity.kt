package com.example.xhwa

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class CookingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cooking)

        findViewById<Button>(R.id.back_button).setOnClickListener {
            startActivity(Intent(this, CoursesActivity::class.java))
        }
    }
}
