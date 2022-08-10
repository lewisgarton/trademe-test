package com.lewisgarton.trademetest.presentation.screens.discover

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.airbnb.mvrx.Fail
import com.airbnb.mvrx.Loading
import com.airbnb.mvrx.Success
import com.airbnb.mvrx.Uninitialized
import com.airbnb.mvrx.compose.collectAsState
import com.airbnb.mvrx.compose.mavericksViewModel
import com.lewisgarton.trademetest.R
import com.lewisgarton.trademetest.presentation.screens.common.ErrorNotification
import com.lewisgarton.trademetest.presentation.screens.common.LoadingNotification
import com.lewisgarton.trademetest.presentation.screens.discover.listingcard.ListingCard

@Composable
fun DiscoverScreen() {
    val viewModel: DiscoverViewModel = mavericksViewModel()
    val state by viewModel.collectAsState()
    DiscoverScreenView(state = state)
}

// Work around for testing - need to figure out how to mock viewmodel
@Composable
fun DiscoverScreenView(state: DiscoverState) {
    Column(
        Modifier.padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        when (state.latestListings) {
            is Success -> {
                LazyColumn(
                    modifier = Modifier.padding(bottom = 50.dp)
                ) {
                    items(state.latestListings.invoke()) {
                        Divider(Modifier.padding(all = 5.dp))
                        ListingCard(listing = it)
                    }
                }
            }
            is Loading -> LoadingNotification()
            is Fail -> ErrorNotification(
                message = stringResource(id = R.string.generic_page_load_failure)
            )
            is Uninitialized -> {}
        }
    }
}
