package com.example.dashboardislami.dashboard.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.dashboardislami.R
import com.example.dashboardislami.dashboard.model.InspirationModel

class InspirationAdapter(private val listItem: ArrayList<InspirationModel>) : RecyclerView.Adapter<InspirationAdapter.ListViewHolder>() {

 inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var imgPhoto: ImageView = itemView.findViewById(R.id.iv_inspiration)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_row_inspirasi, parent, false)
        return ListViewHolder(view)

    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val inspiration = listItem[position]

        Glide.with(holder.itemView.context)
            .load(inspiration.InspirationImage)
            .into(holder.imgPhoto)


    }

    override fun getItemCount(): Int {
        return listItem.size
    }

}