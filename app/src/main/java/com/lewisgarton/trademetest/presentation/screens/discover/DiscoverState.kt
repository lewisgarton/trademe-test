package com.lewisgarton.trademetest.presentation.screens.discover

import com.airbnb.mvrx.Async
import com.airbnb.mvrx.Loading
import com.airbnb.mvrx.MavericksState
import com.lewisgarton.trademetest.service.models.Listing

data class DiscoverState(
    val latestListings: Async<List<Listing>> = Loading(),
    val errorMessage: String = ""
) : MavericksState
