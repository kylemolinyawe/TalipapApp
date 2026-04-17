package com.example.talipapapp.ui.components.cart

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CartHeaderSection(
    uniqueItems: Int,
    totalQuantity: Int
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFF0F5E3B))
            .padding(top = 48.dp, start = 16.dp, end = 16.dp, bottom = 16.dp)
    ) {
        Text(
            text = "My Cart",
            color = Color.White,
            fontWeight = FontWeight.Bold,
            fontSize = 32.sp
        )

        Text(
            text = "$uniqueItems products • $totalQuantity items - Est. delivery April 21",
            color = Color(0xFFE0E0E0)
        )
    }
}