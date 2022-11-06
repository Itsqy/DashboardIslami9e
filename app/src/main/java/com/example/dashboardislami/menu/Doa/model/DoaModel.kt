package com.example.dashboardislami.menu.Doa.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class DoaModel(
 var title: String = "",
 var doa:String = "",
 var latin : String = "",
 var profile : String ="",
 var translate : String =""


) : Parcelable
