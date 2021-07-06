package com.example.reviewmovie.network

import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class MovieApi {
    companion object {
        val URL ="https://api.themoviedb.org/3/"
        fun create(): MovieApi {
            val retrofit = Retrofit.Builder()
                .baseUrl(URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()
            return retrofit.create<MovieApi>(MovieApi::class.java)
        }
    }
}