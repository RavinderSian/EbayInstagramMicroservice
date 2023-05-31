package com.personal.ebayinstagram.model;

import java.math.BigDecimal;
import java.util.List;

import lombok.Data;

@Data
public class Sale {
    private Long id;
    private String description;
    private BigDecimal totalSales;
    private List<Listing> listings;
    private List<Sale> sales;

}
