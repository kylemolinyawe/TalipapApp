package com.example.talipapapp.ui.components.home

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Eco
import androidx.compose.material.icons.filled.LocalDrink
import androidx.compose.material.icons.filled.LocalFlorist
import androidx.compose.material.icons.filled.SetMeal
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.talipapapp.R

@Composable
fun HomeCategoriesSection(
    onCategoryClick: (String) -> Unit
) {

    val categories = listOf(
        "Vegetables" to Icons.Default.Eco,
        "Fruits" to Icons.Default.LocalFlorist,
        "Dairy" to Icons.Default.LocalDrink,

        "Pork" to R.drawable.ic_pork,
        "Beef" to R.drawable.ic_beef,
        "Poultry" to R.drawable.ic_chicken,

        "Fish" to Icons.Default.SetMeal
    )

    Column(
        modifier = Modifier.fillMaxWidth()
    ) {

        // 🔹 Header
        Text(
            text = "Categories",
            style = MaterialTheme.typography.titleLarge,
            modifier = Modifier.padding(16.dp, 16.dp, 16.dp, 8.dp),
            fontWeight = FontWeight.Bold
        )

        // 🔹 Category row
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 12.dp)
        ) {

            items(categories) { (label, icon) ->

                val painter: Painter = when (icon) {
                    is ImageVector -> rememberVectorPainter(icon)
                    is Int -> painterResource(id = icon)
                    else -> error("Unsupported icon type")
                }

                FilterChipItem(
                    label = label,
                    icon = painter,
                    onClick = {
                        onCategoryClick(label) // 👉 sends category to navigation layer
                    }
                )
            }
        }
    }
}