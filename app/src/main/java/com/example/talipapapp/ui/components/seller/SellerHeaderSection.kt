package com.example.talipapapp.ui.components.seller

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Schedule
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.talipapapp.data.ProductRepository
import com.example.talipapapp.data.SellerDataSource
import com.example.talipapapp.data.SellerRepository
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

            // =========================
            // LEFT: IMAGE
            // =========================
            Box(
                modifier = Modifier
                    .size(72.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .border(
                        1.dp,
                        Color.LightGray,
                        RoundedCornerShape(12.dp)
                    )
            ) {
                AsyncImage(
                    model = seller.imageUrl,
                    contentDescription = null,
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop
                )
            }

            Spacer(modifier = Modifier.width(12.dp))

            // =========================
            // MIDDLE: SELLER INFO
            // =========================
            Column(
                modifier = Modifier.weight(1f)
            ) {
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

            // =========================
            // RIGHT: RATING
            // =========================
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {

                Icon(
                    imageVector = Icons.Default.Star,
                    contentDescription = "Rating",
                    tint = Color(0xFFFFC107)
                )

                Spacer(modifier = Modifier.width(4.dp))

                Text(
                    text = String.format("%.1f", seller.rating),
                    style = MaterialTheme.typography.bodyMedium,
                    fontWeight = FontWeight.Bold
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
                text = "Delivery time: ${seller.deliveryTime}",
                style = MaterialTheme.typography.bodyMedium
            )
        }

        Spacer(modifier = Modifier.height(12.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {

            // =========================
            // 1st COLUMN: YEARS ON PLATFORM
            // =========================
            Column(
                modifier = Modifier
                    .weight(1f)
                    .border(1.dp, Color.LightGray, RoundedCornerShape(12.dp))
                    .padding(8.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "${SellerRepository.getYearsOnPlatform(seller.id)} years",
                    fontWeight = FontWeight.Bold,
                    style = MaterialTheme.typography.bodyMedium
                )

                Text(
                    text = "On Platform",
                    style = MaterialTheme.typography.bodySmall,
                    color = Color.Gray
                )
            }

            // =========================
            // 2nd COLUMN: ORDERS
            // =========================
            Column(
                modifier = Modifier
                    .weight(1f)
                    .border(1.dp, Color.LightGray, RoundedCornerShape(12.dp))
                    .padding(8.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "${SellerRepository.getOrdersCompleted(seller.id)}",
                    fontWeight = FontWeight.Bold,
                    style = MaterialTheme.typography.bodyMedium
                )

                Text(
                    text = "Orders",
                    style = MaterialTheme.typography.bodySmall,
                    color = Color.Gray
                )
            }

            // =========================
            // 3rd COLUMN: PRODUCTS
            // =========================
            Column(
                modifier = Modifier
                    .weight(1f)
                    .border(1.dp, Color.LightGray, RoundedCornerShape(12.dp))
                    .padding(8.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                val productCount = ProductRepository.products.count {
                    it.sellerId == seller.id
                }

                Text(
                    text = "$productCount",
                    fontWeight = FontWeight.Bold,
                    style = MaterialTheme.typography.bodyMedium
                )

                Text(
                    text = "Products",
                    style = MaterialTheme.typography.bodySmall,
                    color = Color.Gray
                )
            }
        }
    }
}