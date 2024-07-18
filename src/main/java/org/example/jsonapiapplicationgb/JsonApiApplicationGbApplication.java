package org.example.jsonapiapplicationgb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@RestController
@RequestMapping("/api")
public class JsonApiApplicationGbApplication {

    public static void main(String[] args) {
        SpringApplication.run(JsonApiApplicationGbApplication.class, args);
    }

    @GetMapping(value = "/hello", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Map<String, String>> getHelloMessage() {
        Map<String, String> response = new HashMap<>();
        response.put("message", "Hello, world!");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
