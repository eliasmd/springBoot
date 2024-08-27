package com.sales.domain.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter @Setter @NoArgsConstructor
public class Order {
    private String id;
    private BigDecimal price;
    private List<Product> products;
    private Customer customer;
}
