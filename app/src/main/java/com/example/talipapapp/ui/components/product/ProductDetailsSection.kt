package com.example.talipapapp.ui.components.product

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.talipapapp.data.CartDataSource
import com.example.talipapapp.data.CartRepository
import com.example.talipapapp.data.ProductRepository
import com.example.talipapapp.data.SellerDataSource
import com.example.talipapapp.models.Product

@Composable
fun ProductDetailsSection(
    product: Product,
    onAddToCart: () -> Unit,
    onIncrease: () -> Unit,
    onDecrease: () -> Unit,
    modifier: Modifier = Modifier
) {

    val cartItem = CartRepository.getCartItem(product.id)

    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {

        Text(
            text = product.name,
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "₱ %.2f".format(product.price),
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.SemiBold
        )

        Spacer(modifier = Modifier.height(16.dp))

        if (cartItem == null) {

            Button(
                onClick = onAddToCart,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Add to cart")
            }

        } else {

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

                TextButton(onClick = onDecrease) {
                    Text("-", style = MaterialTheme.typography.titleLarge)
                }

                Text(
                    text = cartItem.quantity.toString(),
                    modifier = Modifier.weight(1f),
                    textAlign = TextAlign.Center,
                    style = MaterialTheme.typography.titleMedium
                )

                TextButton(onClick = onIncrease) {
                    Text("+", style = MaterialTheme.typography.titleLarge)
                }
            }
        }
    }
}