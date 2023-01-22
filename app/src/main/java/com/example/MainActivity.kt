package com.example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.model.SongDataModel
import com.example.myproskills.databinding.ActivityMainBinding
import com.example.ui.HomeAdapter

const val TITLE_VIEW = 0
const val SONG_VIEW = 1

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val songDataModel = SongDataModel()
        val homeAdapter = HomeAdapter()
        homeAdapter.submitList(songDataModel.getPlayListData())
        binding.homeRecyclerView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        binding.homeRecyclerView.adapter = homeAdapter
    }
}