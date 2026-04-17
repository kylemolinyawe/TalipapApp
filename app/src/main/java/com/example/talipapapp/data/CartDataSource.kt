package com.example.talipapapp.data

import com.example.talipapapp.models.Cart
import com.example.talipapapp.models.CartItem
import com.example.talipapapp.data.SellerDataSource.products

object CartDataSource {

    val cart = Cart(
        items = listOf(
            CartItem(
                product = products[0],
                quantity = 2
            ),
            CartItem(
                product = products[2],
                quantity = 1
            ),
            CartItem(
                product = products[2],
                quantity = 1
            ),
            CartItem(
                product = products[2],
                quantity = 1
            ),
            CartItem(
                product = products[2],
                quantity = 1
            ),
            CartItem(
                product = products[2],
                quantity = 1
            ),
            CartItem(
                product = products[8],
                quantity = 5
            )
        )
    )
}