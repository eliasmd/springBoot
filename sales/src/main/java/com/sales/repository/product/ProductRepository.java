package com.sales.repository.product;

import com.sales.domain.entity.Product;

import java.io.IOException;
import java.util.List;

public interface ProductRepository {
    List<Product> getProducts();
}
