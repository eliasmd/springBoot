package com.sales.repository;

import com.sales.domain.entity.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> getCustomers();
}
