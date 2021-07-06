package com.example.reviewmovie.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.reviewmovie.base.BaseAdapter
import com.example.reviewmovie.base.BaseViewHolder
import com.example.reviewmovie.data.MovieShort
import com.example.reviewmovie.databinding.ItemMovieBinding

class MovieAdapter : BaseAdapter<MovieShort, ItemMovieBinding>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): BaseViewHolder<MovieShort, ItemMovieBinding> {
        val itemView = ItemMovieBinding.inflate(
            LayoutInflater.from(parent.context),
            parent, false
        )
        return MovieViewHolder(itemView)
    }

    class MovieViewHolder(
        private val itemBinding: ItemMovieBinding
    ) : BaseViewHolder<MovieShort, ItemMovieBinding>(itemBinding) {
        override fun onBind(itemData: MovieShort) {
            super.onBind(itemData)
            itemBinding.movie = itemData
        }
    }
}
