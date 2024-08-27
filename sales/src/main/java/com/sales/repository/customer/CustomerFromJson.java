package com.sales.repository.customer;

import com.sales.domain.entity.Customer;
import com.sales.domain.entity.Product;
import com.sales.repository.helper.JsonConversion;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CustomerFromJson implements CustomerRepository {
    private JsonConversion conversion;

    public CustomerFromJson(){
        conversion = new JsonConversion();
    }

    @Override
    public List<Customer> getCustomers() {
        List<Customer> customers = new ArrayList<>();
        try{
            List<com.sales.repository.bean.Customer> customersSource =  this.getConversion().<List<com.sales.repository.bean.Customer>>convertJsonToPOJO("https://rgr3viiqdl8sikgv.public.blob.vercel-storage.com/clientes-Vz1U6aR3GTsjb3W8BRJhcNKmA81pVh.json", com.sales.repository.bean.Customer.class);
            customers = getConversion().<List<Customer>>parseArrays(customersSource, Customer.class);
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
        return customers;
    }

    public JsonConversion getConversion() {
        return conversion;
    }

    public void setConversion(JsonConversion conversion) {
        this.conversion = conversion;
    }
}
