package com.example.marsphotos.model
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName

@Serializable
data class MarsPhoto(
    val id: String,
    @SerialName(value = "img_src")
    val imgSrc: String
)
