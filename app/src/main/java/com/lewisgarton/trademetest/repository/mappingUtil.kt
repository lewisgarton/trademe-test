package com.lewisgarton.trademetest.repository

import com.lewisgarton.trademetest.repository.models.ListingModel
import com.lewisgarton.trademetest.service.models.ListingDto

fun List<ListingDto>.toDomain(): List<ListingModel> {
    return this.map { it.toDomain() }
}

fun ListingDto.toDomain(): ListingModel {
    return ListingModel(
        title = this.title ?: "",
        region = this.region ?: "",
        pictureHref = this.pictureHref,
        buyNowPrice = this.buyNowPrice,
        displayPrice = this.displayPrice,
        isClassified = this.isClassified ?: false
    )
}
