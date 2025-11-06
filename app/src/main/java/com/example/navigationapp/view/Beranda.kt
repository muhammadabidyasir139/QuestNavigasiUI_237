package com.example.navigationapp.view

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Beranda(
    modifier: Modifier = Modifier,
    onSubmitClick: () -> Unit
) {
    Scaffold(
        modifier = modifier,
        containerColor = Color(0xFFE6E6FA)
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(20.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Selamat Datang",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF5D3FD3), // Ungu tua
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(bottom = 30.dp)
            )


            Text(
                text = "CARD-LST",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF5D3FD3),
                modifier = Modifier.padding(bottom = 4.dp)
            )
            Text(
                text = "MOBILE APP",
                fontSize = 14.sp,
                color = Color(0xFF5D3FD3),
                modifier = Modifier.padding(bottom = 4.dp)
            )
            Text(
                text = "2025",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF5D3FD3),
                modifier = Modifier.padding(bottom = 30.dp)
            )

            Text(
                text = "Muhammad Abid Yasir",
                fontSize = 18.sp,
                fontWeight = FontWeight.Medium,
                color = Color(0xFF5D3FD3),
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(bottom = 4.dp)
            )
            Text(
                text = "20230140237",
                fontSize = 16.sp,
                color = Color(0xFF5D3FD3),
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(bottom = 30.dp)
            )


            Button(
                onClick = onSubmitClick,
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF5D3FD3), // Ungu tua
                    contentColor = Color.White
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .padding(horizontal = 40.dp)
            ) {
                Text(text = "Submit", fontSize = 16.sp)
            }
        }
    }


}