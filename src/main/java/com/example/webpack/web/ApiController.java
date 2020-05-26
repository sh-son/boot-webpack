package com.example.webpack.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping
    public ResponseEntity isOk () {
        return new ResponseEntity("Success", HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity isBad () {
        return new ResponseEntity("Fail", HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
