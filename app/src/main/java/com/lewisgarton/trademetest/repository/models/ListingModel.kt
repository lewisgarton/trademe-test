package com.lewisgarton.trademetest.repository.models

import java.math.BigDecimal

data class ListingModel(
    val title: String,
    val region: String,
    val pictureHref: String?,
    val buyNowPrice: BigDecimal?,
    val displayPrice: String,
    val isClassified: Boolean
)