package com.sales.repository.bean;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class Product {
    @JsonProperty("codigo")
    private String id;
    @JsonProperty("preco")
    private BigDecimal price;
    @JsonProperty("tipo_vinho")
    private String category;
    @JsonProperty("ano_compra")
    private Integer yearStock;
    @JsonProperty("safra")
    private Integer yearProduction;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getYearStock() {
        return yearStock;
    }

    public void setYearStock(Integer yearStock) {
        this.yearStock = yearStock;
    }

    public Integer getYearProduction() {
        return yearProduction;
    }

    public void setYearProduction(Integer yearProduction) {
        this.yearProduction = yearProduction;
    }


}

