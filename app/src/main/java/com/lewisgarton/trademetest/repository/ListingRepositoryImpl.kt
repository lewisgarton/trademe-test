package com.lewisgarton.trademetest.repository

import com.lewisgarton.trademetest.service.ListingService
import com.lewisgarton.trademetest.service.models.Listing

class ListingRepositoryImpl(
    private val service: ListingService
) : ListingRepository {
    override suspend fun getTwentyLatestListings(): List<Listing> {
        val response = service.getLatestListings(maxRows = 20)
        return response.listings ?: listOf()
    }
}
