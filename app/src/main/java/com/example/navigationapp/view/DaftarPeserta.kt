package com.example.navigationapp.view

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.navigationapp.R

@Composable
fun DaftarPeserta(
    modifier: Modifier = Modifier,
    onBackToHome: () -> Unit,
    onGoToForm: () -> Unit
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = stringResource(id = R.string.title_list_peserta),
                        color = Color.White,
                        fontSize = 20.sp
                    )
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = colorResource(id = R.color.teal_700)
                )
            )
        }
    ) { isiRuang ->
        Column(
            modifier = Modifier.padding(isiRuang),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // NAMA LENGKAP
            Text(
                text = stringResource(id = R.string.label_nama_lengkap),
                fontSize = 14.sp,
                color = Color.Gray,
                modifier = Modifier.padding(top = 20.dp)
            )
            Text(
                text = stringResource(id = R.string.nama),
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 10.dp)
            )

            HorizontalDivider(
                modifier = Modifier
                    .padding(horizontal = 20.dp)
                    .width(250.dp),
                thickness = 1.dp,
                color = Color.Gray
            )

            // JENIS KELAMIN
            Text(
                text = stringResource(id = R.string.label_jenis_kelamin),
                fontSize = 14.sp,
                color = Color.Gray,
                modifier = Modifier.padding(top = 10.dp)
            )
            Text(
                text = stringResource(id = R.string.jenis_kelamin_contoh),
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 10.dp)
            )

            HorizontalDivider(
                modifier = Modifier
                    .padding(horizontal = 20.dp)
                    .width(250.dp),
                thickness = 1.dp,
                color = Color.Gray
            )

            // STATUS PERKAWINAN
            Text(
                text = stringResource(id = R.string.label_status_perkawinan),
                fontSize = 14.sp,
                color = Color.Gray,
                modifier = Modifier.padding(top = 10.dp)
            )
            Text(
                text = stringResource(id = R.string.status_perkawinan_contoh),
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 10.dp)
            )

            HorizontalDivider(
                modifier = Modifier
                    .padding(horizontal = 20.dp)
                    .width(250.dp),
                thickness = 1.dp,
                color = Color.Gray
            )

            // ALAMAT
            Text(
                text = stringResource(id = R.string.label_alamat),
                fontSize = 14.sp,
                color = Color.Gray,
                modifier = Modifier.padding(top = 10.dp)
            )
            Text(
                text = stringResource(id = R.string.alamat_contoh),
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 20.dp)
            )

            Spacer(modifier = Modifier.height(10.dp))

            // Tombol Beranda
            Button(
                onClick = onBackToHome,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp)
                    .padding(bottom = 10.dp)
            ) {
                Text(text = stringResource(id = R.string.btn_beranda))
            }

            // Tombol Formulir Pendaftaran
            Button(
                onClick = onGoToForm,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp)
            ) {
                Text(text = stringResource(id = R.string.btn_formulir_pendaftaran))
            }
        }
    }
}