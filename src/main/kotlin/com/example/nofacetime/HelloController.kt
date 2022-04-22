package com.example.nofacetime

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.GetMapping

@RestController
class HelloController {

    @GetMapping("/")
    fun hell(): String{
        return "hello"
    }
    
}