package com.example.demo.entity.Embeddable;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Embeddable
public class Participant {

    private Long userId;

    private String userName;
}
