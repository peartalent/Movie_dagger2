package com.example.reviewmovie.data

import com.google.gson.annotations.SerializedName

class MovieShort(
    @SerializedName("id")
    val id: Int,
    @SerializedName("original_title")
    val title: String,
    @SerializedName("release_date")
    val releaseDate: String,
    @SerializedName("vote_count")
    val voteCount: Int?,
    @SerializedName("vote_average")
    val voteAverage: Double?,
    @SerializedName("backdrop_path")
    val backdropPath: String?,
    @SerializedName("poster_path")
    val posterPath: String?,
):GeneraEntity {
    override fun areItemsTheSame(newItem: GeneraEntity): Boolean
        = newItem is MovieShort && this.id == newItem.id

    override fun areContentsTheSame(newItem: GeneraEntity): Boolean
            = newItem is MovieShort && this == newItem
}
