package com.example.ticket.dtos.response;

import com.example.ticket.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class TicketDTOResponse {
    private String reference;
    private double price;
    private Status status;
    private MatchDTOResponse matchDTOResponse;
}
