package com.example.demo.testserver;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
// @CrossOrigin(origins = "http://localhost:4200")
public class TestServerController {


    @GetMapping(path = "/testing")
    public String testServer() {
        return "Web Server: Running";
    }

    @GetMapping(path = "/testing-bean")
    public TestServerBean TestServerBean() {
        return new TestServerBean("Web Server Bean: Running");
    }


    @GetMapping(path = "/testing/path/{name}")
    public TestServerBean helloWorldPathVariable(@PathVariable String name) {
        return new TestServerBean(String.format("Path:  %s", name));
    }
}
