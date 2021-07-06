package com.example.reviewmovie.ui

import android.widget.ImageView
import android.widget.TextView
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.reviewmovie.base.RxViewModel
import com.example.reviewmovie.data.MovieResponse
import com.example.reviewmovie.data.MovieShort
import com.example.reviewmovie.network.IMovieApi
import com.example.reviewmovie.network.MovieApi
import com.squareup.picasso.Picasso
import dagger.Module
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

@Module
class MainViewModel : RxViewModel() {
    private val _movies = MutableLiveData<MovieResponse>()
    val movies: LiveData<MovieResponse>
        get() = _movies

    @Inject
    private lateinit var iMovieApi: IMovieApi
    fun loadMovies() {
        disposables.add(
            iMovieApi.moviesPopular("fbc9c62908148ea463ab7fb7d02534e0")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({
                    _movies.value = it
                }, {
                })
        )
    }
}