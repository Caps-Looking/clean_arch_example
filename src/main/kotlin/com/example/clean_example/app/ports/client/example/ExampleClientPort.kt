package com.example.clean_example.app.ports.client.example

import com.example.clean_example.domain.example.Example

interface ExampleClientPort {

    fun fetchExample(): Example

}
