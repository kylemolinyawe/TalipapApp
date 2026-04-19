package com.example.talipapapp.ui.components.browse

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.Color

@Composable
fun CategoryBar(
    initialCategory: String = "All",
    onCategorySelected: (String) -> Unit = {}
) {

    val categories = listOf(
        "All",
        "Vegetables",
        "Fruits",
        "Dairy",
        "Pork",
        "Beef",
        "Chicken",
        "Fish"
    )

    var selectedCategory by remember { mutableStateOf(initialCategory) }

    LazyRow(
        modifier = Modifier.fillMaxWidth(),
        contentPadding = PaddingValues(horizontal = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(categories) { category ->

            FilterChip(
                selected = selectedCategory == category,
                onClick = {
                    selectedCategory = category
                    onCategorySelected(category) // 🔥 sends selection up
                },
                label = { Text(category) },
                shape = RoundedCornerShape(50),
                colors = FilterChipDefaults.filterChipColors(
                    selectedContainerColor = Color(0xFF0F5E3B),
                    selectedLabelColor = Color.White
                )
            )
        }
    }
}