package com.example.project_grihahub.Tampilan.Layanan.Kendaraan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.activity.ComponentActivity
import com.example.project_grihahub.R
import com.example.project_grihahub.Tampilan.Layanan.PilihJenisActivity


class KendaraanActivity : ComponentActivity() {

    private lateinit var BtnMesin : LinearLayout
    private lateinit var BtnCuciMotor: LinearLayout
    private lateinit var BtnBan : LinearLayout
    private lateinit var BtnRem : LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kendaraan)

        val BtnBack = findViewById<ImageView>(R.id.BtnBack)
        BtnBack.setOnClickListener {
            finish()
        }

        BtnMesin = findViewById(R.id.BtnMesin)
        BtnCuciMotor = findViewById(R.id.BtnCuciMotor)
        BtnBan = findViewById(R.id.BtnBan)
        BtnRem = findViewById(R.id.BtnRem)

        BtnMesin.setOnClickListener {
            startActivity(
                Intent(this, PilihJenisActivity::class.java)
                .putExtra("title", "Perbaikan Mesin" ))
        }
        BtnCuciMotor.setOnClickListener {
            startActivity(
                Intent(this, PilihJenisActivity::class.java)
                .putExtra("title", "Cuci Motor & Mobil" ))
        }
        BtnBan.setOnClickListener {
            startActivity(
                Intent(this, PilihJenisActivity::class.java)
                .putExtra("title", "Service Ban" ))
        }
        BtnRem.setOnClickListener {
            startActivity(
                Intent(this, PilihJenisActivity::class.java)
                    .putExtra("title", "Service Rem" ))
        }

    }
}
