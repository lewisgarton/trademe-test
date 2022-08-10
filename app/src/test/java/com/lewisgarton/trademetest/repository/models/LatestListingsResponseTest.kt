package com.lewisgarton.trademetest.repository.models

import com.google.gson.Gson
import com.lewisgarton.trademetest.service.models.LatestListingsResponse
import org.junit.Assert.assertTrue
import org.junit.Test

class LatestListingsResponseTest {

    @Test
    fun mapsFromJsonCorrectly() {
        val json = """
         {
           "TotalCount":250,
           "Page":1,
           "PageSize":50,
           "List":[
              {
                 "ListingId":2149441769,
                 "Title":"testing",
                 "Category":"4798-9048-",
                 "StartPrice":0.0000,
                 "BuyNowPrice":55.0000,
                 "StartDate":"\/Date(1660025834577)\/",
                 "EndDate":"\/Date(1660198634577)\/",
                 "ListingLength":null,
                 "AsAt":"\/Date(1660041580563)\/",
                 "CategoryPath":"\/Health-beauty\/Fragrance-gift-sets",
                 "IsNew":true,
                 "Region":"Wellington",
                 "Suburb":"Kapiti",
                 "HasBuyNow":true,
                 "NoteDate":"\/Date(0)\/",
                 "ReserveState":3,
                 "IsBuyNowOnly":true,
                 "PriceDisplay":"${'$'}55.00",
                 "PromotionId":1,
                 "AdditionalData":{
                    "BulletPoints":[
                       
                    ],
                    "Tags":[
                       
                    ]
                 },
                 "MemberId":4000334
              },
           ]
        }
        """
        val jsonWithoutWhiteSpace = json.replace(" ", "").replace("\n", "")

        val response = Gson().fromJson(
            jsonWithoutWhiteSpace,
            LatestListingsResponse::class.java
        )

        assertTrue(response != null && !response.listings.isNullOrEmpty())
    }
}
