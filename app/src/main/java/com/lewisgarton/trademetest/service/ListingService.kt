package com.lewisgarton.trademetest.service

import com.lewisgarton.trademetest.service.models.LatestListingsResponse
import retrofit2.http.GET

interface ListingService {
    @GET("/latest.json")
    suspend fun getLatestListings(rows: Int): LatestListingsResponse
}