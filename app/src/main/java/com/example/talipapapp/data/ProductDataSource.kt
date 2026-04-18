package com.example.talipapapp.data

import com.example.talipapapp.models.Product
import com.example.talipapapp.data.ProductDescriptions

object ProductDataSource {
    data class ProductRaw(
        val sellerId: Int,
        val name: String,
        val price: Double
    )

    private val rawProducts = listOf(
        // Seller 1 (Vegetables)
        ProductRaw(1, "Tomatoes (Kamatis)", 25.0),
        ProductRaw(1, "Carrots (Karot)", 35.0),
        ProductRaw(1, "Eggplant (Talong)", 30.0),
        ProductRaw(1, "Bitter Gourd (Ampalaya)", 45.0),
        ProductRaw(1, "Okra", 28.0),
        ProductRaw(1, "String Beans (Sitaw)", 32.0),
        ProductRaw(1, "Pechay", 20.0),
        ProductRaw(1, "Kangkong", 18.0),

        // Seller 2 (Fruits)
        ProductRaw(2, "Mango (Carabao Mango)", 90.0),
        ProductRaw(2, "Banana (Lakatan)", 60.0),
        ProductRaw(2, "Pineapple (Formosa)", 85.0),
        ProductRaw(2, "Papaya", 55.0),
        ProductRaw(2, "Watermelon (Pakwan)", 110.0),
        ProductRaw(2, "Calamansi", 25.0),
        ProductRaw(2, "Avocado", 95.0),
        ProductRaw(2, "Guyabano", 120.0),

        // Seller 3 (Meat / Fish / Poultry)
        ProductRaw(3, "Pork Belly (Liempo)", 320.0),
        ProductRaw(3, "Pork Lean Meat", 280.0),
        ProductRaw(3, "Beef Brisket", 450.0),
        ProductRaw(3, "Beef Shank (Bulalo Cut)", 420.0),
        ProductRaw(3, "Tilapia", 120.0),
        ProductRaw(3, "Bangus (Milkfish)", 160.0),
        ProductRaw(3, "Galunggong", 140.0),
        ProductRaw(3, "Shrimp (Hipon)", 300.0),
        ProductRaw(3, "Squid (Pusit)", 280.0),
        ProductRaw(3, "Whole Chicken", 180.0),
        ProductRaw(3, "Chicken Breast", 220.0),
        ProductRaw(3, "Chicken Thigh", 200.0),
        ProductRaw(3, "Duck Meat", 260.0),
        ProductRaw(3, "Eggs (Free-range, dozen)", 12.0)
    )

    val products = rawProducts.mapIndexed { index, productRaw ->

        val productId = index + 1

        Product(
            id = productId,
            sellerId = productRaw.sellerId,
            name = productRaw.name,
            price = productRaw.price,
            imageUrl = "",
            description = ProductDescriptions.list
                .find { it.id == productId }
                ?.description
                .orEmpty()
        )
    }
}