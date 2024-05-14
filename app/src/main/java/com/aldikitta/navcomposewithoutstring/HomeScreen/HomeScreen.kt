package com.aldikitta.navcomposewithoutstring.HomeScreen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.aldikitta.navcomposewithoutstring.DetailScreen.navigation.DetailScreen

@Composable
fun HomeScreen(
    navigateToDetail: (DetailScreen) -> Unit,
) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(text = "Home Screen")
        Button(onClick = {
            navigateToDetail.invoke(DetailScreen("12", "aldi", "bungi"))

        }) {
            Text(text = "Navigate")
        }
    }
}