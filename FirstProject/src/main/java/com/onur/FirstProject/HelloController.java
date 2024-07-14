package com.onur.FirstProject;


import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {


    @GetMapping("/hello")
    public HelloResponse hello() {
        return new HelloResponse("Hello World");
    }

    @PostMapping("/hello")
    public HelloResponse helloPost(@RequestBody String name) {
        return new HelloResponse("Hello " + name);
    }

    @GetMapping("/hello/{name}")   //  in here name is variable. We can write in browser /hello/onur
    public HelloResponse helloParam(@PathVariable String name) {
        //Allows to retrieve data from a specific part of the URI during an HTTP request.
        return new HelloResponse("Hello " + name);
    }

}
