package com.example.myproskills.model

import com.example.myproskills.data.AlbumData
import com.example.myproskills.data.ArtistData
import com.example.myproskills.data.SongData
import java.util.*

class SongDataModel {
    private lateinit var getSongData: MutableList<SongData>
    private lateinit var getArtistData: MutableList<ArtistData>
    private lateinit var getAlbumData: MutableList<AlbumData>


    fun getSongData(): MutableList<SongData> {
        getSongData = mutableListOf()

        getSongData.add(
            SongData(
                1, "Here without you", "Rock",
                ArtistData(1, "3 Doors down"),
                AlbumData(1, "Away from the Sun", Date(28, 7, 2008))
            )
        )
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


}