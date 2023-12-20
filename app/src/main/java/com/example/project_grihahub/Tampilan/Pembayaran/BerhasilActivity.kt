package com.example.project_grihahub.Tampilan.Pembayaran

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.activity.ComponentActivity
import androidx.appcompat.app.AppCompatActivity
import com.example.project_grihahub.R
import com.example.project_grihahub.Tampilan.Dashboard.Dashboard


class BerhasilActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_berhasil)

        val BtnPesanan = findViewById<LinearLayout>(R.id.BtnPesanan)
        BtnPesanan.setOnClickListener {
            val dashboardActivity = Intent(this, Dashboard::class.java)
            dashboardActivity.putExtra("fragmentToLoad", "PesananFragment")
            startActivity(dashboardActivity)
        }
    }
}
