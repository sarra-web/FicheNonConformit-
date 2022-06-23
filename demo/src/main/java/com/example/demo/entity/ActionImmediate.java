package com.example.demo.entity;

import com.example.demo.entity.Embeddable.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ActionImmediate {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    @Column(name = "Id",insertable = false, updatable = false)
    private Long  id;

    @Embedded
    private DecisionCorr decisionCorr;
    @Embedded
    private DecisionLiberation decisionLiberation;
    @Embedded
    private DecisionTraitement decisionTraitement;

    @Embedded
    private DecisionNonConfirmité decisionNonConfirmité;

    @Embedded
    private NecessiteAnalyse necessiteAnalyse;



}
