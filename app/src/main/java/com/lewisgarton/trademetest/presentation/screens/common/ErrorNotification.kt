package com.lewisgarton.trademetest.presentation.screens.common

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.lewisgarton.trademetest.R
import com.lewisgarton.trademetest.theme.Theme

@Composable
fun ErrorNotification(message: String) {
    Surface(
        modifier = Modifier.testTag(ErrorNotificationTestTags.composable)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_error_large),
                contentDescription = stringResource(id = R.string.error_icon_content_description),
                tint = MaterialTheme.colors.error,
            )
            Text(
                modifier = Modifier
                    .padding(24.dp)
                    .testTag(ErrorNotificationTestTags.errorMessage),
                textAlign = TextAlign.Center,
                text = message,
                style = MaterialTheme.typography.h6
            )
        }
    }
}

@Preview
@Composable
fun PreviewErrorNotification() {
    Theme {
        ErrorNotification(message = "Oops... This is not good at all!")
    }
}

object ErrorNotificationTestTags {
    const val composable = "error-notification-tag"
    const val errorMessage = "error-notification-error-message"
}
