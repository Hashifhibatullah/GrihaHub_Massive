package com.example.project_grihahub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import androidx.activity.ComponentActivity
import com.example.project_grihahub.R
import com.example.project_grihahub.Tampilan.Landing.Landing

class MainActivity : ComponentActivity() {
    //timer
    private val SPLASH_TIME_OUT:Long = 3000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //jalankan landing setelah loding

        Handler().postDelayed({
            startActivity(Intent(this@MainActivity, Landing::class.java))
            finish()
        }, SPLASH_TIME_OUT)
    }
}
