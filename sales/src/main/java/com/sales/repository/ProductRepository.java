package com.sales.repository;

import com.sales.domain.entity.Product;

import java.util.List;

public interface ProductRepository {
    List<Product> getProducts();
}
