package com.example.dashboardislami.menu.Doa

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.example.dashboardislami.databinding.ActivityDetailDoaBinding
import com.example.dashboardislami.menu.Doa.model.DoaModel

class DetailDoaActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailDoaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailDoaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // variable untuk menerima data dari kiriman adapter
        val doa = intent.getParcelableExtra<DoaModel>("extra_doa") as DoaModel


        // menentukan actionbar dengan toolbar pada layout
        setSupportActionBar(binding.toolbarDetail)
        supportActionBar?.title = doa.title


        // menampilkan data ke masing2 komponen layout

        binding.tvTitleDoa.text = doa.title
//        tvArabic
        binding.tvArabic.text = doa.doa
//        tvArti
        binding.tvArti.text = doa.translate
//        tvLatin
        binding.tvLatin.text = doa.latin
//        tvDeskripsi
        binding.tvDeskripsi.text = doa.profile
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> finish()
        }
//    diturunin
        return super.onOptionsItemSelected(item)
    }
}