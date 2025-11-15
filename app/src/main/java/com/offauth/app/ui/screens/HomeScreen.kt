@file:OptIn(ExperimentalMaterial3Api::class)

package com.offauth.app.ui.screens


import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun HomeScreen(
    onAddAccount: () -> Unit
) {
    Scaffold(
        topBar = {
            TopAppBar(title = { Text("OffAuth") })
        }
    ) { padding ->
        Column(
            Modifier
                .padding(padding)
                .padding(16.dp)
        ) {
            Text("Home")
            Spacer(Modifier.height(16.dp))
            Button(onClick = onAddAccount) {
                Text("Adicionar Conta")
            }
        }
    }
}
