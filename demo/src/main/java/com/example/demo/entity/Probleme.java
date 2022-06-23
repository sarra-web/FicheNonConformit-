package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Time;
import java.util.Calendar;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Probleme {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id", insertable = false, updatable = false)
    private Long  id;


    private Date time= Calendar.getInstance().getTime();

    @Embedded
    private Decision dec;
    @Embedded
    private Decision2 dec2;
}
