package com.raudonikis.androidskeleton

import androidx.appcompat.app.AppCompatActivity
import com.raudonikis.navigation.NavigationHandler
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity(R.layout.activity_main) {

    @Inject
    lateinit var navigationHandler: NavigationHandler

    /*private fun setUpNavigation() {
        lifecycleScope.launchWhenCreated {
            navigationHandler.getNavigationCommands()
                .onEach { navigationCommand ->
                    when (navigationCommand) {
                        is NavigationCommand.ToGraph -> {
                            val destination = when (navigationCommand.graph) {
                                NavigationGraph.Home -> R.id.action_global_navigation_home
                                NavigationGraph.Dashboard -> R.id.action_global_navigation_dashboard
                            }
                            findNavController(R.id.nav_host_fragment).navigate(destination)
                        }
                    }
                }.collect()
        }
    }*/
}