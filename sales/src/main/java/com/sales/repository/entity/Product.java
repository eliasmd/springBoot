package com.sales.repository.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class Product {
    @JsonProperty("codigo")
    private String id;
    @JsonProperty("preco")
    private BigDecimal price;
    @JsonProperty("tipo_vinho")
    private String category;
    @JsonProperty("safra")
    private Integer yearStock;
    @JsonProperty("ano_compra")
    private Integer yearProduction;
}

