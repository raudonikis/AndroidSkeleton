package com.raudonikis.data_domain.mappers

import com.raudonikis.data.entities.ExampleEntity
import com.raudonikis.data_domain.models.ExampleModel

object ExampleEntityMapper {

    fun fromExampleModel(exampleModel: ExampleModel): ExampleEntity {
        return ExampleEntity(
            id = exampleModel.id,
            title = exampleModel.title
        )
    }

    fun fromExampleModelList(exampleModelList: List<ExampleModel>): List<ExampleEntity> {
        return exampleModelList.map { fromExampleModel(it) }
    }
}