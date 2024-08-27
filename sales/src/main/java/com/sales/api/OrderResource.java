package com.sales.api;

import com.sales.domain.entity.Order;
import com.sales.service.order.OrderService;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderResource {

    private OrderService orderService;

    @Autowired
    public void setOrderService(OrderService orderService){
        this.orderService = orderService;
    }

    public OrderService getOrderService(){
        return orderService;
    }


    @GetMapping(path = "compras")
    public List<Order> getOrders(){
        return getOrderService().getOrders();
    }

    @GetMapping(path = "/maior-compra/{ano}")
    public List<Order> getHighestSalesByCustomerAndYear(@PathVariable Integer ano){
        return getOrderService().getHighestSalesByCustomer();
    }
}
