package com.raudonikis.network

import com.raudonikis.network.responses.ExampleResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface ExampleApi {

    @GET("example")
    suspend fun example(@Query("name") name: String): ExampleResponse
}