package com.example.demo.entity;


import com.example.demo.entity.Embeddable.Decision;
import com.example.demo.entity.Embeddable.Participant;
import com.fasterxml.jackson.annotation.JsonFormat;
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
    @Column
    private Long  numFiche;
    private TypeProblem typeProbleme;
    private String incident;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss",
            timezone = "Africa/Tunis")
    @Temporal(TemporalType.TIMESTAMP)
    private Date time ;
    @Embedded
    private Participant intervenat;
    private String maniereDetection;
    private String autreManiereDetection;
    private String  priodeTemps;
    private double quantité;
    private String cause;
    private boolean prodLivré;
    @Embedded
    private Decision decisionBlockage;
    private boolean prodIsolé;
    private String lieuIsolement;
    private String commentaire;


    //to doo



}
