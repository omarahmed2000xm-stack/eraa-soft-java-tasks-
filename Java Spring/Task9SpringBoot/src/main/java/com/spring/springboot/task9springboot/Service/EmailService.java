package com.spring.springboot.task9springboot.Service;

import com.spring.springboot.task9springboot.Dto.EmailDto;

import java.util.List;

public interface EmailService {

    EmailDto createEmail( EmailDto emailDto);

    EmailDto updateEmail( EmailDto emailDto);

    void removeEmail(Long id);

    List<EmailDto> getAllEmails();

    List<EmailDto> getEmailsByUserName(String name);

    List<EmailDto> getEmailsByNames(List<String> names);

    EmailDto getEmailByContent(String content);
}