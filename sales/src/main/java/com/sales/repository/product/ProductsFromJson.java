package com.sales.repository.product;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.sales.domain.entity.Product;
import com.sales.repository.help.JsonConversion;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductsFromJson implements ProductRepository {

    @Override
    public List<Product> getProducts() {
        JsonConversion conversion = new JsonConversion();
        List<Product> products = new ArrayList<Product>();
        try{
            List<com.sales.repository.entity.Product> productsSource =  conversion.<List<com.sales.repository.entity.Product>>convertJsonToPOJO("https://rgr3viiqdl8sikgv.public.blob.vercel-storage.com/produtos-mnboX5IPl6VgG390FECTKqHsD9SkLS.json", com.sales.repository.entity.Product.class);
            BeanUtils.copyProperties(productsSource, products);
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
        return products;
    }
}
