package com.sales.service.order;

import com.sales.domain.entity.OrderDomain;

import java.util.List;

public interface OrderService {

    List<OrderDomain> getOrders();

    List<OrderDomain> getHighestSalesByCustomer();

}
