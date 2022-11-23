package com.example.dashboardislami.menu.video_kajian.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.dashboardislami.R
import com.example.dashboardislami.menu.video_kajian.DetailVideoKajianActivity
import com.example.dashboardislami.menu.video_kajian.model.VideoKajianModel
import jp.wasabeef.glide.transformations.BlurTransformation

class VideoKajianAdapter(private var listvideokajian: ArrayList<VideoKajianModel>) :
    RecyclerView.Adapter<VideoKajianAdapter.ListViewHolder>() {


    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var imgVideoKajian: ImageView = itemView.findViewById(R.id.thumbnail_video)
        var channelVideoKajian: TextView = itemView.findViewById(R.id.tv_channel)
        var speakerVideoKajian: TextView = itemView.findViewById(R.id.tv_penceramah)
        var titleVideoKajian: TextView = itemView.findViewById(R.id.tv_judul)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_row_video_kajian, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {

        val video = listvideokajian[position]

        holder.channelVideoKajian.text = video.channelVideo
        holder.titleVideoKajian.text = video.titleVideo
        holder.speakerVideoKajian.text = video.speakervideo

        Glide.with(holder.itemView.context)
            .load(video.thumbnailVideo)
//                dari github
            .apply(RequestOptions.bitmapTransform(BlurTransformation(8, 1)))
            .into(holder.imgVideoKajian)

//        cara berpindah halaman
        holder.itemView.setOnClickListener {

//            intent
            val intent = Intent(it.context, DetailVideoKajianActivity::class.java)
//            untuk membawa data ke detail
            intent.putExtra("extra_video_kajian", video)
//            pemicu
            it.context.startActivity(intent)


        }


    }

    //    get data dari model ke adapter
    override fun getItemCount(): Int {
        return listvideokajian.size
    }



    }