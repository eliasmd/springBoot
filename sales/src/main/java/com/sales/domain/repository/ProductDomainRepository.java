package com.sales.domain.repository;

import com.sales.domain.entity.ProductDomain;

import java.util.List;

public interface ProductDomainRepository {
    List<ProductDomain> getProducts();
}
