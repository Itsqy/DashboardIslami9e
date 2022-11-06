package com.example.dashboardislami.dashboard.data

import com.example.dashboardislami.R
import com.example.dashboardislami.dashboard.model.InspirationModel

object InspirationData {
    private val dataImage = intArrayOf(
        R.drawable.img_inspiration,
        R.drawable.img_inspiration,

        )

    val listData: ArrayList<InspirationModel>
        get() {

            val list = arrayListOf<InspirationModel>()
            for (position in dataImage.indices) {
                val model = InspirationModel()
                model.InspirationImage = dataImage[position]
                list.add(model)
            }
            return list
        }

}