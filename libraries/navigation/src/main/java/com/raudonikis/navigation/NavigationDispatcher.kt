package com.raudonikis.navigation

import androidx.navigation.NavDirections
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.launch
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class NavigationDispatcher @Inject constructor() {
    private val coroutineScope = CoroutineScope(Job() + Dispatchers.IO)
    private val navigationCommands = MutableSharedFlow<NavigationCommand>()

    fun getNavigationCommands(): SharedFlow<NavigationCommand> = navigationCommands

    fun navigate(destination: NavDirections) {
        coroutineScope.launch {
            navigationCommands.emit(NavigationCommand.To(destination))
        }
    }

    fun navigate(graph: NavigationGraph) {
        coroutineScope.launch {
            navigationCommands.emit(NavigationCommand.ToGraph(graph))
        }
    }

    // TODO : fun navigate(uri: Uri) {}

    fun navigateBack() {
        coroutineScope.launch {
            navigationCommands.emit(NavigationCommand.Back)
        }
    }
}