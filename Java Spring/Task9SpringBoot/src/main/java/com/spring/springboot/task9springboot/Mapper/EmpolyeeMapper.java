package com.spring.springboot.task9springboot.Mapper;

import com.spring.springboot.task9springboot.Dto.EmpolyeeDto;
import com.spring.springboot.task9springboot.EmpolyeeManagementSystem.Model.Empolyee;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EmpolyeeMapper {
    Empolyee toEntity(EmpolyeeDto empolyeeDto);
    EmpolyeeDto toDto(Empolyee empolyee);


}
