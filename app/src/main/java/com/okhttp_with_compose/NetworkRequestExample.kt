package com.okhttp_with_compose

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@Composable
fun NetworkRequestExample() {

    var result by remember { mutableStateOf<String?>(null) }


    LaunchedEffect(Unit) {
        result = makeNetworkRequest(client)
    }

    result?.let {
        Text(text = it)
    } ?: run {
        Text(text = "Loading...")
    }
}