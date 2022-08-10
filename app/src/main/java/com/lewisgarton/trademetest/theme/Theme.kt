package com.lewisgarton.trademetest.theme

import androidx.compose.material.Colors
import androidx.compose.material.MaterialTheme
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val LightColorPalette = lightColors(
    primary = Color.White,
    secondary = Feijoa500,
    onPrimary = BluffOyster800
)

@Composable
fun Theme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colors = LightColorPalette,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}

val Colors.iconButton: Color
    get() = Blue500
val Colors.iconUnselected: Color
    get() = Blue100
