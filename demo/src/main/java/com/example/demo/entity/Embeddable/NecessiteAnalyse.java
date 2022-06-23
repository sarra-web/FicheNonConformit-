package com.example.demo.entity.Embeddable;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Embeddable
public class NecessiteAnalyse {

    private boolean necessiteAnalyse;

    private String raison;
}
