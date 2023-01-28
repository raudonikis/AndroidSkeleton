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

    fun dispatchAction(action: HomeAction) {
        when (action) {
            HomeAction.NavigateToHomeNext -> navigationDispatcher.navigate(HomeFragmentDirections.actionHomeFragmentToHomeNextFragment())
            HomeAction.NavigateToDashboard -> navigationDispatcher.navigate(NavigationGraph.Dashboard)
        }
    }
}

sealed class HomeAction {
    object NavigateToHomeNext : HomeAction()
    object NavigateToDashboard : HomeAction()
}