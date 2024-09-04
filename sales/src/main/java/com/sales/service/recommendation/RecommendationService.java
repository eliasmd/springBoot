package com.sales.service.recommendation;

import com.sales.domain.entity.Product;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface RecommendationService {

    List<Product> getRecommendationByCustomerAndType(String customer, String category);
}
