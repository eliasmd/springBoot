package com.sales.domain.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter @Setter @NoArgsConstructor
public class Product {
    private String id;
    private BigDecimal price;
    private String category;
    private Integer yearStock;
    private Integer yearProduction;
}
