package com.raudonikis.navigation

sealed class NavigationGraph {
    object Home : NavigationGraph()
    object Dashboard : NavigationGraph()
}