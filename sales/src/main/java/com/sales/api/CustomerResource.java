package com.sales.api;

import com.sales.domain.entity.Customer;
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
    public List<Customer> getTopLoyalCustomers(){
        List<Customer> customers = getCustomerService().getLoyalCustomers();
        return customers;
    }
}
