package com.example.talipapapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import androidx.navigation.compose.*
import androidx.navigation.navArgument
import androidx.navigation.NavType
import com.example.talipapapp.ui.components.home.HomeScreen
import com.example.talipapapp.ui.components.profile.ProfileScreen
import com.example.talipapapp.ui.components.browse.BrowseScreen
import com.example.talipapapp.ui.components.cart.CartScreen
import com.example.talipapapp.ui.components.checkout.CheckoutScreen
import com.example.talipapapp.ui.components.foryou.ForYouScreen
import com.example.talipapapp.ui.components.product.ProductScreen
import com.example.talipapapp.ui.components.seller.SellerScreen
import com.example.talipapapp.ui.theme.TalipapAppTheme
import com.example.talipapapp.utils.Constants
import com.example.talipapapp.ui.theme.SetStatusBarColor

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContent {
            TalipapAppTheme(dynamicColor = false, darkTheme = false) {

                val navController = rememberNavController()

                val navBackStackEntry by navController.currentBackStackEntryAsState()
                val currentRoute = navBackStackEntry?.destination?.route

                // ✅ FIX 1: Proper route extraction (IMPORTANT)
                val baseRoute = currentRoute
                    ?.substringBefore("?")
                    ?.substringBefore("/")

                val hideBottomBarRoutes = listOf("checkout", "product", "seller")
                val showBottomBar = baseRoute !in hideBottomBarRoutes

                // 🎯 FIX 2: Decide ICON MODE, NOT COLOR
                val darkIcons = when (baseRoute) {
                    "home" -> false      // green header → white icons
                    "profile" -> false   // green header → white icons
                    "browse" -> false
                    "cart" -> false
                    "checkout" -> false
                    else -> true         // white screens → dark icons
                }

                // ✅ FIX 3: Apply system UI correctly
                SetStatusBarColor(
                    backgroundColor = Color.Transparent,
                    darkIcons = darkIcons
                )

                Scaffold(
                    containerColor = Color.White,
                    contentWindowInsets = WindowInsets(0, 0, 0, 0),

                    bottomBar = {
                        if (showBottomBar) {
                            BottomNavigationBar(navController)
                        }
                    }
                ) { padding ->

                    NavHostContainer(
                        navController = navController,
                        padding = padding
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
        startDestination = "cart",
        modifier = Modifier.padding(padding),
    ) {

        composable("home") {
            HomeScreen(navController) // 👈 needed for category navigation
        }

        // 🔥 FIXED: browse now accepts category argument
        composable(
            route = "browse?category={category}",
            arguments = listOf(
                navArgument("category") {
                    type = NavType.StringType
                    defaultValue = "All"
                }
            )
        ) { backStackEntry ->

            val category =
                backStackEntry.arguments?.getString("category") ?: "All"

            BrowseScreen(
                navController = navController,
                category = category
            )
        }

        composable("for you") {
            ForYouScreen()
        }

        composable("cart") {
            CartScreen(navController)
        }

        composable("profile") {
            ProfileScreen()
        }

        composable("checkout") {
            CheckoutScreen(navController)
        }

        composable("product/{productId}") { backStackEntry ->

            val productId = backStackEntry.arguments
                ?.getString("productId")
                ?.toInt()

            ProductScreen(
                productId = productId,
                navController = navController
            )
        }

        composable("seller/{sellerId}") { backStackEntry ->
            val sellerId = backStackEntry.arguments
                ?.getString("sellerId")
                ?.toInt() ?: 0

            SellerScreen(
                sellerId = sellerId,
                navController = navController
            )
        }
    }
}
@Composable
fun BottomNavigationBar(navController: NavHostController) {

    NavigationBar(containerColor = MaterialTheme.colorScheme.primary) {

        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route

        // 🔥 extract base route (IMPORTANT FIX)
        val currentBaseRoute = currentRoute?.substringBefore("?")?.substringBefore("/")

        Constants.BottomNavItems.forEach { navItem ->

            NavigationBarItem(

                // 🔥 FIX: compare base route only
                selected = currentBaseRoute == navItem.route,

                onClick = {

                    // optional: avoid stacking duplicate screens
                    navController.navigate(navItem.route) {
                        launchSingleTop = true
                        restoreState = true
                    }
                },

                icon = {
                    Icon(
                        imageVector = navItem.icon,
                        contentDescription = navItem.label
                    )
                },

                label = {
                    Text(text = navItem.label)
                },

                alwaysShowLabel = false,

                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = Color.White,
                    unselectedIconColor = Color.White,
                    selectedTextColor = Color.White,
                    indicatorColor = MaterialTheme.colorScheme.secondary
                )
            )
        }
    }
}