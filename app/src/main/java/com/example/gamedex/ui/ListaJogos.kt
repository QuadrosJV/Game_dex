package com.example.gamedex.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
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
import com.example.gamedex.ui.theme.CardGameDex
import com.example.gamedex.ui.theme.FundoGameDex

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ListaJogos(navController: NavController) {
    val jogos = JogoRepository.listar()

    Scaffold(
        containerColor = FundoGameDex,
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "GameDex",
                        color = Color(0xFFFF2DAA),
                        style = MaterialTheme.typography.headlineMedium
                    )
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = FundoGameDex
                )
            )
        }
    ) { innerPadding ->

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            contentPadding = PaddingValues(12.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(
                items = jogos,
                key = { jogo -> jogo.id }
            ) { jogo ->
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable {
                            navController.navigate(
                                Detalhe(jogoId = jogo.id)
                            )
                        },
                    colors = CardDefaults.cardColors(
                        containerColor = CardGameDex
                    ),
                    elevation = CardDefaults.cardElevation(
                        defaultElevation = 4.dp
                    )
                ) {
                    Column {
                        AsyncImage(
                            model = jogo.imagemUrl,
                            contentDescription = jogo.titulo,
                            modifier = Modifier
                                .fillMaxWidth()
                                .aspectRatio(460f / 215f),
                            contentScale = ContentScale.Crop
                        )

                        Column(
                            modifier = Modifier.padding(12.dp),
                            verticalArrangement = Arrangement.spacedBy(4.dp)
                        ) {
                            Text(
                                text = jogo.titulo,
                                color = Color(0xFFFF2DAA),
                                style = MaterialTheme.typography.titleLarge
                            )

                            Text(
                                text = "Gênero: ${jogo.genero}",
                                color = Color(0xFF00D9FF)
                            )

                            Text(
                                text = "Lançamento: ${jogo.ano}",
                                color = Color.White
                            )

                            Text(
                                text = "Nota: ${jogo.nota}",
                                color = Color.White
                            )
                        }
                    }
                }
            }
        }
    }
}