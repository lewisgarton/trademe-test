package com.lewisgarton.trademetest.presentation.appbar

import androidx.compose.foundation.layout.Spacer
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.lewisgarton.trademetest.R
import com.lewisgarton.trademetest.theme.Theme
import com.lewisgarton.trademetest.theme.iconButton

const val appBarTitleTestTag = "app-bar-title"
const val appBarSearchButtonTestTag = "app-bar-search-button"
const val appBarCartButtonTestTag = "app-bar-cart-button"

@Composable
fun AppBar() {
    TopAppBar {
        Text(
            modifier = Modifier.testTag(appBarTitleTestTag),
            text = stringResource(id = R.string.discover_title),
            style = MaterialTheme.typography.h6
        )
        Spacer(modifier = Modifier.weight(1F))
        IconButton(
            modifier = Modifier.testTag(appBarSearchButtonTestTag),
            onClick = { }) {
            Icon(
                Icons.Outlined.Search,
                contentDescription = stringResource(id = R.string.search_button_content_description),
                tint = MaterialTheme.colors.iconButton
            )
        }
        IconButton(
            modifier = Modifier.testTag(appBarCartButtonTestTag),
            onClick = { }) {
            Icon(
                Icons.Outlined.ShoppingCart,
                contentDescription = stringResource(id = R.string.cart_button_content_description),
                tint = MaterialTheme.colors.iconButton
            )
        }
    }
}

@Preview
@Composable
fun PreviewAppBar() {
    Theme {
        AppBar()
    }
}
