package com.example.dashboardislami.menu.video_kajian

import android.os.Bundle
import android.view.LayoutInflater
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.dashboardislami.R
import com.example.dashboardislami.databinding.ActivityMenuVideoKajianBinding
import com.example.dashboardislami.menu.video_kajian.adapter.VideoKajianAdapter
import com.example.dashboardislami.menu.video_kajian.data.VideoKajianData
import com.example.dashboardislami.menu.video_kajian.model.VideoKajianModel

class MenuVideoKajianActivity : AppCompatActivity() {

//    step 1
    lateinit var binding : ActivityMenuVideoKajianBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        step 2
        binding = ActivityMenuVideoKajianBinding.inflate(layoutInflater)
//         step 3
        setContentView(binding.root)

//        untuk actionBar
        setSupportActionBar(binding.toolbarVideoKajian)

//        recyclerview
        initRecyclerView()



    }


    private fun initRecyclerView() {

        val list: ArrayList<VideoKajianModel> = arrayListOf()
        binding.rvVideoKajian.setHasFixedSize(true)
        list.addAll(VideoKajianData.listdata)
        binding.rvVideoKajian.layoutManager = LinearLayoutManager(this)

        val videokajianadapter = VideoKajianAdapter(list)
        binding.rvVideoKajian.adapter = videokajianadapter
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when (item.itemId) {
            android.R.id.home -> finish()
        }
        return super.onOptionsItemSelected(item)
    }





}