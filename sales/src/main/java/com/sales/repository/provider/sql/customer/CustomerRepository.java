package com.sales.repository.provider.sql.customer;

import com.sales.domain.repository.CustomerDomainRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long>, CustomerDomainRepository {
}
