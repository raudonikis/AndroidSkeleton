package com.raudonikis.home

import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeNextFragment : ComposeFragment() {

    @Composable
    override fun Content() {
        HomeNextScreen()
    }
}

@Composable
private fun HomeNextScreen() {
    Box(contentAlignment = Alignment.Center) {
        Text("Home next screen")
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun Preview() {
    HomeNextScreen()
}