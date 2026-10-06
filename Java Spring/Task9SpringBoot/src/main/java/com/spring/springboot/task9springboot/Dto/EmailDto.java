package com.spring.springboot.task9springboot.Dto;

import jakarta.persistence.Entity;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmailDto {
    private Long id ;
    @NotBlank(message = "Email address is required")
    @Email(message = "Email address is invalid")
    private String content;

    @NotBlank(message = "Email type is required")
    private  String name;
    private Long employeeId;
}
