package com.lewisgarton.trademetest.presentation.screens.mytrademe

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import com.lewisgarton.trademetest.theme.Theme
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class MyTradeMeScreenTest {
    @get:Rule
    val composeTestRule = createComposeRule()

    @Before
    fun setUpBefore() {
        composeTestRule.setContent {
            Theme {
                MyTradeMeScreen()
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
            .onNodeWithTag(MyTradeMeScreenTestTags.placeholder)
            .assertIsDisplayed()
    }
}
