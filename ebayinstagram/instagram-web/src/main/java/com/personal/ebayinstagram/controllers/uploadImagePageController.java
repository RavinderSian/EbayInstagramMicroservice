package com.personal.ebayinstagram.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class uploadImagePageController {
    
    @GetMapping("/instagram")
    public String uploadPage() {
        System.out.println("testing");
        return "upload-image";
    }
}
