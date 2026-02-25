package com.typeb.helloworldapi.controller;

import com.typeb.helloworldapi.service.HelloWorldService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * REST controller that handles hello world requests.
 */
@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {
    private final HelloWorldService helloWorldService;

    public HelloWorldController(HelloWorldService helloService) {
        this.helloWorldService = helloService;
    }

    @GetMapping
    public ResponseEntity<?> displayHello(@RequestParam(required = false) String name) {

        if (!helloWorldService.isValidName(name)) {
            return ResponseEntity
                    .badRequest()
                    .body(Map.of("error", "Invalid Input"));
        }

        String formatted = helloWorldService.formatName(name);

        return ResponseEntity.ok(
                Map.of("message", "Hello " + formatted)
        );
    }
}
