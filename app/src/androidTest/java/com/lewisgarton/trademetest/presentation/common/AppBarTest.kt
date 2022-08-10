package com.lewisgarton.trademetest.presentation.common

import androidx.compose.ui.test.assertHasClickAction
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import com.lewisgarton.trademetest.presentation.appbar.AppBar
import com.lewisgarton.trademetest.presentation.appbar.appBarCartButtonTestTag
import com.lewisgarton.trademetest.presentation.appbar.appBarSearchButtonTestTag
import com.lewisgarton.trademetest.presentation.appbar.appBarTitleTestTag
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
            .onNodeWithTag(appBarTitleTestTag)
            .assertIsDisplayed()
    }

    @Test
    fun hasSearchButton() {
        composeTestRule
            .onNodeWithTag(appBarSearchButtonTestTag)
            .assertHasClickAction()
    }

    @Test
    fun hasCartButton() {
        composeTestRule
            .onNodeWithTag(appBarCartButtonTestTag)
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
