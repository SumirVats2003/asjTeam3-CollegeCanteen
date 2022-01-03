package com.example.collegecanteen_otp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class CollegeCanteenOTP : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_college_canteen_otp)
        val image_view = findViewById(R.id.validateOtp) as ImageView

        image_view.setOnClickListener {
            val intent = Intent(this, MainPage::class.java)
            startActivity(intent)
        }
    }
}