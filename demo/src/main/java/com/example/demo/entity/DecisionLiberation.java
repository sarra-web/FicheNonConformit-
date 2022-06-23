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
public class DecisionLiberation {
    private boolean prodLibAprCorr;
    @Column(name = "date",  insertable = false, updatable = false)
    private Date date;
    private String respLib;

}
