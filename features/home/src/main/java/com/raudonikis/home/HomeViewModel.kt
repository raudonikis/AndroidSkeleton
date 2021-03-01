package com.raudonikis.home

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.raudonikis.navigation.NavigationDispatcher
import com.raudonikis.navigation.NavigationGraph
import dagger.assisted.Assisted
import dagger.hilt.android.lifecycle.HiltViewModel

@HiltViewModel
class HomeViewModel constructor(
    private val navigationDispatcher: NavigationDispatcher,
    @Assisted private val savedStateHandle: SavedStateHandle
) : ViewModel() {

    fun navigateToDashboard() {
        navigationDispatcher.navigate(NavigationGraph.Dashboard)
    }

    fun navigateToHomeNext() {
        navigationDispatcher.navigate(HomeRouter.homeToHomeNext())
    }
}