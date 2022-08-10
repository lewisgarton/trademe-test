package com.lewisgarton.trademetest.presentation.screens.discover

import com.airbnb.mvrx.Async
import com.airbnb.mvrx.Loading
import com.airbnb.mvrx.MavericksState
import com.lewisgarton.trademetest.repository.models.ListingModel

data class DiscoverState(
    val latestListings: Async<List<ListingModel>> = Loading()
) : MavericksState
