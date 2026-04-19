package com.example.talipapapp.data

import com.example.talipapapp.models.Product

object ProductDataSource {

    data class ProductRaw(
        val sellerId: Int,
        val name: String,
        val price: Double,
        val category: String
    )

    private val rawProducts = listOf(

        // SELLER 1 - VEGETABLES
        ProductRaw(1, "Tomatoes (Kamatis)", 25.0, "Vegetables"),
        ProductRaw(1, "Carrots (Karot)", 35.0, "Vegetables"),
        ProductRaw(1, "Eggplant (Talong)", 30.0, "Vegetables"),
        ProductRaw(1, "Bitter Gourd (Ampalaya)", 45.0, "Vegetables"),
        ProductRaw(1, "Okra", 28.0, "Vegetables"),
        ProductRaw(1, "String Beans (Sitaw)", 32.0, "Vegetables"),
        ProductRaw(1, "Pechay", 20.0, "Vegetables"),
        ProductRaw(1, "Kangkong", 18.0, "Vegetables"),

        ProductRaw(1, "Mango (Carabao Mango)", 90.0, "Fruits"),
        ProductRaw(1, "Banana (Lakatan)", 60.0, "Fruits"),
        ProductRaw(1, "Pineapple (Formosa)", 85.0, "Fruits"),
        ProductRaw(1, "Papaya", 55.0, "Fruits"),
        ProductRaw(1, "Watermelon (Pakwan)", 110.0, "Fruits"),
        ProductRaw(1, "Calamansi", 25.0, "Fruits"),
        ProductRaw(1, "Avocado", 95.0, "Fruits"),
        ProductRaw(1, "Guyabano", 120.0, "Fruits"),
        ProductRaw(1, "Orange (Dalandan)", 70.0, "Fruits"),
        ProductRaw(1, "Apple", 120.0, "Fruits"),
        ProductRaw(1, "Grapes", 150.0, "Fruits"),
        ProductRaw(1, "Lanzones", 95.0, "Fruits"),
        ProductRaw(1, "Durian", 180.0, "Fruits"),
        ProductRaw(1, "Mangosteen", 130.0, "Fruits"),

        ProductRaw(1, "Pork Belly (Liempo)", 320.0, "Pork"),
        ProductRaw(1, "Pork Lean Meat", 280.0, "Pork"),
        ProductRaw(1, "Pork Chop", 300.0, "Pork"),
        ProductRaw(1, "Pork Shoulder (Kasim)", 270.0, "Pork"),
        ProductRaw(1, "Pork Ribs", 350.0, "Pork"),
        ProductRaw(1, "Pork Sisig Cut", 290.0, "Pork"),
        ProductRaw(1, "Pork Belly Slice", 340.0, "Pork"),
        ProductRaw(1, "Ground Pork", 260.0, "Pork"),

        ProductRaw(1, "Beef Brisket", 450.0, "Beef"),
        ProductRaw(1, "Beef Shank (Bulalo Cut)", 420.0, "Beef"),
        ProductRaw(1, "Beef Sirloin", 480.0, "Beef"),
        ProductRaw(1, "Beef Ground", 350.0, "Beef"),
        ProductRaw(1, "Beef Short Ribs", 500.0, "Beef"),
        ProductRaw(1, "Beef Tapa Cut", 420.0, "Beef"),
        ProductRaw(1, "Beef Tenderloin", 650.0, "Beef"),
        ProductRaw(1, "Beef Ox Tail", 520.0, "Beef"),

        ProductRaw(1, "Whole Chicken", 180.0, "Poultry"),
        ProductRaw(1, "Chicken Breast", 220.0, "Poultry"),
        ProductRaw(1, "Chicken Thigh", 200.0, "Poultry"),
        ProductRaw(1, "Duck Meat", 260.0, "Poultry"),
        ProductRaw(1, "Chicken Wings", 210.0, "Poultry"),
        ProductRaw(1, "Chicken Drumstick", 200.0, "Poultry"),
        ProductRaw(1, "Chicken Gizzard", 140.0, "Poultry"),
        ProductRaw(1, "Chicken Liver", 130.0, "Poultry"),
        ProductRaw(1, "Whole Duck Premium", 300.0, "Poultry"),
        ProductRaw(1, "Organic Free-range Chicken", 250.0, "Poultry"),

        ProductRaw(1, "Tilapia", 120.0, "Fish"),
        ProductRaw(1, "Bangus (Milkfish)", 160.0, "Fish"),
        ProductRaw(1, "Galunggong", 140.0, "Fish"),
        ProductRaw(1, "Shrimp (Hipon)", 300.0, "Fish"),
        ProductRaw(1, "Squid (Pusit)", 280.0, "Fish"),
        ProductRaw(1, "Salmon Slice", 600.0, "Fish"),
        ProductRaw(1, "Tuna Steak", 450.0, "Fish"),
        ProductRaw(1, "Mackerel (Hasa-hasa)", 160.0, "Fish"),
        ProductRaw(1, "Sardines Fresh", 110.0, "Fish"),
        ProductRaw(1, "Mudfish (Dalag)", 170.0, "Fish"),
        ProductRaw(1, "Crab", 380.0, "Fish"),

        ProductRaw(1, "Free-range Eggs (Dozen)", 12.0, "Dairy"),
        ProductRaw(1, "Fresh Milk (1L)", 90.0, "Dairy"),
        ProductRaw(1, "Powdered Milk", 250.0, "Dairy"),
        ProductRaw(1, "Cheese Block", 180.0, "Dairy"),
        ProductRaw(1, "Butter", 160.0, "Dairy"),
        ProductRaw(1, "Yogurt", 70.0, "Dairy"),
        ProductRaw(1, "Condensed Milk", 85.0, "Dairy"),

        // SELLER 2
        ProductRaw(2, "Mango (Carabao Mango)", 90.0, "Fruits"),
        ProductRaw(2, "Banana (Lakatan)", 60.0, "Fruits"),
        ProductRaw(2, "Pineapple (Formosa)", 85.0, "Fruits"),
        ProductRaw(2, "Papaya", 55.0, "Fruits"),
        ProductRaw(2, "Watermelon (Pakwan)", 110.0, "Fruits"),
        ProductRaw(2, "Calamansi", 25.0, "Fruits"),
        ProductRaw(2, "Avocado", 95.0, "Fruits"),
        ProductRaw(2, "Guyabano", 120.0, "Fruits"),

        // SELLER 3
        ProductRaw(3, "Pork Belly (Liempo)", 320.0, "Pork"),
        ProductRaw(3, "Pork Lean Meat", 280.0, "Pork"),

        ProductRaw(3, "Beef Brisket", 450.0, "Beef"),
        ProductRaw(3, "Beef Shank (Bulalo Cut)", 420.0, "Beef"),

        ProductRaw(3, "Whole Chicken", 180.0, "Poultry"),
        ProductRaw(3, "Chicken Breast", 220.0, "Poultry"),
        ProductRaw(3, "Chicken Thigh", 200.0, "Poultry"),
        ProductRaw(3, "Duck Meat", 260.0, "Poultry"),

        ProductRaw(3, "Tilapia", 120.0, "Fish"),
        ProductRaw(3, "Bangus (Milkfish)", 160.0, "Fish"),
        ProductRaw(3, "Galunggong", 140.0, "Fish"),
        ProductRaw(3, "Shrimp (Hipon)", 300.0, "Fish"),
        ProductRaw(3, "Squid (Pusit)", 280.0, "Fish"),

        ProductRaw(3, "Eggs (Free-range, dozen)", 12.0, "Dairy")
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
                .orEmpty(),
            category = productRaw.category
        )
    }
}