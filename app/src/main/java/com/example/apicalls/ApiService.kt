package com.example.apicalls

import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

//    @GET("random.php")
//    //@GET("search?term=arijit&entity=song&limit=20")
//    suspend fun getRandomMeal(): RandomMealResponse
//
//    @GET("search.php")
//    suspend fun getMeals(
//        @Query("s") search: String = ""
//    ): MealListResponse
//
//    @GET("lookup.php")
//    suspend fun getMealById(
//        @Query("i") id: String
//    ): MealListResponse

    @GET("search")
    suspend fun searchSongs(
        @Query("term") term: String,
        @Query("entity") entity: String = "song",
        @Query("limit") limit: Int = 20
    ): SongResponse
}