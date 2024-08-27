package com.sales.service.recommendation;

import com.sales.domain.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecommendationServiceImpl implements RecommendationService {

    @Override
    public List<Product> getRecommendationByCustomerAndType() {
        return List.of(new Product(), new Product());
    }
}
