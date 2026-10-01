package com.gymwebapp.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * API Root endpoint
 */
@Tag(name = "Root", description = "API Root")
@RestController
public class RootController {

    @GetMapping("/")
    public Map<String, String> getRoot() {
        return Map.of("message", "Welcome to the Gym Webapp project");
    }
}
