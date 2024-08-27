package com.sales.repository.entity;

import com.sales.domain.entity.Customer;
import com.sales.domain.entity.Product;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@NoArgsConstructor
public class Order {
    private List<OrderItem> orderItem;
}
