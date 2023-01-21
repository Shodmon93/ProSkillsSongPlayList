package com.example.myproskills.data

data class ArtistData(
    val id: Int,
    val name: String,
    val album: AlbumData? = null
)
