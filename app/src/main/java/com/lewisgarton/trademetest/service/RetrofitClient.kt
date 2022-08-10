package com.lewisgarton.trademetest.service

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    val instance: ListingService by lazy {
        Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("https://api.tmsandbox.co.nz")
            .client(
                OkHttpClient
                    .Builder()
                    .addInterceptor(
                        buildLoggingInterceptor()
                    ).build()
            )
            .build()
            .create(ListingService::class.java)
    }

    private fun buildLoggingInterceptor(): HttpLoggingInterceptor {
        val interceptor = HttpLoggingInterceptor()
        interceptor.level = HttpLoggingInterceptor.Level.HEADERS
        return interceptor
    }
}
