package com.lewisgarton.trademetest.presentation.screens.navigation.appbar

import androidx.compose.ui.test.assertHasClickAction
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithContentDescription
import androidx.compose.ui.test.onNodeWithTag
import com.lewisgarton.trademetest.presentation.appbar.AppBar
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class AppBarTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Before
    fun setupBefore() {
        composeTestRule.setContent {
            AppBar()
        }
    }

    @Test
    fun hasTitleText() {
        composeTestRule
            .onNodeWithTag("appbar-title")
            .assertIsDisplayed()
    }

    @Test
    fun hasSearchButton() {
        composeTestRule
            .onNodeWithContentDescription("search")
            .assertHasClickAction()
    }

    @Test
    fun hasCartButton() {
        composeTestRule
            .onNodeWithContentDescription("cart")
            .assertHasClickAction()
    }

    @Test
    fun whenSearchButtonClickedToastDisplayed() {
        assertTrue(false)
    }

    @Test
    fun whenCartButtonClickedToastDisplayed() {
        assertTrue(false)
    }
}
