package com.sales.domain.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter @Setter @NoArgsConstructor
public class Product {
    private String id;
    private String description;
    private BigDecimal price;

}
