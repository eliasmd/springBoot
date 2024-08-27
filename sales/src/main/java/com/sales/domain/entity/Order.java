package com.sales.domain.entity;


import java.math.BigDecimal;
import java.util.Map;

public class Order {
    private BigDecimal price;
    private Map<Product, Integer> products;
    private Customer customer;
}
