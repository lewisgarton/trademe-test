package com.lewisgarton.trademetest.presentation.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import com.lewisgarton.trademetest.R
import com.lewisgarton.trademetest.presentation.screens.discover.DiscoverScreen
import com.lewisgarton.trademetest.presentation.screens.mytrademe.MyTradeMeScreen
import com.lewisgarton.trademetest.presentation.screens.notifications.NotificationsScreen
import com.lewisgarton.trademetest.presentation.screens.watchlist.WatchlistScreen

interface Destination {
    val icon: ImageVector
    val route: String
    val screen: @Composable () -> Unit
    val labelResId: Int
    val titleResId: Int
}

//Todo: move route strings
object Discover : Destination {
    override val icon: ImageVector = Icons.Filled.Home
    override val route: String = "discover"
    override val screen: @Composable () -> Unit = { DiscoverScreen() }
    override val labelResId: Int = R.string.discover_bottom_nav_label
    override val titleResId: Int = R.string.discover_title
}

object Notifications : Destination {
    override val icon: ImageVector = Icons.Filled.Notifications
    override val route: String = "notifications"
    override val screen: @Composable () -> Unit = { NotificationsScreen() }
    override val labelResId: Int = R.string.notifications_bottom_nav_label
    override val titleResId: Int = R.string.notifications_title
}

object Watchlist : Destination {
    override val icon: ImageVector = Icons.Filled.Search
    override val route: String = "watchlist"
    override val screen: @Composable () -> Unit = { WatchlistScreen() }
    override val labelResId: Int = R.string.watchlist_bottom_nav_label
    override val titleResId: Int = R.string.discover_title
}

object MyTradeMe : Destination {
    override val icon: ImageVector = Icons.Filled.AccountBox
    override val route: String = "my_trademe"
    override val screen: @Composable () -> Unit = { MyTradeMeScreen() }
    override val labelResId: Int = R.string.my_trade_me_bottom_nav_label
    override val titleResId: Int = R.string.my_trade_me_title
}

object DestinationGroups {
    val allDestinations = listOf(Discover, Notifications, Watchlist, MyTradeMe)
    val bottomNavDestinations = listOf(Discover, Notifications, Watchlist, MyTradeMe)
}
