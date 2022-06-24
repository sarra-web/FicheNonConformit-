package com.example.demo.entity.Embeddable;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
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

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss",
            timezone = "Africa/Tunis")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateDecision;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss",
            timezone = "Africa/Tunis")
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dateExecution",  insertable = false, updatable = false)
    private Date dateExecution;
}
