package com.sales.domain.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class Customer {
    private String id;
    private String cpf;
    private String name;
}
