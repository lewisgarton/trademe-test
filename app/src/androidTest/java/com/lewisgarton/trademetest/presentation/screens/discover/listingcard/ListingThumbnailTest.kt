// package com.lewisgarton.trademetest.presentation.screens.discover.listingcard
//
// import androidx.compose.ui.test.assertIsDisplayed
// import androidx.compose.ui.test.junit4.createComposeRule
// import androidx.compose.ui.test.onNodeWithTag
// import com.lewisgarton.trademetest.theme.Theme
// import org.junit.Assert.assertTrue
// import org.junit.Rule
// import org.junit.Test
//
// class ListingThumbnailTest {
//
//    @get:Rule
//    val composeTestRule = createComposeRule()
//
//    @Test
//    fun whenImageNotNullDisplaysThumbnail() {
//        composeTestRule.setContent {
//            Theme {
//                ListingThumbnail(image = null)
//            }
//        }
//
//        composeTestRule
//            .onNodeWithTag("placeholder-image")
//            .assertIsDisplayed()
//    }
//
//    @Test
//    fun whenImageNullDisplaysPlaceHolder() {
//        assertTrue(false)
//    }
// }
