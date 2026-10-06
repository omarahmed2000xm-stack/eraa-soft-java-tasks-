package com.spring.springboot.task9springboot.Repository;

import com.spring.springboot.task9springboot.EmpolyeeManagementSystem.Model.Empolyee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpolyeeRepository extends JpaRepository<Empolyee,Long> {
    List<Empolyee> findByIdIn(List<Long> ids);

    List<Empolyee> findByNameIn(List<String> names);
}
