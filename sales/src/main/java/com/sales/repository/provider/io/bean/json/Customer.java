package com.sales.repository.provider.io.bean.json;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Customer {
    @JsonProperty("cpf")
    private String document;
    @JsonProperty("nome")
    private String name;
    @JsonProperty("compras")
    private List<OrderItem> order;

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

}
