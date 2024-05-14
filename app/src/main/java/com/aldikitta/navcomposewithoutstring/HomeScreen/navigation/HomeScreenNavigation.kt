package com.aldikitta.navcomposewithoutstring.HomeScreen.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.aldikitta.navcomposewithoutstring.DetailScreen.navigation.DetailScreen
import com.aldikitta.navcomposewithoutstring.HomeScreen.HomeScreen
import kotlinx.serialization.Serializable

@Serializable
object HomeScreen

fun NavController.navigateHomeScreen(navOptions: NavOptions? = null) {
    this.navigate(HomeScreen)
}

fun NavGraphBuilder.homeScreen(
    navigateToDetail: (DetailScreen) -> Unit,
) {
    composable<HomeScreen> {
        HomeScreen(navigateToDetail)
    }
}