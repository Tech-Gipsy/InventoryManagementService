package com.bunroo.bunzon.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
@CrossOrigin
public class baseController {
    @GetMapping("/")
    public String healthCheck()
    {
        return "I'am daf Alive and functioning.";
    }
}
