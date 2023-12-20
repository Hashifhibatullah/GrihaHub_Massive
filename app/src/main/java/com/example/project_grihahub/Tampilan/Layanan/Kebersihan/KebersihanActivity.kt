package com.example.project_grihahub.Tampilan.Layanan.Kebersihan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.activity.ComponentActivity
import com.example.project_grihahub.R
import com.example.project_grihahub.Tampilan.Layanan.PilihJenisActivity


class KebersihanActivity : ComponentActivity() {

    private lateinit var BtnDaily : LinearLayout
    private lateinit var BtnSofa : LinearLayout
    private lateinit var BtnKarpet : LinearLayout
    private lateinit var BtnBed : LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kebersihan)

        val BtnBack = findViewById<ImageView>(R.id.BtnBack)
        BtnBack.setOnClickListener {
            finish()
        }

        BtnDaily = findViewById(R.id.BtnDaily)
        BtnSofa = findViewById(R.id.BtnSofa)
        BtnKarpet = findViewById(R.id.BtnKarpet)
        BtnBed = findViewById(R.id.BtnBed)

        BtnDaily.setOnClickListener {
            startActivity(Intent(this, PilihJenisActivity::class.java)
                .putExtra("title", "Daily Cleaning" ))
        }
        BtnKarpet.setOnClickListener {
            startActivity(Intent(this, PilihJenisActivity::class.java)
                .putExtra("title", "Cuci Karpet" ))
        }
        BtnSofa.setOnClickListener {
            startActivity(Intent(this, PilihJenisActivity::class.java)
                .putExtra("title", "Cuci Sofa" ))
        }
        BtnBed.setOnClickListener {
            startActivity(Intent(this, PilihJenisActivity::class.java)
                .putExtra("title", "Cuci Kasur" ))
        }
    }
}
