package com.raudonikis.network.responses

import com.squareup.moshi.Json

data class ExampleResponse(
    @Json(name = "example_response")
    val response: String
)
