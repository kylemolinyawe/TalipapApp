package com.example.talipapapp.ui.components.seller

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.talipapapp.data.SellerRepository
import com.example.talipapapp.data.ProductRepository

@Composable
fun SellerScreen(
    sellerId: Int,
    navController: NavHostController
) {

    val seller = SellerRepository.getSellerById(sellerId)

    val sellerProducts = ProductRepository.products.filter {
        it.sellerId == sellerId
    }

    val groupedProducts = sellerProducts.groupBy { it.category }

    Column(modifier = Modifier.fillMaxSize()) {

        // 🔹 STATIC TOP BAR (NOT SCROLLING)
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .statusBarsPadding()
                .padding(horizontal = 16.dp, vertical = 8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            IconButton(
                onClick = { navController.popBackStack() }
            ) {
                Icon(
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = "Back"
                )
            }
        }

        // 🔹 SCROLLABLE CONTENT ONLY
        LazyColumn(
            modifier = Modifier.fillMaxSize()
        ) {

            // Header
            item {
                seller?.let {
                    SellerHeaderSection(seller = it)
                }

                SellerFilterSection(
                    onSearch = { },
                    onFilterClick = { }
                )
            }

            item {
                SellerProductSection(
                    category = "All Products",
                    products = sellerProducts
                )
            }

            // Products by category
            groupedProducts.forEach { (category, products) ->

                item {
                    SellerProductSection(
                        category = category,
                        products = products
                    )
                }
            }
        }
    }
}