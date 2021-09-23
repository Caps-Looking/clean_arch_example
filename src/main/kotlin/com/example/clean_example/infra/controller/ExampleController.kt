package com.example.clean_example.infra.controller

import com.example.clean_example.app.usecase.GetExampleWithNameUseCase
import com.example.clean_example.domain.example.Example
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/example")
class ExampleController(
    private val getExampleWithNameUseCase: GetExampleWithNameUseCase
) {

    @GetMapping
    fun getExampleWithNameUseCase(): Example = getExampleWithNameUseCase.execute()

}