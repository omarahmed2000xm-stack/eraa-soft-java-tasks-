package com.spring.springboot.task9springboot.Controller;

import com.spring.springboot.task9springboot.Dto.EmpolyeeDto;
import com.spring.springboot.task9springboot.Service.EmpolyeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empolyee")
public class EmpolyeeController {
    @Autowired
    EmpolyeeService  empolyeeService;
    public EmpolyeeController( EmpolyeeService empolyeeService){
        this.empolyeeService=empolyeeService;
    }
@PostMapping("/create")
    EmpolyeeDto createEmployee(@Valid @RequestBody EmpolyeeDto employeeDto){
        return  empolyeeService.createEmployee(employeeDto);
    };
@PutMapping("/update/{id}")
    EmpolyeeDto updateEmployee( @Valid @RequestBody @PathVariable Long id, EmpolyeeDto employeeDto){
        return empolyeeService.updateEmployee(id,employeeDto);
    };
@DeleteMapping("/delete/{id}")
    ResponseEntity<String>

     removeEmployee(@PathVariable  Long id){
empolyeeService.removeEmployee(id);
return ResponseEntity.ok("Empolyee deleted successfully ");

};
@GetMapping("/empolyees")
    List<EmpolyeeDto> getAllEmployees(){
    return empolyeeService.getAllEmployees();
};
@GetMapping("/email-by/{id}")
    EmpolyeeDto getEmployeeById(@Valid @PathVariable Long id){
        return empolyeeService.getEmployeeById(id);
    };
@GetMapping("/empolyees-by/{id}")
    List<EmpolyeeDto> getEmployeesByIds(@Valid @PathVariable List<Long> ids){
    return empolyeeService.getEmployeesByIds(ids);
};
@GetMapping("/empolyess-name")
    List<EmpolyeeDto> getEmployeesByNames(@Valid @RequestParam List<String> names){
    return empolyeeService.getEmployeesByNames(names);
};
@PostMapping("/empolyees-emails")
    EmpolyeeDto createEmployeeWithEmails(@Valid @RequestBody EmpolyeeDto employeeDto){
    return  empolyeeService.createEmployeeWithEmails(employeeDto);
};
}
