package com.example.gamedex

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.example.gamedex.ui.Detalhe
import com.example.gamedex.ui.DetalheJogo
import com.example.gamedex.ui.Lista
import com.example.gamedex.ui.ListaJogos
import com.example.gamedex.ui.theme.GameDexTheme
import androidx.compose.runtime.Composable

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            GameDexTheme {
                NavegacaoGameDex()
            }
        }
    }
}

@Composable
fun NavegacaoGameDex() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Lista,
        modifier = Modifier.fillMaxSize()
    ) {
        composable<Lista> {
            ListaJogos(navController = navController)
        }

        composable<Detalhe> { entrada ->
            val rota = entrada.toRoute<Detalhe>()

            DetalheJogo(
                jogoId = rota.jogoId,
                navController = navController
            )
        }
    }
}