package com.example.talipapapp.data

import com.example.talipapapp.models.Product

object ProductDataSource {

    data class ProductRaw(
        val sellerId: Int,
        val name: String,
        val price: Double,
        val category: String,
        val imageUrl: String
    )

    private val rawProducts = listOf(

        // SELLER 1 - VEGETABLES
        ProductRaw(1, "Tomatoes (Kamatis)", 25.0, "Vegetables", "https://t4.ftcdn.net/jpg/00/60/56/89/360_F_60568941_XGMX5shUGjF6Oz3B21ICojozyf1FBqmY.jpg"),
        ProductRaw(1, "Carrots (Karot)", 35.0, "Vegetables", "https://www.lovefoodhatewaste.com/sites/default/files/styles/16_9_two_column/public/2022-06/Carrots.jpg.webp?itok=Z9YUwhCd"),
        ProductRaw(1, "Eggplant (Talong)", 30.0, "Vegetables", "https://hudsonvalleyseed.com/cdn/shop/products/370FB710-0AF4-4C69-90E3-9643D049DFB2_1.jpg?v=1735580360&width=1500"),
        ProductRaw(1, "Bitter Gourd (Ampalaya)", 45.0, "Vegetables" ,"https://pindotlang.com/cdn/shop/products/IMG_20220108_055752_13a417ca-11d3-4f09-88bc-ea744440ff81.jpg?v=1642040443"),
        ProductRaw(1, "Okra", 28.0, "Vegetables", "https://static.wixstatic.com/media/9214ba_5fe5b1a6693f439382c8d717c4a3734f~mv2.jpg/v1/fill/w_568,h_524,al_c,q_80,usm_0.66_1.00_0.01,enc_avif,quality_auto/9214ba_5fe5b1a6693f439382c8d717c4a3734f~mv2.jpg"),
        ProductRaw(1, "String Beans (Sitaw)", 32.0, "Vegetables","https://media-cdn2.greatbritishchefs.com/media/juidxweh/img83268.whqc_1426x713q80.jpg"),
        ProductRaw(1, "Pechay", 20.0, "Vegetables", "https://thegrowersdiary.wordpress.com/wp-content/uploads/2020/05/bok-choy-1.jpg?w=540"),
        ProductRaw(1, "Kangkong", 18.0, "Vegetables", "https://yummykitchentv.com/wp-content/uploads/2023/04/WATER-SPINACH_RESIZED1-1024x768.jpg"),

        ProductRaw(1, "Avocado", 95.0, "Fruits", "https://cdn.britannica.com/72/170772-050-D52BF8C2/Avocado-fruits.jpg"),
        ProductRaw(1, "Guyabano", 120.0, "Fruits", "https://bagsakanbyedds.com/cdn/shop/products/istockphoto-1211330897-170667a_481x.jpg?v=1602126203"),
        ProductRaw(1, "Orange (Dalandan)", 70.0, "Fruits", "https://www.dole.com/sites/default/files/media/2025-01/oranges.png"),
        ProductRaw(1, "Apple", 120.0, "Fruits", "https://www.freshorganics.com.au/wp-content/uploads/2025/05/Organic-Apples-Red-Delicious-500g-1.png"),
        ProductRaw(1, "Grapes", 150.0, "Fruits", "https://i0.wp.com/post.healthline.com/wp-content/uploads/2022/04/black-grapes-1296x728-header.jpg?w=1155&h=1528"),
        ProductRaw(1, "Lanzones", 95.0, "Fruits", "https://thumbs.dreamstime.com/b/ripe-yellow-lanzones-fruit-closeup-studio-shot-close-up-bunch-pale-white-background-two-cut-half-revealing-their-360719035.jpg"),
        ProductRaw(1, "Durian", 180.0, "Fruits", "https://th-thumbnailer.cdn-si-edu.com/lRYhWEjayG12jDi1HF83beW7eyw=/fit-in/1600x0/https://tf-cmsv2-smithsonianmag-media.s3.amazonaws.com/filer/a3/08/a308890c-0ee2-43dd-9337-ac562bf82dc3/1200px-durian.jpg"),
        ProductRaw(1, "Mangosteen", 130.0, "Fruits", "https://plantsvilla.com/wp-content/uploads/2025/05/81vd5x7wDjL._AC_UF10001000_QL80_.jpg"),

        ProductRaw(1, "Pork Belly (Liempo)", 320.0, "Pork", "https://www.tenderbites.ph/media/catalog/product/cache/6658c6986eb36f9bee022e602f6cd310/p/r/premium_country_style_-_skin-on_-_gallery_images_04_-_1200x900.jpg"),
        ProductRaw(1, "Pork Lean Meat", 280.0, "Pork", "https://bagsakanbyedds.com/cdn/shop/products/7dbb03a3-dc6d-43fa-a200-d9b76392f26f2_8cd3faeb-da68-43b1-a7e3-df02f6218627_390x.jpg?v=1635230709"),
        ProductRaw(1, "Pork Chop", 300.0, "Pork", "https://www.tenderbites.ph/media/catalog/product/cache/6658c6986eb36f9bee022e602f6cd310/2/_/2_pork_chop_-_skinless_raw_gallery_2_1.jpg"),
        ProductRaw(1, "Pork Shoulder (Kasim)", 270.0, "Pork", "https://www.oldsaltco-op.com/cdn/shop/files/PorkShoulderRoast-2.jpg?v=1744048055"),
        ProductRaw(1, "Pork Ribs", 350.0, "Pork", "https://en.horizonfarms.jp/cdn/shop/files/HFC06883.jpg?v=1724380963&width=1600"),
        ProductRaw(1, "Pork Sisig Cut", 290.0, "Pork", "https://www.seriouseats.com/thmb/M96nArK3x_xS82QefqqTS6vlK9c=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/20210805-Sisig-Rezel-3-54f6cca619ac488b94ab8f8bc7904894.jpg"),
        ProductRaw(1, "Pork Belly Slice", 340.0, "Pork", "https://shopsuki.ph/cdn/shop/products/107989352-PorkBellySliced_Approx.1kg_1024x.jpg?v=1640075549"),
        ProductRaw(1, "Ground Pork", 260.0, "Pork", "https://bountyfreshmarket.ph/cdn/shop/files/Groundpork_3084x.jpg?v=1689657846"),

        ProductRaw(1, "Beef Brisket", 450.0, "Beef", "https://carnistore.com/cdn/shop/files/BrisketFlat.jpg?v=1770997704&width=1500"),
        ProductRaw(1, "Beef Shank (Bulalo Cut)", 420.0, "Beef", "https://butcherssecrets.ph/cdn/shop/files/BEEF_BULALO_CUT_1080.jpg?v=1750391652"),
        ProductRaw(1, "Beef Sirloin", 480.0, "Beef", "https://consistent.com.ph/wp-content/uploads/2022/09/sirloin2.jpg"),
        ProductRaw(1, "Beef Ground", 350.0, "Beef", "https://3lakesranch.net/cdn/shop/articles/fresh_raw_minced_beef.png?v=1714549474"),
        ProductRaw(1, "Beef Short Ribs", 500.0, "Beef", "https://www.recipetineats.com/tachyon/2019/02/Raw-Beef-Short-Ribs_9.jpg"),
        ProductRaw(1, "Beef Tapa Cut", 420.0, "Beef", "https://www.wikihow.life/images/thumb/c/c3/Make-Tapa-Step-1-Version-2.jpg/aid1009384-v4-728px-Make-Tapa-Step-1-Version-2.jpg"),
        ProductRaw(1, "Beef Tenderloin", 650.0, "Beef", "https://lacarne.ph/cdn/shop/files/AngTenderloinMB2-SKUMEAT338.png?v=1732281279"),
        ProductRaw(1, "Beef Ox Tail", 520.0, "Beef", "https://whiteoakpastures.com/cdn/shop/files/oxtails.png?v=1707177241"),

        ProductRaw(1, "Whole Chicken", 180.0, "Chicken", "https://primecutny.com/cdn/shop/files/Broiler_Chicken.jpg?v=1740504373"),
        ProductRaw(1, "Chicken Breast", 220.0, "Chicken", "https://fishnchix.ph/cdn/shop/products/ChickenBreastWhole.jpg?v=1633832119"),
        ProductRaw(1, "Chicken Thigh", 200.0, "Chicken", "https://fishnchix.ph/cdn/shop/files/ChickenThigh.webp?v=1701308169"),
        ProductRaw(1, "Chicken Wings", 210.0, "Chicken", "https://media.istockphoto.com/id/489516996/photo/raw-chicken-wings-isolated-on-white-background.jpg?s=612x612&w=0&k=20&c=0wJ7DOsttlBj3BeBRzRd1tYHYRDTTkWM4j3CdUhZ6Vc="),
        ProductRaw(1, "Chicken Drumstick", 200.0, "Chicken", "https://deligoodph.com/cdn/shop/products/IMG_5183_1024x1024@2x.jpg?v=1622465398"),
        ProductRaw(1, "Chicken Gizzard", 140.0, "Chicken", "https://shop.tapaoagri.com/wp-content/uploads/2023/11/Raw-chicken-gizzards-by-mikroman6-2000-769a332c27214909bafa4a9a1ac3f678.jpg"),
        ProductRaw(1, "Chicken Liver", 130.0, "Chicken", "https://fishnchix.ph/cdn/shop/products/Chickenliver.jpg?v=1630496735"),

        ProductRaw(1, "Tilapia", 120.0, "Fish", "https://static.vecteezy.com/system/resources/previews/004/850/956/large_2x/fresh-tilapia-fish-for-cooking-food-two-raw-nile-tilapia-freshwater-fish-on-wooden-wooden-board-free-photo.JPG"),
        ProductRaw(1, "Bangus (Milkfish)", 160.0, "Fish", "https://goodfinds.ph/wp-content/uploads/2022/08/Daing-Bangus.jpg"),
        ProductRaw(1, "Galunggong", 140.0, "Fish", "https://fishnchix.ph/cdn/shop/products/image_76.jpg?v=1630229461"),
        ProductRaw(1, "Shrimp (Hipon)", 300.0, "Fish", "https://www.thespruceeats.com/thmb/0gsV1UBQRHLatCeepQ2rrr0sDNo=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/rawshrimp_getty2400-56a498603df78cf77283283c.jpg"),
        ProductRaw(1, "Squid (Pusit)", 280.0, "Fish", "https://goodfinds.ph/wp-content/uploads/2022/08/pusitadobo.jpg"),
        ProductRaw(1, "Salmon Slice", 600.0, "Fish", "https://www.koreanbapsang.com/wp-content/uploads/2021/10/DSC1852-640x427.jpg"),
        ProductRaw(1, "Tuna Steak", 450.0, "Fish", "https://www.tastingtable.com/img/gallery/14-tips-you-need-when-cooking-with-tuna/l-intro-1671563002.jpg"),
        ProductRaw(1, "Mackerel (Hasa-hasa)", 160.0, "Fish", "https://www.fetchyourpetneeds.ie/cdn/shop/files/39c75fd25fc978db8e126c771f96d377.png?v=1769648123&width=1080"),
        ProductRaw(1, "Sardines Fresh", 110.0, "Fish", "https://rawandfresh.com.au/cdn/shop/products/sardines7pack_1880x_8862d1fd-1551-48b8-a994-f66ed76b8107.png?v=1595551642"),
        ProductRaw(1, "Mudfish (Dalag)", 170.0, "Fish", "https://thumbs.dreamstime.com/b/chevron-snakehead-murrel-white-background-175660605.jpg"),
        ProductRaw(1, "Crab", 380.0, "Fish", "https://bbqdelicious.com.au/cdn/shop/files/blue_swimmer_crab_meat.jpg?v=1743133063"),

        ProductRaw(1, "Free-range Eggs (Dozen)", 12.0, "Dairy", "https://thepricklypineapple.com/cdn/shop/products/12-dozen-Eggs.jpg?v=1585185074&width=1214"),
        ProductRaw(1, "Fresh Milk (1L)", 90.0, "Dairy", "https://www.organics.ph/cdn/shop/products/feel-well-raw-buffalo-milk-240ml-pre-order-1-wk-delivery-dairy-feel-well-synbiotic-food-517547_1000x.jpg?v=1651652204"),
        ProductRaw(1, "Cheese Block", 180.0, "Dairy", "https://images.squarespace-cdn.com/content/v1/5eb43938f468c330e7d8d665/442e6236-a70f-49ce-aef9-6f7eab628b39/Borracho+with+San+Miguel+Cerveza+Negra+credit+Malagos+Farmhouse.jpg"),
        ProductRaw(1, "Butter", 160.0, "Dairy", "https://m.media-amazon.com/images/I/71ozw6+oLSL._SL1500_.jpg"),
        ProductRaw(1, "Yogurt", 70.0, "Dairy", "https://www.culturedfoodlife.com/wp-content/uploads/2021/06/Raw-milk-yogurt.4.jpg"),
        ProductRaw(1, "Condensed Milk", 85.0, "Dairy", "https://www.savoryexperiments.com/wp-content/uploads/2024/07/Condensed-Milk_Caramel-3.jpg"),

        // SELLER 2
        ProductRaw(2, "Mango (Carabao Mango)", 90.0, "Fruits", "https://alphonsomango.in/cdn/shop/articles/alphonso-mango-online-madurai-3914928.jpg?v=1771429330&width=1200"),
        ProductRaw(2, "Banana (Lakatan)", 60.0, "Fruits", "https://crop-protection.basf.ph/sites/basf.co.ph/files/2023-07/banana.jpg"),
        ProductRaw(2, "Pineapple (Formosa)", 85.0, "Fruits", "https://7641islands.ph/wp-content/uploads/2022/03/PLYGRND-308953-scaled.jpg"),
        ProductRaw(2, "Papaya", 55.0, "Fruits", "https://agora.uplb.edu.ph/wp-content/uploads/2022/03/17-Sinta-Papaya-2-1.png"),
        ProductRaw(2, "Watermelon (Pakwan)", 110.0, "Fruits", "https://www.asiafarming.com/wp-content/uploads/2024/01/Watermelon-Farming-in-the-Philippines-4.jpg"),
        ProductRaw(2, "Calamansi", 25.0, "Fruits", "https://cdn.shopify.com/s/files/1/0557/4269/3571/files/calamansi-fruit_1_1024x1024.jpg?v=1700054424"),
        ProductRaw(2, "Avocado", 95.0, "Fruits", "https://www.tastingtable.com/img/gallery/how-filipino-cuisine-uses-avocado-as-a-delicious-dessert/l-intro-1660939272.jpg"),
        ProductRaw(2, "Guyabano", 120.0, "Fruits", "https://bagsakanbyedds.com/cdn/shop/products/istockphoto-1211330897-170667a_481x.jpg?v=1602126203"),

        // SELLER 3
        ProductRaw(3, "Pork Belly (Liempo)", 320.0, "Pork", "https://safeselect.ph/cdn/shop/products/Pork_liempo_inihaw_sliced_1_300x300.jpg?v=1641873756"),
        ProductRaw(3, "Pork Lean Meat", 280.0, "Pork", "https://www.tenderbites.ph/media/catalog/product/cache/6658c6986eb36f9bee022e602f6cd310/p/o/porkloin_-_skinless_-_boneless_-_gallery_images_02_-_1200x900.jpg"),

        ProductRaw(3, "Beef Brisket", 450.0, "Beef", "https://johnhenrys.net/cdn/shop/files/BeefBrisketUntrimmed.jpg?v=1707153502"),
        ProductRaw(3, "Beef Shank (Bulalo Cut)", 420.0, "Beef", "https://fishnchix.ph/cdn/shop/products/3.jpg?v=1633653541"),

        ProductRaw(3, "Whole Chicken", 180.0, "Chicken", "https://www.midamarhalal.com/cdn/shop/files/RawWholeChicken.jpg?v=1740159079"),
        ProductRaw(3, "Chicken Breast", 220.0, "Chicken", "https://www.thespruceeats.com/thmb/vOhouyHgfcn7DZ-ScX0YOD6T_y0=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/GettyImages-1127568336-ff8bd2c0f5df42a89a510b39389d9e9c.jpg"),
        ProductRaw(3, "Chicken Thigh", 200.0, "Chicken", "https://t3.ftcdn.net/jpg/04/38/46/62/360_F_438466211_HxbbAtbGN7KCYWUlEPVeHR7zG8Q8OsTW.jpg"),

        ProductRaw(3, "Tilapia", 120.0, "Fish", "https://img.freepik.com/premium-photo/raw-tilapia-fish-fillet-meat-cuts-white-background-top-view_249006-12927.jpg"),
        ProductRaw(3, "Bangus (Milkfish)", 160.0, "Fish", "https://fishnchix.ph/cdn/shop/files/bonelessbangusbelly_1800x1800_571e442e-a4b0-4251-98b2-7fc8039ad3aa.webp?v=1750384450"),
        ProductRaw(3, "Galunggong", 140.0, "Fish", "https://philregalo.com/cdn/shop/products/philregaloseafoods-galungong_1024x1024.jpg?v=1588670471"),
        ProductRaw(3, "Shrimp (Hipon)", 300.0, "Fish", "https://pacificbay.com.ph/cdn/shop/products/peeled-shrimp-medium-454670.jpg?v=1746000736"),
        ProductRaw(3, "Squid (Pusit)", 280.0, "Fish", "https://celeplate.co.uk/cdn/shop/files/WechatIMG8694.jpg?v=1753799360&width=1946"),

        ProductRaw(3, "Eggs (Free-range, dozen)", 12.0, "Dairy", "https://assets.landers.ph/catalog/product/1/1/114866-02.jpg")
    )

    val products = rawProducts.mapIndexed { index, productRaw ->

        val productId = index + 1

        Product(
            id = productId,
            sellerId = productRaw.sellerId,
            name = productRaw.name,
            price = productRaw.price,
            description = ProductDescriptions.list
                .find { it.id == productId }
                ?.description
                .orEmpty(),
            category = productRaw.category,
            imageUrl = productRaw.imageUrl
        )
    }
}