package com.example.talipapapp.ui.components.checkout

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.talipapapp.data.CartDataSource
import com.example.talipapapp.data.CartRepository
import com.example.talipapapp.ui.components.cart.CartBottomSection
import com.example.talipapapp.ui.components.cart.CartHeaderSection
import com.example.talipapapp.ui.components.cart.CartItemCard
import com.example.talipapapp.ui.components.cart.CartSubtotalSection


@Composable
fun CheckoutScreen(navController: NavHostController) {

    val cart = CartRepository.cart

    val subtotal = cart.items.sumOf { it.product.price * it.quantity }
    val deliveryFee = 50.0
    val serviceFee = 5.0
    val total = subtotal + deliveryFee + serviceFee

    Column(modifier = Modifier.fillMaxSize()) {

        // static header
        CheckoutHeaderSection(
            navController = navController,
            farmerName = "Farmer Juan"
        )

        // scrollable content
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .weight(1f) // 👈 key fix
        ) {

            item {
                CheckoutAddressSection(
                    street = "134 Sampaguita St.",
                    city = "Dasmarinas City"
                )
            }

            item {
                CheckoutPaymentSection(
                    paymentMethod = "Cash on Delivery",
                    totalPrice = total,
                    onChangeClick = {
                        navController.navigate("browse")
                    }
                )
            }

            item {
                CheckoutSummarySection(
                    deliveryFee = deliveryFee,
                    serviceFee = serviceFee
                )
            }

            item {
                Spacer(modifier = Modifier.height(12.dp))
            }
        }

        CheckoutBottomSection(
            total = total,
            onClickCheckout = {
                navController.navigate("checkout")
            },
        )
    }
}