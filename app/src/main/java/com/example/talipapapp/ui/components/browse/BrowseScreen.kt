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
    import androidx.navigation.NavHostController
    import com.example.talipapapp.data.ProductRepository
    import com.example.talipapapp.data.SellerDataSource

    @Composable
    fun BrowseScreen(
        navController: NavHostController,
        category: String = "All"   // 🔥 receives from Home
    ) {

        Column(modifier = Modifier.fillMaxSize()) {

            BrowseHeaderSection()

            CategoryBar(
                initialCategory = category,   // 🔥 sync with Home selection
                onCategorySelected = { }
            )

            SellerListSection(
                sellers = SellerDataSource.sellers,
                navController = navController
            )
        }
    }