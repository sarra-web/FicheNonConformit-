package com.example.demo.entity.Embeddable;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Embeddable
public class DecisionLiberation {
    private boolean prodLibAprCorr;
    @Column(name = "date",  insertable = false, updatable = false)

    @Embedded
    private Decision decsionLib;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss",
            timezone = "Africa/Tunis")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

}
