package com.example.talipapapp.ui.components.cart

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.talipapapp.data.CartDataSource

@Composable
fun CartScreen(navController: NavHostController) {

    val uniqueItems = CartDataSource.cart.items.size
    val totalQuantity = CartDataSource.cart.items.sumOf { it.quantity }

    val subtotal = CartDataSource.cart.totalPrice().toDouble()

    val deliveryFee = 50.0
    val serviceFee = 5.0

    val total = subtotal + deliveryFee + serviceFee

    Box(modifier = Modifier.fillMaxSize()) {

        Column(modifier = Modifier.fillMaxSize()) {

            // static header
            CartHeaderSection(
                uniqueItems = uniqueItems,
                totalQuantity = totalQuantity
            )

            // scrollable content
            LazyColumn(
                modifier = Modifier
                    .weight(1f) // takes remaining space
                    .fillMaxWidth()
            ) {

                items(CartDataSource.cart.items) { cartItem ->
                    CartItemCard(
                        item = cartItem,
                        onDecrease = {},
                        onIncrease = {}
                    )
                }

                item {
                    CartSubtotalSection(
                        subtotal = subtotal,
                        deliveryFee = deliveryFee,
                        serviceFee = serviceFee
                    )
                }
            }
        }

        // fixed bottom section
        CartBottomSection(
            total = total,
            onClickCheckout = {
                navController.navigate("checkout")
            },
            modifier = Modifier.align(Alignment.BottomCenter)
        )
    }
}