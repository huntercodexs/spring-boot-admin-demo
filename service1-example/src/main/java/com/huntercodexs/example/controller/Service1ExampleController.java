package com.huntercodexs.example.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@CrossOrigin(origins = "*")
public class Service1ExampleController {

    @PostMapping(path = "/example/api/v1/service1/test")
    @ResponseBody
    public ResponseEntity<?> test() {
        return ResponseEntity.ok().body("It's a test !");
    }

}
