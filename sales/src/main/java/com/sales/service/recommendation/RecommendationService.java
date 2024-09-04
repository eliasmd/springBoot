package com.sales.service.recommendation;

import com.sales.domain.entity.ProductDomain;

import java.util.List;

public interface RecommendationService {

    List<ProductDomain> getRecommendationByCustomerAndType(String customer, String category);
}
