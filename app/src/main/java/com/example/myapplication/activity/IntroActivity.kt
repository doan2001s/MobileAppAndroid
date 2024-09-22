package com.example.myapplication.activity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.R
import java.util.logging.Logger
import android.util.Log
import com.example.myapplication.Login.loginActivity

class IntroActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)
        val button = findViewById<Button>(R.id.btnSame)
        button.setOnClickListener {
            // Tạo intent để chuyển sang login
            Log.d("MainActivity", "Button clicked!")
            val intent = Intent(this, loginActivity::class.java)
            startActivity(intent)
        }
    }
}