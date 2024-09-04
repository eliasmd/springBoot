package com.sales.repository.customer;

import com.sales.domain.entity.CustomerDomain;
import com.sales.domain.entity.OrderDomain;
import com.sales.repository.provider.io.json.customer.CustomerFromJson;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
class CustomerFromJsonTest {

    private static List<CustomerDomain> customers;

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
        CustomerDomain customer = new CustomerDomain("05870189179","Geraldo Pedro Julio Nascimento", new ArrayList<OrderDomain>());
        assertEquals(customer, customers.get(0));
    }



}