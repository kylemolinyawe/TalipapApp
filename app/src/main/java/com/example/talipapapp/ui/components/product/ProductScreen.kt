package com.example.talipapapp.ui.components.product

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

@Composable
fun ProductScreen(
    productId: Int?,
    navController: NavHostController
) {
    Text("Product ID: $productId")
}