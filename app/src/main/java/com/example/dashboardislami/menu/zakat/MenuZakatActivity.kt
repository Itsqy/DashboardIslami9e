package com.example.dashboardislami.menu.zakat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.MenuItem
import android.widget.Toast
import com.example.dashboardislami.R
import com.example.dashboardislami.databinding.ActivityMenuZakatBinding
import java.text.NumberFormat
import java.util.*


class MenuZakatActivity : AppCompatActivity() {


    lateinit var binding: ActivityMenuZakatBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMenuZakatBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbarZakat)

        initView()
    }

    private fun initView() {

        binding.btnZakat.setOnClickListener {

            if (TextUtils.isEmpty(binding.edtInputZakat.text)) {
                Toast.makeText(this, "isi dong !!", Toast.LENGTH_SHORT).show()
            }
            else if (binding.edtInputZakat.getNumericValue().toInt() >= 85000000) {
//                hitung-hitungan Zakat
                val zakat = binding.edtInputZakat.getNumericValue().toInt() * (2.5/100)
                val formatZakat = NumberFormat
                    .getNumberInstance(Locale("id","ID"))
                    .format(zakat)

                binding.tvTotalZakat.text = "$formatZakat"

//                Total Uang
                val formatTotalUang = NumberFormat
                    .getNumberInstance(Locale("id","ID"))
                    .format(binding.edtInputZakat.getNumericValue())

                binding.tvTotalUang.text = "$formatTotalUang"
            }
            else {
                Toast.makeText(this, "Total Harta Belum Mencapai nishab (85 gr Emas)", Toast.LENGTH_SHORT).show()
           binding.tvTotalZakat.text = "Rp 0"
            }


        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when (item.itemId) {
            android.R.id.home -> finish()
        }
        return super.onOptionsItemSelected(item)
    }
}