package com.raudonikis.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.platform.ViewCompositionStrategy
import androidx.compose.ui.tooling.preview.Preview
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
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
    Column {
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

abstract class ComposeFragment : Fragment() {

    @Composable
    abstract fun Content()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return ComposeView(requireContext()).apply {
            // Dispose of the Composition when the view's LifecycleOwner is destroyed
            setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed)
            setContent { this@ComposeFragment.Content() }
        }
    }
}