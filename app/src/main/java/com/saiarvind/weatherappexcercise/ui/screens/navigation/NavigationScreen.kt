package com.saiarvind.weatherappexcercise.ui.screens.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.saiarvind.weatherappexcercise.ui.screens.home.HomeScreen
import com.saiarvind.weatherappexcercise.ui.screens.home.HomeViewModel
import com.saiarvind.weatherappexcercise.ui.screens.search.SearchScreen

@Composable
fun NavigationView(homeViewModel: HomeViewModel) {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            HomeScreen(navController, homeViewModel)
        }
        composable("search") {
            SearchScreen(
                onHome = { navController.popBackStack() }
            )
        }
    }
}