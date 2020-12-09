package com.raudonikis.home

import androidx.hilt.Assisted
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.raudonikis.navigation.NavigationDispatcher
import com.raudonikis.navigation.NavigationGraph

class HomeViewModel @ViewModelInject constructor(
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