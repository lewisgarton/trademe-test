package com.lewisgarton.trademetest.presentation.screens.common

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.lewisgarton.trademetest.R
import com.lewisgarton.trademetest.ui.theme.Theme

@Composable
fun ErrorNotification(message: String) {
    Surface(modifier = Modifier.testTag("error-notification")) {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_error_large),
                contentDescription = "error icon",
                tint = MaterialTheme.colors.error
            )
            Text(
                modifier = Modifier.testTag("error-message"),
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
