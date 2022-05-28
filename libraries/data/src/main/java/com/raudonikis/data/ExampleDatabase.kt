package com.raudonikis.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.raudonikis.data.daos.ExampleDao
import com.raudonikis.data.entities.ExampleEntity

@Database(entities = [ExampleEntity::class], version = 1, exportSchema = false)
abstract class ExampleDatabase : RoomDatabase() {

    abstract fun exampleDao(): ExampleDao

    companion object {
        const val DATABASE_NAME = "example_db.db"
    }
}
