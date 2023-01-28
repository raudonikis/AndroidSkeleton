package com.raudonikis.navigation

import com.raudonikis.navigation.model.NavigationEvent
import kotlinx.coroutines.flow.SharedFlow

interface NavigatorHost {
    val navigationEvents: SharedFlow<NavigationEvent>
}