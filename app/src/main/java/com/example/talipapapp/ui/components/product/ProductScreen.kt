package com.example.talipapapp.ui.components.product

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.example.talipapapp.data.CartRepository
import com.example.talipapapp.data.ProductRepository

@Composable
fun ProductScreen(
    productId: Int?,
    navController: NavHostController
) {

    val product = ProductRepository.getProductById(productId)

    // 🔥 IMPORTANT: force recomposition when cart changes
    val cart = CartRepository.cart

    Column(
        modifier = Modifier.fillMaxSize()
    ) {

        ProductImageSection(
            productId,
            navController
        )

        product?.let {

            val cartItem = CartRepository.getCartItem(it.id)
            val quantity = cartItem?.quantity ?: 0

            ProductDetailsSection(
                product = it,
                quantity = quantity, // 🔥 pass live value

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

            // Product Info
            ProductInfoSection(
                it
            )
        }
    }
}