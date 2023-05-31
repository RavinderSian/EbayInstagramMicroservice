package com.personal.ebayinstagram.model;

import java.util.List;

import lombok.Data;

@Data
public class Buyer {
    
    private Long id;
    private String username;
    private List<Sale> purchases;
}
