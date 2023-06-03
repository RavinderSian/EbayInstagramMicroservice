package com.personal.ebayinstagram.model;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

import lombok.Data;

@Data
public class Listing {
    
    private Long id;
    private Long itemId;
    private ZonedDateTime listingDate;
    private BigDecimal cost;
    private Boolean active;
    private Boolean ended;
    private Boolean sold;
    private String Url;
    private Boolean Unsold;
    private Boolean buyerPaysPostage;
    private BigDecimal postage;

}
