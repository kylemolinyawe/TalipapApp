package com.example.talipapapp.ui.components.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import java.util.Calendar

@Composable
fun HomeHeaderSection(
    userName: String = "Juan Dela Cruz",
    location: String = "Dasmariñas, Cavite",
    onSearch: (String) -> Unit = {}
) {

    var searchText by remember { mutableStateOf("") }

    val hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY)

    val greeting = when (hour) {
        in 5..11 -> "Good morning,"
        in 12..17 -> "Good afternoon,"
        else -> "Good evening,"
    }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFF2E7D32)) // 🌿 full green background (touches top edge)
            .statusBarsPadding()          // only affects content, NOT background
            .padding(16.dp, 0.dp, 16.dp, 16.dp)
    ) {

        // 🔹 ROW 1: Greeting
        Text(
            text = greeting,
            style = MaterialTheme.typography.titleMedium,
            color = Color.White
        )

        Spacer(modifier = Modifier.height(4.dp))

        // 🔹 ROW 2: User name
        Text(
            text = userName,
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold,
            color = Color.White
        )

        Spacer(modifier = Modifier.height(8.dp))

        // 🔹 ROW 3: Location
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Default.LocationOn,
                contentDescription = "Location",
                tint = Color.White
            )

            Spacer(modifier = Modifier.width(6.dp))

            Text(
                text = location,
                style = MaterialTheme.typography.bodyLarge,
                color = Color.White
            )
        }

        Spacer(modifier = Modifier.height(12.dp))

        // 🔹 ROW 4: Search bar (WHITE FIELD)
        OutlinedTextField(
            value = searchText,
            onValueChange = {
                searchText = it
                onSearch(it)
            },
            placeholder = {
                Text("Search products, farmers, categories...")
            },
            modifier = Modifier.fillMaxWidth(),
            singleLine = true,
            colors = OutlinedTextFieldDefaults.colors(
                focusedContainerColor = Color.White,
                unfocusedContainerColor = Color.White,
                focusedBorderColor = Color.Transparent,
                unfocusedBorderColor = Color.Transparent
            )
        )
    }
}