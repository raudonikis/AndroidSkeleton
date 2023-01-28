package com.raudonikis.navigation.di

import com.raudonikis.navigation.Navigator
import com.raudonikis.navigation.NavigatorHost
import com.raudonikis.navigation.NavigatorHostImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class NavigationModule {

    @Binds
    abstract fun bindNavigator(
        navigatorHostImpl: NavigatorHostImpl
    ): Navigator

    @Binds
    abstract fun bindNavigatorHost(
        navigatorHostImpl: NavigatorHostImpl
    ): NavigatorHost
}