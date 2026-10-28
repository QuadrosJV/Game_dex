package com.example.gamedex.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable

private val GameDexColorScheme = darkColorScheme(
    primary = Purple80,
    secondary = PurpleGrey80,
    tertiary = Pink80,
    background = FundoGameDex,
    surface = CardGameDex,
    onPrimary = FundoGameDex,
    onSecondary = FundoGameDex,
    onTertiary = FundoGameDex,
    onBackground = TextoGameDex,
    onSurface = TextoGameDex
)

@Composable
fun GameDexTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = GameDexColorScheme,
        typography = Typography,
        content = content
    )
}