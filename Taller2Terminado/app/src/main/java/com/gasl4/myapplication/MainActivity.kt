package com.gasl4.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.gasl4.myapplication.navigation.AppNavigation
import com.gasl4.myapplication.ui.theme.components.BottomNavigationBar
import com.gasl4.myapplication.ui.theme.MyApplicationTheme

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

