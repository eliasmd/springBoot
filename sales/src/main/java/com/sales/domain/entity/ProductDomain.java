package com.sales.domain.entity;

import java.math.BigDecimal;

public class ProductDomain {

    public ProductDomain(){}

    public ProductDomain(String id, BigDecimal price, String category, Integer yearStock, Integer yearProduction) {
        this.id = id;
        this.price = price;
        this.category = category;
        this.yearStock = yearStock;
        this.yearProduction = yearProduction;
    }

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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProductDomain other = (ProductDomain) obj;
        return this.id.equals(other.id) &&
                this.price.equals(other.price) &&
                this.category.equals(other.category) &&
                this.yearStock.equals(other.yearStock) &&
                this.yearProduction.equals(other.yearProduction);
    }
}
