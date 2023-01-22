package com.example.ui

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.data.SongData
import com.example.myproskills.R
import com.example.myproskills.databinding.HorizontalViewBinding

class HomeSongAdapter : RecyclerView.Adapter<HomeSongAdapter.SongViewHolder>() {

    private var songList = mutableListOf<SongData>()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SongViewHolder {
      return SongViewHolder(LayoutInflater.from(parent.context)
          .inflate(R.layout.horizontal_view,parent,false))
    }

    override fun onBindViewHolder(holder: SongViewHolder, position: Int) {
        holder.configSong(songList[position])
    }

    override fun getItemCount(): Int {
       return songList.size

    }

    fun setData(data : MutableList<SongData>){
       this.songList = data
        Log.i("Data Size","${songList.size} shodmon ")
    }

    inner class SongViewHolder(view : View) : RecyclerView.ViewHolder(view){
        val binding = HorizontalViewBinding.bind(view)


        fun configSong(songData: SongData?) {
            songData?.image?.let { binding.image.setImageResource(it) }
            binding.artistName.text = songData?.artist?.name
            binding.story.text = songData?.track
        }


    }
}