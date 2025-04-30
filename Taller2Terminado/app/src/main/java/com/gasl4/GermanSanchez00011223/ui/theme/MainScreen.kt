package com.gasl4.GermanSanchez00011223.ui.theme

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.gasl4.GermanSanchez00011223.data.dummyRestaurants
import com.gasl4.GermanSanchez00011223.ui.components.RestaurantItem

@Composable
fun MainScreen(navController: NavController) {
    val categories = dummyRestaurants.groupBy { it.category }

    LazyColumn(modifier = Modifier.padding(8.dp)) {
        categories.forEach { (category, restaurants) ->
            item {
                Text(
                    text = category,
                    modifier = Modifier.padding(vertical = 8.dp)
                )
                LazyRow {
                    items(restaurants) { restaurant ->
                        RestaurantItem(restaurant = restaurant) {
                            navController.navigate("menu/${restaurant.name}")
                        }
                    }
                }
            }
        }
    }
}
