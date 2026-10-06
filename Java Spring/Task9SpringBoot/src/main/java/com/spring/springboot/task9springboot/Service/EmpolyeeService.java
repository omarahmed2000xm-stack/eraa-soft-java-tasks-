package com.spring.springboot.task9springboot.Service;

import com.spring.springboot.task9springboot.Dto.EmpolyeeDto;
import com.spring.springboot.task9springboot.Dto.EmpolyeeDto;

import java.util.List;

public interface EmpolyeeService {

    EmpolyeeDto createEmployee(EmpolyeeDto employeeDto);

    EmpolyeeDto updateEmployee(Long id, EmpolyeeDto employeeDto);

    void removeEmployee(Long id);

    List<EmpolyeeDto> getAllEmployees();

    EmpolyeeDto getEmployeeById(Long id);

    List<EmpolyeeDto> getEmployeesByIds(List<Long> ids);

    List<EmpolyeeDto> getEmployeesByNames(List<String> names);

    EmpolyeeDto createEmployeeWithEmails(EmpolyeeDto employeeDto);
}