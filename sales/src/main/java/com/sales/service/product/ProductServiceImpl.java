package com.sales.service.product;

import com.sales.domain.entity.ProductDomain;
import com.sales.domain.repository.ProductDomainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductDomainRepository productRepository;

    public ProductDomainRepository getProductRepository() {
        return productRepository;
    }

    @Autowired
    public void setProductRepository(ProductDomainRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<ProductDomain> getProducts(){
        return getProductRepository().getProducts();
    }



}
