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
    quantity: Int,
    onAddToCart: () -> Unit,
    onIncrease: () -> Unit,
    onDecrease: () -> Unit,
    modifier: Modifier = Modifier
) {

    val buttonHeight = 52.dp

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
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.SemiBold
        )

        Spacer(modifier = Modifier.height(16.dp))

        if (quantity == 0) {

            Button(
                onClick = onAddToCart,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(buttonHeight) // 🔥 FIX
            ) {
                Text("Add to cart")
            }

        } else {

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(buttonHeight) // 🔥 FIX SAME HEIGHT
                    .border(
                        width = 1.dp,
                        color = Color.LightGray,
                        shape = RoundedCornerShape(12.dp)
                    )
                    .padding(horizontal = 12.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {

                TextButton(
                    onClick = onDecrease,
                    modifier = Modifier.fillMaxHeight()
                ) {
                    Text("-", style = MaterialTheme.typography.titleLarge)
                }

                Text(
                    text = quantity.toString(),
                    modifier = Modifier.weight(1f),
                    textAlign = TextAlign.Center,
                    style = MaterialTheme.typography.titleMedium
                )

                TextButton(
                    onClick = onIncrease,
                    modifier = Modifier.fillMaxHeight()
                ) {
                    Text("+", style = MaterialTheme.typography.titleLarge)
                }
            }
        }
    }
}