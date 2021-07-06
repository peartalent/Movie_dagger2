package com.example.reviewmovie.data

import com.google.gson.annotations.SerializedName

data class MovieResponse (@SerializedName("results") val movies: List<MovieShort>)
