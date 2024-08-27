package com.sales.domain.entity;

import java.util.List;

public class Customer {
    private String document;
    private String name;
    private List<Order> orders;


    public Customer() {}

    public Customer(String document, String name, List<Order> orders) {
        this.document = document;
        this.name = name;
        this.orders = orders;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Customer other = (Customer) obj;
        return this.document.equals(other.document) &&
                this.name.equals(other.name);
    }
}
