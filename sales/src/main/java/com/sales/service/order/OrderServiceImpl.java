package com.sales.service.order;

import com.sales.domain.entity.OrderDomain;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {


    @Override
    public List<OrderDomain> getOrders() {
        return List.of(new OrderDomain(), new OrderDomain());
    }

    @Override
    public List<OrderDomain> getHighestSalesByCustomer() {
        return List.of(new OrderDomain(), new OrderDomain());
    }
}
