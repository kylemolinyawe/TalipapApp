package com.example.talipapapp.ui.components.checkout

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AttachMoney
import androidx.compose.material.icons.filled.Money
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun CheckoutPaymentSection(
    paymentMethod: String,
    totalPrice: Double,
    onChangeClick: () -> Unit,
    modifier: Modifier = Modifier
) {

    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {

        // 1st row: header + change button
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Text(
                text = "Payment method",
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.weight(1f))

            TextButton(
                onClick = onChangeClick,
                contentPadding = PaddingValues(0.dp)
            ) {
                Text(
                    text = "Change",
                    color = MaterialTheme.colorScheme.primary
                )
            }
        }

        // 2nd row: bordered container
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .border(
                    width = 1.dp,
                    color = Color.LightGray,
                    shape = RoundedCornerShape(12.dp)
                )
                .padding(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            // 1st column: icon
            Icon(
                imageVector = Icons.Default.Money,
                contentDescription = null
            )

            Spacer(modifier = Modifier.width(12.dp))

            // 2nd column: method name
            Text(
                text = paymentMethod,
                modifier = Modifier.weight(1f),
                style = MaterialTheme.typography.bodyLarge
            )

            // 3rd column: total price right-aligned
            Text(
                text = "₱ %.2f".format(totalPrice),
                fontWeight = FontWeight.Bold,
                textAlign = androidx.compose.ui.text.style.TextAlign.End
            )
        }
    }
}