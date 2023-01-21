package com.example.myproskills.data


data class SongData(
    val id : Int,
    val track : String,
    val playlist : String,
    val artist : ArtistData,
    val album : AlbumData
)


