package com.example.dashboardislami.dashboard

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.dashboardislami.R
import com.example.dashboardislami.dashboard.adapter.InspirationAdapter
import com.example.dashboardislami.dashboard.data.InspirationData
import com.example.dashboardislami.dashboard.model.InspirationModel
import com.example.dashboardislami.databinding.ActivityMainBinding
import com.example.dashboardislami.menu.Doa.MenuDoaActivity
import com.example.dashboardislami.menu.dzikir.MenuDzikirActivity
import com.example.dashboardislami.menu.shalat.MenuJadwalShalatActivity
import com.example.dashboardislami.menu.video_kajian.MenuVideoKajianActivity
import com.example.dashboardislami.menu.zakat.MenuZakatActivity
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {


    // binding
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        // binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        //   binding
        setContentView(binding.root)

        // membuat perpindahan antar layar
        initNavMenu()
        //set background agar ganti2 sesuai waktu
        initBackground()
        //membuat init recyclerView
        initRecyclerView()

    }

    private fun initRecyclerView() {
        // variable list untuk menampung data dari object InspirationData
        val list: ArrayList<InspirationModel> = arrayListOf()
        // memasukkan semua data ke dalam variabel list
        list.addAll(InspirationData.listData)

        // membuat object InspirationListAdapter
        val listAdapter = InspirationAdapter(list)

        // mengatur ukuran recyclerview agar fix
        binding.rvInspiration.setHasFixedSize(true)
        // mengatur tampilan recyclerview agar sejajar secara vertical
        binding.rvInspiration.layoutManager = LinearLayoutManager(this)
        // memasang adapter ke recyclerview
        binding.rvInspiration.adapter = listAdapter
    }

    private fun initBackground() {
        val timeNow = Calendar.getInstance()
        val timeFormat = SimpleDateFormat("HH")
        val time = timeFormat.format(timeNow.time)

        when {
            time.toInt() in 0..5 -> binding.ivBackground.setImageResource(R.drawable.bg_header_dashboard_night)
            time.toInt() in 6..10 -> binding.ivBackground.setImageResource(R.drawable.bg_header_dashboard_morning)
            time.toInt() in 11..18 -> binding.ivBackground.setImageResource(R.drawable.bg_header_dashboard_afternoon)
            time.toInt() in 19..23 -> binding.ivBackground.setImageResource(R.drawable.bg_header_dashboard_night)
        }
        when {

//            4-5 (shubuh)
            time.toInt() in 4..5 -> binding.tvWaktuSholat.text = "shubuh"
//           6-11 (pagi)
            time.toInt() in 6..11 -> binding.tvWaktuSholat.text = "Pagi"
//            12 - 15 (Siang)
            time.toInt() in 12..15 -> binding.tvWaktuSholat.text = "SIang"
//            16 - 18 (sore)
            time.toInt() in 16..18 -> binding.tvWaktuSholat.text = "Sore"
//            19-23 (malam)
            time.toInt() in 19..23 -> binding.tvWaktuSholat.text = "malam"
        }


    }

    private fun initNavMenu() {

        binding.ivDoa.setOnClickListener {
            startActivity(Intent(this, MenuDoaActivity::class.java))
        }

        binding.ivDzikir.setOnClickListener {
            startActivity(Intent(this, MenuDzikirActivity::class.java))
        }

        binding.ivZakat.setOnClickListener {
            startActivity(Intent(this, MenuZakatActivity::class.java))
        }



        binding.ivVideoKajian.setOnClickListener {
            val intent = Intent(this, MenuVideoKajianActivity::class.java)
            startActivity(intent)
        }

        binding.ivJadwalShalat.setOnClickListener {
            startActivity(Intent(this, MenuJadwalShalatActivity::class.java))
        }
    }
}