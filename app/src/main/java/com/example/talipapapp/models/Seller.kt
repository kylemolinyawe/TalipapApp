package com.example.talipapapp.models

// Seller details
data class Seller(
    val id: Int,
    val name: String,
    val location: String,
    val deliveryTime: String,
    val deliveryFee: Double,
    val imageUrl: String
)