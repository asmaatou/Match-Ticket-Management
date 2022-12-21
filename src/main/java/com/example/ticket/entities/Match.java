package com.example.ticket.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Match {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String reference;
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date date;
    private String place;
    private String firstTeam;
    private String secondTeam;

}
