package com.example.real_time_object.nav

sealed class screens(val route: String) {
    object Home : screens("home")
    object Details : screens("details")

}