package com.lewisgarton.trademetest.service.models

import com.google.gson.annotations.SerializedName

data class LatestListingsResponse(
    @SerializedName("List")
    val listings: List<ListingDto>?
)
