package com.sales.repository.bean;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Customer {
    @JsonProperty("cpf")
    private String document;
    @JsonProperty("nome")
    private String name;
    @JsonProperty("compras")
    private Order order;

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
