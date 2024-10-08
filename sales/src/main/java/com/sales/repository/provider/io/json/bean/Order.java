package com.sales.repository.provider.io.json.bean;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Order {
    private List<OrderItem> orderItem;
}
