package org.densoft.corsdemo.controller;

import org.densoft.corsdemo.dto.GreetingRequest;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/greeting/")
public class WelcomeController {

    @GetMapping
    public Map<String, String> getGreetings() {
        return Map.of("message", "welcome man", "age", "30");
    }

    @PostMapping
    public Map<String, String> sendGreeting(@RequestBody GreetingRequest request) {
        return Map.of("message", request.getMessage(), "person", request.getPerson());
    }
}
