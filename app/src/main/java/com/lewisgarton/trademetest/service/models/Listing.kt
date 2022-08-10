package com.lewisgarton.trademetest.service.models

import com.google.gson.annotations.SerializedName
import java.math.BigDecimal

data class Listing(
    @SerializedName("Title")
    val title: String?,
    @SerializedName("Region")
    val region: String?,
    @SerializedName("PictureHref")
    val pictureHref: String?,
    @SerializedName("BuyNowPrice")
    val buyNowPrice: BigDecimal?,
    @SerializedName("PriceDisplay")
    val displayPrice: String,
    @SerializedName("IsClassified")
    val isClassified: Boolean?
)
