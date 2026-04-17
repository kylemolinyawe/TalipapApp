package com.example.talipapapp.data

import com.example.talipapapp.models.ProductDescription

object ProductDescriptions {

   private  val rawDescriptions = listOf(

        // =========================
        // VEGETABLES
        // =========================

        "Tomatoes (Kamatis)" to """
            **Fresh Kamatis (Tomatoes)**

            Locally grown Philippine tomatoes, harvested fresh from nearby farms.

            - Naturally ripened under the sun
            - Juicy and slightly tangy flavor
            - Perfect for salads, sauces, and stews
        """.trimIndent(),

        "Carrots (Karot)" to """
            **Fresh Karot (Carrots)**

            Crunchy and sweet carrots sourced from local vegetable farms.

            - High in beta-carotene
            - Great for soups and stir-fry
            - Naturally sweet flavor
        """.trimIndent(),

        "Eggplant (Talong)" to """
            **Talong (Eggplant)**

            A staple Filipino vegetable used in many traditional dishes.

            - Soft texture when cooked
            - Ideal for tortang talong and pinakbet
            - Locally farmed and freshly harvested
        """.trimIndent(),

        "Bitter Gourd (Ampalaya)" to """
            **Ampalaya (Bitter Gourd)**

            A healthy vegetable known for its distinct bitter taste.

            - Rich in vitamins and antioxidants
            - Common in ginisang ampalaya
        """.trimIndent(),

        "Okra" to """
            **Okra**

            Fresh green okra pods commonly used in Filipino soups.

            - High in fiber
            - Slightly slimy texture when cooked
            - Best for sinigang and stews
        """.trimIndent(),

        "String Beans (Sitaw)" to """
            **Sitaw (String Beans)**

            Long green beans widely used in Filipino dishes.

            - Crunchy texture
            - Ideal for adobo and ginisa
        """.trimIndent(),

        "Pechay" to """
            **Pechay**

            Leafy green vegetable commonly used in soups.

            - Mild flavor
            - High in vitamins A and C
        """.trimIndent(),

        "Kangkong" to """
            **Kangkong (Water Spinach)**

            A popular leafy vegetable in Filipino cuisine.

            - Fast-growing and nutrient-rich
            - Used in sinigang and adobo
        """.trimIndent(),

        // =========================
        // FRUITS
        // =========================

        "Mango (Carabao Mango)" to """
            **Carabao Mango**

            Sweet and premium Philippine mango variety.

            - Extremely sweet when ripe
            - Juicy and fragrant
        """.trimIndent(),

        "Banana (Lakatan)" to """
            **Lakatan Banana**

            A popular sweet banana variety in the Philippines.

            - Naturally sweet flavor
            - Soft texture when ripe
        """.trimIndent(),

        "Pineapple (Formosa)" to """
            **Formosa Pineapple**

            Sweet and tangy tropical fruit.

            - High juice content
            - Refreshing taste
        """.trimIndent(),

        "Papaya" to """
            **Papaya**

            Soft tropical fruit rich in enzymes.

            - Supports digestion
            - Sweet when ripe
        """.trimIndent(),

        "Watermelon (Pakwan)" to """
            **Pakwan (Watermelon)**

            Juicy and refreshing summer fruit.

            - High water content
            - Naturally sweet and hydrating
        """.trimIndent(),

        "Calamansi" to """
            **Calamansi**

            Small citrus fruit widely used in Filipino cooking.

            - Strong citrus flavor
            - Rich in vitamin C
        """.trimIndent(),

        "Avocado" to """
            **Avocado**

            Creamy fruit often eaten fresh or with sugar/milk.

            - Healthy fats
            - Smooth creamy texture
        """.trimIndent(),

        "Guyabano (Soursop)" to """
            **Guyabano**

            Tropical fruit with sweet-sour flavor.

            - Soft white flesh
            - Rich in antioxidants
        """.trimIndent(),

        // =========================
        // MEAT / FISH / POULTRY
        // =========================

        "Pork Belly (Liempo)" to """
            **Pork Belly (Liempo)**

            A fatty and flavorful pork cut popular in Filipino BBQ.

            - Rich and juicy texture
            - Perfect for grilling or frying
        """.trimIndent(),

        "Pork Lean Meat" to """
            **Pork Lean Meat**

            Lean cut of pork with less fat.

            - High protein content
            - Great for adobo and stir-fry
        """.trimIndent(),

        "Beef Brisket" to """
            **Beef Brisket**

            A flavorful beef cut ideal for slow cooking.

            - Rich beef flavor
            - Best for stews and soups
        """.trimIndent(),

        "Beef Shank (Bulalo Cut)" to """
            **Beef Shank (Bulalo Cut)**

            Bone-in beef cut used for soups.

            - Rich marrow flavor
            - Perfect for bulalo
        """.trimIndent(),

        "Tilapia" to """
            **Tilapia**

            Common freshwater fish in the Philippines.

            - Mild flavor
            - Affordable and widely available
        """.trimIndent(),

        "Bangus (Milkfish)" to """
            **Bangus**

            The national fish of the Philippines.

            - Soft and flavorful meat
            - Best for fried or grilled dishes
        """.trimIndent(),

        "Galunggong" to """
            **Galunggong**

            Affordable and widely eaten fish.

            - Strong flavor
            - Filipino staple seafood
        """.trimIndent(),

        "Shrimp (Hipon)" to """
            **Shrimp**

            Fresh seafood commonly used in Filipino dishes.

            - Sweet and juicy flavor
            - High in protein
        """.trimIndent(),

        "Squid (Pusit)" to """
            **Squid**

            Versatile seafood used in many dishes.

            - Slightly chewy texture
            - Rich ocean flavor
        """.trimIndent(),

        "Whole Chicken" to """
            **Whole Chicken**

            Freshly dressed whole chicken.

            - Versatile for any dish
            - High protein source
        """.trimIndent(),

        "Chicken Breast" to """
            **Chicken Breast**

            Lean chicken cut with high protein.

            - Low fat content
            - Great for healthy meals
        """.trimIndent(),

        "Chicken Thigh" to """
            **Chicken Thigh**

            Juicy and flavorful chicken cut.

            - More tender than breast
            - Rich flavor
        """.trimIndent(),

        "Duck Meat" to """
            **Duck Meat**

            Rich and flavorful poultry option.

            - Stronger taste than chicken
            - High fat content
        """.trimIndent(),

        "Free-range Eggs (Dozen)" to """
            **Free-range Eggs**

            Fresh eggs from free-range chickens.

            - Richer taste
            - High protein source
        """.trimIndent()
    )

    val list: List<ProductDescription> = rawDescriptions.mapIndexed { index, pair ->
        ProductDescription(
            id = index + 1,
            name = pair.first,
            description = pair.second
        )
    }
}


