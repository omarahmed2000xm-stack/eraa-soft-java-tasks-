package com.spring.springboot.task9springboot.Dto;

import jakarta.persistence.Entity;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmpolyeeDto {
    @NotBlank(message = "Employee name is required")
    private  String name;

    private  long id ;
    @Min(value = 16, message = "Age must be greater than 15")
    @Max(value = 39, message = "Age must be less than 40")

    private  int age ;
    @DecimalMin(
            value = "5000",
            inclusive = false,
            message = "Salary must be greater than 5000"
    )
    @DecimalMax(
            value = "10000",
            inclusive = false,
            message = "Salary must be less than 10000"
    )
    private  double salary;

    @Valid
    private List<EmailDto> emails = new ArrayList<>();



}
