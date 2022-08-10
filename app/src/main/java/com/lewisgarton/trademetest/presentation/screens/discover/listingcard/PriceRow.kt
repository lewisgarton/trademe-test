package com.lewisgarton.trademetest.presentation.screens.discover.listingcard

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.stringResource
import com.lewisgarton.trademetest.R

@Composable
fun PriceRow() {
    Row(Modifier.testTag(PriceRowTestTags.composable)) {
        PriceCard(
            label = stringResource(id = R.string.price_label_asking_price),
            formattedPrice = "$50.00",
            alignment = Alignment.Start
        )
        Spacer(modifier = Modifier.weight(1F))
        PriceCard(
            label = stringResource(id = R.string.price_label_buy_now),
            formattedPrice = "$44.00",
            alignment = Alignment.End
        )
    }
}

object PriceRowTestTags {
    const val composable = "price-row-tag"
}