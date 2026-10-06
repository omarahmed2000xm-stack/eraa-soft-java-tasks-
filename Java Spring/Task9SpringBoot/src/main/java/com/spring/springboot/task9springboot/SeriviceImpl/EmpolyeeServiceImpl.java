package com.spring.springboot.task9springboot.SeriviceImpl;

import com.spring.springboot.task9springboot.Dto.EmpolyeeDto;
import com.spring.springboot.task9springboot.Repository.EmpolyeeRepository;
import com.spring.springboot.task9springboot.Service.EmpolyeeService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmpolyeeServiceImpl implements EmpolyeeService {
    @Autowired
    EmpolyeeRepository  empolyeeRepository ;
    @Override
    public EmpolyeeDto createEmployee(EmpolyeeDto employeeDto) {
        return null;
    }

    @Override
    public EmpolyeeDto updateEmployee(Long id, EmpolyeeDto employeeDto) {
        return null;
    }

    @Override
    public void removeEmployee(Long id) {

    }

    @Override
    public List<EmpolyeeDto> getAllEmployees() {
        return List.of();
    }

    @Override
    public EmpolyeeDto getEmployeeById(Long id) {
        return null;
    }

    @Override
    public List<EmpolyeeDto> getEmployeesByIds(List<Long> ids) {
        return List.of();
    }

    @Override
    public List<EmpolyeeDto> getEmployeesByNames(List<String> names) {
        return List.of();
    }

    @Override
    public EmpolyeeDto createEmployeeWithEmails(EmpolyeeDto employeeDto) {
        return null;
    }
}
