package com.example.day18;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class exercise_Controller {

    @GetMapping("/name")
    public String name() {
        return "My name is Salem";
    }

    @GetMapping("/age")
    public String age() {
        return "My age is 24";
    }

    @GetMapping("/check/status")
    public String status() {
        return "“Everything OK";
    }

    @GetMapping("/health")
    public String health() {
        return "“Server health is up and running";
    }

    @GetMapping("/names")
    public String []  names() {
        String [] names = new String[] {"Salem","Mohammed","Khaled"};
        return names;
    }





}
