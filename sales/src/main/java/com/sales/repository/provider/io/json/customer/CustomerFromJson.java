package com.sales.repository.provider.io.json.customer;

import com.sales.domain.entity.CustomerDomain;
import com.sales.domain.repository.CustomerDomainRepository;
import com.sales.repository.provider.io.json.helper.JsonConversion;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CustomerFromJson implements CustomerDomainRepository {
    private JsonConversion conversion;

    public CustomerFromJson(){
        conversion = new JsonConversion();
    }

    @Override
    public List<CustomerDomain> getCustomers() {
        List<CustomerDomain> customers = new ArrayList<>();
        try{
            List<com.sales.repository.provider.io.json.bean.Customer> customersSource =  this.getConversion().<List<com.sales.repository.provider.io.json.bean.Customer>>convertJsonToPOJO("https://rgr3viiqdl8sikgv.public.blob.vercel-storage.com/clientes-Vz1U6aR3GTsjb3W8BRJhcNKmA81pVh.json", com.sales.repository.provider.io.json.bean.Customer.class);
            customers = getConversion().<List<CustomerDomain>>parseArrays(customersSource, CustomerDomain.class);
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
