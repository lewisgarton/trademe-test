package com.lewisgarton.trademetest

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.lewisgarton.trademetest.presentation.appbar.AppBar
import com.lewisgarton.trademetest.presentation.navigation.BottomNav
import com.lewisgarton.trademetest.presentation.navigation.DestinationGroups
import com.lewisgarton.trademetest.presentation.navigation.Discover
import com.lewisgarton.trademetest.theme.Theme

@Composable
fun App() {
    val navController = rememberNavController()

    Scaffold(
        topBar = {
            AppBar()
        },
        bottomBar = {
            BottomNav(navController = navController)
        }
    ) {
        NavHost(navController = navController, startDestination = Discover.route) {
            DestinationGroups.allDestinations.forEach { destination ->
                composable(route = destination.route) {
                    destination.screen()
                }
            }
        }
    }
}

@Preview
@Composable
fun PreviewApp() {
    Theme {
        App()
    }
}
