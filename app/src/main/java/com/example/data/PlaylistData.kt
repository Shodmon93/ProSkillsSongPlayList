package com.example.data

import androidx.recyclerview.widget.RecyclerView

data class PlaylistData(
    val id :Int,
    val name : String? = null,
    var recyclerView: RecyclerView? = null
)