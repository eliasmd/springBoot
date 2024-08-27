package com.sales.domain.entity;

import java.math.BigDecimal;

public class Product {

    private String id;
    private BigDecimal price;
    private String category;
    private Integer yearStock;
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
