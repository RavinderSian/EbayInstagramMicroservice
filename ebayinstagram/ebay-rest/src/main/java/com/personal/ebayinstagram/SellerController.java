package com.personal.ebayinstagram;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
public class SellerController {
    
    @Autowired
    private WebClient webClient;


    @GetMapping("/test")
    private ResponseEntity<?> testEbay() {
        
        

        return new ResponseEntity<>(HttpStatus.OK);
    }

}