package com.example.apicalls

import androidx.compose.runtime.*
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {

//    var mealList by mutableStateOf<List<Meal>>(emptyList())
//        private set

    var songList by mutableStateOf<List<Song>>(emptyList())
        private set

//    var selectedMeal by mutableStateOf<Meal?>(null)
//        private set

    var selectedSong by mutableStateOf<Song?>(null)
        private set

    var isLoading by mutableStateOf(false)
        private set

    init {
        //fetchMeals("a")
        fetchSongs("arijit")

    }

    fun refresh() {
        //fetchMeals(randomSearchQuery())
        fetchSongs(listOf("arijit", "ed sheeran", "taylor swift", "ar rahman").random())
    }

//    fun fetchMeals(search: String = "a") {
//        viewModelScope.launch {
//            isLoading = true
//            try {
//                val response = RetrofitInstance.api.getMeals(search)
//                mealList = response.meals.orEmpty().toList()
//                println("Fetched ${mealList.size} meals for '$search'")
//            } catch (e: Exception) {
//                println("Error fetching meals: ${e.message}")
//                e.printStackTrace()
//            } finally {
//                isLoading = false
//            }
//        }
//    }


    fun fetchSongs(search: String = "arijit") {
        viewModelScope.launch {
            isLoading = true
            try {
                val response = RetrofitInstance.api.searchSongs(search)
                songList = response.results.orEmpty()
                println("Fetched ${songList.size} songs for '$search'")
                // Debug logging
                songList.take(3).forEach { song ->
                    println("Song: ${song.trackName}")
                    println("  - Artwork URL: ${song.artworkUrl100}")
                    println("  - Preview URL: ${song.previewUrl}")
                    println("  - Preview URL is null: ${song.previewUrl == null}")
                    println("  - Preview URL length: ${song.previewUrl?.length ?: "null"}")
                }
            } catch (e: Exception) {
                println("Error fetching songs: ${e.message}")
                e.printStackTrace()
            } finally {
                isLoading = false
            }
        }
    }
    private fun randomSearchQuery(): String {
        return ('a'..'z').random().toString()
    }

//    fun fetchMealById(id: String) {
//        viewModelScope.launch {
//            val response = RetrofitInstance.api.getMealById(id)
//            selectedMeal = response.meals?.firstOrNull()
//        }
//    }

    fun selectSong(song: Song) {
        selectedSong = song
    }
}