package com.sales.service.order;

import com.sales.domain.entity.Order;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {


    @Override
    public List<Order> getOrders() {
        return List.of(new Order(), new Order());
    }

    @Override
    public List<Order> getHighestSalesByCustomer() {
        return List.of(new Order(), new Order());
    }
}
