package com.aldikitta.navcomposewithoutstring.DetailScreen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.aldikitta.navcomposewithoutstring.DetailScreen.navigation.DetailScreen

@Composable
fun DetailScreen(
    detailScreen: DetailScreen
) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(text = "Detail Screen ${detailScreen.id} ${detailScreen.name} ${detailScreen.address}")
    }
}