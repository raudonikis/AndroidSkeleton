package com.raudonikis.data.di

import android.content.Context
import androidx.room.Room
import com.raudonikis.data.ExampleDatabase
import com.raudonikis.data.daos.ExampleDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideExampleDatabase(@ApplicationContext appContext: Context): ExampleDatabase {
        return Room.databaseBuilder(
            appContext,
            ExampleDatabase::class.java,
            ExampleDatabase.DATABASE_NAME
        ).build()
    }

    @Provides
    @Singleton
    fun provideExampleDao(exampleDatabase: ExampleDatabase): ExampleDao {
        return exampleDatabase.exampleDao()
    }
}