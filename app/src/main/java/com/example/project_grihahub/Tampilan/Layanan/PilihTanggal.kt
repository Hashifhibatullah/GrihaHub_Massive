package com.example.project_grihahub.Tampilan.Layanan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.ComponentActivity
import com.example.project_grihahub.R
import com.example.project_grihahub.Tampilan.Pembayaran.PembayaranActivity


class PilihTanggal : ComponentActivity() {

    lateinit var BtnLanjut : LinearLayout
    private val Jam by lazy { intent.getStringExtra("Jam") }
    private val Total by lazy { intent.getStringExtra("Total") }
    private lateinit var TxtTotal : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pilih_tanggal)

        val BtnBack = findViewById<ImageView>(R.id.BtnBack)
        BtnBack.setOnClickListener {
            finish()
        }

        TxtTotal = findViewById(R.id.TxtTotal)
        TxtTotal.text = "Rp.${Total.toString()}"
        Log.d("Total", Total.toString())

        BtnLanjut = findViewById(R.id.BtnSelanjutnya)

        BtnLanjut.setOnClickListener {
            startActivity(Intent(this, PembayaranActivity::class.java)
                .putExtra("Total", Total.toString()))
        }
    }
}
