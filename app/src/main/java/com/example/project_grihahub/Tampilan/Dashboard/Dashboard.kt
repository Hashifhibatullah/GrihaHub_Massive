package com.example.project_grihahub.Tampilan.Dashboard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.project_grihahub.R
import com.example.project_grihahub.Tampilan.Fragment.Beranda.BerandaFragment
import com.example.project_grihahub.Tampilan.Fragment.Pesanan.PesananFragment
import com.example.project_grihahub.Tampilan.Fragment.Profile.ProfileFragment
import com.example.project_grihahub.databinding.ActivityDashBoardBinding
import com.google.android.material.bottomnavigation.BottomNavigationView


class Dashboard : AppCompatActivity() {

    lateinit var fragmentHome : Fragment
    val fragmentPesanan : Fragment = PesananFragment()
    val fragmentProf : Fragment = ProfileFragment()
    val fm: FragmentManager = supportFragmentManager
    lateinit var active : Fragment

//    private lateinit var binding : ActivityDashBoardBinding
    private lateinit var menu : Menu
    private lateinit var menuItem: MenuItem
    private lateinit var bottomNavigationView: BottomNavigationView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dash_board)

// Ganti penggunaan binding menjadi findViewById
        val navView: BottomNavigationView = findViewById(R.id.nav)


        replaceFragment(BerandaFragment(), "BerandaFragment")

        navView.setOnNavigationItemSelectedListener {
          when(it.itemId){
              R.id.BtnBeranda -> replaceFragment(BerandaFragment(), "BerandaFragment")
              R.id.BtnPesanan -> replaceFragment(PesananFragment(),"PesananFragment")
              R.id.BtnProfile -> replaceFragment(ProfileFragment(),"ProfileFragment")

              else -> {

              }
          }
            true
        }
        // Periksa apakah ada fragment yang perlu di-load dari Intent
        val fragmentToLoad = intent.getStringExtra("fragmentToLoad")
        if (fragmentToLoad != null) {
            when (fragmentToLoad) {
                "PesananFragment" -> {
                    replaceFragment(PesananFragment(), "PesananFragment")
                    // Aktifkan menu Pesanan di Bottom Navigation
                    navView.selectedItemId = R.id.BtnPesanan
                }
                // Tambahkan case lain jika diperlukan
            }
        }
    }
    private fun replaceFragment(fragment: Fragment, tag: String){
        val fragmentManager = supportFragmentManager
        val fragmentTransition = fragmentManager.beginTransaction()
        fragmentTransition.replace(R.id.frame_layout,fragment)
        fragmentTransition.commit()
    }
}
