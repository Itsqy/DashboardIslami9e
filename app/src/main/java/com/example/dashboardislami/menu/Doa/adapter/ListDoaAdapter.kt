package com.example.dashboardislami.menu.Doa.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.dashboardislami.R
import com.example.dashboardislami.menu.Doa.DetailDoaActivity
import com.example.dashboardislami.menu.Doa.model.DoaModel

class ListDoaAdapter(
    private val listDoa: ArrayList<DoaModel>,
    private val logo: Int,
    ) :
    RecyclerView.Adapter<ListDoaAdapter.ListViewHolder>() {

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val imgDoa: ImageView = itemView.findViewById(R.id.iv_doa_shalat)
        val titleDoa: TextView = itemView.findViewById(R.id.tv_doa_shalat)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_row_listdoa, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val doa = listDoa[position]
        holder.titleDoa.text = doa.title

        Glide.with(holder.itemView.context)
            .load(logo)
            .into(holder.imgDoa)

        holder.itemView.setOnClickListener {
            val intent = Intent(it.context, DetailDoaActivity::class.java)
            intent.putExtra("extra_doa", doa)
            it.context.startActivity(intent)
        }

    }


    override fun getItemCount(): Int {
        return listDoa.size
    }
}