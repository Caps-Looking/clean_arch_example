package com.example.clean_example.app.usecase

import com.example.clean_example.domain.example.Example
import com.example.clean_example.app.service.ExampleService
import org.springframework.stereotype.Component

@Component
class GetExampleWithNameUseCase(
    private val exampleService: ExampleService
) {

    fun execute(): Example {
        val someNumber = exampleService.getExampleAndDoSomeLogic()
        return Example("example", someNumber)
    }

}