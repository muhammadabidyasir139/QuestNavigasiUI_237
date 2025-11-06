package com.example.navigationapp

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable

enum class Navigasi {
    Formulir,
    Detail
}

@Composable
fun DataApp(
    navController: NavHostController = rememberNavController(),
    modifier: Modifier
) {
    Scaffold { isiRuang->
        NavHost(
            navController = navController,
        )
    }
}