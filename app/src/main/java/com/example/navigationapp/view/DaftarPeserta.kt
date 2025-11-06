package com.example.navigationapp.view

@Composable
fun DaftarPeserta(
    modifier : Modifier = Modifier,
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
    ) {
            isiRuang ->
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
                text = stringResource(id = R.string.nama_lengkap_contoh),
                fontSize = 18.sp,
                fontWeight = androidx.compose.ui.text.font.FontWeight.Bold,
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
                fontWeight = androidx.compose.ui.text.font.FontWeight.Bold,
                modifier = Modifier.padding(bottom = 10.dp)
            )

            HorizontalDivider(
                modifier = Modifier
                    .padding(horizontal = 20.dp)
                    .width(250.dp),
                thickness = 1.dp,
                color = Color.Gray
            )
    }