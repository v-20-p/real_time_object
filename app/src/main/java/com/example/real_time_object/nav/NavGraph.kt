package com.example.real_time_object.nav

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.real_time_object.screens.HomeScreen


@Composable
fun NavGraph() {
    val navController= rememberNavController()
    NavHost(navController = navController, startDestination = screens.Home.route) {
        composable(route = screens.Home.route) {
            HomeScreen()
        }

    }

}