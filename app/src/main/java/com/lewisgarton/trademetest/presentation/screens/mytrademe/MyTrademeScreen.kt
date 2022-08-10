package com.lewisgarton.trademetest.presentation.screens.mytrademe

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.lewisgarton.trademetest.theme.Theme

@Composable
fun MyTrademeScreen() {
    Surface(modifier = Modifier.fillMaxSize()) {
        Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
            Text(text = "My Trademe Is Currently Under Development")
        }
    }
}

@Preview
@Composable
fun PreviewMyTrademeScreen() {
    Theme {
        MyTrademeScreen()
    }
}
