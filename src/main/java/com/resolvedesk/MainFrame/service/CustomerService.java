package com.resolvedesk.MainFrame.service;

import com.resolvedesk.MainFrame.Repository.CustomerRepository;
import com.resolvedesk.MainFrame.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer createCustomer(Customer customer){
        return customerRepository.save(customer);
    }

    public Customer getCustomerById(UUID id){
        return customerRepository.findById(id).orElse(null);
    }

    public Customer updateCustomer(UUID id, Customer customerDetails){
        Customer customer = customerRepository.findById(id).orElse(null);
        if (customer != null) {
            customer.setName(customerDetails.getName());
            customer.setEmail(customerDetails.getEmail());
            customer.setPnumber(customerDetails.getPnumber());
            return customerRepository.save(customer);
        }
        return null;
    }

    public void deleteCustomer(UUID id){
        customerRepository.deleteById(id);
    }
}
