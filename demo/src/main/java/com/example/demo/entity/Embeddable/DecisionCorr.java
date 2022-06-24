package com.example.demo.entity.Embeddable;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import javax.persistence.*;
import java.sql.Date;

@Builder
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@Data
@Embeddable
public class DecisionCorr {

    @Embedded Decision decisionCorr;

    @Column(name = "type",  insertable = false, updatable = false)
    private String type;
    private String autreType="";
    private String detailCorr;
    private String respCorr;

    @Column(name = "date",  insertable = false, updatable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss",
            timezone = "Africa/Tunis")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

}
