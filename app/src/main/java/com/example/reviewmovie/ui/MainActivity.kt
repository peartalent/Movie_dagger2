package com.example.reviewmovie.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.reviewmovie.R
import com.example.reviewmovie.databinding.ActivityMainBinding
import com.example.reviewmovie.ui.adapter.MovieAdapter

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    val viewModel: MainViewModel by lazy {
        ViewModelProvider(this)[MainViewModel::class.java]
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.vm = viewModel
        viewModel.loadMovies()
        binding.recyclerMovies.adapter =MovieAdapter()
    }
}