package com.lewisgarton.trademetest.repository

import com.lewisgarton.trademetest.repository.models.ListingModel
import com.lewisgarton.trademetest.service.ListingService

class ListingRepositoryImpl(private val service: ListingService) : ListingRepository {
    private val rowsPerRequest = 20

    override suspend fun getLatestListings(): List<ListingModel> {
        val response = service.getLatestListings(maxRows = rowsPerRequest)
        return response.listings?.toDomain() ?: listOf()
    }
}
