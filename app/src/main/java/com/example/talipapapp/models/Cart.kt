package com.example.talipapapp.models

class Cart(
    val items: List<CartItem>
) {
    fun totalItems(): Int {
        return items.sumOf { it.quantity }
    }

    fun totalPrice(): Double {
        return items.sumOf {
            it.product.price * it.quantity
        }
    }
}