package com.javatutorials.springWebDemo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {
    //http://localhost:8087/home/
    @GetMapping("/")
    public ResponseEntity<String> home(){
        ResponseEntity<String> responseEntity = new ResponseEntity<>("Home Controller", HttpStatus.OK);
        return responseEntity;
    }


}
