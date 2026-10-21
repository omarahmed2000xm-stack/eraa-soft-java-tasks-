package com.spring.springboot.task9springboot.Controller;

import com.spring.springboot.task9springboot.Dto.EmailDto;
import com.spring.springboot.task9springboot.Service.EmailService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("emails")
public class EmailController {
    @Autowired
    EmailService emailService;
    public EmailController(EmailService emailService){
        this.emailService= emailService;
    }
@PostMapping("/create")
    EmailDto createEmail(@Valid @RequestBody EmailDto emailDto){
        return emailService.createEmail(emailDto );
    }
    @PutMapping("/update")
    EmailDto updateEmail(@Valid @RequestBody EmailDto emailDto){
        return emailService.updateEmail(emailDto );
    }
    @DeleteMapping("/delete/{id}")
    ResponseEntity<Void>

     removeEmail( @Valid @PathVariable Long id){

emailService.removeEmail(id);
return   ResponseEntity.noContent().build();
    }
    @GetMapping("/by-all-names")
    List<EmailDto> getAllEmails(){
        return emailService.getAllEmails();
    }
    @GetMapping(("/by-user-name"))
    List<EmailDto> getEmailsByUserName(@Valid @RequestParam   String name){
        return emailService.getEmailsByUserName( name);
    }
    @GetMapping("/by-names")
    List<EmailDto> getEmailsByNames( @Valid @RequestParam List<String> names){
        return emailService.getEmailsByNames(names);
    }

@GetMapping("/by-content")
    EmailDto getEmailByContent(@Valid @RequestParam String content){
        return emailService.getEmailByContent(content);
    }
}
