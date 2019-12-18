package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class SwaggerAPIController
{

    @RequestMapping( value = "/products", method = RequestMethod.GET)
    public List<String> getProducts()
    {
        List<String> prodList = new ArrayList<>();

        prodList.add("Smart");
        prodList.add("Bit");
        prodList.add("Pixel");

        return prodList;
    }

    @RequestMapping ( value = "/products", method = RequestMethod.POST)
    public String createProduct()
    {
        return "Product created successfully";
    }
}
