package com.example.ticket.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Match {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(unique = true)
    private String reference;
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date date;
    private String place;
    private String firstTeam;
    private String secondTeam;
    @OneToMany(mappedBy = "match")
    @Column(length = 2022)
    private List<Ticket> tickets;

}
