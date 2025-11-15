package com.offauth.app.ui

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.composable
import com.offauth.app.ui.screens.HomeScreen
import com.offauth.app.ui.screens.AddAccountScreen

@Composable
fun AppNav() {
    val nav = rememberNavController()

    NavHost(navController = nav, startDestination = "home") {
        composable("home") {
            HomeScreen(
                onAddAccount = { nav.navigate("add") }
            )
        }

        composable("add") {
            AddAccountScreen(
                onBack = { nav.popBackStack() }
            )
        }
    }
}
