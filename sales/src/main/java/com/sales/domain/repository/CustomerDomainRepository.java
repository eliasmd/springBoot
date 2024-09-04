package com.sales.domain.repository;

import com.sales.domain.entity.CustomerDomain;

import java.util.List;

public interface CustomerDomainRepository {
    List<CustomerDomain> getCustomers();
}
