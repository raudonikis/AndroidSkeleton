package com.raudonikis.navigation

import androidx.navigation.NavDirections
import dagger.hilt.android.scopes.ActivityRetainedScoped
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@ActivityRetainedScoped
class NavigationHandler @Inject constructor() {
    private val coroutineScope = CoroutineScope(Job() + Dispatchers.IO)
    private val navigationCommands = MutableSharedFlow<NavigationCommand>(replay = 0)

    fun getNavigationCommands(): Flow<NavigationCommand> = navigationCommands

    fun navigate(destination: NavDirections) {
        coroutineScope.launch {
            navigationCommands.emit(NavigationCommand.To(destination))
        }
    }

    fun navigateToGraph(graph: NavigationGraph) {
        coroutineScope.launch {
            navigationCommands.emit(NavigationCommand.ToGraph(graph))
        }
    }

    fun navigateBack() {
        coroutineScope.launch {
            navigationCommands.emit(NavigationCommand.Back)
        }
    }
}