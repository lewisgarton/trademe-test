package com.lewisgarton.trademetest.repository

import com.lewisgarton.trademetest.service.models.Listing

interface ListingRepository {
    suspend fun getTwentyLatestListings(): List<Listing>
}
