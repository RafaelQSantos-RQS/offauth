@file:OptIn(ExperimentalMaterial3Api::class)

package com.offauth.app.ui.screens


import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun AddAccountScreen(
    onBack: () -> Unit
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Adicionar Conta") },
                navigationIcon = {
                    TextButton(onClick = onBack) { Text("< Voltar") }
                }
            )
        }
    ) { padding ->
        Column(
            Modifier
                .padding(padding)
                .padding(16.dp)
        ) {
            Text("Tela de adicionar conta")
        }
    }
}
