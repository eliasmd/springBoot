package com.sales.service.customer;

import com.sales.domain.entity.CustomerDomain;

import java.util.List;

public interface CustomerService {

    List<CustomerDomain> getLoyalCustomers();
}
