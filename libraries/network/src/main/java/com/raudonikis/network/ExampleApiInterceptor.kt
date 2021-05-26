package com.raudonikis.network

import okhttp3.HttpUrl
import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response
import javax.inject.Inject

internal class ExampleApiInterceptor @Inject constructor() : Interceptor {

    /**
     * Here you can define every header to be added in API requests
     */
    private val headers: Map<String, String>
        get() = mapOf()

    /**
     * Here you can define every query to be added in API requests
     */
    private val queries: Map<String, String>
        get() = mapOf()

    override fun intercept(chain: Interceptor.Chain): Response {
        with(addHeaders(chain.request())) {
            addQueries(url)
                .also { url ->
                    return chain.proceed(
                        newBuilder()
                            .url(url)
                            .build()
                    )
                }
        }
    }

    /**
     * Adds headers defined in [headers] to the request
     */
    private fun addHeaders(request: Request): Request {
        return request
            .newBuilder()
            .apply {
                headers.map { header ->
                    addHeader(header.key, header.value)
                }
            }
            .build()
    }

    /**
     * Adds queries defined in [queries] to the request
     */
    private fun addQueries(url: HttpUrl): HttpUrl {
        return url
            .newBuilder()
            .apply {
                queries.map { query ->
                    addQueryParameter(query.key, query.value)
                }
            }
            .build()
    }
}