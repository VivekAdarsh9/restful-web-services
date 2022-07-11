package com.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    // @RequestMapping(method = RequestMethod.GET, path = "/hello-world")
    @GetMapping(path = "/hello-world")
    public String helloWorld() {
        return "Hello vivek Happy Learning";
    }

    @GetMapping(path = "/hello-worldbean")
    public HelloworldBean helloworldBean() {
        return new HelloworldBean("Hello World");
    }

    @GetMapping(path = "/hello-world/path-variable/{name}")
    public HelloworldBean helloWorldPathVariable(@PathVariable String name) {
        return new HelloworldBean("Hello World " + name);
    }
}
