package com.example.talipapapp.data

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import com.example.talipapapp.models.Cart
import com.example.talipapapp.models.CartItem
import com.example.talipapapp.models.Product

object CartRepository {

    var cart by mutableStateOf(
        Cart(items = emptyList())
    )
        private set

    private val cartMap = mutableMapOf<Int, CartItem>()

    init {
        // 🔥 LOAD INITIAL ITEMS FROM DATA SOURCE HERE
        CartDataSource.cart.items.forEach { item ->
            cartMap[item.product.id] = item
        }

        syncCart()
    }

    fun getCartItem(productId: Int?): CartItem? {
        return cartMap[productId]
    }

    fun addToCart(product: Product) {
        val existing = cartMap[product.id]

        if (existing == null) {
            cartMap[product.id] = CartItem(product, 1)
        }

        syncCart()
    }

    fun increase(productId: Int) {
        val item = cartMap[productId] ?: return

        cartMap[productId] = item.copy(quantity = item.quantity + 1)

        syncCart()
    }

    fun decrease(productId: Int) {
        val item = cartMap[productId] ?: return

        val newQty = item.quantity - 1

        if (newQty > 0) {
            cartMap[productId] = item.copy(quantity = newQty)
        } else {
            cartMap.remove(productId)
        }

        syncCart()
    }

    private fun syncCart() {
        cart = Cart(items = cartMap.values.toList())
    }
}