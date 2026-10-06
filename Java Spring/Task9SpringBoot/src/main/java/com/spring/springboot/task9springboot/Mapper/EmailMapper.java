package com.spring.springboot.task9springboot.Mapper;

import com.spring.springboot.task9springboot.Dto.EmailDto;
import com.spring.springboot.task9springboot.EmpolyeeManagementSystem.Model.Emails;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring", uses = EmailMapper.class)
public interface EmailMapper {
    @Mapping(target = "empolyee",ignore = true)
    Emails toEntity(EmailDto emailDto);
    EmailDto toDto(Emails email);
    List<EmailDto> toDtoList(List<Emails> emails);
}
