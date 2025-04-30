package com.gasl4.GermanSanchez00011223.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.gasl4.GermanSanchez00011223.data.Restaurant

@Composable
fun RestaurantItem(restaurant: Restaurant, onClick: () -> Unit) {
    Card(
        modifier = Modifier.padding(8.dp).width(200.dp).clickable { onClick() },
        shape = RoundedCornerShape(10.dp)
    ) {
        Column {
            Image(
                painter = painterResource(id = restaurant.imageRes),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .height(120.dp)
                    .fillMaxWidth()
            )
            Text(
                text = restaurant.name,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                textAlign = TextAlign.Center
            )
        }
    }
}
