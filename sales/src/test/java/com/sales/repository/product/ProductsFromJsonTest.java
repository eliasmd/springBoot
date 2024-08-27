package com.sales.repository.product;

import com.sales.domain.entity.Product;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
class ProductsFromJsonTest {

    private static List<Product> products;

    @BeforeAll
    static void setUp() {
        products = (new ProductsFromJson()).getProducts();
    }

    @Test
    void gotAllDomainProducts(){
        assertEquals(20, products.size());
    }

    @Test
    void checkDomainProductIntegrity(){
        Product product = new Product("1",  new BigDecimal("229.99"),"Tinto", 2018, 2017);
        assertEquals(product, products.get(0));
    }

}