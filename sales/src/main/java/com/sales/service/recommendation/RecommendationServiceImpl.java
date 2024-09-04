package com.sales.service.recommendation;

import com.sales.domain.entity.ProductDomain;
import com.sales.service.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecommendationServiceImpl implements RecommendationService {

    private ProductService productService;

    public ProductService getProductService() {
        return productService;
    }

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    public List<ProductDomain> getRecommendationByCustomerAndType() {
        return getProductService().getProducts();
    }

    @Override
    public List<ProductDomain> getRecommendationByCustomerAndType(String customer, String category) {
        return getProductService().getProducts().stream().filter(obj -> obj.getCategory().equalsIgnoreCase(category)).toList();
    }
}
