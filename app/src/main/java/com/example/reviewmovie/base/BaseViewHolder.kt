package com.example.reviewmovie.base

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding

abstract class BaseViewHolder<T, B : ViewBinding>(
    binding: B
) : RecyclerView.ViewHolder(binding.root) {
    private var itemData: T? = null

    open fun onBind(itemData: T) {
        this.itemData = itemData
    }
}