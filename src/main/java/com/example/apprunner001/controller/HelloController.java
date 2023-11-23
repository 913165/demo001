package com.example.apprunner001.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {

        public String sayHello(){
            return "Hello World";
        }

        @GetMapping("/helloapi")
        public String sayHelloFrontend(){
            System.out.println("Hello World from aws apprunner logs console");

            return "Hello World from aws apprunner";
        }
}
