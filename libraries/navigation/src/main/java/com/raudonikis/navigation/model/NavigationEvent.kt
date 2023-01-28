package com.raudonikis.navigation.model

import androidx.navigation.NavDirections

sealed class NavigationEvent {
    data class To(val directions: NavDirections) : NavigationEvent()
    data class ToGraph(val graph: NavigationGraph) : NavigationEvent()
    object Back : NavigationEvent()
    data class BackTo(val destinationId: Int) : NavigationEvent()
    object ToRoot : NavigationEvent()
}
