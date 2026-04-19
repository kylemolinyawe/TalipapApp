package com.example.talipapapp.ui.components.home

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.talipapapp.models.Seller

@Composable
fun HomeFeaturedFarmersSection(
    sellers: List<Seller>,
    onSellerClick: (Int) -> Unit
) {

    val featuredSellers = sellers.take(10)

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp)
    ) {

        // Header
        Text(
            text = "Featured Farmers",
            style = MaterialTheme.typography.titleLarge,
            modifier = Modifier.padding(vertical = 8.dp),
            fontWeight = FontWeight.Bold
        )

        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            modifier = Modifier.fillMaxWidth()
        ) {

            items(featuredSellers) { seller ->

                Column(
                    modifier = Modifier
                        .width(140.dp)
                        .clickable {
                            onSellerClick(seller.id)
                        }
                ) {

                    // Image
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .aspectRatio(1f)
                            .clip(RoundedCornerShape(12.dp))
                            .border(
                                1.dp,
                                Color.LightGray,
                                RoundedCornerShape(12.dp)
                            )
                    ) {
                        AsyncImage(
                            model = seller.imageUrl,
                            contentDescription = seller.name,
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop // ✅ KEY FIX
                        )
                    }

                    Spacer(modifier = Modifier.height(6.dp))

                    // Seller name
                    Text(
                        text = seller.name,
                        style = MaterialTheme.typography.bodyLarge,
                        fontWeight = FontWeight.Bold,
                        maxLines = 1
                    )

                    // Location
                    Text(
                        text = seller.location,
                        style = MaterialTheme.typography.bodySmall,
                        maxLines = 1,
                        color = Color.Gray
                    )
                }
            }
        }
    }
}