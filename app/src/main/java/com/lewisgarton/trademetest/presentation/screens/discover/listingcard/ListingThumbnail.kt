package com.lewisgarton.trademetest.presentation.screens.discover.listingcard

import androidx.compose.material.Icon
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.lewisgarton.trademetest.R
import com.skydoves.landscapist.glide.GlideImage

@Composable
fun ListingThumbnail(imageHref: String?) {
    if (!imageHref.isNullOrEmpty()) {
        Surface(modifier = Modifier.testTag(ListingThumbnailTestTags.thumbnail)) {
            GlideImage(
                imageModel = imageHref
            )
        }
    }
    Icon(
        modifier = Modifier.testTag(ListingThumbnailTestTags.placeholder),
        painter = painterResource(id = R.drawable.ic_no_picture_large),
        contentDescription = stringResource(id = R.string.listing_thumbnail_content_description)
    )
}

@Preview
@Composable
fun PreviewListingThumbnail() {
    ListingThumbnail(imageHref = null)
}

object ListingThumbnailTestTags {
    const val thumbnail = "listing-thumbnail-thumbnail"
    const val placeholder = "listing-thumbnail-placeholder"
}
