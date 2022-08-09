package com.lewisgarton.trademetest.presentation.screens.watchlist

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import com.lewisgarton.trademetest.ui.theme.Theme
import org.junit.Assert
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class WatchlistScreenTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Before
    fun setUpBefore() {
        composeTestRule.setContent {
            Theme {
                WatchlistScreen()
            }
        }
    }

    @Test
    fun appBarHasCorrectTitle() {
        Assert.assertTrue(false)
    }

    @Test
    fun screenHasPlaceholderTest() {
        composeTestRule
            .onNodeWithText("Watchlist Is Currently Under Development")
            .assertIsDisplayed()
    }
}
