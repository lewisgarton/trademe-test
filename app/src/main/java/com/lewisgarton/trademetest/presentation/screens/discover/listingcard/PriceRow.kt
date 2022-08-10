package com.lewisgarton.trademetest.presentation.screens.discover.listingcard

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag

@Composable
fun PriceRow() {
    Row(Modifier.testTag("price-row")) {
        PriceCard(label = "Asking Price", formattedPrice = "$50.00", alignment = Alignment.Start)
        Spacer(modifier = Modifier.weight(1F))
        PriceCard(label = "Buy now", formattedPrice = "$44.00", alignment = Alignment.End)
    }
}
