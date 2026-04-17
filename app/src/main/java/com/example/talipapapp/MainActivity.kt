package com.example.talipapapp

import android.os.Bundle
import androidx.activity.*
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.graphics.*
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.talipapapp.ui.components.home.HomeScreen
import com.example.talipapapp.ui.components.profile.ProfileScreen
import com.example.talipapapp.ui.components.browse.BrowseScreen
import com.example.talipapapp.ui.components.cart.CartScreen
import com.example.talipapapp.ui.components.checkout.CheckoutScreen
import com.example.talipapapp.ui.components.foryou.ForYouScreen
import com.example.talipapapp.ui.theme.TalipapAppTheme
import com.example.talipapapp.utils.Constants

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TalipapAppTheme(dynamicColor = false, darkTheme = false) {
                val navController = rememberNavController()
                Surface(color = Color.White) {
                    // Scaffold Component
                    Scaffold(
                        // Global Background Color
                        containerColor = Color.White,
                        contentWindowInsets = WindowInsets(0, 0, 0, 0),
                        // Bottom navigation
                        bottomBar = {
                            BottomNavigationBar(navController = navController)
                        }, content = { padding ->
                            // Nav host: where screens are placed
                            NavHostContainer(navController = navController, padding = padding)
                        }
                    )
                }
            }
        }
    }
}

@Composable
fun NavHostContainer(
    navController: NavHostController,
    padding: PaddingValues
) {

    NavHost(
        navController = navController,

        // set the start destination
        startDestination = "cart",

        // Set the padding provided by scaffold
        modifier = Modifier.padding(paddingValues = padding),

        builder = {

            // route : Home
            composable("home") {
                HomeScreen()
            }

            // route : search
            composable("browse") {
                BrowseScreen()
            }

            composable("for you"){
                ForYouScreen()
            }

            composable("cart"){
                CartScreen(navController)
            }

            // route : profile
            composable("profile") {
                ProfileScreen()
            }

            composable("checkout") {
                CheckoutScreen(navController)
            }


        })
}

@Composable
fun BottomNavigationBar(navController: NavHostController) {

    NavigationBar(

        // set background color
        containerColor = Color(0xFF0F9D58)) {

        // observe the backstack
        val navBackStackEntry by navController.currentBackStackEntryAsState()

        // observe current route to change the icon
        // color,label color when navigated
        val currentRoute = navBackStackEntry?.destination?.route

        // Bottom nav items we declared
        Constants.BottomNavItems.forEach { navItem ->

            // Place the bottom nav items
            NavigationBarItem(

                // it currentRoute is equal then its selected route
                selected = currentRoute == navItem.route,

                // navigate on click
                onClick = {
                    navController.navigate(navItem.route)
                },

                // Icon of navItem
                icon = {
                    Icon(imageVector = navItem.icon, contentDescription = navItem.label)
                },

                // label
                label = {
                    Text(text = navItem.label)
                },
                alwaysShowLabel = false,

                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = Color.White, // Icon color when selected
                    unselectedIconColor = Color.White, // Icon color when not selected
                    selectedTextColor = Color.White, // Label color when selected
                    indicatorColor = Color(0xFF195334) // Highlight color for selected item
                )
            )
        }
    }
}