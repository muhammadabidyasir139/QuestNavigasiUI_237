package com.example.navigationapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.example.navigationapp.ui.theme.NavigationAppTheme
import com.example.navigationapp.view.Beranda
import com.example.navigationapp.view.DaftarPeserta

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavigationAppTheme {
                var currentPage by remember { mutableStateOf("beranda") }

                Scaffold(
                    modifier = Modifier.fillMaxSize()
                ) { innerPadding ->
                    when (currentPage) {
                        "beranda" -> {
                            Beranda(
                                onSubmitClick = {
                                    currentPage = "daftar_peserta"
                                },
                                modifier = Modifier.padding(innerPadding)
                            )
                        }
                        "daftar_peserta" -> {
                            DaftarPeserta(
                                onBackToHome = {
                                    currentPage = "beranda"
                                },

                                onGoToForm = {
                                    // Misal: currentPage = "form"
                                    currentPage = "form"
                                }
                            )
                        }
                    }
                }
            }
        }
    }
}