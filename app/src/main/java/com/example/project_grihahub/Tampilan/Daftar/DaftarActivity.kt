package com.example.project_grihahub.Tampilan.Daftar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.ComponentActivity
import com.example.project_grihahub.R
import com.example.project_grihahub.Tampilan.Login.LoginActivity


class DaftarActivity : ComponentActivity() {

    lateinit var BtnDaftar : Button
    lateinit var EdNama : EditText
    lateinit var EdEmail : EditText
    lateinit var EdTelphon : EditText
    lateinit var EdPass : EditText
    lateinit var EdKnfPass : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar)

        EdNama = findViewById(R.id.EdNama)
        EdEmail = findViewById(R.id.EdEmail)
        EdTelphon =findViewById(R.id.EdPhone)
        EdPass = findViewById(R.id.EdPassword)
        EdKnfPass = findViewById(R.id.EdKnfPass)
        BtnDaftar = findViewById(R.id.btnDaftar)

        BtnDaftar.setOnClickListener {
            when{
                EdNama.text.toString() == "" ->{
                    EdNama.error = "Nama Tidak Boleh Kosong!"
                }
                EdEmail.text.toString() == "" ->{
                    EdEmail.error = "Email Tidak Boleh Kosong!"
                }
                EdTelphon.text.toString() == "" ->{
                    EdTelphon.error = "No Telpol Tidak Boleh Kosong!"
                }
                EdPass.text.toString() == "" -> {
                    EdPass.error = "Password Tidak Boleh Kosong!"
                }
                EdKnfPass.text.toString() != EdPass.text.toString() -> {
                    EdKnfPass.error = "Password Tidak Sama"
                }
                else -> {
                    startActivity(Intent(this, LoginActivity::class.java))
                }
            }

        }
    }
}
