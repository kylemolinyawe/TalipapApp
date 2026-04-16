package com.example.talipapapp.ui.components.browse

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.talipapapp.data.SellerDataSource

@Composable
fun BrowseScreen() {

    Column(modifier = Modifier.fillMaxSize()) {

        // Header
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFF0F5E3B))
                .padding(top = 48.dp, start = 16.dp, end = 16.dp, bottom = 16.dp)
        ) {
            Text("Browse Produce", color = Color.White, fontWeight = FontWeight.Bold)
            Text("234 items available today", color = Color(0xFFE0E0E0))

            Spacer(modifier = Modifier.height(12.dp))

            OutlinedTextField(
                value = "",
                onValueChange = {},
                placeholder = { Text("Search products") },
                modifier = Modifier.fillMaxWidth(),
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = Color.White,
                    unfocusedContainerColor = Color.White
                )
            )
        }

        // Category Bar
        CategoryBar()

        // SCROLLABLE SELLER LIST
        Column(modifier = Modifier.fillMaxSize()) {

            LazyColumn {
                items(SellerDataSource.sellers) { seller ->

                    val sellerProducts = SellerDataSource.products
                        .filter { it.sellerId == seller.id }

                    SellerCard(
                        seller = seller,
                        products = sellerProducts
                    )
                }
            }
        }
    }
}