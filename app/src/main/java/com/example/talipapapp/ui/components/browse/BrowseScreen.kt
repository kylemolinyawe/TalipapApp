    package com.example.talipapapp.ui.components.browse

    import androidx.compose.foundation.background
    import androidx.compose.foundation.layout.*
    import androidx.compose.foundation.lazy.LazyColumn
    import androidx.compose.foundation.lazy.items
    import androidx.compose.material3.*
    import androidx.compose.runtime.Composable
    import androidx.compose.runtime.getValue
    import androidx.compose.runtime.mutableStateOf
    import androidx.compose.runtime.remember
    import androidx.compose.runtime.setValue
    import androidx.compose.ui.Modifier
    import androidx.compose.ui.graphics.Color
    import androidx.compose.ui.text.font.FontWeight
    import androidx.compose.ui.unit.dp
    import androidx.navigation.NavHostController
    import com.example.talipapapp.data.ProductRepository
    import com.example.talipapapp.data.SellerDataSource

    @Composable
    fun BrowseScreen(
        navController: NavHostController,
        category: String = "All"
    ) {

        var selectedCategory by remember { mutableStateOf(category) }

        Column(modifier = Modifier.fillMaxSize()) {

            BrowseHeaderSection()

            BrowseCategoriesSection(
                selectedCategory = selectedCategory,
                onCategorySelected = {
                    selectedCategory = it
                }
            )

            SellerListSection(
                sellers = SellerDataSource.sellers,
                selectedCategory = selectedCategory, // 🔥 IMPORTANT
                navController = navController
            )
        }
    }