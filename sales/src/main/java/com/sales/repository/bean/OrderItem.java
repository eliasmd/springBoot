package com.sales.repository.bean;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class OrderItem {
    @JsonProperty("codigo")
    private String id;
    @JsonProperty("quantidade")
    private Integer quantity;
}
