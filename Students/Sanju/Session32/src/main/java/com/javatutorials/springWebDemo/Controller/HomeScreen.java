package com.javatutorials.springWebDemo.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

@RestController
@RequestMapping("/home")
public class HomeScreen {



    @GetMapping
    public ResponseEntity<String> home(){
        ResponseEntity<String> responseEntity=new ResponseEntity<>("Welcome to Home Page", HttpStatus.OK);

        return responseEntity;
    }

}
