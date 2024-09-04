package com.sales.api;

import com.sales.domain.entity.CustomerDomain;
import com.sales.service.customer.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerResource {

    private CustomerService customerService;

    @Autowired
    public void setCustomerService(CustomerService customerService){
        this.customerService = customerService;
    }

    public CustomerService getCustomerService(){
        return customerService;
    }

    @GetMapping(path = "clientes-fieis")
    public List<CustomerDomain> getTopLoyalCustomers(){
        List<CustomerDomain> customers = getCustomerService().getLoyalCustomers();
        return customers;
    }
}
