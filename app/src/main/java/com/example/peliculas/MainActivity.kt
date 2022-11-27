package com.example.peliculas

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.peliculas.adapter.ActivityWithMenus
import com.example.peliculas.adapter.FilmAdapter
import com.example.peliculas.databinding.ActivityMainBinding

class MainActivity : ActivityWithMenus() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //val decoration = DividerItemDecoration(this, LinearLayoutManager.VERTICAL)
        val manager = LinearLayoutManager(this)

        binding.recycler.layoutManager = manager
        binding.recycler.adapter = FilmAdapter(FilmProvider.filmList)
        //binding.recycler.addItemDecoration(decoration)
    }
}