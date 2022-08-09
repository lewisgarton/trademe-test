package com.lewisgarton.trademetest.presentation.appbar

import androidx.compose.foundation.layout.Spacer
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.tooling.preview.Preview
import com.lewisgarton.trademetest.presentation.navigation.Discover

@Composable
fun AppBar() {
    TopAppBar() {
        Text(
            modifier = Modifier.testTag("appbar-title"),
            text = Discover.title,
            style = MaterialTheme.typography.h6
        )
        Spacer(modifier = Modifier.weight(1F))
        IconButton(onClick = { }) {
            Icon(Icons.Outlined.Search, contentDescription = "search")
        }
        IconButton(onClick = { }) {
            Icon(Icons.Outlined.ShoppingCart, contentDescription = "cart")
        }
    }
}

@Preview
@Composable
fun PreviewAppBar() {
    AppBar()
}