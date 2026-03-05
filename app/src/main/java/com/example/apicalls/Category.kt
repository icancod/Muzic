package com.example.apicalls

import com.google.gson.annotations.SerializedName

data class RandomMealResponse(
    val meals: List<Meal>?
)

data class MealListResponse(
    val meals: List<Meal>?
)

data class Meal(
    val idMeal: String,
    val strMeal: String,
    val strMealThumb: String,
    val strInstructions: String
)

data class SongResponse(
    val resultCount: Int,
    val results: List<Song>
)

data class Song(
    val trackId: Long,
    val trackName: String,
    val artistName: String,
    @SerializedName("artworkUrl100")
    val artworkUrl100: String?,
    @SerializedName("previewUrl")
    val previewUrl: String?
)