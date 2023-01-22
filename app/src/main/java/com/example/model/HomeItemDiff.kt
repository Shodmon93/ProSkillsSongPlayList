package com.example.model

import androidx.recyclerview.widget.DiffUtil
import com.example.data.PlaylistData

class HomeItemDiff :DiffUtil.ItemCallback<PlaylistData>() {
    override fun areItemsTheSame(oldItem: PlaylistData, newItem: PlaylistData): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: PlaylistData, newItem: PlaylistData): Boolean {
        return oldItem == newItem
    }
}