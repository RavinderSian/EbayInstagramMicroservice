package com.personal.ebayinstagram.model;

import java.util.List;

import lombok.Data;

@Data
public class Item {

    private Long id;
    private String description;
    private List<Listing> listings;
    private List<Sale> sales;
    
}
