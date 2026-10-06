package com.spring.springboot.task9springboot.SeriviceImpl;

import com.spring.springboot.task9springboot.Dto.EmailDto;
import com.spring.springboot.task9springboot.EmpolyeeManagementSystem.Model.Emails;
import com.spring.springboot.task9springboot.Exception.ResourceNotFoundException;
import com.spring.springboot.task9springboot.Mapper.EmailMapper;
import com.spring.springboot.task9springboot.Repository.EmailRepository;
import com.spring.springboot.task9springboot.Service.EmailService;
import jakarta.validation.constraints.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service

public class EmailServiceImpl implements EmailService {
@Autowired
    EmailRepository emailRepository ;
    EmailMapper emailMapper;
    @Autowired
    public  EmailServiceImpl(EmailMapper emailMapper,EmailRepository  emailRepository){
        this.emailMapper=emailMapper;
        this.emailRepository=emailRepository;
    }


    @Override
    public EmailDto createEmail( EmailDto emailDto) {
        if (!Objects.isNull(emailDto.getId())){
            throw  new ResourceNotFoundException("you must add id in null ");

        }


         emailRepository.save( emailMapper.toEntity(emailDto));
return emailDto;
    }

    @Override
    public EmailDto updateEmail( EmailDto emailDto) {
        if (Objects.isNull(emailDto.getId())){
            throw  new ResourceNotFoundException("you must add id must be not null ");

        }

        Emails email = emailRepository
                .findById(emailDto.getId())
                .orElseThrow(() ->
                        new RuntimeException("This email ID was not found")
                );
        email=emailMapper.toEntity(emailDto);
        emailRepository.save(email);
        return  emailDto ;
    }

    @Override
    public void removeEmail(Long id) {
        if (id == null){
            throw  new RuntimeException("you must enter a valid id ");
        }
        Emails emails=emailRepository.findById(id).orElseThrow (()->new ResourceNotFoundException( "email id is not found ! ")
        );
        emailRepository.delete(emails);


    }

    @Override
    public List<EmailDto> getAllEmails() {
        List<Emails>emails=emailRepository.findAll();
        return emailMapper.toDtoList(emails);
    }

    @Override
    public List<EmailDto> getEmailsByUserName(String name) {
        if (name ==null){
            throw new RuntimeException("You SHOULD ENTER A VALID USERNAME ");
        }
        List<Emails>emails=emailRepository.findByNameIgnoreCase(name.trim());
        return emailMapper.toDtoList(emails);
    }

    @Override
    public List<EmailDto> getEmailsByNames(List<String> names) {
        if (names==null){
            throw new RuntimeException("pls enter a valid usernames");
        }
        List<Emails>emails=emailRepository.findByNameIn(names);
        return emailMapper.toDtoList(emails);


    }

    @Override
    public EmailDto getEmailByContent(String content) {
        if (content==null ||content.isBlank()){
            throw new RuntimeException(" email is required !");

        }
      Emails emails=emailRepository.findByContent(content).orElseThrow(()->new  RuntimeException("pls enter a right email !"));
        return emailMapper.toDto(emails);
    }

}
