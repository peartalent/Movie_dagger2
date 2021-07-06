package com.example.reviewmovie.di

import com.example.reviewmovie.ui.MainViewModel
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ViewModelModule {
    @ContributesAndroidInjector
    abstract fun bindMainActivity(): MainViewModel
}