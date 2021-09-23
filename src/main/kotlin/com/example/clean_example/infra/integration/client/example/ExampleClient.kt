package com.example.clean_example.infra.integration.client.example

import com.example.clean_example.infra.integration.response.client.ExampleResponse
import com.example.clean_example.app.ports.client.example.ExampleClientPort
import com.example.clean_example.infra.integration.client.converter.ExampleConverter
import org.springframework.stereotype.Component

@Component
class ExampleClient : ExampleClientPort {

    override fun fetchExample() = ExampleConverter.convert(ExampleResponse(1))

}
