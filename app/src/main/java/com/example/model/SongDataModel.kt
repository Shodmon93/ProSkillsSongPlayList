package com.example.model

import android.view.View
import com.example.data.AlbumData
import com.example.data.ArtistData
import com.example.data.PlaylistData
import com.example.data.SongData
import com.example.myproskills.R
import com.example.myproskills.databinding.HorizontalRecyclerViewBinding
import java.util.*

class SongDataModel {
    private lateinit var getSongData: MutableList<SongData>
    private lateinit var getArtistData: MutableList<ArtistData>
    private lateinit var getAlbumData: MutableList<AlbumData>
    private lateinit var getPlaylistData : MutableList<PlaylistData>


    fun getSongData(): MutableList<SongData> {
        getSongData = mutableListOf()
        getSongData.add(
            SongData(
                1, "Here without you",
                R.drawable.pizza_001_copy,"Rock",
                ArtistData(1, "3 Doors down"),
                AlbumData(1, "Away from the Sun", Date(28, 7, 2008))),
        )
        getSongData.add(SongData(
            2, "Here without you",
            R.drawable.pizza_002,"Rock",
            ArtistData(1, "3 Doors down"),
            AlbumData(1, "Away from the Sun", Date(28, 7, 2008))
        ))

        getSongData.add( SongData(
            3, "Here without you",
            R.drawable.pizza_003,"Rock",
            ArtistData(1, "3 Doors down"),
            AlbumData(1, "Away from the Sun", Date(28, 7, 2008))
        ))

        getSongData.add(  SongData(
            4, "Here without you",
            R.drawable.pizza_005,"Rock",
            ArtistData(1, "3 Doors down"),
            AlbumData(1, "Away from the Sun", Date(28, 7, 2008))
        ))
        SongData(
            5, "Here without you",
            R.drawable.pizza_005,"Rock",
            ArtistData(1, "3 Doors down"),
            AlbumData(1, "Away from the Sun", Date(28, 7, 2008))
        )

        getSongData.add(SongData(
            6, "Here without you",
            R.drawable.pizza_008,"Rock",
            ArtistData(1, "3 Doors down"),
            AlbumData(1, "Away from the Sun", Date(28, 7, 2008))
        ))

        return getSongData
    }

    fun getArtistData(): MutableList<ArtistData> {
        getArtistData = mutableListOf()
        getArtistData.add(
            ArtistData(
                1, "3 Doors down",
                AlbumData(1, "Away from the Sun", Date(28, 7, 2008))
            )
        )

        return getArtistData
    }

    fun getAlbumData(): MutableList<AlbumData> {
        getAlbumData = mutableListOf()
        getAlbumData.add(AlbumData(1, "Away from the Sun", Date(28, 7, 2008)))

        return getAlbumData
    }

    fun getPlayListData(view : View? = null) : MutableList<PlaylistData>{

        val binding = view?.let { HorizontalRecyclerViewBinding.bind(it) }

        getPlaylistData = mutableListOf()
        getPlaylistData.add(PlaylistData(1,"New Release",null))
        getPlaylistData.add(PlaylistData(2, null, binding?.homeSongRecyclerView))
        getPlaylistData.add(PlaylistData(1,"Recently Played"))
        getPlaylistData.add(PlaylistData(2, null, binding?.homeSongRecyclerView))
        getPlaylistData.add(PlaylistData(1,"Top Mix ",null))
        getPlaylistData.add(PlaylistData(2, null, binding?.homeSongRecyclerView))
        getPlaylistData.add(PlaylistData(1,"Recently added",null))
        getPlaylistData.add(PlaylistData(2, null, binding?.homeSongRecyclerView))

        return getPlaylistData
    }


}