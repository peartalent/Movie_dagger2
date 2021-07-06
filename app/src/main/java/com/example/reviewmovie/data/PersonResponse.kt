package com.example.reviewmovie.data

import com.google.gson.annotations.SerializedName

class PersonResponse(
    @SerializedName("cast") val cast: List<Person>,
    @SerializedName("crew") val crew: List<Person>
)
