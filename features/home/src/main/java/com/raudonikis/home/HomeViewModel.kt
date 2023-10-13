package com.raudonikis.home

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.raudonikis.navigation.model.NavigationGraph
import com.raudonikis.navigation.Navigator
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val navigator: Navigator,
    private val savedStateHandle: SavedStateHandle
) : ViewModel() {

    fun dispatchAction(action: HomeAction) {
        when (action) {
            HomeAction.NavigateToHomeNext -> navigator.navigate(HomeFragmentDirections.actionHomeFragmentToHomeNextFragment())
            HomeAction.NavigateToDashboard -> navigator.navigate(NavigationGraph.Dashboard)
        }
    }
}

sealed class HomeAction {
    object NavigateToHomeNext : HomeAction()
    object NavigateToDashboard : HomeAction()
}