package com.api.aula08.models;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private static final String template = "Vai Corinthians, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/corinthiansapi")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "caralhoooo") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}
