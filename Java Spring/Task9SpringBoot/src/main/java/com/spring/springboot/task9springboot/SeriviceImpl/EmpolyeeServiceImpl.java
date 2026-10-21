package com.spring.springboot.task9springboot.SeriviceImpl;

import com.spring.springboot.task9springboot.Dto.EmpolyeeDto;
import com.spring.springboot.task9springboot.EmpolyeeManagementSystem.Model.Empolyee;
import com.spring.springboot.task9springboot.Mapper.EmpolyeeMapper;
import com.spring.springboot.task9springboot.Repository.EmpolyeeRepository;
import com.spring.springboot.task9springboot.Service.EmpolyeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class EmpolyeeServiceImpl implements EmpolyeeService {
    @Autowired
    EmpolyeeRepository  empolyeeRepository ;
    EmpolyeeMapper empolyeeMapper;
    public EmpolyeeServiceImpl(EmpolyeeRepository empolyeeRepository,EmpolyeeMapper empolyeeMapper){
        this.empolyeeRepository=empolyeeRepository;
        this.empolyeeMapper=empolyeeMapper;

    }
    @Override
    public EmpolyeeDto createEmployee(EmpolyeeDto employeeDto) {
        if (employeeDto==null){
            throw new RuntimeException("you should enter a right data ");
        }
        Empolyee empolyee=empolyeeMapper.toEntity(employeeDto);
        Empolyee savedEntity=empolyeeRepository.save(empolyee );
        return empolyeeMapper.toDto(empolyee);
    }

    @Override
    public EmpolyeeDto updateEmployee(Long id, EmpolyeeDto employeeDto) {
        if (employeeDto==null||id==null){
            throw new RuntimeException("you must enter a right id and a right data !");
        }
        Empolyee empolyee=empolyeeRepository.findById(id).orElseThrow(()->new RuntimeException("pls enter a right id ! "))
        ;
         empolyee=empolyeeMapper.toEntity(employeeDto);
        Empolyee savedEmpolyee=empolyeeRepository.save(empolyee);
return empolyeeMapper.toDto(empolyee);
    }


    @Override
    public void removeEmployee(Long id) {
        if (id==null){
            throw new RuntimeException("pls enter a right id ! ");
        }
        Empolyee empolyee=empolyeeRepository.findById(id).orElseThrow(()->new RuntimeException("pls enter a right id "));
        empolyeeRepository.delete(empolyee);
    }



    @Override
    public List<EmpolyeeDto> getAllEmployees() {
        List<Empolyee>empolyees=empolyeeRepository.findAll();
        return empolyeeMapper.toDtoList(empolyees);
    }

    @Override
    public EmpolyeeDto getEmployeeById(Long id) {
        if (id== null){
            throw new RuntimeException("pls enter a valid id ");
        }
       Empolyee empolyee =empolyeeRepository.findById(id).orElseThrow(()->new RuntimeException("pls enter a valid id "));
        return empolyeeMapper.toDto(empolyee);
    }

    @Override
    public List<EmpolyeeDto> getEmployeesByIds(List<Long> ids) {
        if (ids==null){
            throw new RuntimeException( "pls enter a valid id ");
        }
        List<Empolyee>empolyees=empolyeeRepository.findByIdIn(ids);
        return empolyeeMapper.toDtoList(empolyees);
    }

    @Override
    public List<EmpolyeeDto> getEmployeesByNames(List<String> names) {
        if (names ==null){
            throw new RuntimeException("pls enter a valid names !");
        }
        List<Empolyee>empolyees=empolyeeRepository.findByNameIn(names);
        return empolyeeMapper.toDtoList(empolyees);
    }

    @Override
    public EmpolyeeDto createEmployeeWithEmails(EmpolyeeDto employeeDto) {
        if (employeeDto.getEmails()==null||employeeDto==null){
            throw  new RuntimeException("pls enter a valid email and data ");
        }
        Empolyee savedEmpolyee=empolyeeMapper.toEntity(employeeDto);
        Empolyee empolyee=empolyeeRepository.save(savedEmpolyee);
        return empolyeeMapper.toDto(empolyee);
    }
}
