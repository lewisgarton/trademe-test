package com.lewisgarton.trademetest.presentation.screens.discover.listingcard

import androidx.compose.runtime.Composable
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import com.lewisgarton.trademetest.ui.theme.Theme
import org.junit.Assert
import org.junit.Rule
import org.junit.Test

class PriceCardTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    private fun setupComposable(content: @Composable () -> Unit) {
        composeTestRule.setContent {
            Theme {
                content()
            }
        }
    }

    @Test
    fun hasPriceLabel() {
        val label = "Asking Price"

        setupComposable {
            PriceCard(
                formattedPrice = "",
                label = label
            )
        }

        composeTestRule
            .onNodeWithText(label)
            .assertIsDisplayed()
    }

    @Test
    fun hasPrice() {
        val price = "$42.42"

        setupComposable {
            PriceCard(
                formattedPrice = price,
                label = ""
            )
        }

        composeTestRule
            .onNodeWithText(price)
            .assertIsDisplayed()
    }

    @Test
    fun whenPriceIsLargeDoesNotOverflow() {
        Assert.assertTrue(false)
    }

    @Test
    fun whenLabelIsLargeDoesNotOverflow() {
        Assert.assertTrue(false)
    }
}
