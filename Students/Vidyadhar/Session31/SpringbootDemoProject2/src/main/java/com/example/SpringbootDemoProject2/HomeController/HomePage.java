package com.example.SpringbootDemoProject2.HomeController;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Response;

@RestController
public class HomePage {

    @GetMapping(path = "/home")
    public String home()
    {
        return  "Hello Welcome to the Spring Project";
    }

    @GetMapping(path = "/next")
    public ResponseEntity<String> next()
    {
        ResponseEntity<String> responseEntity = new ResponseEntity<String>("Home page Next Method",HttpStatus.OK);
        return responseEntity;
    }
}
