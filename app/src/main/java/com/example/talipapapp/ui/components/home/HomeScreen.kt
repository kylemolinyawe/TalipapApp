package com.example.talipapapp.ui.components.home

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController

@Composable
fun HomeScreen(
    navController: NavHostController
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {

        // Header
        HomeHeaderSection()

        // Future sections go here
        // Featured Farmers
        // HomeFeaturedFarmersSection.kt

        // Categories (NOW NAVIGATES TO BROWSE)
        HomeCategoriesSection(
            onCategoryClick = { category ->
                navController.navigate("browse?category=$category")
            }
        )
    }
}