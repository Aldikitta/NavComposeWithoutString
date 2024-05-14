package com.aldikitta.navcomposewithoutstring.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.NavOptions
import androidx.navigation.navigation
import com.aldikitta.navcomposewithoutstring.DetailScreen.navigation.DetailScreen
import com.aldikitta.navcomposewithoutstring.DetailScreen.navigation.detailScreen
import com.aldikitta.navcomposewithoutstring.DetailScreen.navigation.navigateDetailScreen
import com.aldikitta.navcomposewithoutstring.HomeScreen.navigation.HomeScreen
import com.aldikitta.navcomposewithoutstring.HomeScreen.navigation.homeScreen
import kotlinx.serialization.Serializable

@Serializable
object HomeToDetailNavGraph

fun NavController.navigateToHomeToDetailGraph(navOptions: NavOptions? = null) {
    this.navigate(HomeToDetailNavGraph, navOptions)
}

fun NavGraphBuilder.homeToDetailGraph(
    navHostController: NavHostController
) {
    navigation<HomeToDetailNavGraph>(
        startDestination = HomeScreen,
    ) {
        homeScreen(
            navigateToDetail = { data ->
                navHostController.navigateDetailScreen(detailScreen = DetailScreen(id = data.id, name = data.name, address = data.address))
            },
        )
        detailScreen()
    }
}