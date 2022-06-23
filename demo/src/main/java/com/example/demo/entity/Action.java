package com.example.demo.entity;

import com.example.demo.entity.Embeddable.Participant;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity


public class Action {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private String nom;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss",
            timezone = "Africa/Tunis")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datePrevue;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss",
            timezone = "Africa/Tunis")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateReelle;

    private String commentaire;


    @Embedded
    private Participant qui;

    @ManyToOne
    @JoinColumn(name = "action", nullable = false)
    private ActionDefinitive actionDefinitive;
}
