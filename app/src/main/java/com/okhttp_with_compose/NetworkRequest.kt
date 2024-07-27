package com.okhttp_with_compose

import okhttp3.OkHttpClient
import okio.IOException


fun makeNetworkRequest(client: OkHttpClient): String? {
    val request = okhttp3.Request.Builder()
        .url("https://example.com")
        .build()

    return try {
        client.newCall(request).execute().use { response ->
            if (!response.isSuccessful) throw IOException("Unexpected code $response")
            response.body?.string()
        }
    } catch (e: IOException) {
        e.printStackTrace()
        null
    }

}