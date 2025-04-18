package com.docker.test;

import com.docker.entity.StateEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TestController {
    private final TestService testService;

    @GetMapping("/test")
    public String test() {
        return "Hello, World!";
    }

    @GetMapping("cacheable")
    public ResponseEntity<List<StateEntity>> getAllStates() {
        return ResponseEntity.ok(testService.getAllStates());
    }
}
