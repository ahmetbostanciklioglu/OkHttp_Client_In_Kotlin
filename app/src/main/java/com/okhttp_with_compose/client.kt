package com.okhttp_with_compose

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor

val client = OkHttpClient.Builder()
    .addInterceptor(HttpLoggingInterceptor().apply {
        level = HttpLoggingInterceptor.Level.BODY
    })
    .build()