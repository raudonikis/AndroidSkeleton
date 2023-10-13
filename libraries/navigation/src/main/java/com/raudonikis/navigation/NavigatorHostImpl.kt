package com.raudonikis.navigation

import android.net.Uri
import androidx.navigation.NavDirections
import com.raudonikis.navigation.model.NavigationEvent
import com.raudonikis.navigation.model.NavigationGraph
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.launch
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class NavigatorHostImpl @Inject constructor() : Navigator, NavigatorHost {

    private val coroutineScope = CoroutineScope(SupervisorJob() + Dispatchers.IO)
    private val mutableNavigationEvents = MutableSharedFlow<NavigationEvent>()

    override val navigationEvents = mutableNavigationEvents.asSharedFlow()

    override fun navigate(destination: NavDirections) {
        coroutineScope.launch {
            mutableNavigationEvents.emit(NavigationEvent.To(destination))
        }
    }

    override fun navigate(graph: NavigationGraph) {
        coroutineScope.launch {
            mutableNavigationEvents.emit(NavigationEvent.ToGraph(graph))
        }
    }

    override fun navigate(uri: Uri) {
        // TODO
    }

    override fun navigateBack() {
        coroutineScope.launch {
            mutableNavigationEvents.emit(NavigationEvent.Back)
        }
    }
}