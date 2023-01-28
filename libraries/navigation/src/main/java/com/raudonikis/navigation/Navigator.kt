package com.raudonikis.navigation

import android.net.Uri
import androidx.navigation.NavDirections
import com.raudonikis.navigation.model.NavigationGraph

interface Navigator {
    fun navigate(destination: NavDirections)
    fun navigate(graph: NavigationGraph)
    fun navigate(uri: Uri)
    fun navigateBack()
}