package com.example.sbcodedeploy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SbCodeDeployApplication {
    @RequestMapping("/")
    public String home() {
        return "Hello from Spring Boot!";
    }

    public static void main(String[] args) {
        SpringApplication.run(SbCodeDeployApplication.class, args);
    }

}
