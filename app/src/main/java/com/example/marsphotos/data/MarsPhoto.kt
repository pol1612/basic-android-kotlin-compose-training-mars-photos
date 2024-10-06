package com.example.marsphotos.data

import com.google.gson.annotations.SerializedName

data class MarsPhoto(
    val id: String,
    @SerializedName(value = "img_src")
    val imageSource: String,
)
