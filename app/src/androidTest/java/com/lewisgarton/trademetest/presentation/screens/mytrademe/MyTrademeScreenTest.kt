package com.lewisgarton.trademetest.presentation.screens.mytrademe

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import com.lewisgarton.trademetest.ui.theme.Theme
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class MyTrademeScreenTest {
    @get:Rule
    val composeTestRule = createComposeRule()

    @Before
    fun setUpBefore() {
        composeTestRule.setContent {
            Theme {
                MyTrademeScreen()
            }
        }
    }

    @Test
    fun appBarHasCorrectTitle() {
        assertTrue(false)
    }

    @Test
    fun screenHasPlaceholderTest() {
        composeTestRule
            .onNodeWithText("My Trademe Is Currently Under Development\"")
            .assertIsDisplayed()
    }
}