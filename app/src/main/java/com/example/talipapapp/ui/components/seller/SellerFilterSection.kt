package com.example.talipapapp.ui.components.seller

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.shape.RoundedCornerShape
import com.example.talipapapp.R

@Composable
fun SellerFilterSection(
    modifier: Modifier = Modifier,
    onSearch: (String) -> Unit = {},
    onFilterClick: (String) -> Unit = {}
) {

    var searchText by remember { mutableStateOf("") }

    // Mixed icon sources (vector + drawable)
    val filters = listOf(
        "Vegetables" to Icons.Default.Eco,
        "Fruits" to Icons.Default.LocalFlorist,
        "Dairy" to Icons.Default.LocalDrink,

        "Pork" to R.drawable.ic_pork,
        "Beef" to R.drawable.ic_beef,
        "Poultry" to R.drawable.ic_chicken,

        "Fish" to Icons.Default.SetMeal
    )

    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp, 4.dp, 16.dp, 16.dp)
    ) {

        // 🔹 Row 1: Search Bar
        OutlinedTextField(
            value = searchText,
            onValueChange = {
                searchText = it
                onSearch(it)
            },
            placeholder = {
                Text("Search products and categories")
            },
            modifier = Modifier.fillMaxWidth(),
            singleLine = true,
            shape = RoundedCornerShape(12.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        // 🔹 Row 2: Filters
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            items(filters) { (label, icon) ->

                // ✅ Convert EVERYTHING into Painter
                val painter: Painter = when (icon) {
                    is ImageVector -> rememberVectorPainter(icon)
                    is Int -> painterResource(id = icon)
                    else -> error("Unsupported icon type")
                }

                FilterChipItem(
                    label = label,
                    icon = painter,
                    onClick = { onFilterClick(label) }
                )
            }
        }
    }
}