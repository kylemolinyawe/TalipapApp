package com.example.talipapapp.data

import com.example.talipapapp.models.Product
import com.example.talipapapp.models.Seller


object SellerDataSource {

    data class SellerRaw(
        val name: String,
        val deliveryTime: String,
        val deliveryFee: Double,
        val location: String
    )

    // 🔹 RAW SELLERS (no IDs)
    private val rawSellers = listOf(
        SellerRaw("Farmer Juan", "30 mins", 50.0, "Dasmariñas"),
        SellerRaw("Farmer Cortez", "30 mins", 50.0, "Imus"),
        SellerRaw("Farmer Ana", "45 mins", 40.0, "Silang")
    )

    // 🔹 FINAL SELLERS (IDs auto-generated)
    val sellers = rawSellers.mapIndexed { index, sellerRaw ->
        Seller(
            id = index + 1,
            name = sellerRaw.name,
            deliveryTime = sellerRaw.deliveryTime,
            deliveryFee = sellerRaw.deliveryFee,
            imageUrl = "",
            location = sellerRaw.location
        )
    }

    data class ProductRaw(
        val sellerId: Int,
        val name: String,
        val price: Double
    )

    private val rawProducts = listOf(
        ProductRaw(1, "Tomatoes", 20.0),
        ProductRaw(1, "Carrots", 35.0),
        ProductRaw(1, "Milk", 50.0),
        ProductRaw(1, "Milk", 50.0),
        ProductRaw(1, "Milk", 50.0),
        ProductRaw(1, "Milk", 50.0),
        ProductRaw(1, "Milk", 50.0),
        ProductRaw(1, "Milk", 50.0),
        ProductRaw(2, "Eggs", 10.0),
        ProductRaw(2, "Eggs", 10.0),
        ProductRaw(2, "Eggs", 10.0),
        ProductRaw(2, "Eggs", 10.0),
        ProductRaw(2, "Eggs", 10.0),
        ProductRaw(2, "Eggs", 10.0),
        ProductRaw(2, "Eggs", 10.0),
        ProductRaw(2, "Eggs", 10.0),
        ProductRaw(3, "Mango", 10.0),
        ProductRaw(3, "Mango", 10.0),
        ProductRaw(3, "Mango", 10.0),
        ProductRaw(3, "Mango", 10.0),
        ProductRaw(3, "Mango", 10.0),
        ProductRaw(3, "Mango", 10.0),
        ProductRaw(3, "Mango", 10.0),
        ProductRaw(3, "Mango", 10.0)
    )

    val products = rawProducts.mapIndexed { index, productRaw ->
        Product(
            id = index + 1,
            sellerId = productRaw.sellerId,
            name = productRaw.name,
            price = productRaw.price,
            imageUrl = ""
        )
    }
}
