package com.example.ticket.entities;

import com.example.ticket.enums.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Ticket {
    @Id
    private Integer id;
    @Column(unique = true,length = 16)
    private String reference;
    private double price;
    @Enumerated(EnumType.STRING)
    private Status status;
    @ManyToOne
    private Match match;
}
