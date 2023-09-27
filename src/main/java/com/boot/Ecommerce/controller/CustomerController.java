package com.boot.Ecommerce.controller;

import com.boot.Ecommerce.entity.Customer;
import com.boot.Ecommerce.service.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    private final CustomerService customerService;
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping
    public ResponseEntity<Customer> saveCustomer(@RequestBody Customer customer){
        Customer customer1 = customerService.saveCustomer(customer);
        return ResponseEntity.ok(customer1);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCustomer(@PathVariable("id") String id){
        customerService.deleteCustomer(id);
        return ResponseEntity.ok().build();
    }
}
