package com.lewisgarton.trademetest.repository

import com.lewisgarton.trademetest.repository.models.ListingModel

interface ListingRepository {
    suspend fun getLatestListings(): List<ListingModel>
}
