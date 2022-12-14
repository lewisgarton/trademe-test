package com.lewisgarton.trademetest.presentation.screens.watchlist

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.lewisgarton.trademetest.R
import com.lewisgarton.trademetest.theme.Theme

@Composable
fun WatchlistScreen() {
    Surface(modifier = Modifier.fillMaxSize()) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                modifier = Modifier.testTag(WatchlistScreenTestTags.placeholder),
                text = stringResource(id = R.string.watchlist_placeholder)
            )
        }
    }
}

@Preview
@Composable
fun PreviewWatchlistScreen() {
    Theme {
        WatchlistScreen()
    }
}

object WatchlistScreenTestTags {
    const val placeholder = "watchlist-screen-placeholder"
}
