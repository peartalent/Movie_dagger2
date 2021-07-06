package com.example.reviewmovie.utils

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.reviewmovie.base.BindableAdapter

@Suppress("UNCHECKED_CAST")
@BindingAdapter("data")
fun <T> setRecyclerViewProperties(recyclerView: RecyclerView, data: List<T>?) {
    (recyclerView.adapter as? BindableAdapter<List<T>>)?.setData(data)
}

@BindingAdapter("image")
fun loadImage(view: ImageView, imageUrl: String?) {
    if (!imageUrl.isNullOrBlank()) {
        Glide.with(view.context)
            .load(URL_IMAGE + imageUrl)
            .into(view)
    }
}
