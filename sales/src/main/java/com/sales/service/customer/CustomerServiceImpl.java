package com.sales.service.customer;

import com.sales.domain.entity.CustomerDomain;
import com.sales.domain.repository.CustomerDomainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    private CustomerDomainRepository customerRepository;

    @Override
    public List<CustomerDomain> getLoyalCustomers() {
        return customerRepository.getCustomers();
    }

    public CustomerDomainRepository getCustomerRepository() {
        return customerRepository;
    }

    @Autowired
    public void setCustomerRepository(CustomerDomainRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
}
