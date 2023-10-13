package com.raudonikis.androidskeleton

import androidx.navigation.NavController
import com.raudonikis.navigation.model.NavigationEvent
import com.raudonikis.navigation.model.NavigationGraph
import com.raudonikis.navigation.NavigatorHost
import dagger.hilt.android.scopes.ActivityRetainedScoped
import timber.log.Timber
import javax.inject.Inject

@ActivityRetainedScoped
class NavigationHandler @Inject constructor(
    private val navigatorHost: NavigatorHost,
) {

    suspend fun setUpNavigation(navController: NavController) {
        navigatorHost.navigationEvents.collect { navigationCommand ->
            Timber.d("NavigationCommand -> $navigationCommand")
            when (navigationCommand) {
                is NavigationEvent.ToGraph -> {
                    onGraphNavigation(navController, navigationCommand.graph)
                }

                is NavigationEvent.To -> {
                    navController.navigate(navigationCommand.directions)
                }

                is NavigationEvent.Back -> {
                    navController.popBackStack()
                }

                is NavigationEvent.BackTo -> {
                    navController.popBackStack(navigationCommand.destinationId, true)
                }

                is NavigationEvent.ToRoot -> {
                    // TODO
                }
            }
        }
    }

    private fun onGraphNavigation(navController: NavController, graph: NavigationGraph) {
        val destination = when (graph) {
            NavigationGraph.Home -> R.id.action_global_navigation_home
            NavigationGraph.Dashboard -> R.id.action_global_navigation_dashboard
        }
        navController.navigate(destination)
    }
}
