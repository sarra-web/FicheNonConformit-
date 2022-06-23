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
    /*private Atelier atelier;
    private Ligne ligne;
    private Lot lot ;
    private OrdreFabrication ordreFabrication;*/
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "NumFiche")
    private Long  NumFiche;

    @OneToOne
    @JoinColumn(name ="idProblem")
    private Probleme prob;


    @OneToOne
    @JoinColumn(name ="idActionImmediate")
    private ActionImmediate actImm;

    @OneToMany( mappedBy="fiche" )
    private List<Cause> causes = new ArrayList<>();



    @OneToOne
    @JoinColumn(name ="idActionDefinitive")
    private ActionDefinitive actDef;
}
