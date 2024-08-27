package com.sales.domain.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter @Setter @NoArgsConstructor
public class Customer {
    @JsonProperty("cpf")
    private String document;
    @JsonProperty("nome")
    private String name;
    @JsonProperty("compras")
    private List<Order> orders;
}
