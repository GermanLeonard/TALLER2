package com.gasl4.myapplication.data


data class Restaurant(
    val name: String,
    val description: String,
    val category: String,
    val imageRes: Int,
    val menu: List<MenuItem>
)

data class MenuItem(
    val name: String,
    val description: String,
    val imageRes: Int
)

