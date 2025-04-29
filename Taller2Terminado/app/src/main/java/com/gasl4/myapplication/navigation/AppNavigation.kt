package com.gasl4.myapplication.navigation


import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.gasl4.myapplication.ui.theme.MainScreen
import com.gasl4.myapplication.ui.MenuScreen
import com.gasl4.myapplication.ui.theme.OrdersScreen
import com.gasl4.myapplication.ui.theme.SearchScreen

@Composable
fun AppNavigation(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "restaurants") {
        composable("restaurants") {
            MainScreen(navController)
        }
        composable("search") {
            SearchScreen(navController)
        }
        composable("orders") {
            OrdersScreen(navController)
        }
        composable("menu/{restaurantName}") { backStackEntry ->
            val restaurantName = backStackEntry.arguments?.getString("restaurantName") ?: ""
            MenuScreen(navController, restaurantName)
        }
    }
}
