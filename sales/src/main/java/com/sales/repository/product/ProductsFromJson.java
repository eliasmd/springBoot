package com.sales.repository.product;

import com.sales.domain.entity.Product;
import com.sales.repository.helper.JsonConversion;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductsFromJson implements ProductRepository {

    private JsonConversion conversion;

    public ProductsFromJson(){
        conversion = new JsonConversion();
    }

    @Override
    public List<Product> getProducts() {
        List<Product> products = new ArrayList<Product>();
        try{
            List<com.sales.repository.entity.Product> productsSource =  this.getConversion().<List<com.sales.repository.entity.Product>>convertJsonToPOJO("https://rgr3viiqdl8sikgv.public.blob.vercel-storage.com/produtos-mnboX5IPl6VgG390FECTKqHsD9SkLS.json", com.sales.repository.entity.Product.class);
            products = getConversion().<List<Product>>parseArrays(productsSource, Product.class);
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
