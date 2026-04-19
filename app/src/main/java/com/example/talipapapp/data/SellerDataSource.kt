package com.example.talipapapp.data

import com.example.talipapapp.models.Product
import com.example.talipapapp.models.Seller


object SellerDataSource {

    data class SellerRaw(
        val name: String,
        val deliveryTime: String,
        val deliveryFee: Double,
        val location: String,
        val imageUrl: String,
        val rating: Double,
        val yearsOnPlatform: Int,
        val ordersCompleted: Int
    )

    // 🔹 RAW SELLERS (no IDs)
    private val rawSellers = listOf(
        SellerRaw(
            "Farmer Juan",
            "30 mins",
            50.0,
            "Dasmariñas",
            "https://t3.ftcdn.net/jpg/10/75/57/92/360_F_1075579237_p8jMSWZaucjSEDrto19Idy5cn9W7irCI.jpg",
            4.7,
            3,
            1231),

        SellerRaw(
            "Farmer Cortez",
            "30 mins",
            50.0,
            "Imus",
            "https://media.istockphoto.com/id/1287902722/photo/farmer-is-walking-on-the-field-farmers-farming-on-rice-terraces-ban-pa-bong-piang-the-most.jpg?s=612x612&w=0&k=20&c=ETCKLeBCi_qWsbErlp0GCirPxr7KKNRHt3UVcFQd_3M=",
            4.1,
            1,
            352),

        SellerRaw(
            "Farmer Ana",
            "45 mins",
            40.0,
            "Silang",
            "https://live.staticflickr.com/8286/7780079564_4d76e84162_z.jpg",
            4.3,
            4,
            2317)
    )

    // 🔹 FINAL SELLERS (IDs auto-generated)
    val sellers = rawSellers.mapIndexed { index, sellerRaw ->
        Seller(
            id = index + 1,
            name = sellerRaw.name,
            deliveryTime = sellerRaw.deliveryTime,
            deliveryFee = sellerRaw.deliveryFee,
            location = sellerRaw.location,
            imageUrl = sellerRaw.imageUrl,
            rating = sellerRaw.rating,
            yearsOnPlatform = sellerRaw.yearsOnPlatform,
            ordersCompleted = sellerRaw.ordersCompleted
        )
    }
}
