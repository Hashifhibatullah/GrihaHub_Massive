package com.example.project_grihahub.Tampilan.Landing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import com.example.project_grihahub.R
import com.example.project_grihahub.Tampilan.Daftar.DaftarActivity
import com.example.project_grihahub.Tampilan.Login.LoginActivity


class Landing : ComponentActivity() {

    lateinit var BtnMasuk : Button
    lateinit var BtnDaftar : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landing)

        BtnDaftar = findViewById(R.id.btnDaftar)
        BtnMasuk = findViewById(R.id.btnMasuk)

        BtnDaftar.setOnClickListener {
            startActivity(Intent(this, DaftarActivity::class.java))
        }
        BtnMasuk.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }
}
