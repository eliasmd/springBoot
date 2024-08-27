package com.sales.api;

import com.sales.domain.entity.Product;
import com.sales.service.customer.CustomerService;
import com.sales.service.recommendation.RecommendationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RecommendationResource {

    private RecommendationService recommendationService;

    public RecommendationService getRecommendationService() {
        return recommendationService;
    }

    @Autowired
    public void setRecommendationService(RecommendationService recommendationService) {
        this.recommendationService = recommendationService;
    }

    @GetMapping(path = "recomendacao/{cliente}/{tipo}")
    public List<Product> getRecommendationByCustomerAndType(@PathVariable String cliente, @PathVariable String tipo){
        return getRecommendationService().getRecommendationByCustomerAndType();
    }
}
