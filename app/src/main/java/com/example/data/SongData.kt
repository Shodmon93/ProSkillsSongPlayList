package com.example.data


data class SongData(
    val id : Int,
    val track : String,
    val image : Int,
    val playlist : String,
    val artist : ArtistData,
    val album : AlbumData
)


