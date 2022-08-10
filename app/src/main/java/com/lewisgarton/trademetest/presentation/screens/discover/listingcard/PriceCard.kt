package com.lewisgarton.trademetest.presentation.screens.discover.listingcard

import androidx.compose.foundation.layout.Column
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import com.lewisgarton.trademetest.theme.Theme

@Composable
fun PriceCard(
    label: String,
    formattedPrice: String,
    alignment: Alignment.Horizontal = Alignment.End
) {
    Column(horizontalAlignment = alignment) {
        Text(formattedPrice, style = MaterialTheme.typography.h5)
        Text(label, style = MaterialTheme.typography.caption)
    }
}

@Preview
@Composable
fun PreviewPriceCard() {
    Theme {
        PriceCard(
            label = "Asking Price",
            formattedPrice = "$42.42"
        )
    }
}
