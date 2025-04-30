package com.gasl4.GermanSanchez00011223.ui.theme

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.gasl4.GermanSanchez00011223.data.dummyRestaurants

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MenuScreen(navController: NavController, restaurantName: String) {
    val context = LocalContext.current
    val restaurant = dummyRestaurants.find { it.name == restaurantName }
    var searchQuery by remember { mutableStateOf("") }

    restaurant?.let {
        Scaffold(
            topBar = {
                TopAppBar(
                    title = { Text(it.name) },
                    navigationIcon = {
                        IconButton(onClick = { navController.popBackStack() }) {
                            Icon(Icons.Default.ArrowBack, contentDescription = "Volver")
                        }
                    }
                )
            }
        ) { innerPadding ->
            Column(modifier = Modifier
                .padding(innerPadding)
                .padding(8.dp)) {

                Text(it.description, style = MaterialTheme.typography.bodyMedium)

                TextField(
                    value = searchQuery,
                    onValueChange = { searchQuery = it },
                    label = { Text("Buscar platillo") },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 8.dp)
                )

                LazyColumn {
                    val filteredMenu = it.menu.filter { item ->
                        item.name.contains(searchQuery, ignoreCase = true)
                    }

                    items(filteredMenu) { menuItem ->
                        Card(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(8.dp)
                        ) {
                            Row(modifier = Modifier.padding(8.dp)) {
                                Image(
                                    painter = painterResource(id = menuItem.imageRes),
                                    contentDescription = null,
                                    modifier = Modifier.size(80.dp)
                                )
                                Spacer(modifier = Modifier.width(8.dp))
                                Column {
                                    Text(menuItem.name, style = MaterialTheme.typography.titleMedium)
                                    Text(menuItem.description)
                                    Button(onClick = {
                                        Toast.makeText(
                                            context,
                                            "${menuItem.name} agregado al carrito",
                                            Toast.LENGTH_SHORT
                                        ).show()
                                    }) {
                                        Text("Agregar al carrito")
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
