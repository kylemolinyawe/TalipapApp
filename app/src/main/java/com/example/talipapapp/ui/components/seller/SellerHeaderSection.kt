package com.example.talipapapp.ui.components.seller

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Schedule
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.talipapapp.models.Seller

@Composable
fun SellerHeaderSection(
    seller: Seller
) {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {

        // =========================
        // 1st Row: Image + Info
        // =========================
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {

            // 1st Column: Image box
            Box(
                modifier = Modifier
                    .size(72.dp)
                    .border(1.dp, Color.LightGray)
            ) {
                AsyncImage(
                    model = seller.imageUrl,
                    contentDescription = null,
                    modifier = Modifier.fillMaxSize()
                )
            }

            Spacer(modifier = Modifier.width(12.dp))

            // 2nd Column: Seller Info
            Column {
                Text(
                    text = seller.name,
                    style = MaterialTheme.typography.bodyLarge,
                    fontWeight = FontWeight.Bold
                )

                Text(
                    text = seller.location,
                    style = MaterialTheme.typography.bodyLarge,
                )

                Text(
                    text = "₱ %.2f delivery fee".format(seller.deliveryFee),
                    style = MaterialTheme.typography.bodyMedium
                )
            }
        }

        Spacer(modifier = Modifier.height(12.dp))

        // =========================
        // 2nd Row: Delivery Time
        // =========================
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {

            // 1st Column: icon
            Icon(
                imageVector = Icons.Default.Schedule,
                contentDescription = "Delivery Time"
            )

            Spacer(modifier = Modifier.width(8.dp))

            // 2nd Column: text
            Text(
                text = "Delivery time: 2 days",
                style = MaterialTheme.typography.bodyMedium
            )
        }
    }
}