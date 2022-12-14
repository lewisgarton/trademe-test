package com.lewisgarton.trademetest.presentation.screens.common

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.lewisgarton.trademetest.theme.Theme

@Composable
fun LoadingNotification() {
    Surface(
        modifier = Modifier.testTag(LoadingNotificationTestTags.composable)
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            CircularProgressIndicator(
                modifier = Modifier.size(140.dp),
                strokeWidth = 10.dp,
                color = MaterialTheme.colors.secondary
            )
        }
    }
}

@Preview
@Composable
fun PreviewLoadingNotification() {
    Theme {
        LoadingNotification()
    }
}

object LoadingNotificationTestTags {
    const val composable = "loading-notification-tag"
}
