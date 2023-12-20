package com.example.project_grihahub.Tampilan.Fragment.Profile

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.project_grihahub.R
import com.example.project_grihahub.Tampilan.CustomDialog
import com.project.grihahub.Model.ModelPesanan


class ProfileFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_profile, container, false)

        val BtnKeluar: Button = view.findViewById(R.id.BtnKeluar)

        val customDialog = CustomDialog(requireContext())
        BtnKeluar.setOnClickListener {
            customDialog.show()
        }



        return view
    }
}
