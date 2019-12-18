package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SwaggerController
{
    @GetMapping("/greet")
    public String getGreeting()
    {
        return ("Swagger Api Documentation Demo");
    }
}
