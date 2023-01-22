package com.example.data

import androidx.recyclerview.widget.RecyclerView

data class PlaylistData(
    val id :Int,
    val name : String? = null,
    val recyclerView: RecyclerView? = null,
    val songData: SongData? =null
)