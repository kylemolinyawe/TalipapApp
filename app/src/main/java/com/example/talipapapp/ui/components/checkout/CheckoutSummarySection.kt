package com.example.talipapapp.ui.components.checkout

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.talipapapp.data.CartDataSource
import com.example.talipapapp.data.CartRepository

@Composable
fun CheckoutSummarySection(
    deliveryFee: Double,
    serviceFee: Double,
    modifier: Modifier = Modifier
) {

    val cart = CartRepository.cart

    // ✅ computed subtotal
    val subtotal = cart.items.sumOf { item ->
        item.product.price * item.quantity
    }

    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {

        Text(
            text = "Order summary",
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold
        )


        // 2nd row: items
        Column {
            cart.items.forEach { item ->

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 4.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    Text(
                        text = "${item.quantity}x",
                        modifier = Modifier.width(40.dp)
                    )

                    Text(
                        text = item.product.name,
                        modifier = Modifier.weight(1f)
                    )

                    Text(
                        text = "₱ %.2f".format(item.product.price * item.quantity),
                    )
                }
            }
        }

        Divider(
            modifier = Modifier.padding(vertical = 12.dp),
            color = Color.LightGray
        )

        SummaryRow(label = "Subtotal", value = subtotal)
        SummaryRow(label = "Delivery fee", value = deliveryFee)
        SummaryRow(label = "Service fee", value = serviceFee)
    }
}