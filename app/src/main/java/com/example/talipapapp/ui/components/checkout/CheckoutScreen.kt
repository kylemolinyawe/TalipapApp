package com.example.talipapapp.ui.components.checkout

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.talipapapp.data.CartDataSource
import com.example.talipapapp.ui.components.cart.CartBottomSection
import com.example.talipapapp.ui.components.cart.CartHeaderSection
import com.example.talipapapp.ui.components.cart.CartItemCard
import com.example.talipapapp.ui.components.cart.CartSubtotalSection


// Header
@Composable
fun CheckoutScreen(navController: NavHostController) {

    Column(modifier = Modifier.fillMaxSize()) {

        CheckoutHeaderSection(
            navController = navController,
            farmerName = "Farmer Juan" // later replace with dynamic data
        )

        // TODO: rest of checkout content
    }
}


