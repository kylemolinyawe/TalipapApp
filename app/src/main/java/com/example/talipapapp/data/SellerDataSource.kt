package com.example.talipapapp.data

import com.example.talipapapp.models.Product
import com.example.talipapapp.models.Seller


object SellerDataSource {

    // 🔹 RAW SELLERS (no IDs)
    private val rawSellers = listOf(
        Triple("Farmer Juan", "30 mins", 50.0),
        Triple("Farmer Cortez", "30 mins", 50.0),
        Triple("Farmer Ana", "45 mins", 40.0)
    )

    // 🔹 FINAL SELLERS (IDs auto-generated)
    val sellers = rawSellers.mapIndexed { index, (name, deliveryTime, deliveryFee) ->
        Seller(
            id = index + 1,
            name = name,
            deliveryTime = deliveryTime,
            deliveryFee = deliveryFee,
            imageUrl = ""
        )
    }
    private val rawProducts = listOf(
        Triple(1, "Tomatoes", 20.0),
        Triple(1, "Carrots", 35.0),
        Triple(1, "Milk", 50.0),
        Triple(1, "Milk", 50.0),
        Triple(1, "Milk", 50.0),
        Triple(1, "Milk", 50.0),
        Triple(1, "Milk", 50.0),
        Triple(1, "Milk", 50.0),
        Triple(2, "Eggs", 10.0),
        Triple(2, "Eggs", 10.0),
        Triple(2, "Eggs", 10.0),
        Triple(2, "Eggs", 10.0),
        Triple(2, "Eggs", 10.0),
        Triple(2, "Eggs", 10.0),
        Triple(2, "Eggs", 10.0),
        Triple(2, "Eggs", 10.0),
        Triple(3, "Mango", 10.0),
        Triple(3, "Mango", 10.0),
        Triple(3, "Mango", 10.0),
        Triple(3, "Mango", 10.0),
        Triple(3, "Mango", 10.0),
        Triple(3, "Mango", 10.0),
        Triple(3, "Mango", 10.0),
        Triple(3, "Mango", 10.0)
    )


    val products = rawProducts.mapIndexed { index, (sellerId, name, price) ->
        Product(
            id = index + 1,
            sellerId = sellerId,
            name = name,
            price = price,
            imageUrl = ""
        )
    }
}
