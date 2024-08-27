package com.sales.service.order;

import com.sales.domain.entity.Order;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface OrderService {

    List<Order> getOrders();

    List<Order> getHighestSalesByCustomer();

}
