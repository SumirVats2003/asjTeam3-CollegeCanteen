package com.example.collegecanteen_otp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_page)
    }

    val image_view = findViewById(R.id.juices) as ImageView
    // Hamza Bhai -- I have straightaway allowed the user to login without otp verification
    // You need to verify the OTP before letting him proceed
    // here is the syntax for linking two activities
    image_view.setOnClickListener {
        val intent = Intent(this, foodOrder::class.java)
        startActivity(intent)
    }
}