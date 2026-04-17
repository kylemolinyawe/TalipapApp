package com.example.talipapapp.ui.components.cart

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun CartSubtotalSection(
    subtotal: Double,
    deliveryFee: Double,
    serviceFee: Double
) {
    val total = subtotal + deliveryFee + serviceFee

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
            .padding(16.dp)
    ) {

        Text(
            text = "Subtotal",
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(4.dp))

        PriceRow("Subtotal", subtotal)
        PriceRow("Delivery fee", deliveryFee)
        PriceRow("Service fee", serviceFee)

        Spacer(modifier = Modifier.height(4.dp))

    }
}