package com.raudonikis.data_domain.mappers

import com.raudonikis.data.entities.ExampleEntity
import com.raudonikis.data_domain.models.ExampleModel
import com.raudonikis.network.responses.ExampleResponse

object ExampleModelMapper {

    fun fromExampleEntity(exampleEntity: ExampleEntity): ExampleModel {
        return ExampleModel(
            id = exampleEntity.id,
            title = exampleEntity.title
        )
    }

    fun fromExampleEntityList(exampleEntityList: List<ExampleEntity>): List<ExampleModel> {
        return exampleEntityList.map { fromExampleEntity(it) }
    }

    fun fromExampleResponse(exampleResponse: ExampleResponse): ExampleModel {
        return ExampleModel(
            title = exampleResponse.response
        )
    }

    fun fromExampleResponseList(exampleResponseList: List<ExampleResponse>): List<ExampleModel> {
        return exampleResponseList.map { fromExampleResponse(it) }
    }
}