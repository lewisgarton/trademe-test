package com.lewisgarton.trademetest.service

import com.lewisgarton.trademetest.service.models.LatestListingsResponse
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface ListingService {
    // Todo: Move this to keystore
    @Headers("Authorization: OAuth oauth_consumer_key=A1AC63F0332A131A78FAC304D007E7D1,oauth_signature_method=PLAINTEXT,oauth_signature=EC7F18B17A062962C6930A8AE88B16C7&")

    @GET("v1/listings/latest.json?")
    suspend fun getLatestListings(@Query("rows") maxRows: Int): LatestListingsResponse
}
