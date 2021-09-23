package com.example.clean_example.app.service

import com.example.clean_example.app.ports.client.example.ExampleClientPort
import org.springframework.stereotype.Service

@Service
class ExampleService(
    private val exampleClientPort: ExampleClientPort
) {

    fun getExampleAndDoSomeLogic(): Int {
        val example = exampleClientPort.fetchExample()

        return if (example.someNumber == 1) {
            example.someNumber + 1
        } else {
            example.someNumber
        }
    }

}
