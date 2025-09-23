package com.mymoviekart.customer.contoller;

import com.mymoviekart.customer.dto.request.CustomerRequestDto;
import com.mymoviekart.customer.dto.response.CustomerResponseDto;
import com.mymoviekart.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/customer/health")
    public String getStatus() {
        return "customer-service customer controller: OK";
    }

    @GetMapping("/customers")
    public List<CustomerResponseDto> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @GetMapping("/partners/{customerId}")
    public CustomerResponseDto getCustomerById(@PathVariable Long customerId) {
        return customerService.getCustomerById(customerId);
    }

    @PostMapping("/customer")
    public CustomerResponseDto createCustomer(@RequestBody CustomerRequestDto customer) {
        return customerService.createCustomer(customer);
    }

}