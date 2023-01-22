package com.example.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.SONG_VIEW
import com.example.TITLE_VIEW
import com.example.data.PlaylistData
import com.example.model.HomeItemDiff
import com.example.model.SongDataModel
import com.example.myproskills.R
import com.example.myproskills.databinding.HorizontalRecyclerViewBinding
import com.example.myproskills.databinding.TitleVerticalViewBinding

class HomeAdapter : ListAdapter<PlaylistData, ViewHolder>(HomeItemDiff()) {


    val songDataModel = SongDataModel()

    override fun getItemViewType(position: Int): Int {
        return if (getItem(position).name != null) {
            TITLE_VIEW
        } else
            SONG_VIEW
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return if (viewType == 0)
            TitleViewHolder(
                LayoutInflater.from(parent.context)
                    .inflate(R.layout.title_vertical_view, parent, false)
            )
        else SongItemViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.horizontal_recycler_view, parent, false)
        )

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        if (holder is TitleViewHolder)
            holder.config(getItem(position))

        else if (holder is SongItemViewHolder)
            holder.configSong(getItem(position)?.recyclerView)

    }

    inner class TitleViewHolder(view: View) : ViewHolder(view) {
        var title_viewBinding = TitleVerticalViewBinding.bind(view)

        fun config(playlistData: PlaylistData) {
            title_viewBinding.homePlaylistTitle.text = playlistData.name

        }
    }

    inner class SongItemViewHolder(view: View) : ViewHolder(view) {
        var song_viewBinding = HorizontalRecyclerViewBinding.bind(view)


        fun configSong(recyclerView: RecyclerView?) {
            val adapter = HomeSongAdapter()

            song_viewBinding.homeSongRecyclerView.layoutManager = GridLayoutManager(itemView
                .context,2,GridLayoutManager.HORIZONTAL,false)
            song_viewBinding.homeSongRecyclerView.adapter = adapter
            adapter.setData(songDataModel.getSongData())

        }
    }
}