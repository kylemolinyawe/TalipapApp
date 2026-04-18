package com.example.talipapapp.data

import com.example.talipapapp.models.Cart
import com.example.talipapapp.models.CartItem
import com.example.talipapapp.data.ProductDataSource.products

object CartDataSource {

    val cart = Cart(
        items = listOf(
            CartItem(
                product = products[0],
                quantity = 2
            ),
            CartItem(
                product = products[1],
                quantity = 1
            ),
            CartItem(
                product = products[3],
                quantity = 1
            ),
            CartItem(
                product = products[4],
                quantity = 1
            ),
            CartItem(
                product = products[6],
                quantity = 1
            ),
            CartItem(
                product = products[7],
                quantity = 1
            ),
            CartItem(
                product = products[2],
                quantity = 5
            )
        )
    )
}