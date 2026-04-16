package com.example.talipapapp.utils

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import com.example.talipapapp.models.BottomNavItem

object Constants {
    val BottomNavItems = listOf(

        // Home screen
        BottomNavItem(
            label = "Home",
            icon = Icons.Filled.Home,
            route = "home"
        ),

        // Search screen
        BottomNavItem(
            label = "Browse",
            icon = Icons.Filled.Search,
            route = "browse"
        ),

        // For You Screen
        BottomNavItem(
            label ="For You",
            icon = Icons.Filled.Star,
            route = "for you"
        ),

        // Cart Screen
        BottomNavItem(
            label ="Cart",
            icon = Icons.Filled.ShoppingCart,
            route = "cart"
        ),

        // Profile screen
        BottomNavItem(
            label = "Profile",
            icon = Icons.Filled.Person,
            route = "profile"
        )
    )
}


