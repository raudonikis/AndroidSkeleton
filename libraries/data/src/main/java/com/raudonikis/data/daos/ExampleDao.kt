package com.raudonikis.data.daos

import androidx.room.*
import com.raudonikis.data.entities.ExampleEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface ExampleDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertExample(example: ExampleEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertExampleList(exampleList: List<ExampleEntity>)

    @Query("SELECT * FROM examples")
    fun getAllExamples(): Flow<List<ExampleEntity>>

    @Query("SELECT * FROM examples WHERE id = :id")
    fun getExample(id: String): Flow<ExampleEntity?>

    @Delete
    suspend fun deleteExample(example: ExampleEntity)
}