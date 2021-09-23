package com.example.clean_example.infra.integration.client.converter

import com.example.clean_example.domain.example.Example
import com.example.clean_example.infra.integration.response.client.ExampleResponse

class ExampleConverter {

    companion object {
        fun convert(response: ExampleResponse) = with(response) {
            Example(name = "", someNumber = someNumber)
        }
    }

}