package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Fiche {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long lineId;

    private String lineLabel;

    private Long lotId;

    private String lotRef;

    private String ofId;


    @Column
    private Long  numFiche;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name ="id")
    private Probleme probleme;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name ="id")
    private ActionImmediate actionImmediate;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="fiche" )
    private List<Cause> causes;



    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name ="id")
    private ActionDefinitive actionDefinitive;
}
