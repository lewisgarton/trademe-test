package com.lewisgarton.trademetest.presentation.screens.discover

import android.util.Log
import com.airbnb.mvrx.Fail
import com.airbnb.mvrx.Loading
import com.airbnb.mvrx.MavericksViewModel
import com.airbnb.mvrx.Success
import com.lewisgarton.trademetest.repository.ListingRepositoryImpl
import com.lewisgarton.trademetest.service.RetrofitClient
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class DiscoverViewModel(initialState: DiscoverState) : MavericksViewModel<DiscoverState>(
    initialState
) {
    private val repo = ListingRepositoryImpl(service = RetrofitClient.instance)

    private fun getListings() = CoroutineScope(Dispatchers.IO).launch {
        setState {
            copy(latestListings = Loading())
        }

        viewModelScope.launch {
            try {
                val listings = repo.getTwentyLatestListings()
                setState {
                    copy(latestListings = Success(listings))
                }
            } catch (e: Exception) {
                e.printStackTrace()
                Log.e(null, null, e)
                setState {
                    copy(
                        latestListings = Fail(e),
                        errorMessage = "Oops.... This is awkward, please reopen the page!"
                    )
                }
            }
        }
    }

    init {
        getListings()
    }
}
