package com.nikolas.ev_example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

//    private final Environment env;
//
//    public ApiController(Environment env) {
//        this.env = env;
//    }
//
//    @GetMapping("/")
//    public String home() {
//        return env.getProperty("app.api.key");
//    }


    @Value("${app.api.key}")
    private String apiKey;

    @Value("${app.database.url}")
    private String dbUrl;


    @GetMapping("/")
    public String home() {
        return apiKey;
    }

    @GetMapping("/db")
    public String getDbUrl() {
        return dbUrl;
    }

}
