package com.spring.springboot.task9springboot.EmpolyeeManagementSystem.Model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Empolyee {
    private  String name;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id ;
    private  int age ;
     private  double salary;
     @OneToMany(mappedBy = "empolyee",
     cascade=CascadeType.ALL
     ,fetch = FetchType.LAZY)

     private List<Emails>emails=new ArrayList<>();

}
