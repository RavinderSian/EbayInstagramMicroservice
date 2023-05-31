package com.personal.ebayinstagram.model;

import java.time.ZonedDateTime;

import lombok.Data;
import lombok.Getter;

@Data
public class Listing {
    
    @Getter
    private Long id;
    private ZonedDateTime listingDate;
    private Double cost;
    private Boolean offer;
    private Boolean active;
    private Boolean ended;
    private Boolean sold;
    private String Url;
    private Boolean Unsold;


}
