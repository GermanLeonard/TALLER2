package com.gasl4.myapplication.data

import com.gasl4.myapplication.R

val dummyRestaurants = listOf(
    Restaurant(
        name = "Burger King",
        description = "Las mejores hamburguesas de la ciudad.",
        category = "Comida Rapida",
        imageRes = R.drawable.burguerking,
        menu = listOf(
            MenuItem(
                name = "Hamburguesa Clasica",
                description = "Carne, queso y vegetales frescos.",
                imageRes = R.drawable.hamburguesa
            ),
            MenuItem(
                name = "Hamburguesa BBQ",
                description = "Sabor ahumado con salsa BBQ.",
                imageRes = R.drawable.carne
            )
        )
    ),
    Restaurant(
        name = "Taco Town",
        description = "Deliciosos tacos mexicanos autenticos.",
        category = "Comida Mexicana",
        imageRes = R.drawable.lapampa,
        menu = listOf(
            MenuItem(
                name = "Taco de Asada",
                description = "Carne asada y guacamole.",
                imageRes = R.drawable.restaurante_carne
            ),
            MenuItem(
                name = "Taco de Pastor",
                description = "Sabor tradicional mexicano.",
                imageRes = R.drawable.carne
            )
        )
    )
)


