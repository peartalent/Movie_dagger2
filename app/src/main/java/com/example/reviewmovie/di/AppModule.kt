package com.example.testdemo.di

import com.example.reviewmovie.network.MovieApi
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {
    @Singleton
    @Provides
    fun provideGithubApi() = MovieApi.create()
}