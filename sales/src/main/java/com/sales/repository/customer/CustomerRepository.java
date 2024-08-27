package com.sales.repository.customer;

import com.sales.domain.entity.Customer;
import com.sales.domain.entity.Product;

import java.util.List;

public interface CustomerRepository {
    List<Customer> getCustomers();
}
