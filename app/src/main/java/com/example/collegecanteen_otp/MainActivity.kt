package com.example.collegecanteen_otp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import java.lang.Double.parseDouble

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val image_view = findViewById(R.id.sendOtp) as ImageView

        image_view.setOnClickListener {
            val intent = Intent(this, CollegeCanteenOTP::class.java)
            startActivity(intent)
        }

//        fun checkPhone(view: android.view.View) {
//            var phone = image_view.toString()
//            var numeric = true
//            if(phone.length == 10) {
//                try {
//                    val num = parseDouble(phone)
//                } catch (e: NumberFormatException) {
//                    numeric = false
//                }
//            }
//            if (numeric) {
//                nextActivity()
//            }
//        }
    }
}
