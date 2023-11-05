package com.huntercodexs.clientrestexample.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ControllerAdvice
@CrossOrigin(origins = "*")
public class ClientRestExampleController {

    @GetMapping(path = "/rest-example/test")
    public ResponseEntity<?> controller() {
        return ResponseEntity.ok().body("rest example it's work !");
    }
}
