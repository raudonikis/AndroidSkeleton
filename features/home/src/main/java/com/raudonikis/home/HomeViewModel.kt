package com.raudonikis.home

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.raudonikis.navigation.NavigationDispatcher
import com.raudonikis.navigation.NavigationGraph
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val navigationDispatcher: NavigationDispatcher,
    private val savedStateHandle: SavedStateHandle
) : ViewModel() {

    fun navigateToDashboard() {
        navigationDispatcher.navigate(NavigationGraph.Dashboard)
    }

    fun navigateToHomeNext() {
        navigationDispatcher.navigate(HomeRouter.homeToHomeNext())
    }
}