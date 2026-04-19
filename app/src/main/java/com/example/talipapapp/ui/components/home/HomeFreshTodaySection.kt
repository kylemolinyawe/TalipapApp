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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.layout.ContentScale
import coil.compose.AsyncImage
import com.example.talipapapp.models.Product

@Composable
fun HomeFreshTodaySection(
    products: List<Product>,
    onProductClick: (Int) -> Unit
) {

    val freshProducts = products.take(10)

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp)
    ) {

        // Row 1: Header
        Text(
            text = "Fresh Today",
            style = MaterialTheme.typography.titleLarge,
            modifier = Modifier.padding(vertical = 8.dp),
            fontWeight = FontWeight.Bold
        )

        // Row 2: Product list
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            modifier = Modifier.fillMaxWidth()
        ) {

            items(freshProducts) { product ->

                Column(
                    modifier = Modifier
                        .width(140.dp)
                        .clickable {
                            onProductClick(product.id)
                        }
                ) {

                    // Image
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .aspectRatio(1f)
                            .clip(RoundedCornerShape(12.dp)) // clip FIRST so image respects corners
                            .border(1.dp, Color.LightGray, RoundedCornerShape(12.dp))
                    ) {
                        AsyncImage(
                            model = product.imageUrl,
                            contentDescription = product.name,
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop // fills container
                        )
                    }

                    Spacer(modifier = Modifier.height(6.dp))

                    // Price
                    Text(
                        text = "₱ %.2f".format(product.price),
                        style = MaterialTheme.typography.bodyLarge,
                        fontWeight = FontWeight.Bold
                    )

                    // Name
                    Text(
                        text = product.name,
                        style = MaterialTheme.typography.bodySmall,
                        maxLines = 2
                    )
                }
            }
        }
    }
}