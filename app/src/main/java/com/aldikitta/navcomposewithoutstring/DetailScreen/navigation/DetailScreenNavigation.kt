package com.aldikitta.navcomposewithoutstring.DetailScreen.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import androidx.navigation.toRoute
import com.aldikitta.navcomposewithoutstring.DetailScreen.DetailScreen
import kotlinx.serialization.Serializable

@Serializable
data class DetailScreen(
    val id: String? = "",
    val name: String? = "",
    val address: String? = "",
)

fun NavController.navigateDetailScreen(navOptions: NavOptions? = null, detailScreen: DetailScreen) {
    this.navigate(detailScreen)
}

fun NavGraphBuilder.detailScreen(

) {
    composable<DetailScreen> {
        val args: DetailScreen = it.toRoute()
        DetailScreen(detailScreen = args)
    }
}