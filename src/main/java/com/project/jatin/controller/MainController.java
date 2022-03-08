package com.project.jatin.controller;
import com.project.jatin.dto.PropertyDTO;
import com.project.jatin.services.PropertyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class MainController {
    
    @Autowired
    private PropertyService services;

    @GetMapping("/")
    public String getHome() {
        return "Hello";
    }

    @PostMapping("/save")
    public ResponseEntity<PropertyDTO> saveProperty(@RequestBody PropertyDTO prop){
    services.save(prop);
    ResponseEntity<PropertyDTO> response = new ResponseEntity<>(prop,HttpStatus.CREATED);
    return response;
    }
}
