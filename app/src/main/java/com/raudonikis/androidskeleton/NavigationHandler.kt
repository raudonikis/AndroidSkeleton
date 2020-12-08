package com.raudonikis.androidskeleton

import androidx.navigation.NavController
import com.raudonikis.navigation.NavigationCommand
import com.raudonikis.navigation.NavigationDispatcher
import com.raudonikis.navigation.NavigationGraph
import dagger.hilt.android.scopes.ActivityRetainedScoped
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.onEach
import timber.log.Timber
import javax.inject.Inject

@ActivityRetainedScoped
class NavigationHandler @Inject constructor(private val navigationDispatcher: NavigationDispatcher) {

    suspend fun setUpNavigation(navController: NavController) {
        navigationDispatcher.getNavigationCommands()
            .onEach { navigationCommand ->
                Timber.d("NavigationCommand -> $navigationCommand")
                when (navigationCommand) {
                    is NavigationCommand.ToGraph -> {
                        onGraphNavigation(navController, navigationCommand.graph)
                    }
                    is NavigationCommand.To -> {
                        navController.navigate(navigationCommand.directions)
                    }
                    is NavigationCommand.Back -> {
                        navController.popBackStack()
                    }
                    is NavigationCommand.BackTo -> {
                        navController.popBackStack(navigationCommand.destinationId, true)
                    }
                    is NavigationCommand.ToRoot -> {
                        // TODO
                    }
                }
            }.collect()
    }

    private fun onGraphNavigation(navController: NavController, graph: NavigationGraph) {
        val destination = when (graph) {
            NavigationGraph.Home -> R.id.action_global_navigation_home
            NavigationGraph.Dashboard -> R.id.action_global_navigation_dashboard
        }
        navController.navigate(destination)
    }
}
