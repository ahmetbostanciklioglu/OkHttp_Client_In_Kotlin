package com.okhttp_with_compose

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun MyApp() {
    MaterialTheme {
        NetworkRequestExample()
    }
}

@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    MyApp()
}