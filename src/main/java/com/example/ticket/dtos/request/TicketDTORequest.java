package com.example.ticket.dtos.request;

import com.example.ticket.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class TicketDTORequest {
    private String reference;
    private double price;
    private Integer matchId;
}
