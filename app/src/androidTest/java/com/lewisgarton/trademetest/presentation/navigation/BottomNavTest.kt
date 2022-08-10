package com.lewisgarton.trademetest.presentation.navigation

import androidx.compose.ui.test.assertHasClickAction
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.navigation.compose.rememberNavController
import com.lewisgarton.trademetest.theme.Theme
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class BottomNavTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Before
    fun setUpBefore() {
        composeTestRule.setContent {
            Theme {
                BottomNav(rememberNavController())
            }
        }
    }

    @Test
    fun whenTabSelectedIsHighlighted() {
        assertTrue(false)
    }

    @Test
    fun whenTabUnselectedIsNotHighlighted() {
        assertTrue(false)
    }

    @Test
    fun hasDiscoverTab() {
        composeTestRule
            .onNodeWithText("Discover")
            .assertHasClickAction()
    }

    @Test
    fun hasNotificationsTab() {
        composeTestRule
            .onNodeWithText("Notifications")
            .assertHasClickAction()
    }

    @Test
    fun hasWatchlistTab() {
        composeTestRule
            .onNodeWithText("Watchlist")
            .assertHasClickAction()
    }

    @Test
    fun hasMyTrademeTab() {
        composeTestRule
            .onNodeWithText("My Trademe")
            .assertHasClickAction()
    }
}
