package com.lewisgarton.trademetest.service

import com.lewisgarton.trademetest.service.models.LatestListingsResponse
import com.lewisgarton.trademetest.service.models.Listing
import kotlinx.coroutines.delay
import java.math.BigDecimal

class DummyListingService() : ListingService {
    private val delayInMs = 500L

    override suspend fun getLatestListings(rows: Int): LatestListingsResponse {
        val dummyListings = mutableListOf<Listing>()

        for (i in 1..20) dummyListings.add(
            Listing(
                title = "1995 Toyta Hilux Surf",
                region = "Auckland",
                pictureHref = null,
                buyNowPrice = BigDecimal("2500"),
                displayPrice = "$50.00",
                isClassified = false
            )
        )

        val dummyResponse = LatestListingsResponse(listings = dummyListings.toList())

        delay(timeMillis = delayInMs)
        return dummyResponse
    }
}
