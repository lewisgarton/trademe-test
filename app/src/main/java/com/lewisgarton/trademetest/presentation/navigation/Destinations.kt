package com.lewisgarton.trademetest.presentation.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector

interface Destination {
    val icon: ImageVector
    val route: String
    val screen: @Composable () -> Unit
    val label: String
    val title: String
}

object Discover : Destination {
    override val icon: ImageVector = Icons.Filled.Home
    override val route: String = "discover"
    override val screen: @Composable () -> Unit = { }
    override val label: String = "Discover"
    override val title: String = "Browse"
}

object Notifications : Destination {
    override val icon: ImageVector = Icons.Filled.Notifications
    override val route: String = "notifications"
    override val screen: @Composable () -> Unit = { }
    override val label: String = "Notifications"
    override val title: String
        get() = label
}
object Watchlist : Destination {
    override val icon: ImageVector = Icons.Filled.Search
    override val route: String = "watchlist"
    override val screen: @Composable () -> Unit = { }
    override val label: String = "Watchlist"
    override val title: String
        get() = label
}
object MyTrademe : Destination {
    override val icon: ImageVector = Icons.Filled.AccountBox
    override val route: String = "my_trademe"
    override val screen: @Composable () -> Unit = { }
    override val label: String = "My Trademe"
    override val title: String
        get() = label
}

object DestinationGroups {
    val allDestinations = listOf(Discover, Notifications, Watchlist, MyTrademe)
    val bottomNavDestinations = listOf(Discover, Notifications, Watchlist, MyTrademe)
}
