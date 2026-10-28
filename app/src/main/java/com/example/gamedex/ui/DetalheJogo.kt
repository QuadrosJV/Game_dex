package com.example.gamedex.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import com.example.gamedex.data.JogoRepository
import com.example.gamedex.ui.theme.FundoGameDex

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetalheJogo(
    jogoId: Int,
    navController: NavController
) {
    val jogo = JogoRepository.buscarPorId(jogoId)

    Scaffold(
        containerColor = FundoGameDex,
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Detalhes do jogo",
                        color = Color(0xFFFF2DAA)
                    )
                },
                navigationIcon = {
                    IconButton(
                        onClick = {
                            navController.popBackStack()
                        }
                    ) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "Voltar",
                            tint = Color(0xFF00D9FF)
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = FundoGameDex
                )
            )
        }
    ) { innerPadding ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .verticalScroll(rememberScrollState())
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            AsyncImage(
                model = jogo.imagemUrl,
                contentDescription = jogo.titulo,
                modifier = Modifier
                    .fillMaxWidth()
                    .aspectRatio(460f / 215f),
                contentScale = ContentScale.Crop
            )

            Text(
                text = jogo.titulo,
                color = Color(0xFFFF2DAA),
                style = MaterialTheme.typography.headlineMedium
            )

            Text(
                text = "Gênero: ${jogo.genero}",
                color = Color(0xFF00D9FF)
            )

            Text(
                text = "Ano de lançamento: ${jogo.ano}",
                color = Color.White
            )

            Text(
                text = "Nota: ${jogo.nota}",
                color = Color.White
            )

            Text(
                text = jogo.descricao,
                color = Color(0xFFB8B8D1),
                style = MaterialTheme.typography.bodyLarge
            )
        }
    }
}