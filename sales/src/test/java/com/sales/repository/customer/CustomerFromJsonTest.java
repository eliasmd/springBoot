package com.sales.repository.customer;

import com.sales.domain.entity.Customer;
import com.sales.domain.entity.Order;
import com.sales.repository.provider.io.customer.CustomerFromJson;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
class CustomerFromJsonTest {

    private static List<Customer> customers;

    @BeforeAll
    static void setUp() {
        customers = (new CustomerFromJson()).getCustomers();
    }

    @Test
    void gotAllDomainCustomers(){
        assertEquals(14, customers.size());
    }

    @Test
    void checkCustomerDomainIntegrity(){
        Customer customer = new Customer("05870189179","Geraldo Pedro Julio Nascimento", new ArrayList<Order>());
        assertEquals(customer, customers.get(0));
    }



}