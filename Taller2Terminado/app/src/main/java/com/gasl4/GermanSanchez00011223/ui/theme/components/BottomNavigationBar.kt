package com.gasl4.GermanSanchez00011223.ui.theme.components


import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState

@Composable
fun BottomNavigationBar(navController: NavController) {
    val items = listOf("restaurants", "search", "orders")
    val navBackStackEntry = navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry.value?.destination?.route

    NavigationBar {
        items.forEach { screen ->
            NavigationBarItem(
                label = { Text(screen) },
                selected = currentRoute == screen,
                onClick = { navController.navigate(screen) },
                icon = { /* */ }
            )
        }
    }
}
