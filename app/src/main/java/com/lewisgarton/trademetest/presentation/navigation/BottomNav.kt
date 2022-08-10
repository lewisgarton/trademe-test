package com.lewisgarton.trademetest.presentation.navigation

import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.lewisgarton.trademetest.theme.Theme
import com.lewisgarton.trademetest.theme.iconButton
import com.lewisgarton.trademetest.theme.iconUnselected

@Composable
fun BottomNav(navController: NavController) {
    BottomNavigation {
        val backStackEntry by navController.currentBackStackEntryAsState()
        val currentDestination = backStackEntry?.destination

        DestinationGroups.bottomNavDestinations.forEach { destination ->
            BottomNavigationItem(
                icon = {
                    Icon(destination.icon, contentDescription = null)
                },
                label = {
                    Text(text = destination.label)
                },
                selected = currentDestination?.hierarchy?.any {
                    it.route == destination.route
                } == true,
                onClick = {
                    navController.navigate(destination.route) {
                        popUpTo(navController.graph.findStartDestination().id) {
                            saveState = true
                        }
                        launchSingleTop = true
                    }
                },
                selectedContentColor = MaterialTheme.colors.iconButton,
                unselectedContentColor = MaterialTheme.colors.iconUnselected
            )
        }
    }
}

@Preview
@Composable
fun PreviewBottomNav() {
    Theme {
        BottomNav(navController = rememberNavController())
    }
}
