package com.raudonikis.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import androidx.fragment.app.viewModels
import com.raudonikis.common_ui.ComposeFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : ComposeFragment() {

    private val homeViewModel by viewModels<HomeViewModel>()

    @Composable
    override fun Content() {
        HomeScreen(onAction = homeViewModel::dispatchAction)
    }
}

@Composable
private fun HomeScreen(onAction: (HomeAction) -> Unit) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("Home screen")
        Button(onClick = { onAction(HomeAction.NavigateToHomeNext) }) {
            Text("To home next")
        }
        Button(onClick = { onAction(HomeAction.NavigateToDashboard) }) {
            Text("To dashboard")
        }
    }
}

@Preview
@Composable
private fun Preview() {
    HomeScreen(onAction = {})
}