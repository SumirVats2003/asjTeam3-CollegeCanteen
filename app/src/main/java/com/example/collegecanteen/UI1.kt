package com.example.collegecanteen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.firebase.auth.FirebaseAuth


class UI1 : AppCompatActivity() {
    lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ui1)

        auth = FirebaseAuth.getInstance()
        var currentUser = auth.currentUser

//        Reference
        //val logout=findViewById<Button>(R.id.idLogout)

        if (currentUser == null) {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener{
            val intent = Intent(this, UI2::class.java)
            startActivity(intent)
        }
    }
}