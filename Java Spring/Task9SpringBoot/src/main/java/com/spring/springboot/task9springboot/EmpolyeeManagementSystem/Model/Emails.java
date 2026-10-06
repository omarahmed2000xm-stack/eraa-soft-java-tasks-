package com.spring.springboot.task9springboot.EmpolyeeManagementSystem.Model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Emails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id ;
    private String content;
    private  String name;
    @ManyToOne
    @JoinColumn(name = "empolyee_id")
private  Empolyee empolyee;
}
