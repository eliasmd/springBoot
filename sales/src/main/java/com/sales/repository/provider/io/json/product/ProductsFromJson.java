package com.sales.repository.provider.io.json.product;

import com.sales.domain.entity.ProductDomain;
import com.sales.domain.repository.ProductDomainRepository;
import com.sales.repository.provider.io.json.helper.JsonConversion;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductsFromJson implements ProductDomainRepository {

    private JsonConversion conversion;

    public ProductsFromJson(){
        conversion = new JsonConversion();
    }

    @Override
    public List<ProductDomain> getProducts() {
        List<ProductDomain> products = new ArrayList<ProductDomain>();
        try{
            List<com.sales.repository.provider.io.json.bean.Product> productsSource =  this.getConversion().<List<com.sales.repository.provider.io.json.bean.Product>>convertJsonToPOJO("https://rgr3viiqdl8sikgv.public.blob.vercel-storage.com/produtos-mnboX5IPl6VgG390FECTKqHsD9SkLS.json", com.sales.repository.provider.io.json.bean.Product.class);
            products = getConversion().<List<ProductDomain>>parseArrays(productsSource, ProductDomain.class);
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
        return products;
    }

    public JsonConversion getConversion() {
        return conversion;
    }

    public void setConversion(JsonConversion conversion) {
        this.conversion = conversion;
    }
}
