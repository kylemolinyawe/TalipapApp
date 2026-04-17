package com.example.talipapapp.ui.components.cart

import androidx.compose.foundation.background
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.talipapapp.models.CartItem


@Composable
fun CartItemsSection(
    items: List<CartItem>,
    onDecrease: (CartItem) -> Unit,
    onIncrease: (CartItem) -> Unit
) {
    LazyColumn(
        modifier = Modifier
            .background(Color.White)
    ) {
        items(items) { cartItem ->

            CartItemCard(
                item = cartItem,
                onDecrease = { onDecrease(cartItem) },
                onIncrease = { onIncrease(cartItem) }
            )
        }
    }
}