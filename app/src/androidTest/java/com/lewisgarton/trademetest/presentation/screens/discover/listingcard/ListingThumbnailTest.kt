package com.lewisgarton.trademetest.presentation.screens.discover.listingcard

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import org.junit.Rule
import org.junit.Test

class ListingThumbnailTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    private fun setupComposable(url: String?) {
        composeTestRule.setContent {
            ListingThumbnail(imageHref = url)
        }
    }

    @Test
    fun whenImageHrefNotNullDisplaysThumbnail() {
        setupComposable(url = "www.42.com")

        composeTestRule
            .onNodeWithTag("listing-thumbnail")
            .assertExists()
    }

    @Test
    fun whenImageHrefEmptyThumbnailNotDisplayed() {
        setupComposable(url = "")

        composeTestRule
            .onNodeWithTag("listing-thumbnail")
            .assertDoesNotExist()
    }

    @Test
    fun whenImageHrefNullThumbnailNotDisplayed() {
        setupComposable(url = null)

        composeTestRule
            .onNodeWithTag("listing-thumbnail")
            .assertDoesNotExist()
    }

    @Test
    fun displaysPlaceHolder() {
        setupComposable(url = null)

        composeTestRule
            .onNodeWithTag("listing-thumbnail-placeholder")
            .assertExists()
    }
}
