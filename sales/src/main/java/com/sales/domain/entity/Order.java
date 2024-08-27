package com.sales.domain.entity;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@Getter @Setter @NoArgsConstructor
public class Order {
    private BigDecimal price;
    private Map<Product, Integer> products;
    private Customer customer;
}
