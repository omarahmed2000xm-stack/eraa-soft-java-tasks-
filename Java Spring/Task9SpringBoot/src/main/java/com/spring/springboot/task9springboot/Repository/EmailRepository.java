package com.spring.springboot.task9springboot.Repository;
import java.util.Optional;

import com.spring.springboot.task9springboot.EmpolyeeManagementSystem.Model.Emails;
import jakarta.validation.constraints.Email;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmailRepository extends JpaRepository<Emails,Long> {

    List<Emails> findByNameIn(List<String> names);

    Optional<Emails> findByContent(String content);
    List<Emails> findByNameIgnoreCase(String name);
}
