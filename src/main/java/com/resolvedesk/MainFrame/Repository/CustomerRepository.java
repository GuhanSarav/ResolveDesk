package com.resolvedesk.MainFrame.Repository;

import com.resolvedesk.MainFrame.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CustomerRepository extends JpaRepository<Customer, UUID> {
}
