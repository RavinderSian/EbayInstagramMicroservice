package com.personal.ebayinstagram.model;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

import lombok.Data;

@Data
public class Item {
    
    private Long id;
    private String description;
    private ZonedDateTime saleDate;
    private BigDecimal salePrice;
    private Boolean offer;
    private BigDecimal postage;
    private BigDecimal fees;
    private BigDecimal adFee;
    private BigDecimal feeRate;
    private Boolean feeDiscount;
    private BigDecimal buyerPaidPostage;
    private String Buyer;
}
