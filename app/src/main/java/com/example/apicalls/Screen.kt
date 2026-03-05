package com.example.apicalls

sealed class Screen(val route: String) {
    object Home : Screen("home")

    object Detail : Screen("detail")
}