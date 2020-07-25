package com.example.demo.controllers;

import com.example.demo.dtos.HelloWorldDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWorldController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/hello-world")
    @ResponseBody
    public HelloWorldDTO sayHello(@RequestParam(name="name", required=false, defaultValue="Stranger") String name) {
        return new HelloWorldDTO(counter.incrementAndGet(), String.format(template, name));
    }

}