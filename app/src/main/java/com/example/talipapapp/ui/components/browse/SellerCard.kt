package com.example.talipapapp.ui.components.browse

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import com.example.talipapapp.models.Seller
import coil.compose.AsyncImage
import com.example.talipapapp.models.Product

@Composable
fun SellerCard(
    seller: Seller,
    products: List<Product>
) {

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),
        shape = RectangleShape
    ) {

        Column {

            // Seller Info
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {

                AsyncImage(
                    model = seller.imageUrl,
                    contentDescription = null,
                    modifier = Modifier
                        .size(68.dp)
                        .border(1.dp, Color.LightGray)
                )

                Spacer(modifier = Modifier.width(12.dp))

                Column {
                    Text(
                        seller.name,
                        style = MaterialTheme.typography.titleMedium
                    )

                    Text(
                        seller.location,
                        style = MaterialTheme.typography.bodySmall
                    )

                    Text(
                        seller.deliveryTime,
                        style = MaterialTheme.typography.bodySmall
                    )

                    Text(
                        text = "₱ %.2f".format(seller.deliveryFee),
                        style = MaterialTheme.typography.bodySmall
                    )
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Products (now from parameter)
            LazyRow(
                horizontalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                items(products) { product ->
                    ProductItem(
                        price = "₱ %.2f".format(product.price),
                        name = product.name,
                        imageUrl = product.imageUrl
                    )
                }
            }
        }
    }
}
