package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.sql.Date;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Embeddable
public class DecisionTraitement {
    @Column(name = "type",  insertable = false, updatable = false)
    private String type;
    private String decideur;
    private String executeur;
    @Column(name = "dateDecision",  insertable = false, updatable = false)
    private Date dateDecision;
    @Column(name = "dateExecution",  insertable = false, updatable = false)
    private Date dateExecution;
}
