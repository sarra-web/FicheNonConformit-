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
public class DecisionCorr {
    private boolean possibiliteCorr;
    private String  nomDecideur;
    @Column(name = "type",  insertable = false, updatable = false)
    private String type;
    private String detailCorr;
    private String respCorr;
    @Column(name = "date",  insertable = false, updatable = false)
    private Date date;

}
