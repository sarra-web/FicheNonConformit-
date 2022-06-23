package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.*;
import java.util.Calendar;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity


public class Action {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name = "Id")
        private Long  id;


        private String nom;
        private Calendar datePrevue = Calendar.getInstance();
        private Calendar dateReelle = Calendar.getInstance();
        private String commentaire;
        private String qui;

        @ManyToOne
        @JoinColumn(name = "action",nullable=false)
        private Fiche action;
}
