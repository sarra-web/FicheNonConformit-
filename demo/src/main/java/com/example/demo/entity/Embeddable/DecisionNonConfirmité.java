package com.example.demo.entity.Embeddable;


import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Embeddable
public class DecisionNonConfirmité {

    @NotNull
    private double quantite;

    private String unite;

    @Column(name = "raison", insertable = false, updatable = false)
    private String raison;

}
