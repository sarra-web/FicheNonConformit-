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
public class DecisionNonConfirmité {
    private double quantite;
    private String unite;

    @Column(name = "raison",  insertable = false, updatable = false)
    private String raison;

}
