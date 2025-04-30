package com.gasl4.GermanSanchez00011223.data

import com.gasl4.GermanSanchez00011223.R

val dummyRestaurants = listOf(
    // COMIDA RÁPIDA
    Restaurant(
        name = "Burger King",
        description = "Las mejores hamburguesas de la ciudad.",
        category = "Comida Rápida",
        imageRes = R.drawable.burguerking,
        menu = listOf(
            MenuItem("Whopper", "Carne, queso y vegetales frescos.", R.drawable.whopper),
            MenuItem("Genius BBQ", "Sabor ahumado con salsa BBQ.", R.drawable.genius)
        )
    ),
    Restaurant(
        name = "McDonald's",
        description = "Favoritos rápidos y sabrosos.",
        category = "Comida Rápida",
        imageRes = R.drawable.mac,
        menu = listOf(
            MenuItem("Big Mac", "Doble carne con salsa especial.", R.drawable.bigmac),
            MenuItem("Cuarto de Libra", "Carne con queso y pepinillos.", R.drawable.cuartolibra)
        )
    ),

    // COMIDA MEXICANA
    Restaurant(
        name = "Tacos Hermanos",
        description = "Deliciosos tacos mexicanos y comida mexicana.",
        category = "Comida Mexicana",
        imageRes = R.drawable.tacoshermanos,
        menu = listOf(
            MenuItem("Taco Gorbernador", "Carne asada y guacamole y camarones.", R.drawable.gobernador),
            MenuItem("Burrito", "Sabor tradicional mexicano.", R.drawable.burrito)
        )
    ),
    Restaurant(
        name = "Donkeys",
        description = "Sabores caseros y salsas picantes.",
        category = "Comida Mexicana",
        imageRes = R.drawable.donkeys,
        menu = listOf(
            MenuItem("Burrito Mixto", "Pollo marinado a la parrilla.", R.drawable.donkeysburrito),
            MenuItem("Torta Mixta", "De todo un poco con arroz y frijoles.", R.drawable.tortadonkeys)
        )

    )

    )
