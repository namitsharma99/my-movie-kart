package com.mymoviekart.customer.service;

import com.mymoviekart.customer.dto.request.CustomerRequestDto;
import com.mymoviekart.customer.dto.response.CustomerResponseDto;
import com.mymoviekart.customer.entity.CustomerEntity;
import com.mymoviekart.customer.mapper.CustomerDtoEntityMapper;
import com.mymoviekart.customer.repository.CustomerRepository;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public List<CustomerResponseDto> getAllCustomers() {
        CustomerDtoEntityMapper mapper = Mappers.getMapper(CustomerDtoEntityMapper.class);
        return mapper.toDto(customerRepository.findAll());
    }

    public CustomerResponseDto getCustomerById(Long id) {
        CustomerDtoEntityMapper mapper = Mappers.getMapper(CustomerDtoEntityMapper.class);
        CustomerEntity customerEntity = customerRepository.findById(id).orElse(null);
        return mapper.toDto(customerEntity);
    }

    public CustomerResponseDto createCustomer(CustomerRequestDto customerRequestDto) {
        CustomerDtoEntityMapper mapper = Mappers.getMapper(CustomerDtoEntityMapper.class);
        CustomerEntity customerEntity = mapper.toEntity(customerRequestDto);
        CustomerEntity persistedCustomerEntity = customerRepository.save(customerEntity);
        return mapper.toDto(persistedCustomerEntity);
    }



}
