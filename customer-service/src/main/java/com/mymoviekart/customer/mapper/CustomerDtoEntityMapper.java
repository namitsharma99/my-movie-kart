package com.mymoviekart.customer.mapper;

import com.mymoviekart.customer.dto.request.CustomerRequestDto;
import com.mymoviekart.customer.dto.response.CustomerResponseDto;
import com.mymoviekart.customer.entity.CustomerEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.WARN)
public interface CustomerDtoEntityMapper {

    CustomerResponseDto toDto(CustomerEntity customerEntity);

    List<CustomerResponseDto> toDto(List<CustomerEntity> customerEntityList);

    CustomerEntity toEntity(CustomerRequestDto customerRequestDto);

    List<CustomerEntity> toEntity(List<CustomerRequestDto> customerRequestDtoList);

}
