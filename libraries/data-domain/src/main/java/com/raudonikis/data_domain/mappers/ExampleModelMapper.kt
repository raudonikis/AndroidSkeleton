package com.raudonikis.data_domain.mappers

import com.raudonikis.data.entities.ExampleEntity
import com.raudonikis.data_domain.models.ExampleModel

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
}