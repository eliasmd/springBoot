package com.sales.repository.customer;

import com.sales.domain.entity.Customer;
import com.sales.domain.entity.Product;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

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
    void gotAllProducts(){
        assertEquals(customers.size(), 20);
    }

}