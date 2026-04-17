package com.example.talipapapp.ui.components.checkout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun CheckoutHeaderSection(
    navController: NavHostController,
    farmerName: String
) {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFF0F5E3B))
            .padding(top = 48.dp, start = 16.dp, end = 16.dp, bottom = 16.dp)
    ) {

        IconButton(
            onClick = { navController.popBackStack() }
        ) {
            Icon(
                imageVector = Icons.Default.ArrowBack,
                contentDescription = "Back",
                tint = Color.White
            )
        }

        Spacer(modifier = Modifier.width(4.dp))

        Column {
            Text(
                text = "Checkout",
                color = Color.White,
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = farmerName,
                color = Color(0xFFE0E0E0),
                style = MaterialTheme.typography.bodyMedium
            )
        }
    }
}