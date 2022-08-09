import androidx.compose.ui.test.assertHasClickAction
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.navigation.compose.rememberNavController
import com.lewisgarton.trademetest.presentation.navigation.BottomNav
import com.lewisgarton.trademetest.ui.theme.Theme
import org.junit.Rule
import org.junit.Test

class BottomNavKtTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun hasDiscoverTab() {
        composeTestRule.setContent {
            Theme {
                BottomNav(rememberNavController())
            }
        }
        composeTestRule.onNodeWithText("Discover").assertHasClickAction()
    }

    @Test
    fun hasNotificationsTab() {
        composeTestRule.setContent {
            Theme {
                BottomNav(rememberNavController())
            }
        }
        composeTestRule.onNodeWithText("Notifications").assertHasClickAction()
    }

    @Test
    fun hasWatchlistTab() {
        composeTestRule.setContent {
            Theme {
                BottomNav(rememberNavController())
            }
        }
        composeTestRule.onNodeWithText("Watchlist").assertHasClickAction()
    }

    @Test
    fun hasMyTrademeTab() {
        composeTestRule.setContent {
            Theme {
                BottomNav(rememberNavController())
            }
        }
        composeTestRule.onNodeWithText("My Trademe").assertHasClickAction()
    }
}
