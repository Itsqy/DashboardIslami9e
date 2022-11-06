package com.example.dashboardislami.menu.shalat

import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.dashboardislami.databinding.ActivityMenuJadwalShalatBinding
import com.loopj.android.http.AsyncHttpClient
import com.loopj.android.http.AsyncHttpResponseHandler
import cz.msebera.android.httpclient.Header
import org.json.JSONObject
import java.text.SimpleDateFormat
import java.util.*

class MenuJadwalShalatActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMenuJadwalShalatBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMenuJadwalShalatBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbarJadwalshalat)

        tanggalHariIni()

    }

    private fun tanggalHariIni() {
//  get data dari calender
        var calender = Calendar.getInstance().time
        var dateFormat = SimpleDateFormat("EEEE, d MMMM", Locale.getDefault())
        var formatedDate: String = dateFormat.format(calender)
        binding.tvToday.text = formatedDate

        dataJadwalShalat(calender)

    }

    private fun dataJadwalShalat(calender: Date) {

        var dateFormat = SimpleDateFormat("yyyy-mm-dd", Locale.getDefault())
        var formatedDate: String = dateFormat.format(calender)
        var client = AsyncHttpClient()
        val url = "https://muslimsalat.com/bogor.json?key=d17258bcaf850ce0255cd81c6dc478d3"

        client.get(url, object : AsyncHttpResponseHandler() {
            override fun onSuccess(
                statusCode: Int,
                headers: Array<out Header>?,
                responseBody: ByteArray?
            ) {

                binding.pbJadwalShalat.visibility = View.INVISIBLE
                val response = responseBody.let {
                    String(it!!)
                }

//                ngambil data API
                try {


                    var jsonData = JSONObject(response)
                    var objData = jsonData.getJSONArray("items")
                    var obnew = objData.getJSONObject(0)

//                    nempelin data ke textView
                    binding.tvTimeImsak.text = obnew.getString("fajr")
                    binding.tvTimeShubuh.text = obnew.getString("fajr")
                    binding.tvTimeDhuha.text = obnew.getString("shurooq")
                    binding.tvTimeDzuhur.text = obnew.getString("dhuhr")
                    binding.tvTimeAshar.text = obnew.getString("asr")
                    binding.tvTimeMaghrib.text = obnew.getString("maghrib")
                    binding.tvTimeIsya.text = obnew.getString("isha")
//                    nambah satu buat lokasi
                    binding.tvLocation.text = jsonData.getString("query")


                } catch (e: Exception) {

                    Toast.makeText(this@MenuJadwalShalatActivity, e.message, Toast.LENGTH_SHORT)
                        .show()
                }
            }

            override fun onFailure(
                statusCode: Int,
                headers: Array<out Header>?,
                responseBody: ByteArray?,
                error: Throwable?
            ) {

                binding.pbJadwalShalat.visibility = View.INVISIBLE

                val errorMessage = when (statusCode) {
                    400 -> "$statusCode : Bad Request"
                    403 -> "$statusCode : Forbidden"
                    404 -> "$statusCode : Not Found "

                    else -> "$statusCode : ${error?.message}"
                }

                Toast.makeText(this@MenuJadwalShalatActivity, errorMessage, Toast.LENGTH_LONG)
                    .show()

            }
        })


    }


    //    buat tombol back
    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when (item.itemId) {
            android.R.id.home -> finish()
        }
        return super.onOptionsItemSelected(item)
    }


}