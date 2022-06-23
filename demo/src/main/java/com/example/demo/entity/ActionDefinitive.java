package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class ActionDefinitive {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private Long  id;


    @OneToMany(mappedBy = "participant")
    private List<Participant> participants = new ArrayList<>();


    @OneToMany(mappedBy = "action")
    private List<Action> actions = new ArrayList<>();


}
