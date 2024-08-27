package com.sales.repository.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Customer {
    @JsonProperty("cpf")
    private String document;
    @JsonProperty("nome")
    private String name;
    @JsonProperty("compras")
    private Order order;
}
