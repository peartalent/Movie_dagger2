package com.example.reviewmovie.base

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import io.reactivex.disposables.CompositeDisposable

open class RxViewModel : ViewModel() {

    protected val disposables: CompositeDisposable = CompositeDisposable()

    protected val error = MutableLiveData<String>()
    val errorException: LiveData<String>
        get() = error

    override fun onCleared() {
        disposables.clear()
        super.onCleared()
    }
}