package com.raudonikis.network

import okhttp3.Interceptor
import okhttp3.Response
import javax.inject.Inject

class ExampleApiInterceptor @Inject constructor() : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        with(chain.request()) {
            url()
                .newBuilder()
                    // Here you can add query parameters to add to every network request
                    // For example, a client key for authentication
//                .addQueryParameter(QUERY_KEY, QUERY_VALUE)
                .build()
                .also { url ->
                    return chain.proceed(
                        newBuilder()
                            .url(url)
                            .build()
                    )
                }
        }
    }
}