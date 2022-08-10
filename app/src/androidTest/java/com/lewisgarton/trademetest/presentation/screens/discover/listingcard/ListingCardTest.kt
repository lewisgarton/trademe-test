package com.lewisgarton.trademetest.presentation.screens.discover.listingcard

import ListingCard
import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createComposeRule
import com.lewisgarton.trademetest.service.models.Listing
import com.lewisgarton.trademetest.theme.Theme
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import java.math.BigDecimal

class ListingCardTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Before
    fun setupBefore() {
        composeTestRule.setContent {
            Theme {
                ListingCard(
                    listing = Listing(
                        title = "Title",
                        region = "Region",
                        pictureHref = null,
                        buyNowPrice = BigDecimal(33),
                        displayPrice = "$44.50",
                        isClassified = false
                    )
                )
            }
        }
    }

    @Test
    fun containsListingThumbnail() {
        composeTestRule
            .onNodeWithTag("listing-thumbnail")
            .assertIsDisplayed()
    }

    @Test
    fun containsListingTitle() {
        composeTestRule
            .onNodeWithText("Title")
            .assertIsDisplayed()
    }

    @Test
    fun containsRegion() {
        composeTestRule
            .onNodeWithText("Region")
            .assertIsDisplayed()
    }

    @Test
    fun containsPriceRow() {
        composeTestRule
            .onNodeWithTag("price-row")
            .assertIsDisplayed()
    }

    @Test
    fun isClickable() {
        composeTestRule
            .onRoot()
            .assertHasClickAction()
    }

    @Test
    fun whenClickedDisplaysToast() {
        assertTrue(false)
    }

    @Test
    fun whenTitleIsLargeTextIsClipped() {
        assertTrue(false)
    }

    @Test
    fun whenTitleIsLargeMaxLinesIsTwo() {
        assertTrue(false)
    }

    @Test
    fun whenRegionIsLargeTextIsClipped() {
        assertTrue(false)
    }
}
