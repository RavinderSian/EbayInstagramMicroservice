package com.personal.ebayinstagram.model;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

import lombok.Data;

@Data
public class Sale {

    private Long id;
    private Long saleId;
    private Long buyerId;
    private ZonedDateTime saleDate;
    private BigDecimal salePrice;
    private Boolean offer;
    private BigDecimal postage;
    private BigDecimal fees;
    private BigDecimal adFee;
    private BigDecimal adFeeRate;
    private BigDecimal feeRate;
    private Boolean feeDiscount;
    private Boolean buyerPaidPostage;
    private BigDecimal buyerPaidPostageAmount;
    private Buyer buyer;

}
