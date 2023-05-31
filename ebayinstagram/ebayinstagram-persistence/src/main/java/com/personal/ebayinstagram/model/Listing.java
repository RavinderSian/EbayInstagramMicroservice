package com.personal.ebayinstagram.model;

import java.time.ZonedDateTime;

import lombok.Data;

@Data
public class Listing {
    
    private Long id;
    private Long itemId;
    private ZonedDateTime listingDate;
    private Double cost;
    private Boolean offer;
    private Boolean active;
    private Boolean ended;
    private Boolean sold;
    private String Url;
    private Boolean Unsold;


}
