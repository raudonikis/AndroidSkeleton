package com.raudonikis.navigation.model

sealed class NavigationGraph {
    object Home : NavigationGraph()
    object Dashboard : NavigationGraph()
}