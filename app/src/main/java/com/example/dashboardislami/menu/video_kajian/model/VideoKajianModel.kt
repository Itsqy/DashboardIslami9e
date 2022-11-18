package com.example.dashboardislami.menu.video_kajian.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class VideoKajianModel(
    var thumbnailVideo : Int = 0,
    var urlVideoKajian : String = "",
    var channelVideo : String = "",
    var speakervideo : String = "",
    var titleVideo : String = "",
    var deskripsiVideo : String = ""
) : Parcelable
