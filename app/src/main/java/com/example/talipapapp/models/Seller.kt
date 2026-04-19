package com.example.talipapapp.models

// Seller details
data class Seller(
    val id: Int,
    val name: String,
    val deliveryTime: String,
    val deliveryFee: Double,
    val location: String,
    val imageUrl: String,
    val rating: Double,
    val yearsOnPlatform: Int,
    val ordersCompleted: Int
)

