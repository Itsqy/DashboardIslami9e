package com.example.dashboardislami.menu.Doa

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.dashboardislami.databinding.ActivityListDoaBinding
import com.example.dashboardislami.menu.Doa.adapter.ListDoaAdapter
import com.example.dashboardislami.menu.Doa.data.*
import com.example.dashboardislami.menu.Doa.model.DoaModel

// mengaitkan ke haalman layout (buat manggil id dari property)


class ListDoaActivity : AppCompatActivity() {
    private lateinit var binding: ActivityListDoaBinding
    lateinit var title: String
    var logo: Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityListDoaBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)

        setContentView(binding.root)


        title = intent.getStringExtra("ext_title").toString()
        logo = intent.getIntExtra("ext_icon", 0)
        setSupportActionBar(binding.toolbarListdoa)
        supportActionBar?.title = title

        initrecyclerView()

    }

    private fun initrecyclerView() {

        val list: ArrayList<DoaModel> = arrayListOf()
        when (title) {
            "Perjalanan"->list.addAll(DoaPerjalanan.listDoaPerjalan)
            "Rumah"-> list.addAll(DoaRumah.listDoaRumahData)
            "Makan Minum" -> list.addAll(DoaMakanMinum.listDoaMakanMinum)
            "Etika Baik" -> list.addAll(DoaEtikaBaik.listDoaEtikaBaik)
            "Pagi Malam" -> list.addAll(DoaPagiMalam.listDoaPagiMalam)
            "Shalat" -> list.addAll(DoaShalat.listDoaShalat)
        }

        val adapterDoa = ListDoaAdapter(list, logo)
        binding.rvDoaShalat.setHasFixedSize(true)
        binding.rvDoaShalat.layoutManager = LinearLayoutManager(this)
        binding.rvDoaShalat.adapter = adapterDoa
    }

    // tombol back pada actionbar mengembalikan ke layar sebelumnya
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> finish()
        }
        return super.onOptionsItemSelected(item)
    }

}