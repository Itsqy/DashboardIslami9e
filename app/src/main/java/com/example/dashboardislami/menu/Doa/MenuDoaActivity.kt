package com.example.dashboardislami.menu.Doa

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.example.dashboardislami.R
import com.example.dashboardislami.databinding.ActivityMenuDoaBinding
import android.content.Intent as Intent1

class MenuDoaActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMenuDoaBinding


    override fun onCreate(savedInstanceState: Bundle?) {

//        aktifin view Binding
        binding = ActivityMenuDoaBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
// set button back kembali ke layar sebelumnya
        setSupportActionBar(binding.actionbarMenudoa)


        initButtonView()

    }

    private fun initButtonView() {
        binding.cdRumah.setOnClickListener {

            val intent = Intent1(this, ListDoaActivity::class.java)
            intent.putExtra("ext_title", "Rumah")
            intent.putExtra("ext_icon", R.drawable.ic_doa_rumah)
            startActivity(intent)

        }

        binding.cdPerjalanana.setOnClickListener {
            val rumah = Intent1(this, ListDoaActivity::class.java)
            rumah.putExtra("ext_title", "Perjalanan")
            rumah.putExtra("ext_icon", R.drawable.ic_doa_perjalanan)
            startActivity(rumah)
        }

        binding.cdEtikaBaik.setOnClickListener {
            val rumah = Intent1(this, ListDoaActivity::class.java)
            rumah.putExtra("ext_title", "Etika Baik")
            rumah.putExtra("ext_icon", R.drawable.ic_doa_etika_baik)
            startActivity(rumah)
        }

        binding.cdMakanMinum.setOnClickListener {
            val rumah = Intent1(this, ListDoaActivity::class.java)
            rumah.putExtra("ext_title", "Makan Minum")
            rumah.putExtra("ext_icon", R.drawable.ic_doa_makanan_minuman)
            startActivity(rumah)
        }
        binding.cdPagiMalam.setOnClickListener {
            val rumah = Intent1(this, ListDoaActivity::class.java)
            rumah.putExtra("ext_title", "Pagi Malam")
            rumah.putExtra("ext_icon", R.drawable.ic_doa_pagi_malam)
            startActivity(rumah)
        }
        binding.cdShalat.setOnClickListener {
            val rumah = Intent1(this, ListDoaActivity::class.java)
            rumah.putExtra("ext_title", "Shalat")
            rumah.putExtra("ext_icon", R.drawable.ic_doa_sholat)
            startActivity(rumah)
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when (item.itemId) {
            android.R.id.home -> finish()
        }
        return super.onOptionsItemSelected(item)
    }


}