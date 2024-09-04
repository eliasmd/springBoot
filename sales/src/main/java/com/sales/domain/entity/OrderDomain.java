package com.sales.domain.entity;


import java.math.BigDecimal;
import java.util.Map;

public class OrderDomain {
    private BigDecimal price;
    private Map<ProductDomain, Integer> products;
    private CustomerDomain customer;
}
