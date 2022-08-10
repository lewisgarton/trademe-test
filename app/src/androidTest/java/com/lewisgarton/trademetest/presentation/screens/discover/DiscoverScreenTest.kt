package com.lewisgarton.trademetest.presentation.screens.discover

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import com.airbnb.mvrx.Fail
import com.airbnb.mvrx.Loading
import com.airbnb.mvrx.Success
import com.lewisgarton.trademetest.presentation.screens.common.ErrorNotificationTestTags
import com.lewisgarton.trademetest.presentation.screens.common.LoadingNotificationTestTags
import com.lewisgarton.trademetest.presentation.screens.discover.listingcard.ListingCardTestTags
import com.lewisgarton.trademetest.repository.models.ListingModel
import com.lewisgarton.trademetest.theme.Theme
import org.junit.Rule
import org.junit.Test

class DiscoverScreenTest {
    @get:Rule
    val composeTestRule = createComposeRule()

    private fun setupScreen(state: DiscoverState) {
        composeTestRule.setContent {
            Theme {
                DiscoverScreenView(state = state)
            }
        }
    }

    @Test
    fun whenStateIsLoadingDisplaysProgressIndicator() {
        val loadingState = DiscoverState(
            latestListings = Loading()
        )

        setupScreen(state = loadingState)

        composeTestRule
            .onNodeWithTag(LoadingNotificationTestTags.composable)
            .assertIsDisplayed()
    }

    @Test
    fun whenStateIsErrorDisplaysMessage() {
        val errorState = DiscoverState(
            latestListings = Fail(error = Throwable())
        )

        setupScreen(state = errorState)

        composeTestRule
            .onNodeWithTag(ErrorNotificationTestTags.errorMessage)
            .assertIsDisplayed()
    }

    @Test
    fun whenStateIsSuccessDisplaysListings() {
        val successState = DiscoverState(
            latestListings = Success(
                listOf(
                    ListingModel(
                        title = "",
                        region = "",
                        pictureHref = "",
                        buyNowPrice = null,
                        displayPrice = "",
                        isClassified = false
                    )
                )
            )
        )

        setupScreen(state = successState)

        composeTestRule
            .onNodeWithTag(ListingCardTestTags.composable)
            .assertIsDisplayed()
    }
}
