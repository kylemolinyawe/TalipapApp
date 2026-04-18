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
}
