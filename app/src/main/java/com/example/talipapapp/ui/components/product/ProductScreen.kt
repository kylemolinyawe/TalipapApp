package com.example.talipapapp.ui.components.product

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.talipapapp.data.CartRepository
import com.example.talipapapp.data.ProductRepository

@Composable
fun ProductScreen(
    productId: Int?,
    navController: NavHostController
) {

    // Product Image Container
    ProductImageSection(
        productId,
        navController
    )

    val product = ProductRepository.getProductById(productId)

    product?.let {
        ProductDetailsSection(
            product = it,
            onAddToCart = {
                CartRepository.addToCart(it)
            },
            onIncrease = {
                CartRepository.increase(it.id)
            },
            onDecrease = {
                CartRepository.decrease(it.id)
            }
        )
    }


    // Product Info
}