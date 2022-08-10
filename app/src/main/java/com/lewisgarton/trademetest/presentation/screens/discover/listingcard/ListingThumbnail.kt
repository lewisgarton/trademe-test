package com.lewisgarton.trademetest.presentation.screens.discover.listingcard

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.lewisgarton.trademetest.R

@Composable
fun ListingThumbnail() {
    Icon(modifier = Modifier.testTag("listing-thumbnail"),
        painter = painterResource(id = R.drawable.ic_no_picture_large),
        contentDescription = ""
    )
}

@Preview
@Composable
fun PreviewListingThumbnail() {
    ListingThumbnail()
}