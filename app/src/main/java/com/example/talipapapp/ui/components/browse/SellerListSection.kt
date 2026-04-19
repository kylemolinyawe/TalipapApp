package com.example.talipapapp.ui.components.browse

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.example.talipapapp.models.Product
import com.example.talipapapp.models.Seller


@Composable
fun SellerListSection(
    sellers: List<Seller>,
    selectedCategory: String,
    navController: NavHostController
) {
    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {
        items(sellers) { seller ->

            SellerCard(
                seller = seller,
                selectedCategory = selectedCategory,
                onProductClick = { productId ->
                    navController.navigate("product/$productId")
                },
                onSellerClick = { sellerId ->
                    navController.navigate("seller/$sellerId")
                }
            )
        }
    }
}