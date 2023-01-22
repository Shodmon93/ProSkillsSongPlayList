package com.example.data

data class ArtistData(
    val id: Int,
    val name: String,
    val album: AlbumData? = null
)
