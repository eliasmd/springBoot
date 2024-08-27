package com.sales.service.recommendation;

import com.sales.domain.entity.Product;

import java.util.List;

public interface RecommendationService {

    List<Product> getRecommendationByCustomerAndType();
}
