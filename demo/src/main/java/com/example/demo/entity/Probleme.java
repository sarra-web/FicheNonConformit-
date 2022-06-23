package com.example.demo.entity;


import com.example.demo.entity.Embeddable.Decision;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Calendar;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Probleme {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private Date time ;

    @Embedded
    private Decision decisionBlockage;


    //to doo



}
