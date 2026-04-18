package com.example.talipapapp.ui.components.cart

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.talipapapp.data.SellerDataSource
import com.example.talipapapp.models.CartItem
import com.example.talipapapp.models.Seller
import com.example.talipapapp.models.Product


@Composable
fun CartItemCard(
    item: CartItem,
    onDecrease: () -> Unit,
    onIncrease: () -> Unit,
    onClickProduct: (Int) -> Unit
) {

    val seller = SellerDataSource.sellers.find {
        it.id == item.product.sellerId
    }

    val price = item.product.price

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {

        // 👇 CLICKABLE AREA (image + product info)
        Row(
            modifier = Modifier
                .weight(1f)
                .clickable {
                    onClickProduct(item.product.id)
                },
            verticalAlignment = Alignment.CenterVertically
        ) {

            AsyncImage(
                model = item.product.imageUrl,
                contentDescription = null,
                modifier = Modifier
                    .size(64.dp)
                    .border(1.dp, Color.LightGray)
            )

            Spacer(modifier = Modifier.width(12.dp))

            Column {

                Text(item.product.name)

                Text(
                    seller?.name ?: "Unknown Seller",
                    style = MaterialTheme.typography.bodySmall,
                    color = Color.Gray
                )

                Text(
                    "₱ %.2f".format(price),
                    fontWeight = FontWeight.Bold
                )
            }
        }

        // quantity controls (NOT clickable for navigation)
        IconButton(onClick = onDecrease) { Text("-") }

        Text(item.quantity.toString())

        IconButton(onClick = onIncrease) { Text("+") }
    }
}