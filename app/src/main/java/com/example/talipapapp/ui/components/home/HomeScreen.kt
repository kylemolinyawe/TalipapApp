package com.example.talipapapp.ui.components.home

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.example.talipapapp.data.ProductRepository
import com.example.talipapapp.data.SellerRepository

@Composable
fun HomeScreen(
    navController: NavHostController
) {

    Column(
        modifier = Modifier.fillMaxSize()
    ) {

        // 🔒 FIXED HEADER (does NOT scroll)
        HomeHeaderSection()

        // 📜 SCROLLABLE CONTENT ONLY
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {

            HomeAdSection(
                ads = listOf("", "", "")
            )

            HomeCategoriesSection(
                onCategoryClick = { category ->
                    navController.navigate("browse?category=$category")
                }
            )

            HomeFreshTodaySection(
                products = ProductRepository.products,
                onProductClick = { productId ->
                    navController.navigate("product/$productId")
                }
            )

            // HomeFeaturedFarmersSection.kt
            // same as Fresh Today but instead of a price put the farmer name, then location
            HomeFeaturedFarmersSection(
                sellers = SellerRepository.getAllSellers(),
                onSellerClick = { sellerId ->
                    navController.navigate("seller/$sellerId")
                }
            )
        }
    }
}