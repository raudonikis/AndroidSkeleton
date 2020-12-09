package com.raudonikis.data_domain.repo

import com.raudonikis.data.daos.ExampleDao
import com.raudonikis.data_domain.mappers.ExampleModelMapper
import com.raudonikis.data_domain.models.ExampleModel
import com.raudonikis.network.ExampleApi
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class ExampleRepository @Inject constructor(
    private val exampleDao: ExampleDao,
    private val exampleApi: ExampleApi
) {

    fun getAllExamples(): Flow<List<ExampleModel>> {
        return exampleDao.getAllExamples().map { ExampleModelMapper.fromExampleEntityList(it) }
    }

    suspend fun fetchNewExample(): ExampleModel {
        return ExampleModelMapper.fromExampleResponse(exampleApi.example(name = "name"))
    }
}