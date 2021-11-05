package com.example.demo.controller;

import com.example.demo.service.CreateService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/createPC")
public class CreateController {
    private final CreateService service;

    public CreateController(CreateService service) {
        this.service = service;
    }

    @GetMapping
    public void create(){
        service.create();
    }
}
