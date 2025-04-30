package com.gasl4.GermanSanchez00011223

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Scaffold
import androidx.navigation.compose.rememberNavController
import com.gasl4.GermanSanchez00011223.navigation.AppNavigation
import com.gasl4.GermanSanchez00011223.ui.theme.components.BottomNavigationBar
import com.gasl4.GermanSanchez00011223.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                val navController = rememberNavController()
                Scaffold(
                    bottomBar = { BottomNavigationBar(navController) }
                ) {
                    AppNavigation(navController)
                }
            }
        }
    }
}

